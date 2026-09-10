package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r1 f8946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f8948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f8949d;

    private void b() {
        x2 x2Var = new x2();
        x2Var.a(this.f8947b.z().a(this.f8946a));
        String strB = this.f8947b.z().b(this.f8946a);
        if (strB != null) {
            x2Var.a("\nBid Response Preview:\n");
            x2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f8948c = textView;
        textView.setText(x2Var.toString());
        this.f8948c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f8946a.d() + " - " + this.f8946a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        g8.a(findViewById(android.R.id.content), this.f8947b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f8949d = button;
        button.setOnClickListener(new c9(this, 1));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f8947b.z().a(this.f8946a, (Context) this, false);
        return true;
    }

    public void a(r1 r1Var, com.applovin.impl.sdk.l lVar) {
        this.f8946a = r1Var;
        this.f8947b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f8947b.z().a(this.f8946a, (Context) this, true);
    }

    private boolean a() {
        return (this.f8946a == null || this.f8947b == null) ? false : true;
    }
}
