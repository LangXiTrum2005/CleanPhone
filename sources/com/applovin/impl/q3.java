package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.C0239a2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q3 extends u2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;
    private List D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.l f9048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f9049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f9050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f9051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f9052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9054k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f9055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final StringBuilder f9056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f9057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f9059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f9060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f9061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f9062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f9063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f9064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f9065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f9066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f9067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f9068z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9069a;

        static {
            int[] iArr = new int[b0.b.values().length];
            f9069a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9069a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9069a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9069a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9069a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        EVENTS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public q3(Context context) {
        super(context);
        this.f9056n = new StringBuilder("");
        this.f9057o = new AtomicBoolean();
        this.f9059q = new ArrayList();
        this.f9060r = new ArrayList();
        this.f9061s = new ArrayList();
        this.f9062t = new ArrayList();
        this.f9063u = new ArrayList();
        this.f9064v = new ArrayList();
        this.f9065w = new ArrayList();
        this.f9066x = new ArrayList();
        this.f9067y = new ArrayList();
        this.f9068z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    private void A() {
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + q7.c(this.f9048e));
        sb2.append("\nTest Mode - ".concat(this.f9048e.u0().c() ? "enabled" : C0239a2.f28155e));
        sb2.append("\nTarget SDK - " + this.f9048e.B().G().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f9048e.a(z4.R3);
        String strB = j.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb4.append(strB);
        sb2.append(sb4.toString());
        if (this.f9048e.J0()) {
            String strA = q7.a(this.f9048e.p0());
            StringBuilder sb5 = new StringBuilder("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(strA) ? strA : "None");
            sb2.append(sb5.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(q0.a(this.f9816a));
        sb2.append(this.f9048e.y().e());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f9048e.t0().i());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb2.append(((d7) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f9060r.iterator();
        while (it2.hasNext()) {
            a(sb2, ((g3) it2.next()).j());
        }
        Iterator it3 = this.f9059q.iterator();
        while (it3.hasNext()) {
            a(sb2, ((g3) it3.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f9050g.iterator();
        while (it4.hasNext()) {
            a(sb2, ((n) it4.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.p.g("MediationDebuggerListAdapter", sb2.toString());
        this.f9056n.append(sb2.toString());
    }

    private List g() {
        boolean zC = this.f9048e.u0().c();
        List listB = this.f9048e.u0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo packageInfoA = q7.a(this.f9816a, 0);
        String str = packageInfoA != null ? packageInfoA.versionName : null;
        arrayList.add(t2.a().d("Package Name").c(this.f9816a.getPackageName()).a());
        t2.b bVarD = t2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(t2.a().d("OS").c(q7.d()).a());
        arrayList.add(t2.a().d("Account").c(StringUtils.isValidString(this.l) ? this.l : "None").a());
        arrayList.add(t2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f9048e.X()) ? this.f9048e.X() : "None").a());
        arrayList.add(t2.a().d("OM SDK Version").c(this.f9048e.g0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.l.H0()));
        return arrayList;
    }

    private t2 l() {
        String strD = this.f9048e.t0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f9048e.t0().j());
        t2.b bVarD = t2.a(t2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        t2.b bVarC = bVarD.c(strD);
        if (this.f9055m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f9816a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z10 = this.f9048e.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(this.f9816a.getColor(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor));
            }
        }
        return bVarC.a();
    }

    private t2 m() {
        return t2.a().d("MAX Terms and Privacy Policy Flow").a(this.f9816a).a(true).a();
    }

    private List n() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t2.a().d("View Axon Events").a(this.f9816a).a(true).a());
        return arrayList;
    }

    private t2 o() {
        boolean zHasSupportedCmp = this.f9048e.t().hasSupportedCmp();
        return t2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(this.f9816a.getColor(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List r() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(t2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f9048e.a(z4.R3);
        t2.b bVarD = t2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f9048e.J0()) {
            String strA = q7.a(this.f9048e.p0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f9048e.y().j()) {
            arrayList.add(m());
            arrayList.add(o());
            return arrayList;
        }
        if (this.f9048e.y().l()) {
            arrayList.add(v());
        }
        return arrayList;
    }

    private t2 s() {
        return t2.a().d("Network Consent Statuses").a(this.f9816a).a(true).a();
    }

    private List t() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f9048e.t0().j())) {
            arrayList.add(s());
        } else {
            arrayList.add(new t4(q0.b(), false, this.f9816a));
        }
        arrayList.add(new t4(q0.a(), true, this.f9816a));
        return arrayList;
    }

    private t2 v() {
        return t2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(this.f9816a.getColor(R.color.applovin_sdk_xmarkColor)).b("Terms Flow has been replaced").a(this.f9048e.y().g()).a(true).a();
    }

    public boolean a(t2 t2Var) {
        if (t2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(t2Var.k().toString());
    }

    public void b(boolean z10) {
        this.f9058p = z10;
    }

    @Override // com.applovin.impl.u2
    public List c(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f9065w;
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f9066x;
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f9067y;
        }
        if (i10 == e.ADS.ordinal()) {
            return this.f9068z;
        }
        if (i10 == e.EVENTS.ordinal()) {
            return this.A;
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B;
        }
        return i10 == e.COMPLETED_NETWORKS.ordinal() ? this.C : this.D;
    }

    public List d() {
        ArrayList<d7> arrayList = new ArrayList();
        Iterator it = this.f9049f.iterator();
        while (it.hasNext()) {
            arrayList.add(((g3) it.next()).t());
        }
        String strK = this.f9048e.t0().k();
        if (strK != null) {
            String strC = this.f9048e.t0().c();
            for (d7 d7Var : arrayList) {
                if (d7Var.f() == d7.a.TCF_VENDOR && d7Var.d() != null) {
                    d7Var.a(Boolean.valueOf(f7.a(strK, d7Var.d().intValue() - 1)));
                } else if (d7Var.f() == d7.a.ATP_NETWORK && d7Var.d() != null) {
                    d7Var.a(f7.a(d7Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((d7) it2.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u2
    public t2 e(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return new x4("APP INFO");
        }
        if (i10 == e.MAX.ordinal()) {
            return new x4("MAX");
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return new x4("PRIVACY");
        }
        if (i10 == e.ADS.ordinal()) {
            return new x4("ADS");
        }
        if (i10 == e.EVENTS.ordinal()) {
            return new x4("EVENTS");
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return new x4("INCOMPLETE SDK INTEGRATIONS");
        }
        return i10 == e.COMPLETED_NETWORKS.ordinal() ? new x4("COMPLETED SDK INTEGRATIONS") : new x4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.f9050g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f9054k;
    }

    public String i() {
        return this.f9053j;
    }

    public List k() {
        return this.f9062t;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9067y = t();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f9059q);
            this.C = a(this.f9060r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9068z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9068z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public List p() {
        return this.f9051h;
    }

    public String q() {
        return this.f9056n.toString();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f9057o.get() + "}";
    }

    public com.applovin.impl.sdk.l u() {
        return this.f9048e;
    }

    public List w() {
        return this.f9064v;
    }

    public List x() {
        return this.f9063u;
    }

    public boolean y() {
        return this.f9058p;
    }

    public boolean z() {
        return this.f9057o.get();
    }

    @Override // com.applovin.impl.u2
    public int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVarF = ((n) it.next()).f();
            Iterator it2 = oVarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((k8) it2.next()).b());
            }
            Iterator it3 = oVarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((k8) it3.next()).b());
            }
        }
        this.f9062t = new ArrayList(hashSet);
        this.f9063u = new ArrayList(hashSet2);
        Collections.sort(this.f9062t);
        Collections.sort(this.f9063u);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z10, com.applovin.impl.sdk.l lVar) {
        this.f9048e = lVar;
        this.f9049f = list;
        this.f9050g = list2;
        this.f9051h = list3;
        this.f9052i = list4;
        this.f9053j = str;
        this.f9054k = str2;
        this.l = str3;
        this.f9055m = z10;
        if (list != null && this.f9057o.compareAndSet(false, true)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f9060r);
            this.f9065w.addAll(j());
            this.f9066x.addAll(r());
            this.f9067y.addAll(t());
            this.f9068z.addAll(g());
            this.A.addAll(n());
            this.B = a(this.f9059q);
            this.C = a(this.f9060r);
            this.D = a(this.f9061s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f9816a).subscribe(this, arrayList);
            A();
        }
        AppLovinSdkUtils.runOnUiThread(new u9(this, 14));
    }

    @Override // com.applovin.impl.u2
    public int d(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f9065w.size();
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f9066x.size();
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f9067y.size();
        }
        if (i10 == e.ADS.ordinal()) {
            return this.f9068z.size();
        }
        if (i10 == e.EVENTS.ordinal()) {
            if (this.f9048e.G().isAxonEventTracked()) {
                return this.A.size();
            }
            return 0;
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    private t2 b(String str, String str2) {
        t2.b bVarD = t2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(this.f9816a.getColor(R.color.applovin_sdk_xmarkColor));
        }
        return bVarD.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (!g3Var.G()) {
                if (g3Var.q() != g3.a.INCOMPLETE_INTEGRATION && g3Var.q() != g3.a.INVALID_INTEGRATION) {
                    if (g3Var.q() == g3.a.COMPLETE) {
                        this.f9060r.add(g3Var);
                    } else if (g3Var.q() == g3.a.MISSING) {
                        this.f9061s.add(g3Var);
                    }
                } else {
                    this.f9059q.add(g3Var);
                }
            }
        }
    }

    private t2 e() {
        String strQ;
        t2.b bVarD = t2.a().d("Ad Review Version");
        String strB = j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f9048e.k0())) {
                strQ = null;
            } else {
                strQ = defpackage.e.q(this.f9048e.J0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.", new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "));
            }
        } else {
            strQ = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (strQ != null) {
            bVarD.b("MAX Ad Review").a(strQ).a(R.drawable.applovin_ic_x_mark).b(this.f9816a.getColor(R.color.applovin_sdk_xmarkColor)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private t2 b(String str) {
        t2.b bVarA = t2.a();
        if (this.f9048e.u0().c()) {
            bVarA.a(this.f9816a);
        }
        t2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f9048e.u0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (g3Var.y() == g3.b.READY) {
                this.f9064v.add(g3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(z zVar, String str) {
        String strA;
        c cVarA;
        c cVar;
        String strO;
        List<a0> listA = b0.a(zVar, this.f9052i);
        if (listA.isEmpty()) {
            strO = defpackage.e.o("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : listA) {
                this.f9048e.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVarQ = this.f9048e.Q();
                    StringBuilder sbJ = d5.u.j(str, " is missing a required entry: ");
                    sbJ.append(a0Var2.d());
                    pVarQ.b("MediationDebuggerListAdapter", sbJ.toString());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, a0Var.d());
                cVarA = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str2 = strA;
            cVar = cVarA;
            strO = str2;
        }
        this.f9066x.add(a(strO, cVar));
        c();
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.f9048e.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f9048e.Q().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f9066x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (str.length() + string.length() >= ((Integer) this.f9048e.a(z4.f10238r)).intValue()) {
            com.applovin.impl.sdk.p.g("MediationDebuggerListAdapter", string);
            this.f9056n.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(t2.a().d("View Ad Units (" + this.f9050g.size() + ")").a(this.f9816a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f9051h.isEmpty()) {
            arrayList.add(t2.a().d("Selective Init Ad Units (" + this.f9051h.size() + ")").a(this.f9816a).a(true).a());
        }
        arrayList.add(t2.a().d("Test Mode Enabled").c(String.valueOf(this.f9048e.u0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b4((g3) it.next(), this.f9816a));
        }
        return arrayList;
    }

    private t2 a(String str) {
        t2.b bVarA = t2.a();
        if (!this.f9048e.u0().c()) {
            bVarA.a(this.f9816a);
        }
        t2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f9048e.u0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private t2 a(boolean z10) {
        return t2.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(this.f9816a.getColor(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z10).a();
    }

    private t2 a(String str, c cVar) {
        int i10;
        int color;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            color = this.f9816a.getColor(R.color.applovin_sdk_checkmarkColor);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            color = this.f9816a.getColor(R.color.applovin_sdk_warningColor);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            color = this.f9816a.getColor(R.color.applovin_sdk_xmarkColor);
        }
        return t2.a().d("app-ads.txt").a(i10).b(color).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.f9069a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i10 == 3) {
            return defpackage.e.o("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i10 == 4) {
            return l1.d.h("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i10 != 5) {
            return "";
        }
        return defpackage.e.o("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    private c a(b0.b bVar) {
        int i10 = a.f9069a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return c.ERROR;
        }
        if (i10 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (w2 w2Var : this.f9062t) {
                if (list.equals(w2Var.b())) {
                    return w2Var.a();
                }
            }
            for (w2 w2Var2 : this.f9063u) {
                if (list.equals(w2Var2.b())) {
                    return w2Var2.a();
                }
            }
        } else {
            for (g3 g3Var : this.f9064v) {
                if (list.equals(g3Var.u())) {
                    return g3Var.g();
                }
            }
        }
        return String.join(",", list);
    }
}
