package com.thinkup.core.common.mo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.cs;
import com.thinkup.core.api.NetTrafficeCallback;
import com.thinkup.core.api.TUGDPRAuthCallback;
import com.thinkup.core.api.TUGDPRConsentDismissListener;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static volatile n mm = null;
    private static final String mo = "tpn_thinkup_ump";
    private Map<Integer, m> mn;
    private Map<Integer, m> n0;
    private List<Integer> o0o;
    final int o = -1;
    final int m = 100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f41879n = 101;
    final int o0 = 102;
    final int oo = 103;
    final int om = 104;
    final int on = 105;
    final int m0 = 106;
    private String nm = "";
    private String nn = "";
    private String o00 = "";
    private boolean no = false;

    private n() {
        HashMap map = new HashMap();
        this.mn = map;
        map.put(2, new m(2, 755, 1));
        this.mn.put(33, new m(33, 755, 1));
        this.mn.put(6, new m(6, 867, 1));
        this.mn.put(3, new m(3, 333, 1));
        this.mn.put(37, new m(37, 262, 1));
        this.mn.put(13, new m(13, 667, 1));
        this.mn.put(36, new m(36, 31, 1));
        this.mn.put(58, new m(58, 512, 1));
        this.mn.put(75, new m(75, 793, 1));
        this.mn.put(1, new m(1, 89, 2));
        this.mn.put(12, new m(12, 3234, 2));
        this.mn.put(5, new m(5, cs.c.INSTANCE_AUCTION_FAILED, 2));
        this.mn.put(9, new m(9, 2898, 2));
        this.mn.put(11, new m(11, 2878, 2));
        this.mn.put(23, new m(23, 1782, 2));
        this.mn.put(59, new m(59, 16831, 2));
        this.mn.put(45, new m(45, 3183, 2));
        this.mn.put(14, new m(14, 2710, 2));
        this.mn.put(10, new m(10, 1985, 2));
        this.mn.put(25, new m(25, 2312, 2));
        this.n0 = new HashMap();
        this.o0o = new ArrayList();
    }

    public final String n() {
        return this.nm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Context context) {
        String strO = o.o(context).o();
        if (TextUtils.isEmpty(strO) || strO.contains("1")) {
            oom.o(context).o(0);
        } else {
            oom.o(context).o(1);
        }
    }

    public final synchronized boolean m() {
        return this.no;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(String str) {
        if (TUSDK.isNetworkLogDebug()) {
            Log.d(mo, str);
        }
    }

    public static n o() {
        if (mm == null) {
            synchronized (n.class) {
                try {
                    if (mm == null) {
                        mm = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mm;
    }

    public final void o(final Activity activity, final TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
        boolean z2;
        o0n.m();
        if (activity == null) {
            if (o0n.m().m0o()) {
                m("showGDPRConsentDialog fail:activity is null!");
            }
            o(tUGDPRConsentDismissListener, "activity is null!", -1);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        try {
            o0.o(applicationContext);
            z2 = true;
        } catch (Throwable unused) {
            z2 = false;
        }
        final boolean z3 = z2;
        if (o0n.m().m0o()) {
            m("Has UMP SDK:".concat(String.valueOf(z3)));
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.mo.n.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!TextUtils.isEmpty(o.o(applicationContext).m())) {
                    if (z3) {
                        o0.o(applicationContext).o(activity, new o0.o() { // from class: com.thinkup.core.common.mo.n.1.1
                            @Override // com.thinkup.core.common.mo.o0.o
                            public final void o(boolean z4) {
                                n.m("(UMP Update)UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z4)));
                            }

                            @Override // com.thinkup.core.common.mo.o0.o
                            public final void o(String str) {
                                n.m("(UMP Update)UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                        });
                    }
                    n.this.o(tUGDPRConsentDismissListener, "", 101);
                } else {
                    if (!z3) {
                        n.this.o(applicationContext, tUGDPRConsentDismissListener);
                        return;
                    }
                    o0.o(applicationContext).o(activity, new o0.o() { // from class: com.thinkup.core.common.mo.n.1.2
                        @Override // com.thinkup.core.common.mo.o0.o
                        public final void o(boolean z4) {
                            if (o0n.m().m0o()) {
                                n.m("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z4)));
                            }
                            if (z4) {
                                n.n(applicationContext);
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            n.this.o(tUGDPRConsentDismissListener, "", z4 ? 105 : 103);
                        }

                        @Override // com.thinkup.core.common.mo.o0.o
                        public final void o(String str) {
                            if (o0n.m().m0o()) {
                                n.m("UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                            if (o0.o(applicationContext).o()) {
                                n.m("UMP canRequestAd:true after onConsentFail");
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                n.this.o(tUGDPRConsentDismissListener, "", 106);
                            } else {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                n.this.o(applicationContext, tUGDPRConsentDismissListener);
                            }
                        }
                    });
                    if (o0.o(applicationContext).o()) {
                        n.m("UMP canRequestAd:true");
                        n.this.o(tUGDPRConsentDismissListener, "", 104);
                    }
                }
            }
        }, 2);
    }

    public final void o(final Context context, final TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
        if (oom.o(context).o() != 2) {
            o(tUGDPRConsentDismissListener, "", 101);
        } else {
            TUSDK.checkIsEuTraffic(context, new NetTrafficeCallback() { // from class: com.thinkup.core.common.mo.n.2
                @Override // com.thinkup.core.api.NetTrafficeCallback
                public final void onErrorCallback(String str) {
                    n.this.o(tUGDPRConsentDismissListener, str, -1);
                }

                @Override // com.thinkup.core.api.NetTrafficeCallback
                public final void onResultCallback(boolean z2) {
                    if (z2) {
                        oom.o(context).o(context, new TUGDPRAuthCallback() { // from class: com.thinkup.core.common.mo.n.2.1
                            @Override // com.thinkup.core.api.TUGDPRAuthCallback
                            public final void onAuthResult(int i2) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                n.this.o(tUGDPRConsentDismissListener, "", 100);
                            }

                            @Override // com.thinkup.core.api.TUGDPRAuthCallback
                            public final void onPageLoadFail() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                n.this.o(tUGDPRConsentDismissListener, "showUploadDataNotifyDialog onPageLoadFail", -1);
                            }
                        });
                    } else {
                        n.this.o(tUGDPRConsentDismissListener, "", 102);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(final TUGDPRConsentDismissListener tUGDPRConsentDismissListener, final String str, final int i2) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.mo.n.3
            @Override // java.lang.Runnable
            public final void run() {
                if (tUGDPRConsentDismissListener == null || n.this.o0o.contains(Integer.valueOf(tUGDPRConsentDismissListener.hashCode()))) {
                    return;
                }
                n.this.o0o.add(Integer.valueOf(tUGDPRConsentDismissListener.hashCode()));
                tUGDPRConsentDismissListener.onDismiss(new TUGDPRConsentDismissListener.ConsentDismissInfo(str, i2));
            }
        });
    }

    public final synchronized void o(Context context) {
        boolean zO;
        try {
            if (TextUtils.isEmpty(this.nm)) {
                this.nm = o.o(context).m();
                this.o00 = o.o(context).o0();
                this.nn = o.o(context).n();
            }
            m("IABTCF_TCString:" + this.nm);
            m("IABTCF_VendorConsents:" + this.o00);
            m("IABTCF_AddtlConsent:" + this.nn);
            if (TextUtils.isEmpty(this.nm)) {
                this.no = true;
                return;
            }
            this.no = false;
            this.n0.clear();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.nn)) {
                try {
                    String[] strArrSplit = this.nn.split("~");
                    if (strArrSplit.length >= 2) {
                        for (String str : strArrSplit[1].split("\\.")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            for (Map.Entry<Integer, m> entry : this.mn.entrySet()) {
                Integer key = entry.getKey();
                m value = entry.getValue();
                int iN = value.n();
                if (iN == 1) {
                    zO = o(this.o00, value.m());
                } else {
                    if (iN == 2) {
                        zO = arrayList.size() == 0 ? false : arrayList.contains(Integer.valueOf(value.m()));
                    }
                    this.n0.put(key, value);
                    m("initNetworkConsentMap " + value.o() + ":" + value.o0());
                }
                value.o(zO);
                this.n0.put(key, value);
                m("initNetworkConsentMap " + value.o() + ":" + value.o0());
            }
            n(context);
            StringBuilder sb = new StringBuilder("initNetworkConsentMap others:");
            sb.append(oom.o(context).o() == 0);
            m(sb.toString());
            this.no = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean o(Context context, int i2) {
        m mVar;
        if (this.n0.size() > 0 && (mVar = this.n0.get(Integer.valueOf(i2))) != null) {
            return mVar.o0();
        }
        return oom.o(context).n();
    }

    private static boolean o(String str, int i2) {
        if (!TextUtils.isEmpty(str) && i2 > 0) {
            try {
                if (str.length() >= i2 && str.charAt(i2 - 1) == '1') {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean o(List<Integer> list, int i2) {
        if (list.size() == 0) {
            return false;
        }
        return list.contains(Integer.valueOf(i2));
    }

    public final synchronized JSONObject o(JSONObject jSONObject) {
        if (!m() && TextUtils.isEmpty(this.nm)) {
            this.nm = o.o(o0n.m().on()).m();
            this.o00 = o.o(o0n.m().on()).o0();
            this.nn = o.o(o0n.m().on()).n();
        }
        try {
            if (!TextUtils.isEmpty(this.nm)) {
                jSONObject.put("tc_string", this.nm);
            }
            if (!TextUtils.isEmpty(this.nn)) {
                jSONObject.put("addtl_consent", this.nn);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
