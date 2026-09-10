package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o3 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q3 f8876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f8877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f8878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f8879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f8880e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            o3.this.a();
            o3 o3Var = o3.this;
            o3Var.b((Context) o3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f8882a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements com.applovin.impl.d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(o3.this.f8876a.u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0012b implements com.applovin.impl.d.b {
            public C0012b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(o3.this.f8876a.d(), o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class c implements com.applovin.impl.d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(o3.this.f8876a.d(), o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class d implements com.applovin.impl.d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.f8876a.f(), false, o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class e implements com.applovin.impl.d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(o3.this.f8876a.k(), o3.this.f8876a.x(), o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class f implements com.applovin.impl.d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(o3.this.f8876a.w(), o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class g implements com.applovin.impl.d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.f8876a.p(), true, o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class h implements com.applovin.impl.d.b {
            public h() {
            }

            @Override // com.applovin.impl.d.b
            public void a(g0 g0Var) {
                g0Var.initialize(o3.this.f8876a.u().G().getTrackedAxonEvents(), o3.this.f8876a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class i implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f8892a;

            public i(t2 t2Var) {
                this.f8892a = t2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((b4) this.f8892a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.f8882a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            int iB = l2Var.b();
            if (iB == q3.e.APP_INFO.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), o3.this);
                return;
            }
            if (iB == q3.e.MAX.ordinal()) {
                if (o3.this.f8876a.a(t2Var)) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerUnifiedFlowActivity.class, this.f8882a, new a());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (iB == q3.e.PRIVACY.ordinal()) {
                if (l2Var.a() != q3.d.CMP.ordinal()) {
                    if (l2Var.a() == q3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f8882a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(o3.this.f8876a.u().t0().j())) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTcfInfoListActivity.class, this.f8882a, new C0012b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (iB != q3.e.ADS.ordinal()) {
                if (iB == q3.e.EVENTS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAxonEventsListActivity.class, this.f8882a, new h());
                    return;
                } else {
                    if ((iB == q3.e.INCOMPLETE_NETWORKS.ordinal() || iB == q3.e.COMPLETED_NETWORKS.ordinal()) && (t2Var instanceof b4)) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerDetailActivity.class, this.f8882a, new i(t2Var));
                        return;
                    }
                    return;
                }
            }
            if (l2Var.a() == q3.b.AD_UNITS.ordinal()) {
                if (o3.this.f8876a.f().size() > 0) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.f8882a, new d());
                    return;
                } else {
                    q7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", o3.this);
                    return;
                }
            }
            if (l2Var.a() == q3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (o3.this.f8876a.k().size() <= 0 && o3.this.f8876a.x().size() <= 0) {
                    q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
                    return;
                } else if (o3.this.f8876a.u().u0().c()) {
                    q7.a("Restart Required", t2Var.b(), o3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f8882a, new e());
                    return;
                }
            }
            if (l2Var.a() != q3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (l2Var.a() == q3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.f8882a, new g());
                }
            } else if (!o3.this.f8876a.u().u0().c()) {
                o3.this.getSdk().u0().a();
                q7.a("Restart Required", t2Var.b(), o3.this);
            } else if (o3.this.f8876a.w().size() > 0) {
                com.applovin.impl.d.a(o3.this, MaxDebuggerTestModeNetworkActivity.class, this.f8882a, new f());
            } else {
                q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f8880e = aVar;
        aVar.setColor(-3355444);
        this.f8878c.addView(this.f8880e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8878c.bringChildToFront(this.f8880e);
        this.f8880e.a();
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        q3 q3Var = this.f8876a;
        if (q3Var != null) {
            return q3Var.u();
        }
        return null;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f8878c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f8879d = listView;
        listView.setAdapter((ListAdapter) this.f8876a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q3 q3Var = this.f8876a;
        if (q3Var != null) {
            q3Var.unregisterDataSetObserver(this.f8877b);
            this.f8876a.a((u2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        q3 q3Var = this.f8876a;
        if (q3Var == null || !q3Var.z()) {
            return;
        }
        this.f8876a.c();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        q3 q3Var = this.f8876a;
        if (q3Var == null || q3Var.z()) {
            return;
        }
        c();
    }

    public void setListAdapter(q3 q3Var, c cVar) {
        DataSetObserver dataSetObserver;
        q3 q3Var2 = this.f8876a;
        if (q3Var2 != null && (dataSetObserver = this.f8877b) != null) {
            q3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f8876a = q3Var;
        this.f8877b = new a();
        b((Context) this);
        this.f8876a.registerDataSetObserver(this.f8877b);
        this.f8876a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f8880e;
        if (aVar != null) {
            aVar.b();
            this.f8878c.removeView(this.f8880e);
            this.f8880e = null;
        }
    }

    private void b() {
        q3 q3Var = this.f8876a;
        if (q3Var == null) {
            return;
        }
        String strQ = q3Var.q();
        if (TextUtils.isEmpty(strQ)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strQ);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        q7.a(this.f8876a.i(), this.f8876a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.f8876a.h()) || this.f8876a.y()) {
            return;
        }
        this.f8876a.b(true);
        runOnUiThread(new x8(13, this, context));
    }
}
