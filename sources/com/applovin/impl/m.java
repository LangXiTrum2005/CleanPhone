package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class m extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f8378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f8379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8 f8380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f8383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f8384k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends b4 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final k8 f8390p;

        public b(k8 k8Var, String str, boolean z10) {
            super(k8Var.b().d(), m.this.f9816a);
            this.f8390p = k8Var;
            this.f9735c = StringUtils.createSpannedString(k8Var.b().a(), -16777216, 18, 1);
            this.f9736d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f9734b = z10;
        }

        @Override // com.applovin.impl.t2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public boolean o() {
            return this.f9734b;
        }

        public k8 v() {
            return this.f8390p;
        }
    }

    public m(n nVar, o oVar, k8 k8Var, Context context) {
        super(context);
        this.f8378e = nVar;
        this.f8380g = k8Var;
        this.f8379f = oVar != null ? oVar : nVar.f();
        this.f8381h = oVar != null ? oVar.c() : nVar.d();
        this.f8382i = h();
        this.f8383j = e();
        this.f8384k = l();
        notifyDataSetChanged();
    }

    private t2 f() {
        return t2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private t2 g() {
        return t2.a().d("ID").c(this.f8378e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f8379f.b() != null) {
            arrayList.add(f());
        }
        if (this.f8380g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private t2 i() {
        return t2.a().d("Selected Network").c(this.f8380g.b().a()).a();
    }

    private List l() {
        k8 k8Var = this.f8380g;
        if (k8Var != null && k8Var.d()) {
            return new ArrayList();
        }
        List<k8> listE = this.f8379f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (k8 k8Var2 : listE) {
            k8 k8Var3 = this.f8380g;
            if (k8Var3 == null || k8Var3.b().c().equals(k8Var2.b().c())) {
                arrayList.add(new b(k8Var2, null, this.f8380g == null));
                for (c4 c4Var : k8Var2.c()) {
                    arrayList.add(t2.a().d(c4Var.a()).c(c4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    public List c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f8382i;
        }
        return i10 == a.BIDDERS.ordinal() ? this.f8383j : this.f8384k;
    }

    @Override // com.applovin.impl.u2
    public int d(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f8382i.size();
        }
        return i10 == a.BIDDERS.ordinal() ? this.f8383j.size() : this.f8384k.size();
    }

    @Override // com.applovin.impl.u2
    public t2 e(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new x4("INFO");
        }
        return i10 == a.BIDDERS.ordinal() ? new x4("BIDDERS") : new x4("WATERFALL");
    }

    public o j() {
        return this.f8379f;
    }

    public String k() {
        return this.f8381h;
    }

    private t2 d() {
        return t2.a().d("Ad Format").c(this.f8378e.b()).a();
    }

    private List e() {
        k8 k8Var = this.f8380g;
        if (k8Var != null && !k8Var.d()) {
            return new ArrayList();
        }
        List<k8> listA = this.f8379f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (k8 k8Var2 : listA) {
            k8 k8Var3 = this.f8380g;
            if (k8Var3 == null || k8Var3.b().c().equals(k8Var2.b().c())) {
                arrayList.add(new b(k8Var2, k8Var2.a() != null ? k8Var2.a().a() : "", this.f8380g == null));
            }
        }
        return arrayList;
    }
}
