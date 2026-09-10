package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0948m extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0950n f11072e;
    private final C0952o f;
    private final i8 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f11073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f11074i;
    private final List j;
    private final List k;

    /* JADX INFO: renamed from: com.applovin.impl.m$a */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.m$b */
    public class b extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final i8 f11079p;

        public b(i8 i8Var, String str, boolean z2) {
            super(i8Var.b().d(), C0948m.this.f11581a);
            this.f11079p = i8Var;
            this.f11550c = StringUtils.createSpannedString(i8Var.b().a(), -16777216, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f11549b = z2;
        }

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f11549b;
        }

        public i8 v() {
            return this.f11079p;
        }
    }

    public C0948m(C0950n c0950n, C0952o c0952o, i8 i8Var, Context context) {
        super(context);
        this.f11072e = c0950n;
        this.g = i8Var;
        this.f = c0952o != null ? c0952o : c0950n.f();
        this.f11073h = c0952o != null ? c0952o.c() : c0950n.d();
        this.f11074i = h();
        this.j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f11072e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private List l() {
        i8 i8Var = this.g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listE = this.f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (i8 i8Var2 : listE) {
            i8 i8Var3 = this.g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.g == null));
                for (a4 a4Var : i8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i2) {
        if (i2 == a.INFO.ordinal()) {
            return this.f11074i;
        }
        return i2 == a.BIDDERS.ordinal() ? this.j : this.k;
    }

    @Override // com.applovin.impl.s2
    public int d(int i2) {
        if (i2 == a.INFO.ordinal()) {
            return this.f11074i.size();
        }
        return i2 == a.BIDDERS.ordinal() ? this.j.size() : this.k.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i2) {
        if (i2 == a.INFO.ordinal()) {
            return new v4("INFO");
        }
        return i2 == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    public C0952o j() {
        return this.f;
    }

    public String k() {
        return this.f11073h;
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f11072e.b()).a();
    }

    private List e() {
        i8 i8Var = this.g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listA = this.f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (i8 i8Var2 : listA) {
            i8 i8Var3 = this.g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.g == null));
            }
        }
        return arrayList;
    }
}
