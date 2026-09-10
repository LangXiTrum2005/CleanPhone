package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f7954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f7955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f7956d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f7957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ListView f7958f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return g0.this.f7955c;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return g0.this.f7955c.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return new x4("");
        }
    }

    private int b(boolean z10) {
        return getColor(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_checkmarkColor);
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f7953a;
    }

    public void initialize(List<f0> list, com.applovin.impl.sdk.l lVar) {
        this.f7953a = lVar;
        this.f7955c = a(list);
        a aVar = new a(this);
        this.f7954b = aVar;
        aVar.a(new e9(this, list, 0));
        this.f7954b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Axon Events");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7958f = listView;
        listView.setAdapter((ListAdapter) this.f7954b);
        TextView textView = new TextView(this);
        this.f7957e = textView;
        textView.setGravity(17);
        this.f7957e.setTextSize(18.0f);
        this.f7957e.setText(R.string.applovin_mediation_debugger_no_axon_events_text);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.default_margin);
        this.f7957e.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ((FrameLayout) findViewById(android.R.id.content)).addView(this.f7957e, new FrameLayout.LayoutParams(-1, -1, 17));
        a();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.axon_events_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_clear) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f7953a.G().clearTrackedAxonEvents();
        this.f7955c.clear();
        this.f7954b.notifyDataSetChanged();
        a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, l2 l2Var, t2 t2Var) {
        int iA = l2Var.a();
        if (this.f7956d.contains(Integer.valueOf(iA))) {
            this.f7956d.remove(Integer.valueOf(iA));
        } else {
            this.f7956d.add(Integer.valueOf(iA));
        }
        this.f7955c = a(list);
        this.f7954b.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            f0 f0Var = (f0) list.get(i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strA = f0Var.a();
            boolean zIsValidString = StringUtils.isValidString(strA);
            if (this.f7956d.contains(Integer.valueOf(i10))) {
                Map mapD = f0Var.d();
                Map mapC = f0Var.c();
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("PARAMETERS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(!mapD.isEmpty() ? JsonUtils.maybeConvertToIndentedString(new JSONObject(mapD)) : "None", -16777216));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nOPTIONS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(mapC.isEmpty() ? "None" : JsonUtils.maybeConvertToIndentedString(new JSONObject(mapC)), -16777216));
                if (zIsValidString) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nERROR: ", -65536));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(strA, -65536));
                }
            }
            arrayList.add(t2.a(t2.c.DETAIL).b(StringUtils.createSpannedString(f0Var.b(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(a(zIsValidString)).b(b(zIsValidString)).a(true).a());
        }
        return arrayList;
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_check_mark_bordered;
    }

    private void a() {
        if (this.f7955c.isEmpty()) {
            this.f7957e.setVisibility(0);
            this.f7958f.setVisibility(8);
        } else {
            this.f7957e.setVisibility(8);
            this.f7958f.setVisibility(0);
        }
    }
}
