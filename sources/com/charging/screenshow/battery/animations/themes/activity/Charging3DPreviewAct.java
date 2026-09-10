package com.charging.screenshow.battery.animations.themes.activity;

import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActThreeDPreviewBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.Layer3D;
import com.charging.screenshow.battery.animations.themes.opengl.gl.GLBitmap;
import com.charging.screenshow.battery.animations.themes.opengl.image.RotationMonitor;
import com.charging.screenshow.battery.animations.themes.opengl.image.WallpaperRenderer;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/Charging3DPreviewAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Charging3DPreviewAct extends BaseAct {
    public static final /* synthetic */ int l0 = 0;
    public ActThreeDPreviewBinding h0;
    public WallpaperRenderer i0;
    public RotationMonitor j0;
    public Charging3D k0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/Charging3DPreviewAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActThreeDPreviewBinding actThreeDPreviewBinding = this.h0;
        if (actThreeDPreviewBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i2 = 0;
        ViewExt.c(actThreeDPreviewBinding.f13157c, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.e

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ Charging3DPreviewAct f13044Y;

            {
                this.f13044Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                Charging3DPreviewAct charging3DPreviewAct = this.f13044Y;
                View it = (View) obj;
                switch (i2) {
                    case 0:
                        int i3 = Charging3DPreviewAct.l0;
                        Intrinsics.f(it, "it");
                        charging3DPreviewAct.onBackPressed();
                        break;
                    default:
                        int i4 = Charging3DPreviewAct.l0;
                        Intrinsics.f(it, "it");
                        charging3DPreviewAct.getClass();
                        BaseMedia baseMediaB = AppPreferences.b();
                        if (baseMediaB == null) {
                            Charging3D charging3D = charging3DPreviewAct.k0;
                            Intrinsics.c(charging3D);
                            AppPreferences.d(charging3D);
                            int i5 = ResultAct.i0;
                            ResultAct.Companion.a(charging3DPreviewAct, 4);
                            charging3DPreviewAct.finish();
                        } else {
                            String name = baseMediaB.getName();
                            Charging3D charging3D2 = charging3DPreviewAct.k0;
                            Intrinsics.c(charging3D2);
                            if (!TextUtils.equals(name, charging3D2.getName())) {
                                Charging3D charging3D3 = charging3DPreviewAct.k0;
                                Intrinsics.c(charging3D3);
                                AppPreferences.d(charging3D3);
                                int i6 = ResultAct.i0;
                                ResultAct.Companion.a(charging3DPreviewAct, 4);
                                charging3DPreviewAct.finish();
                            } else {
                                AppPreferences.d(null);
                            }
                        }
                        break;
                }
                return unit;
            }
        });
        ActThreeDPreviewBinding actThreeDPreviewBinding2 = this.h0;
        if (actThreeDPreviewBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i3 = 1;
        ViewExt.c(actThreeDPreviewBinding2.f13158e, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.e

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ Charging3DPreviewAct f13044Y;

            {
                this.f13044Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                Charging3DPreviewAct charging3DPreviewAct = this.f13044Y;
                View it = (View) obj;
                switch (i3) {
                    case 0:
                        int i4 = Charging3DPreviewAct.l0;
                        Intrinsics.f(it, "it");
                        charging3DPreviewAct.onBackPressed();
                        break;
                    default:
                        int i5 = Charging3DPreviewAct.l0;
                        Intrinsics.f(it, "it");
                        charging3DPreviewAct.getClass();
                        BaseMedia baseMediaB = AppPreferences.b();
                        if (baseMediaB == null) {
                            Charging3D charging3D3 = charging3DPreviewAct.k0;
                            Intrinsics.c(charging3D3);
                            AppPreferences.d(charging3D3);
                            int i6 = ResultAct.i0;
                            ResultAct.Companion.a(charging3DPreviewAct, 4);
                            charging3DPreviewAct.finish();
                        } else {
                            String name = baseMediaB.getName();
                            Charging3D charging3D2 = charging3DPreviewAct.k0;
                            Intrinsics.c(charging3D2);
                            if (!TextUtils.equals(name, charging3D2.getName())) {
                                Charging3D charging3D4 = charging3DPreviewAct.k0;
                                Intrinsics.c(charging3D4);
                                AppPreferences.d(charging3D4);
                                int i7 = ResultAct.i0;
                                ResultAct.Companion.a(charging3DPreviewAct, 4);
                                charging3DPreviewAct.finish();
                            } else {
                                AppPreferences.d(null);
                            }
                        }
                        break;
                }
                return unit;
            }
        });
        if (j()) {
            p(new d(this, 1));
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        Charging3D charging3D;
        if (getIntent().hasExtra("key_bean")) {
            charging3D = Build.VERSION.SDK_INT >= 33 ? (Charging3D) getIntent().getSerializableExtra("key_bean", Charging3D.class) : (Charging3D) getIntent().getSerializableExtra("key_bean");
        } else {
            charging3D = null;
        }
        this.k0 = charging3D;
        if (charging3D == null) {
            finish();
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_three_d_preview, (ViewGroup) null, false);
        int i2 = R.id.glSurfaceView;
        GLSurfaceView gLSurfaceView = (GLSurfaceView) ViewBindings.a(R.id.glSurfaceView, viewInflate);
        if (gLSurfaceView != null) {
            i2 = R.id.immersionBarView;
            View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
            if (viewA != null) {
                i2 = R.id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
                if (imageView != null) {
                    i2 = R.id.rlBottom;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.rlBottom, viewInflate);
                    if (relativeLayout != null) {
                        i2 = R.id.tvApply;
                        TextView textView = (TextView) ViewBindings.a(R.id.tvApply, viewInflate);
                        if (textView != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.h0 = new ActThreeDPreviewBinding(linearLayout, gLSurfaceView, viewA, imageView, relativeLayout, textView);
                            Intrinsics.e(linearLayout, "getRoot(...)");
                            return linearLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActThreeDPreviewBinding actThreeDPreviewBinding = this.h0;
        if (actThreeDPreviewBinding != null) {
            return actThreeDPreviewBinding.f13156b;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        Layer3D pictures;
        ActThreeDPreviewBinding actThreeDPreviewBinding = this.h0;
        if (actThreeDPreviewBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDPreviewBinding.f13155a.setEGLContextClientVersion(2);
        ActThreeDPreviewBinding actThreeDPreviewBinding2 = this.h0;
        if (actThreeDPreviewBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDPreviewBinding2.f13155a.setPreserveEGLContextOnPause(true);
        WallpaperRenderer wallpaperRenderer = new WallpaperRenderer();
        this.i0 = wallpaperRenderer;
        ActThreeDPreviewBinding actThreeDPreviewBinding3 = this.h0;
        if (actThreeDPreviewBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDPreviewBinding3.f13155a.setRenderer(wallpaperRenderer);
        ActThreeDPreviewBinding actThreeDPreviewBinding4 = this.h0;
        if (actThreeDPreviewBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDPreviewBinding4.f13155a.setRenderMode(0);
        Charging3D charging3D = this.k0;
        if (charging3D == null || (pictures = charging3D.getPictures()) == null) {
            return;
        }
        String name = charging3D.getName();
        WallpaperRenderer wallpaperRenderer2 = this.i0;
        if (wallpaperRenderer2 == null) {
            return;
        }
        wallpaperRenderer2.j0 = (20 * 0.003f) + 0.03f;
        List listI = CollectionsKt.I(DownloadUtil.b(pictures.getLayer1(), name), DownloadUtil.b(pictures.getLayer2(), name), DownloadUtil.b(pictures.getLayer3(), name));
        List listI2 = CollectionsKt.I(Float.valueOf(0.6f), Float.valueOf(-0.6f), Float.valueOf(1.0f));
        List list = listI;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new GLBitmap((String) it.next()));
        }
        List list2 = listI2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((Number) it2.next()).floatValue()));
        }
        wallpaperRenderer2.b();
        ArrayList arrayList3 = wallpaperRenderer2.X;
        arrayList3.addAll(arrayList);
        wallpaperRenderer2.h0 = arrayList3.size();
        ArrayList arrayList4 = wallpaperRenderer2.f13312Y;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        wallpaperRenderer2.i0 = arrayList4.size();
        ActThreeDPreviewBinding actThreeDPreviewBinding5 = this.h0;
        if (actThreeDPreviewBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDPreviewBinding5.f13155a.requestRender();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.b();
        }
        RotationMonitor rotationMonitor2 = new RotationMonitor(this, new RotationMonitor.RotationChangedListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.Charging3DPreviewAct$startRotationMonitor$1
            @Override // com.charging.screenshow.battery.animations.themes.opengl.image.RotationMonitor.RotationChangedListener
            public final void a(float[] fArr) {
                Charging3DPreviewAct charging3DPreviewAct = this.f13033a;
                if (charging3DPreviewAct.getResources().getConfiguration().orientation == 2) {
                    WallpaperRenderer wallpaperRenderer3 = charging3DPreviewAct.i0;
                    if (wallpaperRenderer3 != null) {
                        wallpaperRenderer3.a(fArr[1], fArr[2]);
                    }
                } else {
                    WallpaperRenderer wallpaperRenderer4 = charging3DPreviewAct.i0;
                    if (wallpaperRenderer4 != null) {
                        wallpaperRenderer4.a(fArr[2], fArr[1]);
                    }
                }
                ActThreeDPreviewBinding actThreeDPreviewBinding6 = charging3DPreviewAct.h0;
                if (actThreeDPreviewBinding6 != null) {
                    actThreeDPreviewBinding6.f13155a.requestRender();
                } else {
                    Intrinsics.m("binding");
                    throw null;
                }
            }
        });
        this.j0 = rotationMonitor2;
        rotationMonitor2.a();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!j() || n().f13353e) {
            finish();
        } else {
            q(new d(this, 0));
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.b();
        }
        WallpaperRenderer wallpaperRenderer = this.i0;
        if (wallpaperRenderer != null) {
            wallpaperRenderer.b();
            wallpaperRenderer.f13312Y.clear();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.b();
        }
        ActThreeDPreviewBinding actThreeDPreviewBinding = this.h0;
        if (actThreeDPreviewBinding != null) {
            actThreeDPreviewBinding.f13155a.onPause();
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.a();
        }
        ActThreeDPreviewBinding actThreeDPreviewBinding = this.h0;
        if (actThreeDPreviewBinding != null) {
            actThreeDPreviewBinding.f13155a.onResume();
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }
}
