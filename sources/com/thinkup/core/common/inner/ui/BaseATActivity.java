package com.thinkup.core.common.inner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.common.inner.oo.m;
import com.thinkup.core.common.inner.oo.o0;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.mn.oo.o.on;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.o.nn;
import com.thinkup.core.common.on.nm0;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class BaseATActivity extends Activity {
    public static final String o = "BaseATActivity";
    boolean m;
    o0 mm;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    nm0 f41833n;
    private BaseScreenTUView n0;
    private ooo nm;
    private String nn;
    private oom no;
    private m.AbstractC0660m o00;
    private int o0m;
    private int o0n;
    private String o0o;
    private boolean om0;
    private boolean oo0;
    private boolean oom;
    private boolean oon;
    private boolean ooo;
    long o0 = 0;
    long oo = 0;
    float om = 0.0f;
    boolean on = false;
    boolean m0 = false;
    com.thinkup.core.common.m.o mo = new com.thinkup.core.common.m.o() { // from class: com.thinkup.core.common.inner.ui.BaseATActivity.1
        @Override // com.thinkup.core.common.m.o
        public final void o(Object obj) {
            if (!(obj instanceof nm0) || BaseATActivity.this.nm == null) {
                return;
            }
            nm0 nm0Var = (nm0) obj;
            if (nm0Var.m().oo0().equals(BaseATActivity.this.nm.oo0())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.m) {
                    return;
                }
                baseATActivity.f41833n = nm0Var;
            }
        }
    };
    boolean mn = false;

    private void o0() {
        try {
            if (!this.mn) {
                ooo oooVar = this.nm;
                if (oooVar == null || oooVar.on() == null || this.nm.on().nmo() != 1) {
                    return;
                }
            } else if (!TUSDKGlobalSetting.isHideNavAndStatusBar) {
                return;
            }
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.systemUiVisibility = IronSourceError.ERROR_LEGACY_INIT_POST_FAILED;
            window.setAttributes(attributes);
            window.addFlags(1024);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        BaseScreenTUView baseScreenTUView = this.n0;
        if (baseScreenTUView != null) {
            baseScreenTUView.onActivityResult(i2, i3, intent);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (o0n.m().on() == null) {
            o0n.m().o(getApplicationContext());
        }
        o(bundle);
        o0();
        try {
            com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o interfaceC0666oM = com.thinkup.core.common.inner.mixad.o.o().m(this.nn);
            if (interfaceC0666oM != null) {
                interfaceC0666oM.o(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f41833n = null;
        this.mm = null;
        com.thinkup.core.common.m.o().m("1", this.mo);
        BaseScreenTUView baseScreenTUView = this.n0;
        if (baseScreenTUView != null) {
            baseScreenTUView.removeAllViews();
            this.n0.destroy();
            this.n0 = null;
        }
        ooo oooVar = this.nm;
        if (oooVar != null && oooVar.oon() && !this.nm.onn()) {
            nn.o().m();
        }
        if (this.no != null) {
            com.thinkup.core.common.oo0.o.o().o(this.no.om + this.no.oo);
        }
        if (!TextUtils.isEmpty(this.nn)) {
            m.o().m(this.nn);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (4 == i2) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.m = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                super.onResume();
            } catch (Throwable unused) {
                n();
            }
        } else {
            super.onResume();
        }
        o0();
        this.m = true;
        if (this.f41833n != null) {
            this.f41833n = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenTUView baseScreenTUView = this.n0;
        if (baseScreenTUView != null) {
            if (baseScreenTUView.isShowEndCard()) {
                bundle.putBoolean("extra_is_show_end_card", true);
            }
            bundle.putBoolean("extra_is_mute", this.n0.isVideoMute());
            bundle.putBoolean("extra_has_reward_savestate", this.n0.hasReward());
            bundle.putLong("extra_show_banner_time", this.n0.getShowBannerTime());
            bundle.putLong("extra_hide_banner_time", this.n0.getHideBannerTime());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            o0();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(o00.o(this, "myoffer_half_screen_fit_by_o", "style"));
        } else {
            super.setTheme(i2);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseATActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends o0 {
        public AnonymousClass2() {
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void m() {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.m();
            }
        }

        @Override // com.thinkup.core.common.inner.oo.o0
        public final void m0() {
        }

        @Override // com.thinkup.core.common.inner.oo.o0
        public final String mo() {
            return "";
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void n() {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.n();
            }
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void o(oo ooVar) {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.o(ooVar);
            }
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void o0() {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.o(oo());
                BaseATActivity.this.o00.o0();
            }
            BaseATActivity.this.n();
        }

        @Override // com.thinkup.core.common.inner.oo.o0
        public final void om() {
        }

        @Override // com.thinkup.core.common.inner.oo.o0
        public final void on() {
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void m(oo ooVar) {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.m(ooVar);
            }
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void o(com.thinkup.core.common.inner.m.o oVar) {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.o(oVar);
            }
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void o() {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.o();
            }
        }

        @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
        public final void o(boolean z2) {
            if (BaseATActivity.this.o00 != null) {
                BaseATActivity.this.o00.o(z2);
            }
        }
    }

    private void m() {
        com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o interfaceC0666oM = com.thinkup.core.common.inner.mixad.o.o().m(this.nn);
        if (interfaceC0666oM != null) {
            interfaceC0666oM.o(this);
        }
    }

    private void n(Bundle bundle) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.mm = anonymousClass2;
        this.n0.setListener(anonymousClass2);
        if (bundle != null) {
            this.oo0 = bundle.getBoolean("extra_is_show_end_card");
            this.ooo = bundle.getBoolean("extra_is_mute");
            this.oom = bundle.getBoolean("extra_has_reward_savestate");
            this.o0 = bundle.getLong("extra_show_banner_time");
            this.oo = bundle.getLong("extra_hide_banner_time");
            this.om = bundle.getFloat("extra_close_view_scale");
            this.on = bundle.getBoolean("extra_has_perform_click", false);
            this.m0 = bundle.getBoolean("extra_is_showing_endcard_after_video_play", false);
        }
        this.n0.setIsShowEndCard(this.oo0);
        this.n0.setHasReward(this.oom);
        if (bundle != null) {
            this.n0.setVideoMute(this.ooo);
            this.n0.setShowBannerTime(this.o0);
            this.n0.setHideBannerTime(this.oo);
        }
        try {
            this.n0.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                m.AbstractC0660m abstractC0660m = this.o00;
                if (abstractC0660m != null) {
                    abstractC0660m.o(com.thinkup.core.common.inner.m.m.o("40002", o00.o(th.getStackTrace())));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            n();
        }
    }

    public static void o(Activity activity, com.thinkup.core.basead.m.o oVar) {
        Intent intent = new Intent();
        Context contextOn = o0n.m().on();
        if (activity == null || activity.isFinishing()) {
            Log.i("thinkup_BaseATActivity", "Activity is null");
        } else {
            contextOn = activity;
        }
        boolean zO = o(oVar.o, oVar.m0);
        if (oVar.oo == 2) {
            if (zO || oVar.mm) {
                intent.setClass(contextOn, TULandscapeTranslucentActivity.class);
            } else {
                intent.setClass(contextOn, TULandscapeActivity.class);
            }
        } else if (zO || oVar.mm) {
            intent.setClass(contextOn, TUPortraitTranslucentActivity.class);
        } else {
            intent.setClass(contextOn, TUPortraitActivity.class);
        }
        intent.putExtra("extra_event_id", oVar.o0);
        com.thinkup.core.common.inner.ui.o0.o.o().o(oVar.o0, oVar);
        if (!(contextOn instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            contextOn.startActivity(intent);
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.overridePendingTransition(0, 0);
        } catch (Throwable th) {
            m.AbstractC0660m abstractC0660mO = m.o().o(oVar.o0);
            if (abstractC0660mO != null) {
                abstractC0660mO.o(com.thinkup.core.common.inner.m.m.o("10000", th.getMessage()));
            }
        }
    }

    private void m(Bundle bundle) {
        if (bundle != null) {
            this.oo0 = bundle.getBoolean("extra_is_show_end_card");
            this.ooo = bundle.getBoolean("extra_is_mute");
            this.oom = bundle.getBoolean("extra_has_reward_savestate");
            this.o0 = bundle.getLong("extra_show_banner_time");
            this.oo = bundle.getLong("extra_hide_banner_time");
            this.om = bundle.getFloat("extra_close_view_scale");
            this.on = bundle.getBoolean("extra_has_perform_click", false);
            this.m0 = bundle.getBoolean("extra_is_showing_endcard_after_video_play", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            finish();
            overridePendingTransition(0, 0);
        } catch (Throwable unused) {
        }
    }

    private void o() {
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.nn = intent.getStringExtra("extra_event_id");
                com.thinkup.core.basead.m.o oVarO = com.thinkup.core.common.inner.ui.o0.o.o().o(this.nn);
                if (oVarO != null) {
                    this.o0o = oVarO.m;
                    this.o0m = oVarO.o;
                    this.nm = oVarO.f41799n;
                    this.no = oVarO.m0;
                }
                this.oon = o(this.o0m, this.no);
                return;
            }
            Log.e(mo.oo0, o + " Intent is null.");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean o(int i2, oom oomVar) {
        oon oonVar;
        if (oomVar == null || (oonVar = oomVar.oo0) == null || i2 != 3) {
            return false;
        }
        return TextUtils.equals("2", oonVar.ooo());
    }

    private BaseScreenTUView o(com.thinkup.core.common.inner.mixad.n.o.o oVar, BaseAd baseAd) {
        int i2 = this.o0m;
        if ((i2 == 1 || i2 == 3) && baseAd != null) {
            boolean z2 = this.oon;
            if (oVar != null) {
                Object objO = new com.thinkup.core.common.inner.mixad.n.m(new com.thinkup.core.common.inner.mixad.n.o.o.C0658o().o(oVar).o(this).o(z2).o(this.o0o).o(this.o0n).o()).o();
                if (objO instanceof BaseScreenTUView) {
                    this.om0 = objO instanceof com.thinkup.core.common.mn.oo.o.oo;
                    return (BaseScreenTUView) objO;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    public void o(Bundle bundle) {
        BaseAd baseAdO;
        BaseScreenTUView baseScreenTUView;
        if (this instanceof TULandscapeActivity) {
            this.o0n = 2;
        } else {
            this.o0n = 1;
        }
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.nn = intent.getStringExtra("extra_event_id");
                com.thinkup.core.basead.m.o oVarO = com.thinkup.core.common.inner.ui.o0.o.o().o(this.nn);
                if (oVarO != null) {
                    this.o0o = oVarO.m;
                    this.o0m = oVarO.o;
                    this.nm = oVarO.f41799n;
                    this.no = oVarO.m0;
                }
                this.oon = o(this.o0m, this.no);
            } else {
                Log.e(mo.oo0, o + " Intent is null.");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.o00 = m.o().o(this.nn);
        oom oomVar = this.no;
        if (oomVar != null && oomVar.oo0 != null) {
            if (this.nm == null) {
                StringBuilder sb = new StringBuilder();
                String str = o;
                sb.append(str);
                sb.append(" onCreate: OfferAd = null");
                Log.e(mo.oo0, sb.toString());
                try {
                    m.AbstractC0660m abstractC0660m = this.o00;
                    if (abstractC0660m != null) {
                        abstractC0660m.o(com.thinkup.core.common.inner.m.m.o("40002", str + " onCreate: OfferAd = null"));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                n();
                return;
            }
            com.thinkup.core.common.m.o().o("1", this.mo);
            com.thinkup.core.common.inner.mixad.n.o.o oVarO2 = com.thinkup.core.common.inner.mixad.o.o().o(this.nn);
            if (oVarO2 == null || oVarO2.o() == null) {
                baseAdO = null;
            } else {
                TUNativeAdInfo tUNativeAdInfoO = oVarO2.o();
                if (tUNativeAdInfoO instanceof on) {
                    baseAdO = ((on) tUNativeAdInfoO).o();
                    this.mn = true;
                } else {
                    baseAdO = null;
                }
            }
            int i2 = this.o0m;
            if ((i2 == 1 || i2 == 3) && baseAdO != null) {
                boolean z2 = this.oon;
                if (oVarO2 != null) {
                    Object objO = new com.thinkup.core.common.inner.mixad.n.m(new com.thinkup.core.common.inner.mixad.n.o.o.C0658o().o(oVarO2).o(this).o(z2).o(this.o0o).o(this.o0n).o()).o();
                    if (objO instanceof BaseScreenTUView) {
                        this.om0 = objO instanceof com.thinkup.core.common.mn.oo.o.oo;
                        baseScreenTUView = (BaseScreenTUView) objO;
                    } else {
                        baseScreenTUView = null;
                    }
                } else {
                    baseScreenTUView = null;
                }
            } else {
                baseScreenTUView = null;
            }
            this.n0 = baseScreenTUView;
            if (baseScreenTUView == null) {
                m.AbstractC0660m abstractC0660m2 = this.o00;
                if (abstractC0660m2 != null) {
                    abstractC0660m2.o(com.thinkup.core.common.inner.m.m.o("40002", "mScreenAdView is null."));
                    return;
                }
                return;
            }
            if (!this.om0 && !this.oon) {
                ViewGroup customAdContainer = baseAdO != null ? baseAdO.getCustomAdContainer() : null;
                if (customAdContainer != null) {
                    customAdContainer.addView(this.n0);
                    moo.o((View) customAdContainer);
                    setContentView(customAdContainer);
                    this.n0.handleFullScreenClick(customAdContainer);
                } else {
                    setContentView(this.n0);
                }
            } else {
                setContentView(baseScreenTUView);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.mm = anonymousClass2;
            this.n0.setListener(anonymousClass2);
            if (bundle != null) {
                this.oo0 = bundle.getBoolean("extra_is_show_end_card");
                this.ooo = bundle.getBoolean("extra_is_mute");
                this.oom = bundle.getBoolean("extra_has_reward_savestate");
                this.o0 = bundle.getLong("extra_show_banner_time");
                this.oo = bundle.getLong("extra_hide_banner_time");
                this.om = bundle.getFloat("extra_close_view_scale");
                this.on = bundle.getBoolean("extra_has_perform_click", false);
                this.m0 = bundle.getBoolean("extra_is_showing_endcard_after_video_play", false);
            }
            this.n0.setIsShowEndCard(this.oo0);
            this.n0.setHasReward(this.oom);
            if (bundle != null) {
                this.n0.setVideoMute(this.ooo);
                this.n0.setShowBannerTime(this.o0);
                this.n0.setHideBannerTime(this.oo);
            }
            try {
                this.n0.init();
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                try {
                    m.AbstractC0660m abstractC0660m3 = this.o00;
                    if (abstractC0660m3 != null) {
                        abstractC0660m3.o(com.thinkup.core.common.inner.m.m.o("40002", o00.o(th2.getStackTrace())));
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                n();
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = o;
        sb2.append(str2);
        sb2.append("Start Screen Ad Error.");
        Log.e(mo.oo0, sb2.toString());
        try {
            m.AbstractC0660m abstractC0660m4 = this.o00;
            if (abstractC0660m4 != null) {
                abstractC0660m4.o(com.thinkup.core.common.inner.m.m.o("40002", str2 + "Start FullScreen Ad Error."));
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        n();
    }

    private BaseScreenTUView o(com.thinkup.core.common.inner.mixad.n.o.o oVar, boolean z2) {
        if (oVar == null) {
            return null;
        }
        Object objO = new com.thinkup.core.common.inner.mixad.n.m(new com.thinkup.core.common.inner.mixad.n.o.o.C0658o().o(oVar).o(this).o(z2).o(this.o0o).o(this.o0n).o()).o();
        if (!(objO instanceof BaseScreenTUView)) {
            return null;
        }
        this.om0 = objO instanceof com.thinkup.core.common.mn.oo.o.oo;
        return (BaseScreenTUView) objO;
    }
}
