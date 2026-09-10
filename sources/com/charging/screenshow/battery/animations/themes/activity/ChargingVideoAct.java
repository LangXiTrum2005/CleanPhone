package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBindings;
import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import com.charging.screenshow.battery.animations.themes.utils.PermissionUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ChargingVideoVM;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingVideoAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingVideoAct extends BaseAct {
    public static final /* synthetic */ int n0 = 0;
    public ActChargingBinding h0;
    public ChargingVideo j0;
    public MediaPlayer k0;
    public String l0;
    public final ViewModelLazy i0 = new ViewModelLazy(Reflection.f43333a.b(ChargingVideoVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoAct$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoAct$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoAct$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelCreationExtras();
        }
    });
    public String m0 = "";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingVideoAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context, ChargingVideo bean, boolean z2) {
            Intrinsics.f(context, "context");
            Intrinsics.f(bean, "bean");
            Intent intent = new Intent(context, (Class<?>) ChargingVideoAct.class);
            intent.putExtra("key_bean", bean);
            intent.putExtra("key_boolean", z2);
            context.startActivity(intent);
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActChargingBinding actChargingBinding = this.h0;
        if (actChargingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingBinding.f13096e, new l(this, 1));
        ActChargingBinding actChargingBinding2 = this.h0;
        if (actChargingBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingBinding2.f13098i, new l(this, 2));
        ActChargingBinding actChargingBinding3 = this.h0;
        if (actChargingBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingBinding3.s, new l(this, 3));
        ActChargingBinding actChargingBinding4 = this.h0;
        if (actChargingBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingBinding4.g, new l(this, 4));
        ActChargingBinding actChargingBinding5 = this.h0;
        if (actChargingBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingBinding5.f13099l, new l(this, 5));
        ActChargingBinding actChargingBinding6 = this.h0;
        if (actChargingBinding6 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingBinding6.m, new l(this, 6));
        ActChargingBinding actChargingBinding7 = this.h0;
        if (actChargingBinding7 != null) {
            ViewExt.c(actChargingBinding7.f, new l(this, 7));
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        if (getIntent().hasExtra("key_bean")) {
            this.j0 = Build.VERSION.SDK_INT >= 33 ? (ChargingVideo) getIntent().getSerializableExtra("key_bean", ChargingVideo.class) : (ChargingVideo) getIntent().getSerializableExtra("key_bean");
        }
        if (this.j0 == null) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("key_boolean", true) && j()) {
            p(new m(this, 2));
        }
        ChargingVideo chargingVideo = this.j0;
        Intrinsics.c(chargingVideo);
        this.l0 = chargingVideo.k();
        ChargingVideo chargingVideo2 = this.j0;
        Intrinsics.c(chargingVideo2);
        this.m0 = chargingVideo2.h();
        ViewModelLazy viewModelLazy = this.i0;
        ((ChargingVideoVM) viewModelLazy.getX()).d.e(this, new ChargingVideoAct$sam$androidx_lifecycle_Observer$0(new l(this, 8)));
        ((ChargingVideoVM) viewModelLazy.getX()).f13351e.e(this, new ChargingVideoAct$sam$androidx_lifecycle_Observer$0(new l(this, 0)));
        ChargingVideoVM chargingVideoVM = (ChargingVideoVM) viewModelLazy.getX();
        String str = this.l0;
        Intrinsics.c(str);
        chargingVideoVM.d(str, this.m0);
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_charging, (ViewGroup) null, false);
        int i2 = R.id.cvContainer;
        CardView cardView = (CardView) ViewBindings.a(R.id.cvContainer, viewInflate);
        if (cardView != null) {
            i2 = R.id.flCover;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.a(R.id.flCover, viewInflate);
            if (frameLayout != null) {
                i2 = R.id.flVideo;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.a(R.id.flVideo, viewInflate);
                if (frameLayout2 != null) {
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
                                    i2 = R.id.ivLighting;
                                    ImageView imageView4 = (ImageView) ViewBindings.a(R.id.ivLighting, viewInflate);
                                    if (imageView4 != null) {
                                        i2 = R.id.ivSettings;
                                        ImageView imageView5 = (ImageView) ViewBindings.a(R.id.ivSettings, viewInflate);
                                        if (imageView5 != null) {
                                            i2 = R.id.llCharging;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llCharging, viewInflate);
                                            if (linearLayout != null) {
                                                i2 = R.id.llChargingPermission;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llChargingPermission, viewInflate);
                                                if (linearLayout2 != null) {
                                                    i2 = R.id.llFloating;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.a(R.id.llFloating, viewInflate);
                                                    if (linearLayout3 != null) {
                                                        i2 = R.id.llIgnoreBattery;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.a(R.id.llIgnoreBattery, viewInflate);
                                                        if (linearLayout4 != null) {
                                                            i2 = R.id.pbb;
                                                            RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) ViewBindings.a(R.id.pbb, viewInflate);
                                                            if (roundCornerProgressBar != null) {
                                                                i2 = R.id.rlBottom;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.rlBottom, viewInflate);
                                                                if (relativeLayout != null) {
                                                                    i2 = R.id.surfaceVideo;
                                                                    SurfaceView surfaceView = (SurfaceView) ViewBindings.a(R.id.surfaceVideo, viewInflate);
                                                                    if (surfaceView != null) {
                                                                        i2 = R.id.switchAlert;
                                                                        Switch r21 = (Switch) ViewBindings.a(R.id.switchAlert, viewInflate);
                                                                        if (r21 != null) {
                                                                            i2 = R.id.switchBattery;
                                                                            Switch r22 = (Switch) ViewBindings.a(R.id.switchBattery, viewInflate);
                                                                            if (r22 != null) {
                                                                                i2 = R.id.tvApply;
                                                                                TextView textView = (TextView) ViewBindings.a(R.id.tvApply, viewInflate);
                                                                                if (textView != null) {
                                                                                    i2 = R.id.tvBattery;
                                                                                    TextView textView2 = (TextView) ViewBindings.a(R.id.tvBattery, viewInflate);
                                                                                    if (textView2 != null) {
                                                                                        i2 = R.id.tvTip;
                                                                                        TextView textView3 = (TextView) ViewBindings.a(R.id.tvTip, viewInflate);
                                                                                        if (textView3 != null) {
                                                                                            LinearLayout linearLayout5 = (LinearLayout) viewInflate;
                                                                                            this.h0 = new ActChargingBinding(linearLayout5, cardView, frameLayout, frameLayout2, viewA, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, roundCornerProgressBar, relativeLayout, surfaceView, r21, r22, textView, textView2, textView3);
                                                                                            Intrinsics.e(linearLayout5, "getRoot(...)");
                                                                                            return linearLayout5;
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActChargingBinding actChargingBinding = this.h0;
        if (actChargingBinding != null) {
            return actChargingBinding.d;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ActChargingBinding actChargingBinding = this.h0;
        if (actChargingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = actChargingBinding.f13093a.getLayoutParams();
        int iA = DeviceUtil.a(this) - IntExt.a(210);
        layoutParams.width = (int) (((DeviceUtil.b(this) * iA) / DeviceUtil.a(this)) * 1.0f);
        layoutParams.height = iA;
        ActChargingBinding actChargingBinding2 = this.h0;
        if (actChargingBinding2 != null) {
            actChargingBinding2.f13093a.setLayoutParams(layoutParams);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActChargingBinding actChargingBinding = this.h0;
        if (actChargingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        if (actChargingBinding.k.getVisibility() == 0) {
            s();
        } else if (j() && !n().f13353e && getIntent().getBooleanExtra("key_boolean", true)) {
            q(new m(this, 0));
        } else {
            finish();
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.k0;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            this.k0 = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            MediaPlayer mediaPlayer = this.k0;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.pause();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            MediaPlayer mediaPlayer = this.k0;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        } catch (Exception unused) {
        }
        u();
        v();
    }

    public final void s() {
        ActChargingBinding actChargingBinding = this.h0;
        if (actChargingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.a(actChargingBinding.k);
        ReturnAppManager.e0 = false;
    }

    public final Uri t() {
        String str = this.l0;
        Intrinsics.c(str);
        File file = new File(DownloadUtil.b(str, this.m0));
        Uri uriFromFile = (file.isFile() && file.exists()) ? Uri.fromFile(file) : null;
        Log.d("charging-wallpaper", "video uri: " + uriFromFile);
        return uriFromFile;
    }

    public final void u() {
        BaseMedia baseMediaB = AppPreferences.b();
        if (baseMediaB != null) {
            String name = baseMediaB.getName();
            ChargingVideo chargingVideo = this.j0;
            Intrinsics.c(chargingVideo);
            if (TextUtils.equals(name, chargingVideo.getName())) {
                ActChargingBinding actChargingBinding = this.h0;
                if (actChargingBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.b(actChargingBinding.f13102u);
                ActChargingBinding actChargingBinding2 = this.h0;
                if (actChargingBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingBinding2.s.setBackgroundResource(R.drawable.drw_card_theme_gray_32dp);
                ActChargingBinding actChargingBinding3 = this.h0;
                if (actChargingBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingBinding3.s.setText(IntExt.c(R.string.stop));
                return;
            }
        }
        ActChargingBinding actChargingBinding4 = this.h0;
        if (actChargingBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.a(actChargingBinding4.f13102u);
        ActChargingBinding actChargingBinding5 = this.h0;
        if (actChargingBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingBinding5.s.setBackgroundResource(R.drawable.drw_card_theme_main_32dp);
        ActChargingBinding actChargingBinding6 = this.h0;
        if (actChargingBinding6 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingBinding6.s.setText(IntExt.c(R.string.apply));
    }

    public final void v() {
        if (PermissionUtil.a(this) && PermissionUtil.b(this)) {
            s();
            return;
        }
        ActChargingBinding actChargingBinding = this.h0;
        if (actChargingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingBinding.q.setChecked(PermissionUtil.a(this));
        ActChargingBinding actChargingBinding2 = this.h0;
        if (actChargingBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingBinding2.r.setChecked(PermissionUtil.b(this));
    }
}
