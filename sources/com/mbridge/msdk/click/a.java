package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.B5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f31604n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Map<String, Long> f31605o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Set<String> f31606p = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f31609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f31610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.e f31611e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.report.h f31613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f31614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f31615i;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f31618m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f31612f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31616j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31617k = true;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements g {
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31625c;

        public c(boolean z10, boolean z11, CampaignEx campaignEx) {
            this.f31623a = z10;
            this.f31624b = z11;
            this.f31625c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31623a && !a.f31604n && !a.this.l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.f31624b) {
                a.this.d(this.f31625c);
            }
            if (this.f31623a || a.this.f31612f == null || a.f31604n || a.this.l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f31612f.onShowLoading(this.f31625c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Campaign f31634b;

        public e(boolean z10, Campaign campaign) {
            this.f31633a = z10;
            this.f31634b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31633a && !a.f31604n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                a.this.a();
            }
            if (a.this.f31612f == null || a.f31604n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f31612f.onDismissLoading(this.f31634b);
        }
    }

    public a(Context context, String str) {
        this.f31609c = null;
        this.f31610d = null;
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(str);
        this.f31614h = gVarF;
        if (gVarF == null) {
            this.f31614h = com.mbridge.msdk.setting.i.b().a();
        }
        this.f31615i = this.f31614h.P0();
        Context applicationContext = context.getApplicationContext();
        this.f31610d = applicationContext;
        this.f31607a = str;
        if (this.f31609c == null) {
            this.f31609c = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f31613g = new com.mbridge.msdk.foundation.same.report.h(this.f31610d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10) {
        if (i10 == 1) {
            return "2000136";
        }
        if (i10 == 2) {
            return "2000137";
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "2000138";
        }
        return "2000139";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.f31610d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            this.f31610d.startActivity(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    public void c() {
        try {
            this.f31612f = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                    if (cVarB != null) {
                        cVarB.a(cVarB.t() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    q0.b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            cVarB2.a(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_check_local_c", cVarB2);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, null, str2, z10, z11, com.mbridge.msdk.click.retry.a.l);
    }

    public boolean b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id2 = campaignEx.getId();
            Map<String, Long> map = f31605o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id2) && (l = f31605o.get(id2)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f31606p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f31605o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11, int i10) {
        int i11;
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            i11 = -1;
        } else {
            i11 = str2.startsWith("tcp") ? 1 : 0;
        }
        a(i10, campaignEx, i11);
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, new C0100a(i11, str2, i10, campaignEx), str2, z10, z11, i10);
    }

    private static void a(int i10, CampaignEx campaignEx, int i11) {
        if (campaignEx != null) {
            try {
                String strB = b(i10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("net_ty", Integer.valueOf(i11));
                eVar.a("result", 3);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.setting.g gVar = this.f31614h;
            if (gVar != null) {
                return gVar.X();
            }
            return 1;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0100a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31622d;

        public C0100a(int i10, String str, int i11, CampaignEx campaignEx) {
            this.f31619a = i10;
            this.f31620b = str;
            this.f31621c = i11;
            this.f31622d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                eVar.a("net_ty", String.valueOf(this.f31619a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    eVar.a("status_code", str);
                    if (str.startsWith("2")) {
                        eVar.a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : ".concat(str);
                        }
                        eVar.a("failingURL", c1.d(this.f31620b));
                        eVar.a("reason", exceptionMsg);
                    }
                }
                String strB = a.b(this.f31621c);
                if (this.f31622d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f31622d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            try {
                String strB = a.b(this.f31621c);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    eVar.a("reason", str);
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                eVar.a("code", "");
                eVar.a("failingURL", c1.d(this.f31620b));
                eVar.a("net_ty", String.valueOf(this.f31619a));
                if (this.f31622d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f31622d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z10, boolean z11) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        com.mbridge.msdk.click.e eVar = new com.mbridge.msdk.click.e(context.getApplicationContext());
        for (String str2 : strArr) {
            eVar.a(str, campaignEx, new b(), str2, z10, z11, com.mbridge.msdk.click.retry.a.l);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f31629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f31630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f31631e;

        public d(CampaignEx campaignEx, boolean z10, Boolean bool, List list, boolean z11) {
            this.f31627a = campaignEx;
            this.f31628b = z10;
            this.f31629c = bool;
            this.f31630d = list;
            this.f31631e = z11;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0097  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            ?? StartsWith;
            Throwable th2;
            Set<String> set = a.f31606p;
            if (set != null) {
                set.remove(this.f31627a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            this.f31627a.setJumpResult(jumpLoaderResult2);
                            a aVar = a.this;
                            aVar.a(this.f31627a, jumpLoaderResult2, this.f31628b, aVar.f31616j, this.f31629c, (List<String>) this.f31630d);
                            if (jumpLoaderResult2.isjumpDone()) {
                                com.mbridge.msdk.click.b.a(com.mbridge.msdk.foundation.db.d.a(a.this.f31609c), this.f31627a, a.this.f31607a);
                            }
                            a.this.a(this.f31631e, this.f31627a);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            jumpLoaderResult = jumpLoaderResult2;
                            q0.b("CommonClickControl", th2.getMessage());
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "1");
                if (jumpLoaderResult != null) {
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                CampaignEx campaignEx = this.f31627a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (TextUtils.isEmpty(clickURL)) {
                        StartsWith = -1;
                    } else {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                } else {
                    StartsWith = -1;
                }
                eVar.a("net_ty", Integer.valueOf((int) StartsWith));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f31627a, eVar);
            } catch (Throwable th5) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th5.getMessage());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0065  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [int] */
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            ?? StartsWith;
            Set<String> set = a.f31606p;
            if (set != null) {
                set.remove(this.f31627a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            a.this.a((JumpLoaderResult) obj, this.f31627a, true);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th2) {
                            th = th2;
                            jumpLoaderResult = jumpLoaderResult2;
                            q0.b("CommonClickControl", th.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (a.this.f31612f != null) {
                a.this.f31612f.onRedirectionFailed(this.f31627a, str);
            }
            a.this.a(this.f31631e, this.f31627a);
            try {
                CampaignEx campaignEx = this.f31627a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (TextUtils.isEmpty(clickURL)) {
                        StartsWith = -1;
                    } else {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                } else {
                    StartsWith = -1;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "2");
                eVar.a("net_ty", Integer.valueOf((int) StartsWith));
                if (jumpLoaderResult != null) {
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f31627a, eVar);
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th4.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    public void a(String str) {
        this.f31607a = str;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f31612f = nativeTrackingListener;
    }

    public void a(j jVar) {
        this.f31618m = jVar;
    }

    public void a(boolean z10) {
        this.f31617k = z10;
    }

    public void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    public void a(CampaignEx campaignEx) {
        a aVar = this;
        if (campaignEx == null) {
            return;
        }
        try {
            if (b(campaignEx)) {
                c(campaignEx);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", campaignEx);
                String noticeUrl = campaignEx.getNoticeUrl();
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(aVar.f31609c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), aVar.f31607a);
                if (jumpLoaderResultB != null) {
                    if (jumpLoaderResultB.getNoticeurl() != null) {
                        jumpLoaderResultB.setNoticeurl(null);
                    }
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    com.mbridge.msdk.click.b.a(dVarA, campaignEx, aVar.f31607a);
                }
                ArrayList arrayList = new ArrayList();
                AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
                if (v0.b(campaignEx)) {
                    MIMManager.b().a(campaignEx);
                    arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                    if (com.mbridge.msdk.click.c.d(aVar.f31610d, campaignEx.getDeepLinkURL())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener = aVar.f31612f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        com.mbridge.msdk.click.b.a(aVar.f31610d, aVar.f31607a, campaignEx, noticeUrl + "&opdptype=1", -1);
                        com.mbridge.msdk.click.b.a(campaignEx);
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = aVar.f31612f;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        aVar.a(campaignEx, 3, 1, arrayList);
                        return;
                    }
                    noticeUrl = noticeUrl + "&opdptype=0";
                    MIMManager.b().b(campaignEx);
                }
                String str = noticeUrl;
                if (campaignEx.getLinkType() == 12) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = aVar.f31612f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    com.mbridge.msdk.click.b.a(aVar.f31610d, aVar.f31607a, campaignEx, str, -1);
                    aVar.a(aVar.f31610d, campaignEx, arrayList);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = aVar.f31612f;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                    if (appletsModel.isRequestSuccess()) {
                        if (com.mbridge.msdk.click.c.d(aVar.f31610d, appletsModel.getDeepLink())) {
                            NativeListener.NativeTrackingListener nativeTrackingListener5 = aVar.f31612f;
                            if (nativeTrackingListener5 != null) {
                                nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            if (aVar.f31610d != null) {
                                Intent intent = new Intent();
                                intent.setAction("mb_dp_close_broadcast_receiver");
                                try {
                                    aVar.f31610d.sendBroadcast(intent);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("CommonClickControl", e10.getMessage());
                                    }
                                }
                            }
                            com.mbridge.msdk.click.b.a(aVar.f31610d, aVar.f31607a, campaignEx, str + "&opdptype=1", -1);
                            com.mbridge.msdk.click.b.a(campaignEx);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = aVar.f31612f;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                                return;
                            }
                            return;
                        }
                        str = str + "&opdptype=0";
                    } else {
                        if (appletsModel.isRequesting()) {
                            NativeListener.NativeTrackingListener nativeTrackingListener7 = aVar.f31612f;
                            if (nativeTrackingListener7 != null) {
                                nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.setAppletSchemeCallBack(aVar.a(aVar.f31612f, campaignEx, appletsModel, aVar));
                            return;
                        }
                        if (appletsModel.can(1)) {
                            if (appletsModel.isRequestTimesMaxPerDay()) {
                                if (!TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                    campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                                }
                            } else {
                                NativeListener.NativeTrackingListener nativeTrackingListener8 = aVar.f31612f;
                                if (nativeTrackingListener8 != null) {
                                    nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                                }
                                appletsModel.requestWxAppletsScheme(1, aVar.a(aVar.f31612f, campaignEx, appletsModel, aVar));
                                return;
                            }
                        }
                    }
                }
                if (com.mbridge.msdk.util.b.b()) {
                    com.mbridge.msdk.click.b.a(aVar.f31610d, aVar.f31607a, campaignEx, str, -1);
                }
                if (!campaignEx.getUserActivation() && com.mbridge.msdk.click.c.a(aVar.f31610d, campaignEx.getPackageName())) {
                    com.mbridge.msdk.click.c.b(aVar.f31610d, campaignEx.getPackageName());
                    if (com.mbridge.msdk.util.b.a()) {
                        com.mbridge.msdk.click.b.a(aVar.f31610d, aVar.f31607a, campaignEx, str, com.mbridge.msdk.foundation.same.a.N);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener9 = aVar.f31612f;
                    if (nativeTrackingListener9 != null) {
                        nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (com.mbridge.msdk.util.b.a()) {
                        aVar.a(campaignEx, true, Boolean.TRUE, (List<String>) arrayList);
                    } else {
                        aVar.a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener10 = aVar.f31612f;
                    if (nativeTrackingListener10 != null) {
                        nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        u0.a(aVar.f31612f);
                        return;
                    }
                    return;
                }
                int linkType = campaignEx.getLinkType();
                int iB = aVar.b();
                if (com.mbridge.msdk.util.b.a() && linkType != 3) {
                    com.mbridge.msdk.click.b.a(aVar.f31610d, aVar.f31607a, campaignEx, str, -1);
                }
                boolean z10 = linkType == 8 || linkType == 9 || linkType == 4;
                String clickURL = campaignEx.getClickURL();
                if (!TextUtils.isEmpty(clickURL) && (clickURL.startsWith("market://") || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add("google_play");
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = aVar.f31612f;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (u0.a.a(aVar.f31610d, campaignEx.getClickURL(), aVar.f31612f)) {
                        aVar.a(jumpLoaderResultB, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = aVar.f31612f;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        aVar.a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    aVar.a(iB, campaignEx.getClickURL(), campaignEx, aVar.f31612f, arrayList);
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = aVar.f31612f;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (!z10) {
                    if (linkType == 2) {
                        if (com.mbridge.msdk.util.b.a()) {
                            aVar.a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            return;
                        } else {
                            aVar.a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (com.mbridge.msdk.util.b.a()) {
                            aVar.a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            aVar.a(campaignEx, 2, 1, arrayList);
                            return;
                        } else {
                            aVar.a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = aVar.f31612f;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = aVar.f31612f;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        aVar.a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = aVar.f31612f;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    u0.a(aVar.f31610d, clickURL2, aVar.f31612f, campaignEx, arrayList);
                    if (com.mbridge.msdk.util.b.a()) {
                        aVar.a(jumpLoaderResultB, campaignEx, false);
                        return;
                    } else {
                        aVar.a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = aVar.f31612f;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = aVar.f31612f;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    aVar.a(jumpLoaderResultB, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                        BaseTrackingListener baseTrackingListener = aVar.f31612f;
                        if (baseTrackingListener == null && (baseTrackingListener = aVar.f31618m) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        u0.a(aVar.f31610d, clickURL3, campaignEx, aVar, baseTrackingListener, arrayList);
                        aVar = aVar;
                    } else {
                        u0.a(aVar.f31610d, clickURL3, campaignEx, aVar.f31612f, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = aVar.f31612f;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    }
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    u0.a(aVar.f31610d, clickURL3, aVar.f31612f, campaignEx, arrayList);
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = aVar.f31612f;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (iB == 2) {
                        u0.a(aVar.f31610d, clickURL3, campaignEx, aVar.f31612f, arrayList);
                    } else {
                        u0.a(aVar.f31610d, clickURL3, aVar.f31612f, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = aVar.f31612f;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                aVar.a(jumpLoaderResultB, campaignEx, false);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new h(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, 2, "context is null", this.f31607a);
            return;
        }
        boolean z10 = m0.G() == 1;
        boolean z11 = m0.E(context) == 1;
        if (z10 && z11) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String strJ = com.mbridge.msdk.foundation.controller.c.n().j();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(strJ)) {
                        bindId = strJ;
                    }
                    Object objD = m0.d(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object objNewInstance = cls.newInstance();
                    cls.getField("userName").set(objNewInstance, ghId);
                    cls.getField("path").set(objNewInstance, ghPath);
                    cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 1, "", this.f31607a);
                    return;
                } catch (Throwable th2) {
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, th2.getMessage(), this.f31607a);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "ghid is empty", this.f31607a);
            return;
        }
        com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "integrated:" + z10 + "-hasWx:" + z11, this.f31607a);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            u0.a(this.f31610d, campaignEx.getClickURL(), campaignEx, this.f31612f, list);
        } else {
            u0.a(this.f31610d, campaignEx.getClickURL(), this.f31612f, campaignEx, list);
        }
    }

    private void a(CampaignEx campaignEx, boolean z10, Boolean bool, List<String> list) {
        boolean z11;
        try {
            this.f31608b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f31612f;
            if (nativeTrackingListener == null || z10) {
                z11 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z11 = !this.f31612f.onInterceptDefaultLoadingDialog();
            }
            this.l = false;
            boolean z12 = true;
            if (campaignEx.getJumpResult() != null) {
                if (!z10) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.f31616j, bool, list);
                }
                this.l = true;
                this.f31616j = false;
                z12 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.f31609c).c(campaignEx.getId(), this.f31607a) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f31609c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.f31607a);
                if (jumpLoaderResultB != null && !z10) {
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    if (z12) {
                        a(campaignEx, jumpLoaderResultB, z12, this.f31616j, bool, list);
                        this.l = true;
                        this.f31616j = false;
                        z12 = false;
                    }
                } else {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z10) {
                        boolean zA = u0.a.a(this.f31610d, "market://details?id=" + campaignEx.getPackageName(), this.f31612f);
                        if (list != null) {
                            list.add("google_play");
                        }
                        if (zA) {
                            a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f31612f;
                        if (nativeTrackingListener2 != null && z12) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.f31612f.onFinishRedirection(campaignEx, null);
                        }
                        this.l = true;
                        z12 = false;
                    }
                    if (z10) {
                        this.l = true;
                        this.f31616j = false;
                        z12 = false;
                    }
                }
                new Handler(Looper.getMainLooper()).post(new c(z11, z10, campaignEx));
                com.mbridge.msdk.click.e eVar = this.f31611e;
                if (eVar != null) {
                    eVar.a();
                }
                Set<String> set = f31606p;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f31612f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f31612f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = f31606p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                com.mbridge.msdk.click.e eVar2 = new com.mbridge.msdk.click.e(this.f31610d);
                this.f31611e = eVar2;
                eVar2.a(this.f31607a, campaignEx, new d(campaignEx, z12, bool, list, z11));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z10, campaign));
    }

    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f31608b;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int iS = m0.s(this.f31610d);
            eVar.e(iS);
            eVar.h(m0.a(this.f31610d, iS));
            eVar.i(campaignEx.getRequestId());
            eVar.j(campaignEx.getRequestIdNotice());
            eVar.a(i10);
            eVar.c(jCurrentTimeMillis + "");
            eVar.a(campaignEx.getId());
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), B5.O));
            }
            eVar.b((this.f31608b / 1000) + "");
            eVar.c(Integer.parseInt(campaignEx.getLandingType()));
            eVar.d(campaignEx.getLinkType());
            eVar.k(this.f31607a);
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), B5.O));
            }
            if (this.f31615i) {
                eVar.b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), B5.O));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), B5.O));
                }
            }
            if (z10) {
                this.f31613g.a("click_jump_error", eVar, this.f31607a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            ArrayList<JSONObject> arrayListA = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (arrayListA == null || arrayListA.isEmpty()) {
                return;
            }
            Iterator<JSONObject> it = arrayListA.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(it.next());
            }
        } catch (Throwable th2) {
            q0.b("CommonClickControl", th2.getMessage());
        }
    }

    public void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) {
                    com.mbridge.msdk.click.b.a(str, this.f31610d, this.f31607a, campaignEx, this.f31612f);
                    return;
                }
                if (u0.a.a(this.f31610d, str, this.f31612f) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    u0.a.a(this.f31610d, "market://details?id=" + campaignEx.getPackageName(), this.f31612f);
                    return;
                }
                if (b() == 2) {
                    u0.a(this.f31610d, campaignEx.getClickURL(), campaignEx, this.f31612f, new ArrayList());
                } else {
                    u0.a(this.f31610d, campaignEx.getClickURL(), this.f31612f, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z10) {
        a(jumpLoaderResult, campaignEx, 1, z10);
    }

    private void a(int i10, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i10 == 2) {
                u0.a(this.f31610d, str, campaignEx, nativeTrackingListener, list);
            } else {
                u0.a(this.f31610d, str, nativeTrackingListener, campaignEx, list);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, int i10, List<String> list) {
        boolean z11 = true;
        boolean z12 = false;
        if (z10) {
            try {
                int i11 = Integer.parseInt(campaignEx.getLandingType());
                if (i11 == 1) {
                    u0.a(this.f31610d, jumpLoaderResult.getUrl(), this.f31612f, campaignEx, list);
                } else if (i11 == 2) {
                    u0.a(this.f31610d, jumpLoaderResult.getUrl(), campaignEx, this.f31612f, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (u0.a.a(this.f31610d, "market://details?id=" + campaignEx.getPackageName(), this.f31612f)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th2) {
                                th = th2;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z11;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f31612f, list);
                    }
                } else {
                    a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f31612f, list);
                }
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
        }
        if (z12) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f31612f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z12;
            }
        } else {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f31612f;
            if (nativeTrackingListener2 != null && z10) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z12;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, List<String> list) {
        boolean z11 = false;
        if (z10) {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.f31610d, this.f31607a, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.M);
                }
                u0.a(this.f31610d, campaignEx.getClickURL(), this.f31612f, campaignEx, list);
                z11 = true;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th2.getMessage(), th2);
                }
                return false;
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z11) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f31612f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z11;
            }
        } else {
            if (com.mbridge.msdk.util.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f31612f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:81:0x016e A[Catch: Exception -> 0x0194, TryCatch #0 {Exception -> 0x0194, blocks: (B:3:0x0002, B:6:0x0008, B:10:0x0016, B:12:0x0020, B:14:0x0026, B:16:0x0036, B:19:0x0048, B:21:0x004e, B:25:0x0060, B:27:0x0064, B:29:0x0076, B:33:0x0084, B:35:0x008e, B:37:0x0098, B:40:0x00a8, B:42:0x00b6, B:50:0x00f1, B:53:0x00f7, B:79:0x0160, B:81:0x016e, B:83:0x0176, B:87:0x017e, B:82:0x0173, B:45:0x00c3, B:47:0x00cd, B:49:0x00e7, B:59:0x0107, B:61:0x0119, B:64:0x011f, B:68:0x012c, B:70:0x0132, B:72:0x0136, B:74:0x013c, B:76:0x0147, B:78:0x0159, B:90:0x0188, B:92:0x018f), top: B:97:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0173 A[Catch: Exception -> 0x0194, TryCatch #0 {Exception -> 0x0194, blocks: (B:3:0x0002, B:6:0x0008, B:10:0x0016, B:12:0x0020, B:14:0x0026, B:16:0x0036, B:19:0x0048, B:21:0x004e, B:25:0x0060, B:27:0x0064, B:29:0x0076, B:33:0x0084, B:35:0x008e, B:37:0x0098, B:40:0x00a8, B:42:0x00b6, B:50:0x00f1, B:53:0x00f7, B:79:0x0160, B:81:0x016e, B:83:0x0176, B:87:0x017e, B:82:0x0173, B:45:0x00c3, B:47:0x00cd, B:49:0x00e7, B:59:0x0107, B:61:0x0119, B:64:0x011f, B:68:0x012c, B:70:0x0132, B:72:0x0136, B:74:0x013c, B:76:0x0147, B:78:0x0159, B:90:0x0188, B:92:0x018f), top: B:97:0x0002 }] */
    public void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, boolean z11, Boolean bool, List<String> list) {
        JumpLoaderResult jumpLoaderResult2;
        a aVar;
        NativeListener.NativeTrackingListener nativeTrackingListener;
        NativeListener.NativeTrackingListener nativeTrackingListener2;
        try {
            if (this.f31617k) {
                com.mbridge.msdk.click.b.a();
                if (campaignEx == null || jumpLoaderResult == null) {
                    if (z10) {
                        a(jumpLoaderResult, campaignEx, true);
                        NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f31612f;
                        if (nativeTrackingListener3 != null) {
                            nativeTrackingListener3.onRedirectionFailed(null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int iB = b();
                int code = jumpLoaderResult.getCode();
                if (bool != null && !bool.booleanValue()) {
                    com.mbridge.msdk.click.b.a(jumpLoaderResult, this.f31610d, this.f31607a, campaignEx, Boolean.FALSE, this.f31612f, list);
                    return;
                }
                CampaignEx campaignEx2 = campaignEx;
                if (TextUtils.isEmpty(jumpLoaderResult.getUrl()) && z10) {
                    int linkType = campaignEx2.getLinkType();
                    if (linkType == 2) {
                        a(campaignEx2, jumpLoaderResult, z10, b(), list);
                        return;
                    }
                    if (linkType == 3) {
                        a(campaignEx2, jumpLoaderResult, z10, list);
                        return;
                    }
                    u0.a(this.f31610d, campaignEx2.getClickURL(), this.f31612f, campaignEx2, list);
                    a(jumpLoaderResult, campaignEx2, true);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f31612f;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx2, jumpLoaderResult.getUrl());
                        return;
                    }
                    return;
                }
                a aVar2 = this;
                JumpLoaderResult jumpLoaderResult3 = jumpLoaderResult;
                boolean z12 = z10;
                if (code == 1) {
                    if (!TextUtils.isEmpty(campaignEx2.getPackageName()) && !TextUtils.isEmpty(jumpLoaderResult3.getUrl()) && jumpLoaderResult3.getUrl().contains(campaignEx2.getPackageName()) && z12) {
                        if (!u0.a.a(aVar2.f31610d, jumpLoaderResult3.getUrl(), aVar2.f31612f)) {
                            aVar2.a(iB, jumpLoaderResult3.getUrl(), campaignEx2, aVar2.f31612f, list);
                        }
                    } else {
                        if (z12) {
                            if (!TextUtils.isEmpty(campaignEx2.getPackageName())) {
                                if (!u0.a.a(aVar2.f31610d, "market://details?id=" + campaignEx2.getPackageName(), aVar2.f31612f)) {
                                }
                            }
                            aVar2.a(iB, jumpLoaderResult3.getUrl(), campaignEx2, aVar2.f31612f, list);
                        }
                        nativeTrackingListener2 = aVar2.f31612f;
                        if (nativeTrackingListener2 != null && z12) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx2, jumpLoaderResult3.getUrl());
                        }
                    }
                    nativeTrackingListener2 = aVar2.f31612f;
                    if (nativeTrackingListener2 != null) {
                        nativeTrackingListener2.onFinishRedirection(campaignEx2, jumpLoaderResult3.getUrl());
                    }
                } else {
                    aVar2 = aVar2;
                    if (code == 3) {
                        if (z12) {
                            com.mbridge.msdk.click.b.a(aVar2.f31610d, campaignEx2, aVar2.f31607a, jumpLoaderResult3, bool, aVar2.f31612f, list);
                            jumpLoaderResult2 = jumpLoaderResult3;
                            campaignEx2 = campaignEx2;
                        } else {
                            jumpLoaderResult2 = jumpLoaderResult3;
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener5 = aVar2.f31612f;
                        if (nativeTrackingListener5 != null && z12) {
                            nativeTrackingListener5.onFinishRedirection(campaignEx2, jumpLoaderResult2.getUrl());
                        }
                    } else {
                        jumpLoaderResult2 = jumpLoaderResult3;
                        if (z12) {
                            if (3 == campaignEx2.getLinkType()) {
                                aVar2.a(campaignEx2, jumpLoaderResult2, z12, list);
                                return;
                            }
                            if (2 == campaignEx2.getLinkType()) {
                                aVar2.a(campaignEx2, jumpLoaderResult2, z12, aVar2.b(), list);
                                return;
                            }
                            z12 = z12;
                            jumpLoaderResult3 = jumpLoaderResult2;
                            aVar = aVar2;
                            u0.a(aVar.f31610d, jumpLoaderResult3.getUrl(), aVar.f31612f, campaignEx2, list);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = aVar.f31612f;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx2, jumpLoaderResult3.getUrl());
                            }
                        }
                        if (aVar.a(campaignEx2.getLinkType(), jumpLoaderResult3.getUrl())) {
                            aVar.a(jumpLoaderResult3, campaignEx2, false);
                        } else {
                            aVar.a(jumpLoaderResult3, campaignEx2, true);
                        }
                        nativeTrackingListener = aVar.f31612f;
                        if (nativeTrackingListener == null && !z12 && z11) {
                            nativeTrackingListener.onFinishRedirection(campaignEx2, jumpLoaderResult3.getUrl());
                            return;
                        }
                        return;
                    }
                    jumpLoaderResult3 = jumpLoaderResult2;
                }
                aVar = aVar2;
                if (aVar.a(campaignEx2.getLinkType(), jumpLoaderResult3.getUrl())) {
                    aVar.a(jumpLoaderResult3, campaignEx2, false);
                } else {
                    aVar.a(jumpLoaderResult3, campaignEx2, true);
                }
                nativeTrackingListener = aVar.f31612f;
                if (nativeTrackingListener == null) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10, String str) {
        try {
            if (i10 == 2) {
                return u0.a.b(str);
            }
            return !TextUtils.isEmpty(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.f31610d.sendBroadcast(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    private void a(CampaignEx campaignEx, int i10, int i11, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", Integer.valueOf(i10));
            if (i10 == 1 || i10 == 2) {
                eVar.a("url", campaignEx.getClickURL());
            } else if (i10 == 3) {
                eVar.a("url", campaignEx.getDeepLinkURL());
            }
            eVar.a("result", Integer.valueOf(i11));
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", e10.getMessage());
            }
        }
    }
}
