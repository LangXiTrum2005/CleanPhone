package com.charging.screenshow.battery.animations.themes.activity;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingCategoryDetailBinding;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.CustomItemDecoration;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingCategoryDetailAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingCategoryDetailAct extends BaseAct {
    public static final /* synthetic */ int k0 = 0;
    public ActChargingCategoryDetailBinding h0;
    public final ArrayList i0 = new ArrayList();
    public ChargingAdapter j0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingCategoryDetailAct$Companion;", "", "", "KEY_DATA", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        ChargingCategoryBean chargingCategoryBean;
        if (Build.VERSION.SDK_INT >= 33) {
            chargingCategoryBean = (ChargingCategoryBean) getIntent().getSerializableExtra("key_data", ChargingCategoryBean.class);
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("key_data");
            Intrinsics.d(serializableExtra, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean");
            chargingCategoryBean = (ChargingCategoryBean) serializableExtra;
        }
        if (chargingCategoryBean != null) {
            ArrayList arrayList = this.i0;
            arrayList.clear();
            arrayList.addAll(chargingCategoryBean.get_list());
        }
        if (chargingCategoryBean != null) {
            ActChargingCategoryDetailBinding actChargingCategoryDetailBinding = this.h0;
            if (actChargingCategoryDetailBinding != null) {
                actChargingCategoryDetailBinding.d.setText(chargingCategoryBean.get_title());
            } else {
                Intrinsics.m("binding");
                throw null;
            }
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_charging_category_detail, (ViewGroup) null, false);
        int i2 = R.id.immersionBarView;
        View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
        if (viewA != null) {
            i2 = R.id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
            if (imageView != null) {
                i2 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.rv, viewInflate);
                if (recyclerView != null) {
                    i2 = R.id.tvTitle;
                    TextView textView = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                    if (textView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.h0 = new ActChargingCategoryDetailBinding(linearLayout, viewA, imageView, recyclerView, textView);
                        Intrinsics.e(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActChargingCategoryDetailBinding actChargingCategoryDetailBinding = this.h0;
        if (actChargingCategoryDetailBinding != null) {
            return actChargingCategoryDetailBinding.f13103a;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ChargingAdapter chargingAdapter = new ChargingAdapter(this, this.i0);
        this.j0 = chargingAdapter;
        chargingAdapter.k = new ChargingCategoryDetailAct$initViews$1(this);
        ActChargingCategoryDetailBinding actChargingCategoryDetailBinding = this.h0;
        if (actChargingCategoryDetailBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingCategoryDetailBinding.f13105c.setLayoutManager(new GridLayoutManager(2));
        ActChargingCategoryDetailBinding actChargingCategoryDetailBinding2 = this.h0;
        if (actChargingCategoryDetailBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingCategoryDetailBinding2.f13105c.addItemDecoration(new CustomItemDecoration(10, 0));
        ActChargingCategoryDetailBinding actChargingCategoryDetailBinding3 = this.h0;
        if (actChargingCategoryDetailBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ChargingAdapter chargingAdapter2 = this.j0;
        Intrinsics.c(chargingAdapter2);
        actChargingCategoryDetailBinding3.f13105c.setAdapter(chargingAdapter2);
        ActChargingCategoryDetailBinding actChargingCategoryDetailBinding4 = this.h0;
        if (actChargingCategoryDetailBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingCategoryDetailBinding4.f13104b, new androidx.room.b(this, 4));
        if (j()) {
            p(new h(this, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!j() || n().f13353e) {
            finish();
        } else {
            q(new h(this, 1));
        }
    }
}
