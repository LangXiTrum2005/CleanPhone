package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.badlogic.gdx.backends.android.SpineActivity;
import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.backends.android.SpineData;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutRussainRouletteGuideBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3197ck0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3651ht;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3678i90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4012m10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4100n10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4276p10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4539s10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4629t20;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4717u20;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DialogC2384Ed;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.E10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.I10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ma0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oh0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC3924l10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class RussianRouletteActivity extends SpineActivity<ActivityRussianRouletteBinding> {
    public static final /* synthetic */ int t = 0;
    public DialogC2384Ed c;
    public int d;
    public SpineController e;
    public SurfaceView g;
    public SurfaceView h;
    public boolean l;
    public C3678i90 m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2778a = 1.0f;
    public int b = R.drawable.bg_scene_russain_roulette;
    public final InterfaceC3069bH f = AbstractC2340Cl.H(EnumC4124nH.c, new J10(this, 0));
    public final Ma0 i = AbstractC2340Cl.I(new J10(this, 2));
    public final Ma0 j = AbstractC2340Cl.I(new J10(this, 1));
    public final Ma0 k = AbstractC2340Cl.I(new C4276p10(this));

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity
    public final ViewBinding getViewBinding() {
        ActivityRussianRouletteBinding activityRussianRouletteBindingInflate = ActivityRussianRouletteBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(activityRussianRouletteBindingInflate, "inflate(...)");
        return activityRussianRouletteBindingInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initData() {
        super.initData();
        SurfaceView surfaceView = this.h;
        if (surfaceView != null) {
            ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.removeView(surfaceView);
        }
        SurfaceView surfaceView2 = new SurfaceView(this);
        surfaceView2.getHolder().addCallback((N10) this.i.getValue());
        if (Build.VERSION.SDK_INT < 26) {
            surfaceView2.setZOrderOnTop(true);
            surfaceView2.setZOrderMediaOverlay(true);
        } else {
            surfaceView2.setZOrderOnTop(false);
        }
        this.h = surfaceView2;
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.addView(this.h);
        SurfaceView surfaceView3 = this.h;
        if (surfaceView3 == null) {
            return;
        }
        surfaceView3.setVisibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initListener() {
        super.initListener();
        ActivityRussianRouletteBinding activityRussianRouletteBinding = (ActivityRussianRouletteBinding) getMBinding();
        ImageView imageView = activityRussianRouletteBinding.ivHelp;
        AbstractC2995aW.p(imageView, "ivHelp");
        int i = 0;
        Oh0.a(imageView, new B10(this, i));
        ImageView imageView2 = activityRussianRouletteBinding.ivScene;
        AbstractC2995aW.p(imageView2, "ivScene");
        Oh0.a(imageView2, new B10(this, 1));
        ImageView imageView3 = activityRussianRouletteBinding.ivFiringEffect;
        AbstractC2995aW.p(imageView3, "ivFiringEffect");
        Oh0.a(imageView3, new B10(this, 2));
        TextView textView = activityRussianRouletteBinding.tvReload;
        AbstractC2995aW.p(textView, "tvReload");
        Oh0.a(textView, new B10(this, 3));
        TextView textView2 = activityRussianRouletteBinding.tvReloadDone;
        AbstractC2995aW.p(textView2, "tvReloadDone");
        Oh0.a(textView2, new B10(this, 4));
        ImageView imageView4 = activityRussianRouletteBinding.ivBack;
        AbstractC2995aW.p(imageView4, "ivBack");
        Oh0.a(imageView4, new B10(this, 5));
        ImageView imageView5 = activityRussianRouletteBinding.ivImmersive;
        AbstractC2995aW.p(imageView5, "ivImmersive");
        Oh0.a(imageView5, new D10(i, this, activityRussianRouletteBinding));
        ImageView imageView6 = activityRussianRouletteBinding.ivSetting;
        AbstractC2995aW.p(imageView6, "ivSetting");
        Oh0.a(imageView6, new E10(this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initView() {
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new I10(this, null), 3);
    }

    public final C5033xf0 j(int i) {
        return (C5033xf0) WD.R(C2734Rq.f3684a, new C4539s10(this, i, null));
    }

    public final Vector3 k(float f, float f2) {
        Stage stage = AbstractC3197ck0.f4241a;
        if (stage == null) {
            return null;
        }
        Vector3 vector3Project = stage.getViewport().project(new Vector3(f, f2, 0.0f));
        float screenHeight = (stage.getViewport().getScreenHeight() - vector3Project.y) + AbstractC3375el.G(this);
        Resources resources = getResources();
        vector3Project.y = screenHeight - resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        return vector3Project;
    }

    public final SpineData l(String str, String str2) {
        return new SpineData(AbstractC5044xl.f("toString(...)"), AbstractC3375el.D(this).x / 2.0f, AbstractC3375el.D(this).y / 2.0f, 1.0f, str, str2, true, null, 128, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        SurfaceView surfaceView;
        SurfaceHolder holder;
        SurfaceHolder holder2;
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.setVisibility(0);
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.removeAllViews();
        SurfaceView surfaceView2 = new SurfaceView(this);
        this.g = surfaceView2;
        if (Build.VERSION.SDK_INT < 26) {
            surfaceView2.setZOrderOnTop(true);
            SurfaceView surfaceView3 = this.g;
            if (surfaceView3 != null) {
                surfaceView3.setZOrderMediaOverlay(true);
            }
        } else {
            surfaceView2.setZOrderOnTop(false);
        }
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.addView(this.g, new ViewGroup.LayoutParams(-1, -1));
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.black_background);
        Canvas canvasLockCanvas = null;
        try {
            SurfaceView surfaceView4 = this.g;
            if (surfaceView4 != null && (holder2 = surfaceView4.getHolder()) != null) {
                canvasLockCanvas = holder2.lockCanvas();
            }
            if (canvasLockCanvas != null) {
                canvasLockCanvas.drawColor(ViewCompat.MEASURED_STATE_MASK);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvasLockCanvas.getWidth(), canvasLockCanvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvasLockCanvas);
                }
            }
        } finally {
            if (canvasLockCanvas != null && (surfaceView = this.g) != null && (holder = surfaceView.getHolder()) != null) {
                holder.unlockCanvasAndPost(canvasLockCanvas);
            }
        }
    }

    public final C4717u20 n() {
        return (C4717u20) this.f.getValue();
    }

    public final C4629t20 o() {
        return (C4629t20) this.j.getValue();
    }

    @Override // com.badlogic.gdx.backends.android.SpineActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new K10(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.backends.android.SpineActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        SurfaceHolder holder;
        Q8.a().j(((ActivityRussianRouletteBinding) getMBinding()).conWeaponBanner);
        super.onDestroy();
        AbstractC3651ht.c(LifecycleOwnerKt.getLifecycleScope(this), new L10(this, null));
        SurfaceView surfaceView = this.h;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback((N10) this.i.getValue());
        }
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.removeView(this.h);
        this.h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.backends.android.SpineActivity, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Q8.a().b(((ActivityRussianRouletteBinding) getMBinding()).conWeaponBanner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.backends.android.SpineActivity, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Q8.a().c(((ActivityRussianRouletteBinding) getMBinding()).conWeaponBanner);
    }

    public final void p(SpineController spineController, boolean z) {
        AbstractC2995aW.q(spineController, "controller");
        m();
        C4717u20 c4717u20N = n();
        c4717u20N.g = z;
        c4717u20N.f.j(R.drawable.black_background);
        ActivityRussianRouletteBinding activityRussianRouletteBinding = c4717u20N.d;
        activityRussianRouletteBinding.ivBack.setVisibility(4);
        activityRussianRouletteBinding.groupReload.setVisibility(8);
        activityRussianRouletteBinding.groupReloadDone.setVisibility(8);
        ((LayoutRussainRouletteGuideBinding) c4717u20N.b).groupLayout.setVisibility(0);
        ((LayoutRussainRouletteGuideBinding) n().b).conGuide1.post(new RunnableC3924l10(this, spineController, 0));
    }

    public final void q() {
        SpineController spineController = this.e;
        if (spineController != null) {
            spineController.showSlot("banji", "banji_hong");
        }
        SpineController spineController2 = this.e;
        if (spineController2 != null) {
            spineController2.showSlot("jichui", "jichui_hong");
        }
        SpineController spineController3 = this.e;
        if (spineController3 != null) {
            spineController3.showSlot("dancao", "dancao_hong");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(int i) {
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.removeAllViews();
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.setVisibility(8);
        VideoView videoView = ((ActivityRussianRouletteBinding) getMBinding()).vvScene;
        if (videoView.isPlaying()) {
            videoView.stopPlayback();
        }
        C2498In c2498In = App.n;
        videoView.setVideoURI(Uri.parse("android.resource://" + C2498In.i().getPackageName() + "/" + i));
        videoView.setVisibility(0);
        videoView.setOnPreparedListener(new C4012m10(0));
        videoView.setOnCompletionListener(new C4100n10(videoView, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(int i) {
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.removeAllViews();
        ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.setVisibility(4);
        if (i == R.drawable.bg_scene_russain_roulette) {
            ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.setVisibility(0);
            j(R.drawable.bg_scene_russain_roulette);
        } else {
            ((ActivityRussianRouletteBinding) getMBinding()).surfaceRoot.setVisibility(4);
            r(i);
        }
    }
}
