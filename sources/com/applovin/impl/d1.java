package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f7697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f7698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f7699c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f7700a;

        /* JADX INFO: renamed from: com.applovin.impl.d1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0005a implements d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l2 f7702a;

            public C0005a(l2 l2Var) {
                this.f7702a = l2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((r1) d1.this.f7697a.d().get(this.f7702a.a()), d1.this.f7697a.e());
            }
        }

        public a(c cVar) {
            this.f7700a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() != e1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(d1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f7700a, new C0005a(l2Var));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f7698b = (FrameLayout) findViewById(android.R.id.content);
        this.f7699c = (ListView) findViewById(R.id.listView);
        g8.a(this.f7698b, com.applovin.impl.sdk.l.E0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.f7697a;
        if (e1Var != null) {
            e1Var.a((u2.a) null);
            this.f7697a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        e1 e1Var = this.f7697a;
        if (e1Var == null) {
            finish();
            return;
        }
        this.f7699c.setAdapter((ListAdapter) e1Var);
        e1 e1Var2 = this.f7697a;
        if (e1Var2 != null && !e1Var2.e().z().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        e1 e1Var3 = this.f7697a;
        if (e1Var3 == null || !e1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(e1 e1Var, c cVar) {
        this.f7697a = e1Var;
        e1Var.a(new a(cVar));
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f7698b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f7698b.bringChildToFront(textView);
    }
}
