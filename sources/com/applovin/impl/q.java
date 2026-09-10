package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f9026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f9027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f9028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f9030e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f9031e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f9031e = list;
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return q.this.f9028c;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return this.f9031e.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return new x4("");
        }
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f9026a;
    }

    public void initialize(List<n> list, boolean z10, com.applovin.impl.sdk.l lVar) {
        this.f9029d = z10;
        this.f9026a = lVar;
        this.f9028c = a(list);
        a aVar = new a(this, list);
        this.f9027b = aVar;
        aVar.a(new ac.a(this, list, lVar, 6));
        this.f9027b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f9029d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9030e = listView;
        listView.setAdapter((ListAdapter) this.f9027b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.l lVar, l2 l2Var, t2 t2Var) {
        final n nVar = (n) list.get(l2Var.a());
        if (nVar.g().size() == 1) {
            final int i10 = 0;
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.y9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, lVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, lVar);
                            break;
                    }
                }
            });
        } else {
            final int i11 = 1;
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.y9
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i11) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, lVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, lVar);
                            break;
                    }
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.b(), -16777216));
            arrayList.add(t2.a(t2.c.DETAIL).b(StringUtils.createSpannedString(nVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
