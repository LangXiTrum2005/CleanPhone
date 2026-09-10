package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f8805b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f8806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f8807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f8808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f8809h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f8810i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f8806e = list;
            this.f8807f = list2;
            this.f8808g = list3;
            this.f8809h = list4;
            this.f8810i = list5;
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f8806e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f8807f;
            } else {
                z10 = false;
                if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f8808g;
                } else {
                    list = i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f8809h : this.f8810i;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n0.this.a((d7) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f8806e.size();
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f8807f.size();
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f8808g.size();
            }
            return i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f8809h.size() : this.f8810i.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new x4("MISSING TCF VENDORS (TC STRING)");
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new x4("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new x4("LISTED TCF VENDORS (TC STRING)");
            }
            return i10 == c.LISTED_AC_NETWORKS.ordinal() ? new x4("LISTED ATP NETWORKS (AC STRING)") : new x4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements u2.a {
        public b() {
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            q7.a(t2Var.c(), t2Var.b(), n0.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f8804a;
    }

    public void initialize(List<d7> list, List<d7> list2, List<d7> list3, List<d7> list4, List<d7> list5, com.applovin.impl.sdk.l lVar) {
        this.f8804a = lVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f8805b = aVar;
        aVar.a(new b());
        this.f8805b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f8805b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(d7 d7Var, boolean z10) {
        t2.b bVarA = t2.a();
        boolean zB = this.f8804a.t0().b();
        d7.a aVarF = d7Var.f();
        d7.a aVar = d7.a.TCF_VENDOR;
        if (aVarF == aVar || (d7Var.f() == d7.a.ATP_NETWORK && zB)) {
            String strC = d7Var.c();
            String str = d7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            t2.b bVarB = bVarA.d(strC).d(z10 ? -65536 : -16777216).b(strC);
            StringBuilder sbI = d5.u.i(str);
            sbI.append(d7Var.d());
            bVarB.a(sbI.toString()).a(true);
        } else {
            bVarA.d(d7Var.b());
        }
        return bVarA.a();
    }
}
