package com.charging.screenshow.battery.animations.themes.activity;

import A.ViewOnClickListenerC0885d;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBindings;
import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.applovin.impl.Z;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingPreviewBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ChargingVideoVM;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingVideoPreviewAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingVideoPreviewAct extends BaseAct {
    public static final /* synthetic */ int o0 = 0;
    public ActChargingPreviewBinding h0;
    public ChargingVideo j0;
    public MediaPlayer k0;
    public String l0;
    public long n0;
    public final ViewModelLazy i0 = new ViewModelLazy(Reflection.f43333a.b(ChargingVideoVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoPreviewAct$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoPreviewAct$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoPreviewAct$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelCreationExtras();
        }
    });
    public String m0 = "";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingVideoPreviewAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        long j;
        ActChargingPreviewBinding actChargingPreviewBinding = this.h0;
        if (actChargingPreviewBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actChargingPreviewBinding.d, new n(this, 2));
        ActChargingPreviewBinding actChargingPreviewBinding2 = this.h0;
        if (actChargingPreviewBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingPreviewBinding2.f13110h.setOnClickListener(new ViewOnClickListenerC0885d(this, 16));
        int i2 = AppPreferencesUtil.a(AppPreferencesUtil.f13313a, AppExt.a()).getInt("charging_show_duration", 0);
        if (i2 == 5) {
            j = 5000;
        } else if (i2 == 10) {
            j = 10000;
        } else if (i2 == 15) {
            j = MBInterstitialActivity.WEB_LOAD_TIME;
        } else if (i2 == 30) {
            j = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        } else if (i2 != 60) {
            j = i2 != 180 ? 0L : 180000L;
        } else {
            j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (j != 0) {
            Async.b(j, new c0.a(this, 11));
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        getWindow().addFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (getIntent().hasExtra("key_bean")) {
            this.j0 = Build.VERSION.SDK_INT >= 33 ? (ChargingVideo) getIntent().getSerializableExtra("key_bean", ChargingVideo.class) : (ChargingVideo) getIntent().getSerializableExtra("key_bean");
        }
        ChargingVideo chargingVideo = this.j0;
        if (chargingVideo == null) {
            finish();
            return;
        }
        this.l0 = chargingVideo.k();
        ChargingVideo chargingVideo2 = this.j0;
        Intrinsics.c(chargingVideo2);
        this.m0 = chargingVideo2.h();
        ViewModelLazy viewModelLazy = this.i0;
        ((ChargingVideoVM) viewModelLazy.getX()).d.e(this, new ChargingVideoPreviewAct$sam$androidx_lifecycle_Observer$0(new n(this, 0)));
        ((ChargingVideoVM) viewModelLazy.getX()).f13351e.e(this, new ChargingVideoPreviewAct$sam$androidx_lifecycle_Observer$0(new n(this, 1)));
        ChargingVideoVM chargingVideoVM = (ChargingVideoVM) viewModelLazy.getX();
        String str = this.l0;
        Intrinsics.c(str);
        chargingVideoVM.d(str, this.m0);
        if (j()) {
            p(new o(this, 0));
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_charging_preview, (ViewGroup) null, false);
        int i2 = R.id.cvContainer;
        CardView cardView = (CardView) ViewBindings.a(R.id.cvContainer, viewInflate);
        if (cardView != null) {
            i2 = R.id.flCover;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.a(R.id.flCover, viewInflate);
            if (frameLayout != null) {
                i2 = R.id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
                if (imageView != null) {
                    i2 = R.id.ivLighting;
                    ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivLighting, viewInflate);
                    if (imageView2 != null) {
                        i2 = R.id.llChargingText;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llChargingText, viewInflate);
                        if (linearLayout != null) {
                            i2 = R.id.pbb;
                            RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) ViewBindings.a(R.id.pbb, viewInflate);
                            if (roundCornerProgressBar != null) {
                                i2 = R.id.surfaceVideo;
                                SurfaceView surfaceView = (SurfaceView) ViewBindings.a(R.id.surfaceVideo, viewInflate);
                                if (surfaceView != null) {
                                    i2 = R.id.tvBattery;
                                    TextView textView = (TextView) ViewBindings.a(R.id.tvBattery, viewInflate);
                                    if (textView != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                        this.h0 = new ActChargingPreviewBinding(frameLayout2, cardView, frameLayout, imageView, imageView2, linearLayout, roundCornerProgressBar, surfaceView, textView);
                                        Intrinsics.e(frameLayout2, "getRoot(...)");
                                        return frameLayout2;
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
        return null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!j() || n().f13353e) {
            finish();
        } else {
            q(new o(this, 1));
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
        if (Z.z(AppPreferencesUtil.f13313a, "charging_show_battery_text", true)) {
            ActChargingPreviewBinding actChargingPreviewBinding = this.h0;
            if (actChargingPreviewBinding != null) {
                ViewExt.b(actChargingPreviewBinding.f);
                return;
            } else {
                Intrinsics.m("binding");
                throw null;
            }
        }
        ActChargingPreviewBinding actChargingPreviewBinding2 = this.h0;
        if (actChargingPreviewBinding2 != null) {
            ViewExt.a(actChargingPreviewBinding2.f);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    public final Uri s() {
        String str = this.l0;
        Intrinsics.c(str);
        File file = new File(DownloadUtil.b(str, this.m0));
        Uri uriFromFile = (file.isFile() && file.exists()) ? Uri.fromFile(file) : null;
        Log.d("charging-wallpaper", "video uri: " + uriFromFile);
        return uriFromFile;
    }
}
