package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.Charging3DPagerAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.ActThreeDBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import com.charging.screenshow.battery.animations.themes.entity.Layer3D;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.utils.PermissionUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/Charging3DAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Charging3DAct extends BaseAct {
    public static final /* synthetic */ int o0 = 0;
    public ActThreeDBinding h0;
    public final ArrayList i0 = new ArrayList();
    public Charging3D j0;
    public Charging3DPagerAdapter k0;
    public int l0;
    public DownloadDialog m0;
    public int n0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/Charging3DAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context, ChargingCategoryBean bean, boolean z2) {
            Intrinsics.f(context, "context");
            Intrinsics.f(bean, "bean");
            Intent intent = new Intent(context, (Class<?>) Charging3DAct.class);
            intent.putExtra("key_bean", bean);
            intent.putExtra("key_boolean", z2);
            context.startActivity(intent);
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActThreeDBinding actThreeDBinding = this.h0;
        if (actThreeDBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actThreeDBinding.f13148b, new b(this, 1));
        ActThreeDBinding actThreeDBinding2 = this.h0;
        if (actThreeDBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actThreeDBinding2.f13150e, new b(this, 2));
        ActThreeDBinding actThreeDBinding3 = this.h0;
        if (actThreeDBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actThreeDBinding3.f13153l, new b(this, 3));
        ActThreeDBinding actThreeDBinding4 = this.h0;
        if (actThreeDBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actThreeDBinding4.d, new b(this, 4));
        ActThreeDBinding actThreeDBinding5 = this.h0;
        if (actThreeDBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actThreeDBinding5.g, new b(this, 5));
        ActThreeDBinding actThreeDBinding6 = this.h0;
        if (actThreeDBinding6 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actThreeDBinding6.f13151h, new b(this, 6));
        ActThreeDBinding actThreeDBinding7 = this.h0;
        if (actThreeDBinding7 != null) {
            ViewExt.c(actThreeDBinding7.f13149c, new b(this, 7));
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        ChargingCategoryBean chargingCategoryBean;
        if (getIntent().hasExtra("key_bean")) {
            chargingCategoryBean = Build.VERSION.SDK_INT >= 33 ? (ChargingCategoryBean) getIntent().getSerializableExtra("key_bean", ChargingCategoryBean.class) : (ChargingCategoryBean) getIntent().getSerializableExtra("key_bean");
        } else {
            chargingCategoryBean = null;
        }
        if (chargingCategoryBean == null || chargingCategoryBean.get_list().isEmpty()) {
            finish();
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(this);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new Charging3DAct$beforeViews$1(this, chargingCategoryBean, null), 2);
        if (getIntent().getBooleanExtra("key_boolean", true) && j()) {
            p(new c(this, 3));
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_three_d, (ViewGroup) null, false);
        int i2 = R.id.cvContainer;
        if (((CardView) ViewBindings.a(R.id.cvContainer, viewInflate)) != null) {
            i2 = R.id.immersionBarView;
            View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
            if (viewA != null) {
                i2 = R.id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
                if (imageView != null) {
                    i2 = R.id.ivBack2;
                    ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivBack2, viewInflate);
                    if (imageView2 != null) {
                        i2 = R.id.ivEye;
                        ImageView imageView3 = (ImageView) ViewBindings.a(R.id.ivEye, viewInflate);
                        if (imageView3 != null) {
                            i2 = R.id.ivSettings;
                            ImageView imageView4 = (ImageView) ViewBindings.a(R.id.ivSettings, viewInflate);
                            if (imageView4 != null) {
                                i2 = R.id.llChargingPermission;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llChargingPermission, viewInflate);
                                if (linearLayout != null) {
                                    i2 = R.id.llFloating;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llFloating, viewInflate);
                                    if (linearLayout2 != null) {
                                        i2 = R.id.llIgnoreBattery;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.a(R.id.llIgnoreBattery, viewInflate);
                                        if (linearLayout3 != null) {
                                            i2 = R.id.rlBottom;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.rlBottom, viewInflate);
                                            if (relativeLayout != null) {
                                                i2 = R.id.switchAlert;
                                                Switch r13 = (Switch) ViewBindings.a(R.id.switchAlert, viewInflate);
                                                if (r13 != null) {
                                                    i2 = R.id.switchBattery;
                                                    Switch r14 = (Switch) ViewBindings.a(R.id.switchBattery, viewInflate);
                                                    if (r14 != null) {
                                                        i2 = R.id.tvApply;
                                                        TextView textView = (TextView) ViewBindings.a(R.id.tvApply, viewInflate);
                                                        if (textView != null) {
                                                            i2 = R.id.tvNext;
                                                            if (((TextView) ViewBindings.a(R.id.tvNext, viewInflate)) != null) {
                                                                i2 = R.id.tvTip;
                                                                TextView textView2 = (TextView) ViewBindings.a(R.id.tvTip, viewInflate);
                                                                if (textView2 != null) {
                                                                    i2 = R.id.view_pager;
                                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.a(R.id.view_pager, viewInflate);
                                                                    if (viewPager2 != null) {
                                                                        LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                                        this.h0 = new ActThreeDBinding(linearLayout4, viewA, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, relativeLayout, r13, r14, textView, textView2, viewPager2);
                                                                        Intrinsics.e(linearLayout4, "getRoot(...)");
                                                                        return linearLayout4;
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActThreeDBinding actThreeDBinding = this.h0;
        if (actThreeDBinding != null) {
            return actThreeDBinding.f13147a;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        Charging3DPagerAdapter charging3DPagerAdapter = new Charging3DPagerAdapter(this, this.i0);
        this.k0 = charging3DPagerAdapter;
        charging3DPagerAdapter.k = new Charging3DAct$initViews$1();
        ActThreeDBinding actThreeDBinding = this.h0;
        if (actThreeDBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding.f13154n.setAdapter(charging3DPagerAdapter);
        ActThreeDBinding actThreeDBinding2 = this.h0;
        if (actThreeDBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding2.f13154n.d(this.l0, false);
        ActThreeDBinding actThreeDBinding3 = this.h0;
        if (actThreeDBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding3.f13154n.b(new ViewPager2.OnPageChangeCallback() { // from class: com.charging.screenshow.battery.animations.themes.activity.Charging3DAct$initViews$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i2) {
                Charging3DAct charging3DAct = this.f13032a;
                charging3DAct.l0 = i2;
                charging3DAct.j0 = (Charging3D) charging3DAct.i0.get(i2);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActThreeDBinding actThreeDBinding = this.h0;
        if (actThreeDBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        if (actThreeDBinding.f.getVisibility() == 0) {
            t();
        } else if (j() && !n().f13353e && getIntent().getBooleanExtra("key_boolean", true)) {
            q(new c(this, 4));
        } else {
            finish();
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        DownloadDialog downloadDialog = this.m0;
        if (downloadDialog != null) {
            downloadDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        w();
    }

    public final void s() {
        Charging3D charging3D;
        if (!(PermissionUtil.a(this) && PermissionUtil.b(this))) {
            ActThreeDBinding actThreeDBinding = this.h0;
            if (actThreeDBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            ViewExt.b(actThreeDBinding.f);
            ReturnAppManager.e0 = true;
            return;
        }
        Charging3D charging3D2 = this.j0;
        Intrinsics.c(charging3D2);
        if (charging3D2.getPictures() != null) {
            Layer3D pictures = charging3D2.getPictures();
            Intrinsics.c(pictures);
            if (!DownloadUtil.c(pictures.getLayer1(), charging3D2.getName()) || !DownloadUtil.c(pictures.getLayer2(), charging3D2.getName()) || !DownloadUtil.c(pictures.getLayer3(), charging3D2.getName())) {
                ArrayList arrayList = new ArrayList();
                Charging3D charging3D3 = this.j0;
                Intrinsics.c(charging3D3);
                Layer3D pictures2 = charging3D3.getPictures();
                if (pictures2 != null) {
                    String layer1 = pictures2.getLayer1();
                    Charging3D charging3D4 = this.j0;
                    Intrinsics.c(charging3D4);
                    if (!DownloadUtil.c(layer1, charging3D4.getName())) {
                        arrayList.add(pictures2.getLayer1());
                    }
                    String layer2 = pictures2.getLayer2();
                    Charging3D charging3D5 = this.j0;
                    Intrinsics.c(charging3D5);
                    if (!DownloadUtil.c(layer2, charging3D5.getName())) {
                        arrayList.add(pictures2.getLayer2());
                    }
                    String layer3 = pictures2.getLayer3();
                    Charging3D charging3D6 = this.j0;
                    Intrinsics.c(charging3D6);
                    if (!DownloadUtil.c(layer3, charging3D6.getName())) {
                        arrayList.add(pictures2.getLayer3());
                    }
                }
                Charging3D charging3D7 = this.j0;
                Intrinsics.c(charging3D7);
                this.m0 = new DownloadDialog(this, arrayList, charging3D7.getName(), IntExt.c(R.string.generating_preview_image), new b(this, 0));
                AppExt.b(new c(this, 0));
                return;
            }
        }
        if (this.n0 == 1) {
            u();
        } else {
            if (isFinishing() || (charging3D = this.j0) == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) Charging3DPreviewAct.class);
            intent.putExtra("key_bean", charging3D);
            startActivity(intent);
        }
    }

    public final void t() {
        ActThreeDBinding actThreeDBinding = this.h0;
        if (actThreeDBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.a(actThreeDBinding.f);
        ReturnAppManager.e0 = false;
    }

    public final void u() {
        BaseMedia baseMediaB = AppPreferences.b();
        if (baseMediaB != null) {
            String name = baseMediaB.getName();
            Charging3D charging3D = this.j0;
            Intrinsics.c(charging3D);
            if (TextUtils.equals(name, charging3D.getName())) {
                AppPreferences.d(null);
                v();
                return;
            }
        }
        Charging3D charging3D2 = this.j0;
        Intrinsics.c(charging3D2);
        AppPreferences.d(charging3D2);
        v();
        ResultAct.Companion.a(this, 4);
        finish();
    }

    public final void v() {
        BaseMedia baseMediaB = AppPreferences.b();
        if (baseMediaB != null) {
            String name = baseMediaB.getName();
            Charging3D charging3D = this.j0;
            Intrinsics.c(charging3D);
            if (TextUtils.equals(name, charging3D.getName())) {
                ActThreeDBinding actThreeDBinding = this.h0;
                if (actThreeDBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.b(actThreeDBinding.m);
                ActThreeDBinding actThreeDBinding2 = this.h0;
                if (actThreeDBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actThreeDBinding2.f13153l.setBackgroundResource(R.drawable.drw_card_theme_gray_32dp);
                ActThreeDBinding actThreeDBinding3 = this.h0;
                if (actThreeDBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actThreeDBinding3.f13153l.setText(IntExt.c(R.string.stop));
                return;
            }
        }
        ActThreeDBinding actThreeDBinding4 = this.h0;
        if (actThreeDBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.a(actThreeDBinding4.m);
        ActThreeDBinding actThreeDBinding5 = this.h0;
        if (actThreeDBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding5.f13153l.setBackgroundResource(R.drawable.drw_card_theme_main_32dp);
        ActThreeDBinding actThreeDBinding6 = this.h0;
        if (actThreeDBinding6 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding6.f13153l.setText(IntExt.c(R.string.apply));
    }

    public final void w() {
        if (PermissionUtil.a(this) && PermissionUtil.b(this)) {
            t();
            return;
        }
        ActThreeDBinding actThreeDBinding = this.h0;
        if (actThreeDBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding.j.setChecked(PermissionUtil.a(this));
        ActThreeDBinding actThreeDBinding2 = this.h0;
        if (actThreeDBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDBinding2.k.setChecked(PermissionUtil.b(this));
    }
}
