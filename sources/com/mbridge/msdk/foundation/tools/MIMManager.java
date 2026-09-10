package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.B5;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class MIMManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f34033i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f34034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f34036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f34037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f34038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f34039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile g f34040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f34041h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                q0.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a(X3.i.W, URLEncoder.encode("m_mini_card", B5.O));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a("rid", campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f33385r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        q0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34042a;

        public a(Context context) {
            this.f34042a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f34034a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f34038e = mIMManager.a();
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f34038e == null || !MIMManager.this.f34038e.booleanValue() || this.f34042a == null) {
                    return;
                }
                try {
                    MIMManager.this.f34040g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f34042a.registerReceiver(MIMManager.this.f34040g, intentFilter);
                } catch (Exception e11) {
                    q0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34045b;

        public b(Context context, CampaignEx campaignEx) {
            this.f34044a = context;
            this.f34045b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f34044a, this.f34045b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34048b;

        public c(Context context, CampaignEx campaignEx) {
            this.f34047a = context;
            this.f34048b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f34047a, this.f34048b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34051b;

        public d(Context context, CampaignEx campaignEx) {
            this.f34050a = context;
            this.f34051b = campaignEx;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.f(this.f34050a, this.f34051b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            } finally {
                if (MIMManager.this.f34036c != null && MIMManager.this.f34036c.contains(this.f34051b)) {
                    MIMManager.this.f34036c.remove(this.f34051b);
                }
            }
            this = this;
            this = this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f34056d;

        public e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f34053a = context;
            this.f34054b = str;
            this.f34055c = campaignEx;
            this.f34056d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f34053a == null || TextUtils.isEmpty(this.f34054b) || this.f34055c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000100");
                jSONObject.put("network_type", m0.s(this.f34053a));
                jSONObject.put("rid", this.f34055c.getRequestId());
                jSONObject.put("rid_n", this.f34055c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f34055c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f34055c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f33385r.get(this.f34055c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put(BidResponsedEx.KEY_CID, this.f34055c.getId());
                jSONObject.put("status", this.f34054b);
                jSONObject.put("code", this.f34056d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("MIMManager", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final MIMManager f34058a = new MIMManager(null);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i10 = extras.getInt("statusCode", -1);
                String string = extras.getString("packageName", "");
                if (i10 != -1 && !TextUtils.isEmpty(string) && (campaignExA = MIMManager.b().a(string)) != null) {
                    MIMManager.b().a(context, campaignExA, i10);
                    MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.f34035b++;
    }

    public void g() {
        int i10 = this.f34035b - 1;
        this.f34035b = i10;
        if (i10 <= 0) {
            a(this.f34037d);
        }
    }

    public void h() {
        try {
            if (this.f34041h == null) {
                this.f34041h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f34041h, intentFilter);
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f34041h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f34041h);
                }
                this.f34039f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f34036c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f34036c = null;
                this.f34041h = null;
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    private MIMManager() {
        this.f34035b = 0;
        this.f34036c = new CopyOnWriteArrayList<>();
        this.f34034a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrB;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrB = nativeVideoTracking.B()) == null) {
                    return;
                }
                int length = strArrB.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrB[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public String d() {
        try {
            if (f34033i == null) {
                return "";
            }
            return X3.j.f27834d + f34033i + X3.j.f27836e;
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f34038e;
    }

    public static MIMManager b() {
        return f.f34058a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrZ;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrZ = nativeVideoTracking.z()) == null) {
                    return;
                }
                int length = strArrZ.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrZ[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrA;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrA = nativeVideoTracking.A()) == null) {
                    return;
                }
                int length = strArrA.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrA[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public CampaignEx c() {
        return this.f34039f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.f34037d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f34038e != null && campaignEx != null && this.f34038e.booleanValue()) {
                this.f34039f = campaignEx;
                this.f34036c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f34041h == null) {
                    h();
                }
                this.f34039f = campaignEx;
                this.f34036c.add(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.f34038e == null || campaignEx == null || !this.f34038e.booleanValue()) {
                return;
            }
            this.f34039f = null;
            try {
                this.f34036c.remove(campaignEx);
            } catch (Exception e10) {
                q0.a("MIMManager", e10.getMessage());
            }
        } catch (Exception e11) {
            q0.b("MIMManager", e11.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f34039f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f34039f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f34036c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.f34036c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(k0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f29610g))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                q0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f34033i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                q0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            q0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                q0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030 A[PHI: r4
  0x0030: PHI (r4v5 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
  (r4v4 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
  (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
 binds: [B:20:0x002e, B:16:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.f34040g != null) {
                        context.unregisterReceiver(this.f34040g);
                    }
                    if (this.f34041h != null) {
                        context.unregisterReceiver(this.f34041h);
                    }
                    this.f34039f = null;
                    copyOnWriteArrayList = this.f34036c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                    this.f34039f = null;
                    copyOnWriteArrayList = this.f34036c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                }
                this.f34036c = null;
                this.f34040g = null;
                this.f34037d = null;
            } catch (Throwable th2) {
                this.f34039f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f34036c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.f34036c = null;
                this.f34040g = null;
                this.f34037d = null;
                throw th2;
            }
        }
        try {
            i();
        } catch (Throwable th3) {
            q0.b("MIMManager", th3.getMessage());
        }
    }

    public void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableB;
        if (i10 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i10 != 3002) {
            runnableB = i10 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    public void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }
}
