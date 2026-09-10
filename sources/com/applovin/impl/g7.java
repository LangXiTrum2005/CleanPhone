package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f8030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f8031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u2 f8032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f8033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f8034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListView f8035g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        public t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return i10 == c.BIDDERS.ordinal() ? g7.this.f8033e : g7.this.f8034f;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return i10 == c.BIDDERS.ordinal() ? g7.this.f8033e.size() : g7.this.f8034f.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return i10 == c.BIDDERS.ordinal() ? new x4("BIDDERS") : new x4("WATERFALL");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends b4 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w2 f8037p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g3 g3Var, Context context, w2 w2Var) {
            super(g3Var, context);
            this.f8037p = w2Var;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int d() {
            if (g7.this.f8029a.u0().b() == null || !g7.this.f8029a.u0().b().equals(this.f8037p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int e() {
            if (g7.this.f8029a.u0().b() == null || !g7.this.f8029a.u0().b().equals(this.f8037p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.t2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f8037p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public g7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f8029a;
    }

    public void initialize(List<w2> list, List<w2> list2, com.applovin.impl.sdk.l lVar) {
        this.f8029a = lVar;
        this.f8030b = list;
        this.f8031c = list2;
        this.f8033e = a(list);
        this.f8034f = a(list2);
        a aVar = new a(this);
        this.f8032d = aVar;
        aVar.a(new e9(this, lVar, 1));
        this.f8032d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8035g = listView;
        listView.setAdapter((ListAdapter) this.f8032d);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f8033e = a(this.f8030b);
        this.f8034f = a(this.f8031c);
        this.f8032d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.l lVar, l2 l2Var, t2 t2Var) {
        List listB = a(l2Var).b();
        if (listB.equals(lVar.u0().b())) {
            lVar.u0().a((List) null);
        } else {
            lVar.u0().a(listB);
        }
        this.f8032d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2 w2Var = (w2) it.next();
            arrayList.add(new b(w2Var.d(), this, w2Var));
        }
        return arrayList;
    }

    private w2 a(l2 l2Var) {
        if (l2Var.b() == c.BIDDERS.ordinal()) {
            return (w2) this.f8030b.get(l2Var.a());
        }
        return (w2) this.f8031c.get(l2Var.a());
    }
}
