package com.charging.screenshow.battery.animations.themes.activity;

import A.I0;
import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.charging.screenshow.battery.animations.themes.entity.event.EventFinish;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.LoadingDialog;
import com.charging.screenshow.battery.animations.themes.vm.ConfigVM;
import com.gyf.immersionbar.ImmersionBar;
import com.zg.adlib.util.MagicAdUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/charging/screenshow/battery/animations/themes/entity/event/EventFinish;", "event", "", "onEventFinish", "(Lcom/charging/screenshow/battery/animations/themes/entity/event/EventFinish;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseAct extends AppCompatActivity {
    public static final /* synthetic */ int g0 = 0;
    public boolean Z;
    public LoadingDialog e0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ViewModelLazy f13026Y = new ViewModelLazy(Reflection.f43333a.b(ConfigVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.activity.BaseAct$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.activity.BaseAct$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.activity.BaseAct$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelCreationExtras();
        }
    });
    public boolean f0 = true;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public final boolean j() {
        return MagicAdUtil.getInstance(AppExt.a()).canShowAd();
    }

    public final void k() {
        LoadingDialog loadingDialog;
        try {
            LoadingDialog loadingDialog2 = this.e0;
            if (loadingDialog2 == null || !loadingDialog2.isShowing() || isFinishing() || (loadingDialog = this.e0) == null) {
                return;
            }
            loadingDialog.dismiss();
        } catch (Exception unused) {
        }
    }

    public abstract View l();

    public abstract View m();

    public final ConfigVM n() {
        return (ConfigVM) this.f13026Y.getX();
    }

    public void o() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h();
        setContentView(l());
        View viewM = m();
        if (viewM != null) {
            ImmersionBar immersionBarJ = ImmersionBar.j(this);
            Intrinsics.e(immersionBarJ, "this");
            immersionBarJ.i0.getClass();
            immersionBarJ.i0.getClass();
            immersionBarJ.i0.getClass();
            immersionBarJ.i0.Z = viewM;
            if (immersionBarJ.n0 == 0) {
                immersionBarJ.n0 = 3;
            }
            immersionBarJ.e();
        }
        if (n().d == null) {
            n().d = getResources().getConfiguration();
        } else {
            this.Z = (((long) getResources().getConfiguration().diff(n().d)) & 2147483648L) != 0;
            n().d = getResources().getConfiguration();
        }
        if (!EventBus.b().e(this)) {
            EventBus.b().j(this);
        }
        i();
        o();
        g();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: com.charging.screenshow.battery.animations.themes.activity.BaseAct.onCreate.1
            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackPressed() {
                BaseAct.this.onBackPressed();
            }
        };
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.b(onBackPressedCallback);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k();
        try {
            if (EventBus.b().e(this)) {
                EventBus.b().l(this);
            }
        } catch (Exception unused) {
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventFinish(EventFinish event) {
        if (this.f0) {
            finish();
        }
    }

    public final void p(final Function0 function0) {
        MagicAdUtil.getInstance(AppExt.a()).showInstAd(this, new MagicAdUtil.MAdActionListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.BaseAct$showInstAd$1
            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
            public final void click() {
            }

            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
            public final void close() {
                Function0 function1 = function0;
                if (function1 != null) {
                    function1.invoke();
                }
            }

            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
            public final void show() {
            }

            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
            public final void showError() {
                Function0 function1 = function0;
                if (function1 != null) {
                    function1.invoke();
                }
            }
        });
    }

    public final void q(Function0 function0) {
        if (!j()) {
            function0.invoke();
        } else {
            r(IntExt.c(com.charging.screenshow.battery.animations.themes.R.string.loading_ads));
            Async.b(1200L, new I0(24, this, function0));
        }
    }

    public final void r(String str) {
        LoadingDialog loadingDialog;
        try {
            LoadingDialog loadingDialog2 = this.e0;
            if (loadingDialog2 != null && loadingDialog2.isShowing()) {
                loadingDialog2.dismiss();
            }
            this.e0 = new LoadingDialog(this, str);
            if (isFinishing() || (loadingDialog = this.e0) == null) {
                return;
            }
            loadingDialog.show();
        } catch (Exception unused) {
        }
    }
}
