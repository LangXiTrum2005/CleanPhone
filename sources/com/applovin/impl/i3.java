package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i3 extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g3 f8124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f8125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f8129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SpannedString f8130k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public i3(g3 g3Var, Context context) {
        super(context);
        this.f8124e = g3Var;
        if (g3Var.q() == g3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f8130k = new SpannedString(spannableString);
        } else {
            this.f8130k = new SpannedString("");
        }
        this.f8125f = g();
        this.f8126g = b(g3Var.n());
        this.f8127h = e();
        this.f8128i = a(g3Var.f());
        this.f8129j = j();
        notifyDataSetChanged();
    }

    private t2 f() {
        if (this.f8124e.H()) {
            return null;
        }
        return t2.a().d("Initialization Status").c(f(this.f8124e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private t2 i() {
        t2.b bVarC = t2.a().d("SDK").c(this.f8124e.p());
        if (TextUtils.isEmpty(this.f8124e.p())) {
            bVarC.a(a(this.f8124e.F())).b(b(this.f8124e.F()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f8124e.v())) {
            arrayList.add(t2.a(t2.c.DETAIL).d(this.f8124e.v()).a());
        }
        if (this.f8124e.y() == g3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f8124e.s() != null) {
            arrayList.add(c(this.f8124e.s()));
        }
        arrayList.add(a(this.f8124e.y()));
        return arrayList;
    }

    public boolean a(l2 l2Var) {
        return l2Var.b() == a.TEST_ADS.ordinal() && l2Var.a() == this.f8129j.size() - 1;
    }

    @Override // com.applovin.impl.u2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    public List c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f8125f;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f8126g;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f8127h;
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f8128i : this.f8129j;
    }

    @Override // com.applovin.impl.u2
    public int d(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f8125f.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f8126g.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f8127h.size();
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f8128i.size() : this.f8129j.size();
    }

    @Override // com.applovin.impl.u2
    public t2 e(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new x4("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new x4("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new x4("CONFIGURATION");
        }
        return i10 == a.DEPENDENCIES.ordinal() ? new x4("DEPENDENCIES") : new x4("TEST ADS");
    }

    public g3 h() {
        return this.f8124e;
    }

    public void k() {
        this.f8125f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l1 l1Var = (l1) it.next();
                arrayList.add(a(l1Var.b(), l1Var.a(), l1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r4 r4Var = (r4) it.next();
                arrayList.add(a(r4Var.b(), r4Var.a(), r4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i10 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i10 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i10) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private t2 a(g3.b bVar) {
        t2.b bVarA = t2.a();
        if (bVar == g3.b.READY) {
            bVarA.a(this.f9816a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        Context context;
        int i10;
        if (z10) {
            context = this.f9816a;
            i10 = R.color.applovin_sdk_checkmarkColor;
        } else {
            context = this.f9816a;
            i10 = R.color.applovin_sdk_xmarkColor;
        }
        return context.getColor(i10);
    }

    private t2 c(List list) {
        return t2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private t2 d() {
        t2.b bVarC = t2.a().d("Adapter").c(this.f8124e.c());
        if (TextUtils.isEmpty(this.f8124e.c())) {
            bVarC.a(a(this.f8124e.z())).b(b(this.f8124e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f8124e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.l.H0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        Context context;
        int i10;
        if (z10) {
            context = this.f9816a;
            i10 = R.color.applovin_sdk_xmarkColor;
        } else {
            context = this.f9816a;
            i10 = R.color.applovin_sdk_warningColor;
        }
        return context.getColor(i10);
    }

    private t2 a(String str, String str2, boolean z10, boolean z11) {
        return t2.a(z10 ? t2.c.RIGHT_DETAIL : t2.c.DETAIL).d(str).a(z10 ? null : this.f8130k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? this.f9816a.getColor(R.color.applovin_sdk_checkmarkColor) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
