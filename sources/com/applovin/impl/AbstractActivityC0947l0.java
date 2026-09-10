package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0947l0 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f11034b;

    /* JADX INFO: renamed from: com.applovin.impl.l0$a */
    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f11035e;
        final /* synthetic */ List f;
        final /* synthetic */ List g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f11036h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f11037i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f11035e = list;
            this.f = list2;
            this.g = list3;
            this.f11036h = list4;
            this.f11037i = list5;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i2) {
            List list;
            boolean z2 = true;
            if (i2 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f11035e;
            } else if (i2 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f;
            } else {
                z2 = false;
                if (i2 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.g;
                } else {
                    list = i2 == c.LISTED_AC_NETWORKS.ordinal() ? this.f11036h : this.f11037i;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractActivityC0947l0.this.a((a7) it.next(), z2));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i2) {
            if (i2 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f11035e.size();
            }
            if (i2 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            if (i2 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.g.size();
            }
            return i2 == c.LISTED_AC_NETWORKS.ordinal() ? this.f11036h.size() : this.f11037i.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i2) {
            if (i2 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new v4("MISSING TCF VENDORS (TC STRING)");
            }
            if (i2 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new v4("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i2 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new v4("LISTED TCF VENDORS (TC STRING)");
            }
            return i2 == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.l0$b */
    public class b implements s2.a {
        public b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), AbstractActivityC0947l0.this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.l0$c */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f11033a;
    }

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, com.applovin.impl.sdk.k kVar) {
        this.f11033a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f11034b = aVar;
        aVar.a(new b());
        this.f11034b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f11034b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z2) {
        r2.b bVarA = r2.a();
        boolean zB = this.f11033a.r0().b();
        a7.a aVarF = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (aVarF == aVar || (a7Var.f() == a7.a.ATP_NETWORK && zB)) {
            String strC = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            r2.b bVarB = bVarA.d(strC).d(z2 ? -65536 : -16777216).b(strC);
            StringBuilder sbW = android.support.v4.media.a.w(str);
            sbW.append(a7Var.d());
            bVarB.a(sbW.toString()).a(true);
        } else {
            bVarA.d(a7Var.b());
        }
        return bVarA.a();
    }
}
