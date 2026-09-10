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
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0956q extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f11504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f11505c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f11506e;

    /* JADX INFO: renamed from: com.applovin.impl.q$a */
    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f11507e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f11507e = list;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        public List c(int i2) {
            return AbstractActivityC0956q.this.f11505c;
        }

        @Override // com.applovin.impl.s2
        public int d(int i2) {
            return this.f11507e.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i2) {
            return new v4("");
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f11503a;
    }

    public void initialize(List<C0950n> list, boolean z2, com.applovin.impl.sdk.k kVar) {
        this.d = z2;
        this.f11503a = kVar;
        this.f11505c = a(list);
        a aVar = new a(this, list);
        this.f11504b = aVar;
        aVar.a(new androidx.media3.exoplayer.analytics.o(this, list, kVar, 5));
        this.f11504b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f11506e = listView;
        listView.setAdapter((ListAdapter) this.f11504b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        final C0950n c0950n = (C0950n) list.get(j2Var.a());
        if (c0950n.g().size() == 1) {
            final int i2 = 0;
            AbstractC0930d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new AbstractC0930d.b() { // from class: com.applovin.impl.F0
                @Override // com.applovin.impl.AbstractC0930d.b
                public final void a(Activity activity) {
                    switch (i2) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c0950n, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c0950n, kVar);
                            break;
                    }
                }
            });
        } else {
            final int i3 = 1;
            AbstractC0930d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new AbstractC0930d.b() { // from class: com.applovin.impl.F0
                @Override // com.applovin.impl.AbstractC0930d.b
                public final void a(Activity activity) {
                    switch (i3) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c0950n, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c0950n, kVar);
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
            C0950n c0950n = (C0950n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c0950n.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c0950n.b(), -16777216));
            arrayList.add(r2.a(r2.c.DETAIL).b(StringUtils.createSpannedString(c0950n.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
