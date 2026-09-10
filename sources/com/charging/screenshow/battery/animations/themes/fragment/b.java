package com.charging.screenshow.battery.animations.themes.fragment;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import com.charging.screenshow.battery.animations.themes.activity.BatteryHealthAct;
import com.charging.screenshow.battery.animations.themes.databinding.FragHomeBinding;
import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ HomeFrag f13267Y;

    public /* synthetic */ b(HomeFrag homeFrag, int i2) {
        this.X = i2;
        this.f13267Y = homeFrag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        HomeFrag homeFrag = this.f13267Y;
        switch (this.X) {
            case 0:
                View it = (View) obj;
                Intrinsics.f(it, "it");
                homeFrag.getClass();
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(homeFrag);
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new HomeFrag$reload$1(homeFrag, null), 2);
                FragHomeBinding fragHomeBinding = homeFrag.Z;
                if (fragHomeBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.a(fragHomeBinding.f13179c);
                FragHomeBinding fragHomeBinding2 = homeFrag.Z;
                if (fragHomeBinding2 != null) {
                    ViewExt.b(fragHomeBinding2.d);
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 1:
                View it2 = (View) obj;
                Intrinsics.f(it2, "it");
                int i2 = BatteryHealthAct.i0;
                FragmentActivity fragmentActivityRequireActivity = homeFrag.requireActivity();
                Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
                ActUtils.b(fragmentActivityRequireActivity, BatteryHealthAct.class);
                return unit;
            default:
                List list = (List) obj;
                homeFrag.g0.clear();
                ArrayList arrayList = homeFrag.g0;
                Intrinsics.c(list);
                arrayList.addAll(list);
                AppExt.b(new a(homeFrag, 1));
                return unit;
        }
    }
}
