package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z6 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f10305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f10306b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f10307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f10308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10309g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f10307e = arrayList;
            this.f10308f = arrayList2;
            this.f10309g = z10;
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f10307e : this.f10308f;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f10307e.size() : this.f10308f.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new x4("TCF VENDORS (TC STRING)");
            }
            return new x4(this.f10309g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private t2 a(String str, String str2) {
        return t2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f10305a;
    }

    public void initialize(List<d7> list, com.applovin.impl.sdk.l lVar) {
        this.f10305a = lVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = q0.b().a(this);
        boolean zB = lVar.t0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (d7 d7Var : list) {
            Boolean boolA = d7Var.a();
            if (boolA != null) {
                if (d7Var.f() == d7.a.TCF_VENDOR) {
                    arrayList.add(a(d7Var.b(), String.valueOf(boolA)));
                } else if (d7Var.f() == d7.a.ATP_NETWORK) {
                    arrayList2.add(a(d7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && d7Var.f() == d7.a.ATP_NETWORK) {
                arrayList2.add(a(d7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f10306b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f10306b);
    }
}
