package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.core.net.MailTo;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import androidx.webkit.internal.AssetHelper;
import com.bumptech.glide.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivitySettingBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2767Sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2940Zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class SettingActivity extends BaseSyncActivity<ActivitySettingBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2779a = 0;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity
    public final ViewBinding getViewBinding() {
        ActivitySettingBinding activitySettingBindingInflate = ActivitySettingBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(activitySettingBindingInflate, "inflate(...)");
        return activitySettingBindingInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initView() {
        C2498In c2498In = App.n;
        final int i = 0;
        final int i2 = 2;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new B8(this, null), 2);
        VY vyC = a.a(this).e.c(this);
        PY py = (PY) ((PY) vyC.i(Drawable.class).y(Integer.valueOf(R.drawable.bg_setting)).n(false)).d(AbstractC2940Zo.c);
        py.getClass();
        ((PY) py.l(AbstractC2767Sx.b, Boolean.TRUE)).w(((ActivitySettingBinding) getMBinding()).ivBg);
        final int i3 = 3;
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new L50(this, null), 3);
        ((ActivitySettingBinding) getMBinding()).ivBack.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A50
            public final /* synthetic */ SettingActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i4 = i;
                SettingActivity settingActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(settingActivity, "button_sound/button_sound.ogg", null), 2);
                        settingActivity.finish();
                        break;
                    case 1:
                        int i6 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "rate");
                        WD.D(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, 0, new N50(2, null), 3);
                        new DialogC4228oX(settingActivity, settingActivity, settingActivity, true).show();
                        break;
                    case 2:
                        int i7 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "more");
                        try {
                            settingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:BetterLife Technology")));
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(settingActivity, R.string.install_google_play, 1).show();
                            return;
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case 3:
                        int i8 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "share");
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                            intent.putExtra("android.intent.extra.SUBJECT", settingActivity.getResources().getString(R.string.app_name));
                            intent.putExtra("android.intent.extra.TEXT", "\n\n\nhttps://play.google.com/store/apps/details?id=" + settingActivity.getPackageName() + " \n\n");
                            settingActivity.startActivity(Intent.createChooser(intent, "Share to"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i9 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "feedback");
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"ALL-Betterlife@hotmail.com"});
                        StringBuilder sb = new StringBuilder("Feedback for , app ver is");
                        try {
                            str = settingActivity.getPackageManager().getPackageInfo(settingActivity.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        sb.append(" :");
                        intent2.putExtra("android.intent.extra.SUBJECT", sb.toString());
                        try {
                            settingActivity.startActivity(intent2);
                        } catch (Exception unused2) {
                            Toast.makeText(settingActivity, settingActivity.getString(R.string.cm_no_email), 1).show();
                            return;
                        }
                        break;
                    default:
                        int i10 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", com.umeng.analytics.pro.bc.by);
                        final C2547Kk c2547Kk = new C2547Kk(settingActivity);
                        BM bm = new BM(settingActivity);
                        bm.a(c2547Kk);
                        bm.l = settingActivity.getText(R.string.cm_close);
                        bm.B = new DialogInterface.OnShowListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha0
                            public final /* synthetic */ String b = "https://colordrawfun.com/BetterLifeTechnology.html";

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                C2547Kk c2547Kk2 = c2547Kk;
                                WebSettings settings = c2547Kk2.getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSupportZoom(true);
                                settings.setCacheMode(2);
                                c2547Kk2.setWebViewClient(new WebViewClient());
                                c2547Kk2.loadUrl(this.b);
                            }
                        };
                        bm.A = new DialogInterfaceOnDismissListenerC3706ia0(c2547Kk, 0);
                        bm.s = false;
                        bm.t = false;
                        EM em = new EM(bm);
                        em.m.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        em.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                        em.show();
                        break;
                }
            }
        });
        final int i4 = 1;
        ((ActivitySettingBinding) getMBinding()).layoutRate.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A50
            public final /* synthetic */ SettingActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i5 = i4;
                SettingActivity settingActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(settingActivity, "button_sound/button_sound.ogg", null), 2);
                        settingActivity.finish();
                        break;
                    case 1:
                        int i7 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "rate");
                        WD.D(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, 0, new N50(2, null), 3);
                        new DialogC4228oX(settingActivity, settingActivity, settingActivity, true).show();
                        break;
                    case 2:
                        int i8 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "more");
                        try {
                            settingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:BetterLife Technology")));
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(settingActivity, R.string.install_google_play, 1).show();
                            return;
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case 3:
                        int i9 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "share");
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                            intent.putExtra("android.intent.extra.SUBJECT", settingActivity.getResources().getString(R.string.app_name));
                            intent.putExtra("android.intent.extra.TEXT", "\n\n\nhttps://play.google.com/store/apps/details?id=" + settingActivity.getPackageName() + " \n\n");
                            settingActivity.startActivity(Intent.createChooser(intent, "Share to"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i10 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "feedback");
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"ALL-Betterlife@hotmail.com"});
                        StringBuilder sb = new StringBuilder("Feedback for , app ver is");
                        try {
                            str = settingActivity.getPackageManager().getPackageInfo(settingActivity.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        sb.append(" :");
                        intent2.putExtra("android.intent.extra.SUBJECT", sb.toString());
                        try {
                            settingActivity.startActivity(intent2);
                        } catch (Exception unused2) {
                            Toast.makeText(settingActivity, settingActivity.getString(R.string.cm_no_email), 1).show();
                            return;
                        }
                        break;
                    default:
                        int i11 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", com.umeng.analytics.pro.bc.by);
                        final C2547Kk c2547Kk = new C2547Kk(settingActivity);
                        BM bm = new BM(settingActivity);
                        bm.a(c2547Kk);
                        bm.l = settingActivity.getText(R.string.cm_close);
                        bm.B = new DialogInterface.OnShowListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha0
                            public final /* synthetic */ String b = "https://colordrawfun.com/BetterLifeTechnology.html";

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                C2547Kk c2547Kk2 = c2547Kk;
                                WebSettings settings = c2547Kk2.getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSupportZoom(true);
                                settings.setCacheMode(2);
                                c2547Kk2.setWebViewClient(new WebViewClient());
                                c2547Kk2.loadUrl(this.b);
                            }
                        };
                        bm.A = new DialogInterfaceOnDismissListenerC3706ia0(c2547Kk, 0);
                        bm.s = false;
                        bm.t = false;
                        EM em = new EM(bm);
                        em.m.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        em.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                        em.show();
                        break;
                }
            }
        });
        ((ActivitySettingBinding) getMBinding()).layoutMoreApps.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A50
            public final /* synthetic */ SettingActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i5 = i2;
                SettingActivity settingActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(settingActivity, "button_sound/button_sound.ogg", null), 2);
                        settingActivity.finish();
                        break;
                    case 1:
                        int i7 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "rate");
                        WD.D(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, 0, new N50(2, null), 3);
                        new DialogC4228oX(settingActivity, settingActivity, settingActivity, true).show();
                        break;
                    case 2:
                        int i8 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "more");
                        try {
                            settingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:BetterLife Technology")));
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(settingActivity, R.string.install_google_play, 1).show();
                            return;
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case 3:
                        int i9 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "share");
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                            intent.putExtra("android.intent.extra.SUBJECT", settingActivity.getResources().getString(R.string.app_name));
                            intent.putExtra("android.intent.extra.TEXT", "\n\n\nhttps://play.google.com/store/apps/details?id=" + settingActivity.getPackageName() + " \n\n");
                            settingActivity.startActivity(Intent.createChooser(intent, "Share to"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i10 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "feedback");
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"ALL-Betterlife@hotmail.com"});
                        StringBuilder sb = new StringBuilder("Feedback for , app ver is");
                        try {
                            str = settingActivity.getPackageManager().getPackageInfo(settingActivity.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        sb.append(" :");
                        intent2.putExtra("android.intent.extra.SUBJECT", sb.toString());
                        try {
                            settingActivity.startActivity(intent2);
                        } catch (Exception unused2) {
                            Toast.makeText(settingActivity, settingActivity.getString(R.string.cm_no_email), 1).show();
                            return;
                        }
                        break;
                    default:
                        int i11 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", com.umeng.analytics.pro.bc.by);
                        final C2547Kk c2547Kk = new C2547Kk(settingActivity);
                        BM bm = new BM(settingActivity);
                        bm.a(c2547Kk);
                        bm.l = settingActivity.getText(R.string.cm_close);
                        bm.B = new DialogInterface.OnShowListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha0
                            public final /* synthetic */ String b = "https://colordrawfun.com/BetterLifeTechnology.html";

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                C2547Kk c2547Kk2 = c2547Kk;
                                WebSettings settings = c2547Kk2.getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSupportZoom(true);
                                settings.setCacheMode(2);
                                c2547Kk2.setWebViewClient(new WebViewClient());
                                c2547Kk2.loadUrl(this.b);
                            }
                        };
                        bm.A = new DialogInterfaceOnDismissListenerC3706ia0(c2547Kk, 0);
                        bm.s = false;
                        bm.t = false;
                        EM em = new EM(bm);
                        em.m.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        em.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                        em.show();
                        break;
                }
            }
        });
        ((ActivitySettingBinding) getMBinding()).layoutShare.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A50
            public final /* synthetic */ SettingActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i5 = i3;
                SettingActivity settingActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(settingActivity, "button_sound/button_sound.ogg", null), 2);
                        settingActivity.finish();
                        break;
                    case 1:
                        int i7 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "rate");
                        WD.D(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, 0, new N50(2, null), 3);
                        new DialogC4228oX(settingActivity, settingActivity, settingActivity, true).show();
                        break;
                    case 2:
                        int i8 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "more");
                        try {
                            settingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:BetterLife Technology")));
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(settingActivity, R.string.install_google_play, 1).show();
                            return;
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case 3:
                        int i9 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "share");
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                            intent.putExtra("android.intent.extra.SUBJECT", settingActivity.getResources().getString(R.string.app_name));
                            intent.putExtra("android.intent.extra.TEXT", "\n\n\nhttps://play.google.com/store/apps/details?id=" + settingActivity.getPackageName() + " \n\n");
                            settingActivity.startActivity(Intent.createChooser(intent, "Share to"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i10 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "feedback");
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"ALL-Betterlife@hotmail.com"});
                        StringBuilder sb = new StringBuilder("Feedback for , app ver is");
                        try {
                            str = settingActivity.getPackageManager().getPackageInfo(settingActivity.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        sb.append(" :");
                        intent2.putExtra("android.intent.extra.SUBJECT", sb.toString());
                        try {
                            settingActivity.startActivity(intent2);
                        } catch (Exception unused2) {
                            Toast.makeText(settingActivity, settingActivity.getString(R.string.cm_no_email), 1).show();
                            return;
                        }
                        break;
                    default:
                        int i11 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", com.umeng.analytics.pro.bc.by);
                        final C2547Kk c2547Kk = new C2547Kk(settingActivity);
                        BM bm = new BM(settingActivity);
                        bm.a(c2547Kk);
                        bm.l = settingActivity.getText(R.string.cm_close);
                        bm.B = new DialogInterface.OnShowListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha0
                            public final /* synthetic */ String b = "https://colordrawfun.com/BetterLifeTechnology.html";

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                C2547Kk c2547Kk2 = c2547Kk;
                                WebSettings settings = c2547Kk2.getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSupportZoom(true);
                                settings.setCacheMode(2);
                                c2547Kk2.setWebViewClient(new WebViewClient());
                                c2547Kk2.loadUrl(this.b);
                            }
                        };
                        bm.A = new DialogInterfaceOnDismissListenerC3706ia0(c2547Kk, 0);
                        bm.s = false;
                        bm.t = false;
                        EM em = new EM(bm);
                        em.m.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        em.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                        em.show();
                        break;
                }
            }
        });
        final int i5 = 4;
        ((ActivitySettingBinding) getMBinding()).layoutFeedback.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A50
            public final /* synthetic */ SettingActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i6 = i5;
                SettingActivity settingActivity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(settingActivity, "button_sound/button_sound.ogg", null), 2);
                        settingActivity.finish();
                        break;
                    case 1:
                        int i8 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "rate");
                        WD.D(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, 0, new N50(2, null), 3);
                        new DialogC4228oX(settingActivity, settingActivity, settingActivity, true).show();
                        break;
                    case 2:
                        int i9 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "more");
                        try {
                            settingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:BetterLife Technology")));
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(settingActivity, R.string.install_google_play, 1).show();
                            return;
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case 3:
                        int i10 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "share");
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                            intent.putExtra("android.intent.extra.SUBJECT", settingActivity.getResources().getString(R.string.app_name));
                            intent.putExtra("android.intent.extra.TEXT", "\n\n\nhttps://play.google.com/store/apps/details?id=" + settingActivity.getPackageName() + " \n\n");
                            settingActivity.startActivity(Intent.createChooser(intent, "Share to"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i11 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "feedback");
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"ALL-Betterlife@hotmail.com"});
                        StringBuilder sb = new StringBuilder("Feedback for , app ver is");
                        try {
                            str = settingActivity.getPackageManager().getPackageInfo(settingActivity.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        sb.append(" :");
                        intent2.putExtra("android.intent.extra.SUBJECT", sb.toString());
                        try {
                            settingActivity.startActivity(intent2);
                        } catch (Exception unused2) {
                            Toast.makeText(settingActivity, settingActivity.getString(R.string.cm_no_email), 1).show();
                            return;
                        }
                        break;
                    default:
                        int i12 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", com.umeng.analytics.pro.bc.by);
                        final C2547Kk c2547Kk = new C2547Kk(settingActivity);
                        BM bm = new BM(settingActivity);
                        bm.a(c2547Kk);
                        bm.l = settingActivity.getText(R.string.cm_close);
                        bm.B = new DialogInterface.OnShowListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha0
                            public final /* synthetic */ String b = "https://colordrawfun.com/BetterLifeTechnology.html";

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                C2547Kk c2547Kk2 = c2547Kk;
                                WebSettings settings = c2547Kk2.getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSupportZoom(true);
                                settings.setCacheMode(2);
                                c2547Kk2.setWebViewClient(new WebViewClient());
                                c2547Kk2.loadUrl(this.b);
                            }
                        };
                        bm.A = new DialogInterfaceOnDismissListenerC3706ia0(c2547Kk, 0);
                        bm.s = false;
                        bm.t = false;
                        EM em = new EM(bm);
                        em.m.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        em.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                        em.show();
                        break;
                }
            }
        });
        final int i6 = 5;
        ((ActivitySettingBinding) getMBinding()).layoutPrivacyPolicy.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A50
            public final /* synthetic */ SettingActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i7 = i6;
                SettingActivity settingActivity = this.b;
                switch (i7) {
                    case 0:
                        int i8 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(settingActivity, "button_sound/button_sound.ogg", null), 2);
                        settingActivity.finish();
                        break;
                    case 1:
                        int i9 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "rate");
                        WD.D(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, 0, new N50(2, null), 3);
                        new DialogC4228oX(settingActivity, settingActivity, settingActivity, true).show();
                        break;
                    case 2:
                        int i10 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "more");
                        try {
                            settingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:BetterLife Technology")));
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(settingActivity, R.string.install_google_play, 1).show();
                            return;
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case 3:
                        int i11 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "share");
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                            intent.putExtra("android.intent.extra.SUBJECT", settingActivity.getResources().getString(R.string.app_name));
                            intent.putExtra("android.intent.extra.TEXT", "\n\n\nhttps://play.google.com/store/apps/details?id=" + settingActivity.getPackageName() + " \n\n");
                            settingActivity.startActivity(Intent.createChooser(intent, "Share to"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i12 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", "feedback");
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{"ALL-Betterlife@hotmail.com"});
                        StringBuilder sb = new StringBuilder("Feedback for , app ver is");
                        try {
                            str = settingActivity.getPackageManager().getPackageInfo(settingActivity.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        sb.append(" :");
                        intent2.putExtra("android.intent.extra.SUBJECT", sb.toString());
                        try {
                            settingActivity.startActivity(intent2);
                        } catch (Exception unused2) {
                            Toast.makeText(settingActivity, settingActivity.getString(R.string.cm_no_email), 1).show();
                            return;
                        }
                        break;
                    default:
                        int i13 = SettingActivity.f2779a;
                        AbstractC2995aW.q(settingActivity, "this$0");
                        S3.b("setting_page_click", com.umeng.analytics.pro.bc.by);
                        final C2547Kk c2547Kk = new C2547Kk(settingActivity);
                        BM bm = new BM(settingActivity);
                        bm.a(c2547Kk);
                        bm.l = settingActivity.getText(R.string.cm_close);
                        bm.B = new DialogInterface.OnShowListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha0
                            public final /* synthetic */ String b = "https://colordrawfun.com/BetterLifeTechnology.html";

                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                C2547Kk c2547Kk2 = c2547Kk;
                                WebSettings settings = c2547Kk2.getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSupportZoom(true);
                                settings.setCacheMode(2);
                                c2547Kk2.setWebViewClient(new WebViewClient());
                                c2547Kk2.loadUrl(this.b);
                            }
                        };
                        bm.A = new DialogInterfaceOnDismissListenerC3706ia0(c2547Kk, 0);
                        bm.s = false;
                        bm.t = false;
                        EM em = new EM(bm);
                        em.m.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        em.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                        em.show();
                        break;
                }
            }
        });
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new O50(this, null), 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new Q50(this, null), 2);
    }
}
