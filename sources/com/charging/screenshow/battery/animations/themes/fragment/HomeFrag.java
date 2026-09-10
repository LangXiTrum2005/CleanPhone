package com.charging.screenshow.battery.animations.themes.fragment;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.FragHomeBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ChargingCategoryVM;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/HomeFrag;", "Lcom/charging/screenshow/battery/animations/themes/fragment/BaseFrag;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeFrag extends BaseFrag {
    public FragHomeBinding Z;
    public ChargingCategoryAdapter f0;
    public final Lazy e0 = LazyKt.b(new a(this, 0));
    public final ArrayList g0 = new ArrayList();

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final View b() {
        View viewInflate = getLayoutInflater().inflate(R.layout.frag_home, (ViewGroup) null, false);
        int i2 = R.id.btnBatterySpecs;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.btnBatterySpecs, viewInflate);
        if (linearLayout != null) {
            i2 = R.id.imvBatteryAnim;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.imvBatteryAnim, viewInflate);
            if (imageView != null) {
                i2 = R.id.llEmpty;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llEmpty, viewInflate);
                if (linearLayout2 != null) {
                    i2 = R.id.pbb;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.a(R.id.pbb, viewInflate);
                    if (progressBar != null) {
                        i2 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.rv, viewInflate);
                        if (recyclerView != null) {
                            i2 = R.id.tvBatteryPercent;
                            TextView textView = (TextView) ViewBindings.a(R.id.tvBatteryPercent, viewInflate);
                            if (textView != null) {
                                i2 = R.id.tvChargingStatus;
                                TextView textView2 = (TextView) ViewBindings.a(R.id.tvChargingStatus, viewInflate);
                                if (textView2 != null) {
                                    i2 = R.id.tvReload;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.tvReload, viewInflate);
                                    if (textView3 != null) {
                                        i2 = R.id.tvTimeToFull;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.tvTimeToFull, viewInflate);
                                        if (textView4 != null) {
                                            i2 = R.id.tvTitle;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                                            if (textView5 != null) {
                                                LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                                                this.Z = new FragHomeBinding(linearLayout3, linearLayout, imageView, linearLayout2, progressBar, recyclerView, textView, textView2, textView3, textView4, textView5);
                                                Intrinsics.e(linearLayout3, "getRoot(...)");
                                                return linearLayout3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final TextView c() {
        FragHomeBinding fragHomeBinding = this.Z;
        if (fragHomeBinding != null) {
            return fragHomeBinding.j;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void d() {
        FragHomeBinding fragHomeBinding = this.Z;
        if (fragHomeBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(fragHomeBinding.f13181h, new b(this, 0));
        FragHomeBinding fragHomeBinding2 = this.Z;
        if (fragHomeBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(fragHomeBinding2.f13177a, new b(this, 1));
        ((ChargingCategoryVM) this.e0.getX()).d.e(this, new HomeFrag$sam$androidx_lifecycle_Observer$0(new b(this, 2)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new HomeFrag$initDatas$4(this, null), 3);
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void e() {
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void f() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ChargingCategoryAdapter chargingCategoryAdapter = new ChargingCategoryAdapter(fragmentActivityRequireActivity, this.g0);
        this.f0 = chargingCategoryAdapter;
        chargingCategoryAdapter.f13071l = new HomeFrag$initViews$1(this);
        FragHomeBinding fragHomeBinding = this.Z;
        if (fragHomeBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        requireActivity();
        fragHomeBinding.f13180e.setLayoutManager(new LinearLayoutManager());
        FragHomeBinding fragHomeBinding2 = this.Z;
        if (fragHomeBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ChargingCategoryAdapter chargingCategoryAdapter2 = this.f0;
        Intrinsics.c(chargingCategoryAdapter2);
        fragHomeBinding2.f13180e.setAdapter(chargingCategoryAdapter2);
        FragHomeBinding fragHomeBinding3 = this.Z;
        if (fragHomeBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fragHomeBinding3.f13178b, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(6000L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.start();
    }
}
