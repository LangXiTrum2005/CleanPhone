package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0304dd extends AbstractC0437l3 {
    public static final C0304dd P;

    static {
        C0304dd c0304dd = new C0304dd();
        P = c0304dd;
        c0304dd.H = "outcome";
        c0304dd.G = 0;
        c0304dd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c0304dd.e();
    }

    private C0304dd() {
    }

    @Override // com.ironsource.AbstractC0437l3
    public int c(C0654x5 c0654x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC0437l3
    public void d() {
    }

    @Override // com.ironsource.AbstractC0437l3
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean g(C0654x5 c0654x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean h(C0654x5 c0654x5) {
        return false;
    }

    public final void i() {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        a(new C0654x5(EnumC0672y5.INIT_DEFERRED_DATA, new C0246a9().a()));
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean j(C0654x5 c0654x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean d(C0654x5 c0654x5) {
        return true;
    }

    @Override // com.ironsource.AbstractC0437l3
    public void a(ArrayList<C0654x5> arrayList) {
    }

    @Override // com.ironsource.AbstractC0437l3
    public void f(C0654x5 c0654x5) {
    }
}
