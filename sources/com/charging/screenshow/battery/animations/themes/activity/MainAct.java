package com.charging.screenshow.battery.animations.themes.activity;

import A.C0880a0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBindings;
import com.applovin.impl.Z;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActMainBinding;
import com.charging.screenshow.battery.animations.themes.fragment.HomeFrag;
import com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryFrag;
import com.charging.screenshow.battery.animations.themes.fragment.SettingsFrag;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.RateDialog;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzd;
import com.google.android.play.core.review.zzi;
import es.dmoral.toasty.Toasty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pub.devrel.easypermissions.EasyPermissions;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/MainAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainAct extends BaseAct {
    public static boolean q0;
    public ActMainBinding h0;
    public final ArrayList i0 = new ArrayList();
    public final Lazy j0 = LazyKt.b(new androidx.room.c(this, 2));
    public long k0;
    public RateDialog l0;
    public zzd m0;
    public ReviewInfo n0;
    public int o0;
    public Fragment p0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/MainAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActMainBinding actMainBinding = this.h0;
        if (actMainBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actMainBinding.f, new w(this, 1));
        ActMainBinding actMainBinding2 = this.h0;
        if (actMainBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actMainBinding2.f13133h, new w(this, 2));
        ActMainBinding actMainBinding3 = this.h0;
        if (actMainBinding3 != null) {
            ViewExt.c(actMainBinding3.g, new w(this, 3));
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        q0 = true;
        ArrayList arrayList = this.i0;
        arrayList.clear();
        arrayList.add(new HomeFrag());
        arrayList.add(new ImageCategoryFrag());
        arrayList.add(new SettingsFrag());
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_main, (ViewGroup) null, false);
        int i2 = R.id.flContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.a(R.id.flContainer, viewInflate);
        if (frameLayout != null) {
            i2 = R.id.immersionBarView;
            View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
            if (viewA != null) {
                i2 = R.id.ivCharging;
                ImageView imageView = (ImageView) ViewBindings.a(R.id.ivCharging, viewInflate);
                if (imageView != null) {
                    i2 = R.id.ivSettings;
                    ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivSettings, viewInflate);
                    if (imageView2 != null) {
                        i2 = R.id.ivWallpaper;
                        ImageView imageView3 = (ImageView) ViewBindings.a(R.id.ivWallpaper, viewInflate);
                        if (imageView3 != null) {
                            i2 = R.id.llCharging;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llCharging, viewInflate);
                            if (linearLayout != null) {
                                i2 = R.id.llSettings;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llSettings, viewInflate);
                                if (linearLayout2 != null) {
                                    i2 = R.id.llWallpaper;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.a(R.id.llWallpaper, viewInflate);
                                    if (linearLayout3 != null) {
                                        i2 = R.id.tvCharging;
                                        TextView textView = (TextView) ViewBindings.a(R.id.tvCharging, viewInflate);
                                        if (textView != null) {
                                            i2 = R.id.tvSettings;
                                            TextView textView2 = (TextView) ViewBindings.a(R.id.tvSettings, viewInflate);
                                            if (textView2 != null) {
                                                i2 = R.id.tvWallpaper;
                                                TextView textView3 = (TextView) ViewBindings.a(R.id.tvWallpaper, viewInflate);
                                                if (textView3 != null) {
                                                    LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                    this.h0 = new ActMainBinding(linearLayout4, frameLayout, viewA, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActMainBinding actMainBinding = this.h0;
        if (actMainBinding != null) {
            return actMainBinding.f13130b;
        }
        Intrinsics.m("binding");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        boolean z2 = this.Z;
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        if (!z2) {
            long j = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getLong("last_into_main_today", 0L);
            if (System.currentTimeMillis() - j < 86400000) {
                Calendar calendar = Calendar.getInstance();
                Intrinsics.e(calendar, "getInstance(...)");
                Calendar calendar2 = Calendar.getInstance();
                Intrinsics.e(calendar2, "getInstance(...)");
                calendar2.setTimeInMillis(j);
                if (calendar.get(6) != calendar2.get(6)) {
                    AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putLong("last_into_main_today", System.currentTimeMillis()).apply();
                }
            } else {
                AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putLong("last_into_main_today", System.currentTimeMillis()).apply();
            }
        }
        s(0);
        t(0);
        if (AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getBoolean("show_rate_complete", false)) {
            return;
        }
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            applicationContext = this;
        }
        zzd zzdVar = new zzd(new zzi(applicationContext));
        this.m0 = zzdVar;
        Task taskB = zzdVar.b();
        Intrinsics.e(taskB, "requestReviewFlow(...)");
        taskB.addOnCompleteListener(new C0880a0(this, 6));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i2 = 0;
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        if (Z.z(appPreferencesUtil, "show_rate_us_enable", true)) {
            RateDialog rateDialog = new RateDialog(this, new w(this, i2));
            this.l0 = rateDialog;
            rateDialog.show();
            appPreferencesUtil.b("show_rate_us_enable", false);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.k0 > com.smartdigimkt.u2.m.D0) {
            try {
                String strC = IntExt.c(R.string.quit_tips);
                Typeface typeface = Toasty.f42874a;
                Toasty.a(this, strC, AppCompatResources.a(this, 2131231236), ContextCompat.getColor(this, R.color.infoColor), ContextCompat.getColor(this, R.color.defaultTextColor)).show();
            } catch (Exception unused) {
            }
        } else {
            finishAffinity();
        }
        this.k0 = jCurrentTimeMillis;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        RateDialog rateDialog = this.l0;
        if (rateDialog != null) {
            rateDialog.dismiss();
        }
        q0 = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean zAreNotificationsEnabled;
        super.onResume();
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        if (Z.z(appPreferencesUtil, "check_notification_permission", true)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this);
                Intrinsics.e(notificationManagerCompatFrom, "from(...)");
                zAreNotificationsEnabled = notificationManagerCompatFrom.areNotificationsEnabled();
            } else {
                zAreNotificationsEnabled = true;
            }
            if (zAreNotificationsEnabled) {
                return;
            }
            appPreferencesUtil.b("check_notification_permission", false);
            if (i2 >= 33) {
                EasyPermissions.b(this, getString(R.string.storage_grant_permission_title), 14, (String[]) Arrays.copyOf(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1));
            }
        }
    }

    public final void s(int i2) {
        this.o0 = i2;
        FragmentTransaction fragmentTransactionD = getSupportFragmentManager().d();
        Fragment fragment = this.p0;
        if (fragment != null) {
            fragmentTransactionD.i(fragment);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ArrayList arrayList = this.i0;
        Fragment fragmentC = supportFragmentManager.C(arrayList.get(this.o0).getClass().getName());
        if (fragmentC == null) {
            fragmentC = (Fragment) arrayList.get(i2);
        }
        this.p0 = fragmentC;
        if (fragmentC.isAdded()) {
            fragmentTransactionD.k(fragmentC);
        } else {
            fragmentTransactionD.h(R.id.flContainer, fragmentC, fragmentC.getClass().getName(), 1);
        }
        fragmentTransactionD.c();
    }

    public final void t(int i2) {
        if (i2 == 0) {
            ActMainBinding actMainBinding = this.h0;
            if (actMainBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding.f13131c.setImageResource(R.drawable.ic_tab_charging_sel);
            ActMainBinding actMainBinding2 = this.h0;
            if (actMainBinding2 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding2.f13132e.setImageResource(R.drawable.ic_tab_wallpaper_nor);
            ActMainBinding actMainBinding3 = this.h0;
            if (actMainBinding3 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding3.d.setImageResource(R.drawable.ic_tab_settings_nor);
            ActMainBinding actMainBinding4 = this.h0;
            if (actMainBinding4 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding4.f13134i.setTextColor(IntExt.b(R.color.text_tab_selected));
            ActMainBinding actMainBinding5 = this.h0;
            if (actMainBinding5 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding5.k.setTextColor(IntExt.b(R.color.text_tab_unselected));
            ActMainBinding actMainBinding6 = this.h0;
            if (actMainBinding6 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding6.j.setTextColor(IntExt.b(R.color.text_tab_unselected));
            return;
        }
        if (i2 == 1) {
            ActMainBinding actMainBinding7 = this.h0;
            if (actMainBinding7 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding7.f13131c.setImageResource(R.drawable.ic_tab_charging_nor);
            ActMainBinding actMainBinding8 = this.h0;
            if (actMainBinding8 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding8.f13132e.setImageResource(R.drawable.ic_tab_wallpaper_sel);
            ActMainBinding actMainBinding9 = this.h0;
            if (actMainBinding9 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding9.d.setImageResource(R.drawable.ic_tab_settings_nor);
            ActMainBinding actMainBinding10 = this.h0;
            if (actMainBinding10 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding10.f13134i.setTextColor(IntExt.b(R.color.text_tab_unselected));
            ActMainBinding actMainBinding11 = this.h0;
            if (actMainBinding11 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding11.k.setTextColor(IntExt.b(R.color.text_tab_selected));
            ActMainBinding actMainBinding12 = this.h0;
            if (actMainBinding12 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actMainBinding12.j.setTextColor(IntExt.b(R.color.text_tab_unselected));
            return;
        }
        if (i2 != 2) {
            return;
        }
        ActMainBinding actMainBinding13 = this.h0;
        if (actMainBinding13 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actMainBinding13.f13131c.setImageResource(R.drawable.ic_tab_charging_nor);
        ActMainBinding actMainBinding14 = this.h0;
        if (actMainBinding14 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actMainBinding14.f13132e.setImageResource(R.drawable.ic_tab_wallpaper_nor);
        ActMainBinding actMainBinding15 = this.h0;
        if (actMainBinding15 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actMainBinding15.d.setImageResource(R.drawable.ic_tab_settings_sel);
        ActMainBinding actMainBinding16 = this.h0;
        if (actMainBinding16 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actMainBinding16.f13134i.setTextColor(IntExt.b(R.color.text_tab_unselected));
        ActMainBinding actMainBinding17 = this.h0;
        if (actMainBinding17 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actMainBinding17.k.setTextColor(IntExt.b(R.color.text_tab_unselected));
        ActMainBinding actMainBinding18 = this.h0;
        if (actMainBinding18 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actMainBinding18.j.setTextColor(IntExt.b(R.color.text_tab_selected));
    }
}
