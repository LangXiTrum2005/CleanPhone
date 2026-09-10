package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7801c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f7801c);
        intent.putExtra("android.intent.extra.TITLE", this.f7800b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f7800b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f7799a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.l lVar) {
        this.f7799a = lVar;
        this.f7800b = str;
        this.f7801c = str2;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f7800b);
        ((TextView) findViewById(R.id.textView)).setText(this.f7801c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
