package com.charging.screenshow.battery.animations.themes.fragment;

import android.app.Application;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.FragHomeBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ChargingCategoryVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ HomeFrag f13266Y;

    public /* synthetic */ a(HomeFrag homeFrag, int i2) {
        this.X = i2;
        this.f13266Y = homeFrag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.X) {
            case 0:
                Application application = this.f13266Y.requireActivity().getApplication();
                MyApp myApp = application instanceof MyApp ? (MyApp) application : null;
                if (myApp != null) {
                    return (ChargingCategoryVM) myApp.a().a(ChargingCategoryVM.class);
                }
                throw new NullPointerException("Application does not inherit from BaseApplication");
            default:
                HomeFrag homeFrag = this.f13266Y;
                ChargingCategoryAdapter chargingCategoryAdapter = homeFrag.f0;
                if (chargingCategoryAdapter != null) {
                    chargingCategoryAdapter.notifyDataSetChanged();
                }
                FragHomeBinding fragHomeBinding = homeFrag.Z;
                if (fragHomeBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.a(fragHomeBinding.d);
                if (homeFrag.g0.isEmpty()) {
                    FragHomeBinding fragHomeBinding2 = homeFrag.Z;
                    if (fragHomeBinding2 == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.b(fragHomeBinding2.f13179c);
                } else {
                    FragHomeBinding fragHomeBinding3 = homeFrag.Z;
                    if (fragHomeBinding3 == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.a(fragHomeBinding3.f13179c);
                }
                return Unit.f43263a;
        }
    }
}
