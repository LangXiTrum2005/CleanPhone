package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f7572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7573c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7574d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f7575e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f7576f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7577g = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? b7.this.c() : b7.this.a();
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? new x4("IAB TCF Parameters") : new x4("CMP CONFIGURATION");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c7 f7579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f7580b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f7582a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f7583b;

            public a(String str, String str2) {
                this.f7582a = str;
                this.f7583b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f7582a, this.f7583b, b.this.f7580b);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.b7$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0004b implements com.applovin.impl.d.b {
            public C0004b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(b7.this.f7575e, b7.this.f7576f, b7.this.f7573c, b7.this.f7574d, b7.this.f7577g, b.this.f7580b);
            }
        }

        public b(c7 c7Var, com.applovin.impl.sdk.l lVar) {
            this.f7579a = c7Var;
            this.f7580b = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            String strA;
            String strC;
            if (l2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (l2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(b7.this, MaxDebuggerCmpNetworksListActivity.class, this.f7580b.e(), new C0004b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), b7.this);
                    return;
                }
            }
            if (l2Var.a() == d.TC_STRING.ordinal()) {
                strA = b5.f7565x.a();
                strC = this.f7579a.j();
            } else {
                strA = b5.f7566y.a();
                strC = this.f7579a.c();
            }
            com.applovin.impl.d.a(b7.this, MaxDebuggerTcfStringActivity.class, this.f7580b.e(), new a(strA, strC));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f7571a;
    }

    public void initialize(List<d7> list, com.applovin.impl.sdk.l lVar) {
        this.f7571a = lVar;
        c7 c7VarT0 = lVar.t0();
        a(list);
        a aVar = new a(this);
        this.f7572b = aVar;
        aVar.a(new b(c7VarT0, lVar));
        this.f7572b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7572b);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f7572b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    private void a(List list) {
        boolean zB = this.f7571a.t0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d7 d7Var = (d7) it.next();
            if (d7Var.f() == d7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(d7Var.a())) {
                    a(d7Var, this.f7573c);
                } else {
                    a(d7Var, this.f7575e);
                }
            } else if (d7Var.f() != d7.a.ATP_NETWORK) {
                this.f7577g.add(d7Var);
            } else if (!zB) {
                this.f7577g.add(d7Var);
            } else if (Boolean.TRUE.equals(d7Var.a())) {
                a(d7Var, this.f7574d);
            } else {
                a(d7Var, this.f7576f);
            }
        }
    }

    private t2 b() {
        t2.b bVarA;
        String strA = b5.f7562u.a();
        Integer numE = this.f7571a.t0().e();
        if (StringUtils.isValidString(this.f7571a.t0().d())) {
            bVarA = t2.a(t2.c.RIGHT_DETAIL);
        } else {
            t2.b bVarB = t2.a(t2.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(getColor(R.color.applovin_sdk_warningColor)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? -16777216 : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f7571a.t0().g();
        String strJ = this.f7571a.t0().j();
        String strC = this.f7571a.t0().c();
        arrayList.add(a(b5.f7564w.a(), numG));
        arrayList.add(a(b5.f7565x.a(), strJ, !f7.b(strJ)));
        arrayList.add(a(b5.f7566y.a(), strC, false));
        return arrayList;
    }

    private void a(d7 d7Var, List list) {
        if (d7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (d7Var.d().equals(((d7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(d7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String strH;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f7576f.size() + this.f7575e.size();
        arrayList.add(b());
        arrayList.add(a(b5.f7563v.a(), this.f7571a.t0().f()));
        arrayList.add(t2.a(t2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        t2.b bVarD = t2.a(t2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            strH = defpackage.e.h(size, "Missing ", " network(s)");
        } else {
            strH = "";
        }
        arrayList.add(bVarD.c(strH).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private t2 a(String str, Integer num) {
        return t2.a(t2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private t2 a(String str, String str2, boolean z10) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        t2.b bVarD = t2.a(t2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        t2.b bVarA = bVarD.c(str2).c(z10 ? -65536 : -16777216).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
