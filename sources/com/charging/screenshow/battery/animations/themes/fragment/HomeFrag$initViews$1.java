package com.charging.screenshow.battery.animations.themes.fragment;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.charging.screenshow.battery.animations.themes.activity.ChargingCategoryDetailAct;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/charging/screenshow/battery/animations/themes/fragment/HomeFrag$initViews$1", "Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingCategoryAdapter$OnItemClickListener;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeFrag$initViews$1 implements ChargingCategoryAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFrag f13260a;

    public HomeFrag$initViews$1(HomeFrag homeFrag) {
        this.f13260a = homeFrag;
    }

    public final void a(int i2) {
        HomeFrag homeFrag = this.f13260a;
        if (i2 < 0) {
            homeFrag.getClass();
            return;
        }
        ArrayList arrayList = homeFrag.g0;
        if (i2 < arrayList.size()) {
            int i3 = ChargingCategoryDetailAct.k0;
            FragmentActivity fragmentActivityRequireActivity = homeFrag.requireActivity();
            Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
            ChargingCategoryBean bean = (ChargingCategoryBean) arrayList.get(i2);
            Intrinsics.f(bean, "bean");
            Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ChargingCategoryDetailAct.class);
            intent.putExtra("key_data", bean);
            fragmentActivityRequireActivity.startActivity(intent);
        }
    }
}
