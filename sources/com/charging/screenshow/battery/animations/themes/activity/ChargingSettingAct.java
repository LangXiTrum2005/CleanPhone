package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBindings;
import com.applovin.impl.Z;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingSettingBinding;
import com.charging.screenshow.battery.animations.themes.databinding.LayChargingCloseTypeBinding;
import com.charging.screenshow.battery.animations.themes.databinding.LayChargingDurationBinding;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.CustomPopWindow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingSettingAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingSettingAct extends BaseAct {
    public static final /* synthetic */ int m0 = 0;
    public ActChargingSettingBinding h0;
    public LayChargingDurationBinding i0;
    public CustomPopWindow j0;
    public LayChargingCloseTypeBinding k0;
    public CustomPopWindow l0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingSettingAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context) {
            Intrinsics.f(context, "context");
            ActUtils.b(context, ChargingSettingAct.class);
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_charging_setting, (ViewGroup) null, false);
        int i2 = R.id.immersionBarView;
        View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
        if (viewA != null) {
            i2 = R.id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
            if (imageView != null) {
                i2 = R.id.lay_title_toolbar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.lay_title_toolbar, viewInflate);
                if (relativeLayout != null) {
                    i2 = R.id.llBatteryText;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llBatteryText, viewInflate);
                    if (linearLayout != null) {
                        i2 = R.id.llClose;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llClose, viewInflate);
                        if (linearLayout2 != null) {
                            i2 = R.id.llDuration;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.a(R.id.llDuration, viewInflate);
                            if (linearLayout3 != null) {
                                i2 = R.id.llScreen;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.a(R.id.llScreen, viewInflate);
                                if (linearLayout4 != null) {
                                    i2 = R.id.llSounds;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.a(R.id.llSounds, viewInflate);
                                    if (linearLayout5 != null) {
                                        i2 = R.id.switchBatteryText;
                                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.a(R.id.switchBatteryText, viewInflate);
                                        if (switchCompat != null) {
                                            i2 = R.id.switchScreen;
                                            SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.a(R.id.switchScreen, viewInflate);
                                            if (switchCompat2 != null) {
                                                i2 = R.id.switchSounds;
                                                SwitchCompat switchCompat3 = (SwitchCompat) ViewBindings.a(R.id.switchSounds, viewInflate);
                                                if (switchCompat3 != null) {
                                                    i2 = R.id.tvCloseType;
                                                    TextView textView = (TextView) ViewBindings.a(R.id.tvCloseType, viewInflate);
                                                    if (textView != null) {
                                                        i2 = R.id.tvDuration;
                                                        TextView textView2 = (TextView) ViewBindings.a(R.id.tvDuration, viewInflate);
                                                        if (textView2 != null) {
                                                            i2 = R.id.tvTitle;
                                                            if (((TextView) ViewBindings.a(R.id.tvTitle, viewInflate)) != null) {
                                                                LinearLayout linearLayout6 = (LinearLayout) viewInflate;
                                                                this.h0 = new ActChargingSettingBinding(linearLayout6, viewA, imageView, relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, switchCompat, switchCompat2, switchCompat3, textView, textView2);
                                                                Intrinsics.e(linearLayout6, "getRoot(...)");
                                                                return linearLayout6;
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
        ActChargingSettingBinding actChargingSettingBinding = this.h0;
        if (actChargingSettingBinding != null) {
            return actChargingSettingBinding.f13112a;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ActChargingSettingBinding actChargingSettingBinding = this.h0;
        if (actChargingSettingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i2 = 0;
        ViewExt.c(actChargingSettingBinding.f13116h, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingSettingAct f13049Y;

            {
                this.f13049Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = R.id.item2;
                AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
                final int i4 = 0;
                final int i5 = 1;
                Unit unit = Unit.f43263a;
                final ChargingSettingAct chargingSettingAct = this.f13049Y;
                switch (i2) {
                    case 0:
                        View it = (View) obj;
                        int i6 = ChargingSettingAct.m0;
                        Intrinsics.f(it, "it");
                        boolean z2 = !Z.z(appPreferencesUtil, "charging_play_sound", true);
                        appPreferencesUtil.b("charging_play_sound", z2);
                        ActChargingSettingBinding actChargingSettingBinding2 = chargingSettingAct.h0;
                        if (actChargingSettingBinding2 != null) {
                            actChargingSettingBinding2.k.setChecked(z2);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 1:
                        View it2 = (View) obj;
                        int i7 = ChargingSettingAct.m0;
                        Intrinsics.f(it2, "it");
                        boolean z3 = !Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false);
                        appPreferencesUtil.b("charging_show_on_lock_screen", z3);
                        ActChargingSettingBinding actChargingSettingBinding3 = chargingSettingAct.h0;
                        if (actChargingSettingBinding3 != null) {
                            actChargingSettingBinding3.j.setChecked(z3);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 2:
                        View it3 = (View) obj;
                        int i8 = ChargingSettingAct.m0;
                        Intrinsics.f(it3, "it");
                        boolean z4 = !Z.z(appPreferencesUtil, "charging_show_battery_text", true);
                        appPreferencesUtil.b("charging_show_battery_text", z4);
                        ActChargingSettingBinding actChargingSettingBinding4 = chargingSettingAct.h0;
                        if (actChargingSettingBinding4 != null) {
                            actChargingSettingBinding4.f13117i.setChecked(z4);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 3:
                        View it4 = (View) obj;
                        int i9 = ChargingSettingAct.m0;
                        Intrinsics.f(it4, "it");
                        if (chargingSettingAct.i0 == null) {
                            View viewInflate = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_duration, (ViewGroup) null, false);
                            TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                            if (textView != null) {
                                TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                                if (textView2 != null) {
                                    i3 = R.id.item3;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.item3, viewInflate);
                                    if (textView3 != null) {
                                        i3 = R.id.item4;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.item4, viewInflate);
                                        if (textView4 != null) {
                                            i3 = R.id.item5;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.item5, viewInflate);
                                            if (textView5 != null) {
                                                i3 = R.id.item6;
                                                TextView textView6 = (TextView) ViewBindings.a(R.id.item6, viewInflate);
                                                if (textView6 != null) {
                                                    i3 = R.id.item7;
                                                    TextView textView7 = (TextView) ViewBindings.a(R.id.item7, viewInflate);
                                                    if (textView7 != null) {
                                                        chargingSettingAct.i0 = new LayChargingDurationBinding((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i3 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow = chargingSettingAct2.l0;
                                        if (customPopWindow != null) {
                                            customPopWindow.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding5 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding5 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding5.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding6 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding6.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding7 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding7.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct3.j0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding8 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding8.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding14 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding14.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingDurationBinding layChargingDurationBinding = chargingSettingAct.i0;
                        if (layChargingDurationBinding != null) {
                            layChargingDurationBinding.f13229b.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding2 = chargingSettingAct.i0;
                        if (layChargingDurationBinding2 != null) {
                            layChargingDurationBinding2.f13230c.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding3 = chargingSettingAct.i0;
                        if (layChargingDurationBinding3 != null) {
                            layChargingDurationBinding3.d.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding4 = chargingSettingAct.i0;
                        if (layChargingDurationBinding4 != null) {
                            layChargingDurationBinding4.f13231e.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding5 = chargingSettingAct.i0;
                        if (layChargingDurationBinding5 != null) {
                            layChargingDurationBinding5.f.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding6 = chargingSettingAct.i0;
                        if (layChargingDurationBinding6 != null) {
                            layChargingDurationBinding6.g.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding7 = chargingSettingAct.i0;
                        if (layChargingDurationBinding7 != null) {
                            layChargingDurationBinding7.f13232h.setOnClickListener(onClickListener);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingDurationBinding layChargingDurationBinding8 = chargingSettingAct.i0;
                        Intrinsics.c(layChargingDurationBinding8);
                        CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                        customPopWindow.h0 = layChargingDurationBinding8.f13228a;
                        customPopWindow.g0 = -1;
                        customPopWindow.p0 = true;
                        customPopWindow.q0 = 0.7f;
                        CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                        chargingSettingAct.j0 = customPopWindowA;
                        ActChargingSettingBinding actChargingSettingBinding5 = chargingSettingAct.h0;
                        if (actChargingSettingBinding5 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView8 = actChargingSettingBinding5.f13118l;
                        PopupWindow popupWindow = customPopWindowA.i0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(textView8, 0, 0);
                        }
                        return unit;
                    case 4:
                        View it5 = (View) obj;
                        int i10 = ChargingSettingAct.m0;
                        Intrinsics.f(it5, "it");
                        if (chargingSettingAct.k0 == null) {
                            View viewInflate2 = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_close_type, (ViewGroup) null, false);
                            TextView textView9 = (TextView) ViewBindings.a(R.id.item1, viewInflate2);
                            if (textView9 != null) {
                                TextView textView10 = (TextView) ViewBindings.a(R.id.item2, viewInflate2);
                                if (textView10 != null) {
                                    chargingSettingAct.k0 = new LayChargingCloseTypeBinding((LinearLayout) viewInflate2, textView9, textView10);
                                }
                            } else {
                                i3 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding6 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding6.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding7 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding7.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding8 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding8.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding15 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding15.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding != null) {
                            layChargingCloseTypeBinding.f13226b.setOnClickListener(onClickListener2);
                        }
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding2 = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding2 != null) {
                            layChargingCloseTypeBinding2.f13227c.setOnClickListener(onClickListener2);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder2 = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding3 = chargingSettingAct.k0;
                        Intrinsics.c(layChargingCloseTypeBinding3);
                        CustomPopWindow customPopWindow2 = popupWindowBuilder2.f13327a;
                        customPopWindow2.h0 = layChargingCloseTypeBinding3.f13225a;
                        customPopWindow2.g0 = -1;
                        customPopWindow2.p0 = true;
                        customPopWindow2.q0 = 0.7f;
                        CustomPopWindow customPopWindowA2 = popupWindowBuilder2.a();
                        chargingSettingAct.l0 = customPopWindowA2;
                        ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct.h0;
                        if (actChargingSettingBinding6 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView11 = actChargingSettingBinding6.f13118l;
                        PopupWindow popupWindow2 = customPopWindowA2.i0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(textView11, 0, 0);
                        }
                        return unit;
                    default:
                        View it6 = (View) obj;
                        int i11 = ChargingSettingAct.m0;
                        Intrinsics.f(it6, "it");
                        chargingSettingAct.onBackPressed();
                        return unit;
                }
            }
        });
        ActChargingSettingBinding actChargingSettingBinding2 = this.h0;
        if (actChargingSettingBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i3 = 1;
        ViewExt.c(actChargingSettingBinding2.g, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingSettingAct f13049Y;

            {
                this.f13049Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = R.id.item2;
                AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
                final int i5 = 0;
                final int i6 = 1;
                Unit unit = Unit.f43263a;
                final ChargingSettingAct chargingSettingAct = this.f13049Y;
                switch (i3) {
                    case 0:
                        View it = (View) obj;
                        int i7 = ChargingSettingAct.m0;
                        Intrinsics.f(it, "it");
                        boolean z2 = !Z.z(appPreferencesUtil, "charging_play_sound", true);
                        appPreferencesUtil.b("charging_play_sound", z2);
                        ActChargingSettingBinding actChargingSettingBinding3 = chargingSettingAct.h0;
                        if (actChargingSettingBinding3 != null) {
                            actChargingSettingBinding3.k.setChecked(z2);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 1:
                        View it2 = (View) obj;
                        int i8 = ChargingSettingAct.m0;
                        Intrinsics.f(it2, "it");
                        boolean z3 = !Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false);
                        appPreferencesUtil.b("charging_show_on_lock_screen", z3);
                        ActChargingSettingBinding actChargingSettingBinding4 = chargingSettingAct.h0;
                        if (actChargingSettingBinding4 != null) {
                            actChargingSettingBinding4.j.setChecked(z3);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 2:
                        View it3 = (View) obj;
                        int i9 = ChargingSettingAct.m0;
                        Intrinsics.f(it3, "it");
                        boolean z4 = !Z.z(appPreferencesUtil, "charging_show_battery_text", true);
                        appPreferencesUtil.b("charging_show_battery_text", z4);
                        ActChargingSettingBinding actChargingSettingBinding5 = chargingSettingAct.h0;
                        if (actChargingSettingBinding5 != null) {
                            actChargingSettingBinding5.f13117i.setChecked(z4);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 3:
                        View it4 = (View) obj;
                        int i10 = ChargingSettingAct.m0;
                        Intrinsics.f(it4, "it");
                        if (chargingSettingAct.i0 == null) {
                            View viewInflate = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_duration, (ViewGroup) null, false);
                            TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                            if (textView != null) {
                                TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                                if (textView2 != null) {
                                    i4 = R.id.item3;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.item3, viewInflate);
                                    if (textView3 != null) {
                                        i4 = R.id.item4;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.item4, viewInflate);
                                        if (textView4 != null) {
                                            i4 = R.id.item5;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.item5, viewInflate);
                                            if (textView5 != null) {
                                                i4 = R.id.item6;
                                                TextView textView6 = (TextView) ViewBindings.a(R.id.item6, viewInflate);
                                                if (textView6 != null) {
                                                    i4 = R.id.item7;
                                                    TextView textView7 = (TextView) ViewBindings.a(R.id.item7, viewInflate);
                                                    if (textView7 != null) {
                                                        chargingSettingAct.i0 = new LayChargingDurationBinding((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding6 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding6.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding7 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding7.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding8 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding8.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding15 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding15.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingDurationBinding layChargingDurationBinding = chargingSettingAct.i0;
                        if (layChargingDurationBinding != null) {
                            layChargingDurationBinding.f13229b.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding2 = chargingSettingAct.i0;
                        if (layChargingDurationBinding2 != null) {
                            layChargingDurationBinding2.f13230c.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding3 = chargingSettingAct.i0;
                        if (layChargingDurationBinding3 != null) {
                            layChargingDurationBinding3.d.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding4 = chargingSettingAct.i0;
                        if (layChargingDurationBinding4 != null) {
                            layChargingDurationBinding4.f13231e.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding5 = chargingSettingAct.i0;
                        if (layChargingDurationBinding5 != null) {
                            layChargingDurationBinding5.f.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding6 = chargingSettingAct.i0;
                        if (layChargingDurationBinding6 != null) {
                            layChargingDurationBinding6.g.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding7 = chargingSettingAct.i0;
                        if (layChargingDurationBinding7 != null) {
                            layChargingDurationBinding7.f13232h.setOnClickListener(onClickListener);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingDurationBinding layChargingDurationBinding8 = chargingSettingAct.i0;
                        Intrinsics.c(layChargingDurationBinding8);
                        CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                        customPopWindow.h0 = layChargingDurationBinding8.f13228a;
                        customPopWindow.g0 = -1;
                        customPopWindow.p0 = true;
                        customPopWindow.q0 = 0.7f;
                        CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                        chargingSettingAct.j0 = customPopWindowA;
                        ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct.h0;
                        if (actChargingSettingBinding6 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView8 = actChargingSettingBinding6.f13118l;
                        PopupWindow popupWindow = customPopWindowA.i0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(textView8, 0, 0);
                        }
                        return unit;
                    case 4:
                        View it5 = (View) obj;
                        int i11 = ChargingSettingAct.m0;
                        Intrinsics.f(it5, "it");
                        if (chargingSettingAct.k0 == null) {
                            View viewInflate2 = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_close_type, (ViewGroup) null, false);
                            TextView textView9 = (TextView) ViewBindings.a(R.id.item1, viewInflate2);
                            if (textView9 != null) {
                                TextView textView10 = (TextView) ViewBindings.a(R.id.item2, viewInflate2);
                                if (textView10 != null) {
                                    chargingSettingAct.k0 = new LayChargingCloseTypeBinding((LinearLayout) viewInflate2, textView9, textView10);
                                }
                            } else {
                                i4 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding7 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding7.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding8 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding8.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding9 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding9.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding16 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding16.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding != null) {
                            layChargingCloseTypeBinding.f13226b.setOnClickListener(onClickListener2);
                        }
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding2 = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding2 != null) {
                            layChargingCloseTypeBinding2.f13227c.setOnClickListener(onClickListener2);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder2 = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding3 = chargingSettingAct.k0;
                        Intrinsics.c(layChargingCloseTypeBinding3);
                        CustomPopWindow customPopWindow2 = popupWindowBuilder2.f13327a;
                        customPopWindow2.h0 = layChargingCloseTypeBinding3.f13225a;
                        customPopWindow2.g0 = -1;
                        customPopWindow2.p0 = true;
                        customPopWindow2.q0 = 0.7f;
                        CustomPopWindow customPopWindowA2 = popupWindowBuilder2.a();
                        chargingSettingAct.l0 = customPopWindowA2;
                        ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct.h0;
                        if (actChargingSettingBinding7 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView11 = actChargingSettingBinding7.f13118l;
                        PopupWindow popupWindow2 = customPopWindowA2.i0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(textView11, 0, 0);
                        }
                        return unit;
                    default:
                        View it6 = (View) obj;
                        int i12 = ChargingSettingAct.m0;
                        Intrinsics.f(it6, "it");
                        chargingSettingAct.onBackPressed();
                        return unit;
                }
            }
        });
        ActChargingSettingBinding actChargingSettingBinding3 = this.h0;
        if (actChargingSettingBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i4 = 2;
        ViewExt.c(actChargingSettingBinding3.d, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingSettingAct f13049Y;

            {
                this.f13049Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = R.id.item2;
                AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
                final int i6 = 0;
                final int i7 = 1;
                Unit unit = Unit.f43263a;
                final ChargingSettingAct chargingSettingAct = this.f13049Y;
                switch (i4) {
                    case 0:
                        View it = (View) obj;
                        int i8 = ChargingSettingAct.m0;
                        Intrinsics.f(it, "it");
                        boolean z2 = !Z.z(appPreferencesUtil, "charging_play_sound", true);
                        appPreferencesUtil.b("charging_play_sound", z2);
                        ActChargingSettingBinding actChargingSettingBinding4 = chargingSettingAct.h0;
                        if (actChargingSettingBinding4 != null) {
                            actChargingSettingBinding4.k.setChecked(z2);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 1:
                        View it2 = (View) obj;
                        int i9 = ChargingSettingAct.m0;
                        Intrinsics.f(it2, "it");
                        boolean z3 = !Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false);
                        appPreferencesUtil.b("charging_show_on_lock_screen", z3);
                        ActChargingSettingBinding actChargingSettingBinding5 = chargingSettingAct.h0;
                        if (actChargingSettingBinding5 != null) {
                            actChargingSettingBinding5.j.setChecked(z3);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 2:
                        View it3 = (View) obj;
                        int i10 = ChargingSettingAct.m0;
                        Intrinsics.f(it3, "it");
                        boolean z4 = !Z.z(appPreferencesUtil, "charging_show_battery_text", true);
                        appPreferencesUtil.b("charging_show_battery_text", z4);
                        ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct.h0;
                        if (actChargingSettingBinding6 != null) {
                            actChargingSettingBinding6.f13117i.setChecked(z4);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 3:
                        View it4 = (View) obj;
                        int i11 = ChargingSettingAct.m0;
                        Intrinsics.f(it4, "it");
                        if (chargingSettingAct.i0 == null) {
                            View viewInflate = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_duration, (ViewGroup) null, false);
                            TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                            if (textView != null) {
                                TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                                if (textView2 != null) {
                                    i5 = R.id.item3;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.item3, viewInflate);
                                    if (textView3 != null) {
                                        i5 = R.id.item4;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.item4, viewInflate);
                                        if (textView4 != null) {
                                            i5 = R.id.item5;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.item5, viewInflate);
                                            if (textView5 != null) {
                                                i5 = R.id.item6;
                                                TextView textView6 = (TextView) ViewBindings.a(R.id.item6, viewInflate);
                                                if (textView6 != null) {
                                                    i5 = R.id.item7;
                                                    TextView textView7 = (TextView) ViewBindings.a(R.id.item7, viewInflate);
                                                    if (textView7 != null) {
                                                        chargingSettingAct.i0 = new LayChargingDurationBinding((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i5 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding7 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding7.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding8 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding8.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding9 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding9.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding16 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding16.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingDurationBinding layChargingDurationBinding = chargingSettingAct.i0;
                        if (layChargingDurationBinding != null) {
                            layChargingDurationBinding.f13229b.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding2 = chargingSettingAct.i0;
                        if (layChargingDurationBinding2 != null) {
                            layChargingDurationBinding2.f13230c.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding3 = chargingSettingAct.i0;
                        if (layChargingDurationBinding3 != null) {
                            layChargingDurationBinding3.d.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding4 = chargingSettingAct.i0;
                        if (layChargingDurationBinding4 != null) {
                            layChargingDurationBinding4.f13231e.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding5 = chargingSettingAct.i0;
                        if (layChargingDurationBinding5 != null) {
                            layChargingDurationBinding5.f.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding6 = chargingSettingAct.i0;
                        if (layChargingDurationBinding6 != null) {
                            layChargingDurationBinding6.g.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding7 = chargingSettingAct.i0;
                        if (layChargingDurationBinding7 != null) {
                            layChargingDurationBinding7.f13232h.setOnClickListener(onClickListener);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingDurationBinding layChargingDurationBinding8 = chargingSettingAct.i0;
                        Intrinsics.c(layChargingDurationBinding8);
                        CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                        customPopWindow.h0 = layChargingDurationBinding8.f13228a;
                        customPopWindow.g0 = -1;
                        customPopWindow.p0 = true;
                        customPopWindow.q0 = 0.7f;
                        CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                        chargingSettingAct.j0 = customPopWindowA;
                        ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct.h0;
                        if (actChargingSettingBinding7 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView8 = actChargingSettingBinding7.f13118l;
                        PopupWindow popupWindow = customPopWindowA.i0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(textView8, 0, 0);
                        }
                        return unit;
                    case 4:
                        View it5 = (View) obj;
                        int i12 = ChargingSettingAct.m0;
                        Intrinsics.f(it5, "it");
                        if (chargingSettingAct.k0 == null) {
                            View viewInflate2 = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_close_type, (ViewGroup) null, false);
                            TextView textView9 = (TextView) ViewBindings.a(R.id.item1, viewInflate2);
                            if (textView9 != null) {
                                TextView textView10 = (TextView) ViewBindings.a(R.id.item2, viewInflate2);
                                if (textView10 != null) {
                                    chargingSettingAct.k0 = new LayChargingCloseTypeBinding((LinearLayout) viewInflate2, textView9, textView10);
                                }
                            } else {
                                i5 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i5)));
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding8 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding8.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding10 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding10.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding17 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding17.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding != null) {
                            layChargingCloseTypeBinding.f13226b.setOnClickListener(onClickListener2);
                        }
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding2 = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding2 != null) {
                            layChargingCloseTypeBinding2.f13227c.setOnClickListener(onClickListener2);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder2 = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding3 = chargingSettingAct.k0;
                        Intrinsics.c(layChargingCloseTypeBinding3);
                        CustomPopWindow customPopWindow2 = popupWindowBuilder2.f13327a;
                        customPopWindow2.h0 = layChargingCloseTypeBinding3.f13225a;
                        customPopWindow2.g0 = -1;
                        customPopWindow2.p0 = true;
                        customPopWindow2.q0 = 0.7f;
                        CustomPopWindow customPopWindowA2 = popupWindowBuilder2.a();
                        chargingSettingAct.l0 = customPopWindowA2;
                        ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct.h0;
                        if (actChargingSettingBinding8 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView11 = actChargingSettingBinding8.f13118l;
                        PopupWindow popupWindow2 = customPopWindowA2.i0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(textView11, 0, 0);
                        }
                        return unit;
                    default:
                        View it6 = (View) obj;
                        int i13 = ChargingSettingAct.m0;
                        Intrinsics.f(it6, "it");
                        chargingSettingAct.onBackPressed();
                        return unit;
                }
            }
        });
        ActChargingSettingBinding actChargingSettingBinding4 = this.h0;
        if (actChargingSettingBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i5 = 3;
        ViewExt.c(actChargingSettingBinding4.f, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingSettingAct f13049Y;

            {
                this.f13049Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = R.id.item2;
                AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
                final int i7 = 0;
                final int i8 = 1;
                Unit unit = Unit.f43263a;
                final ChargingSettingAct chargingSettingAct = this.f13049Y;
                switch (i5) {
                    case 0:
                        View it = (View) obj;
                        int i9 = ChargingSettingAct.m0;
                        Intrinsics.f(it, "it");
                        boolean z2 = !Z.z(appPreferencesUtil, "charging_play_sound", true);
                        appPreferencesUtil.b("charging_play_sound", z2);
                        ActChargingSettingBinding actChargingSettingBinding5 = chargingSettingAct.h0;
                        if (actChargingSettingBinding5 != null) {
                            actChargingSettingBinding5.k.setChecked(z2);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 1:
                        View it2 = (View) obj;
                        int i10 = ChargingSettingAct.m0;
                        Intrinsics.f(it2, "it");
                        boolean z3 = !Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false);
                        appPreferencesUtil.b("charging_show_on_lock_screen", z3);
                        ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct.h0;
                        if (actChargingSettingBinding6 != null) {
                            actChargingSettingBinding6.j.setChecked(z3);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 2:
                        View it3 = (View) obj;
                        int i11 = ChargingSettingAct.m0;
                        Intrinsics.f(it3, "it");
                        boolean z4 = !Z.z(appPreferencesUtil, "charging_show_battery_text", true);
                        appPreferencesUtil.b("charging_show_battery_text", z4);
                        ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct.h0;
                        if (actChargingSettingBinding7 != null) {
                            actChargingSettingBinding7.f13117i.setChecked(z4);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 3:
                        View it4 = (View) obj;
                        int i12 = ChargingSettingAct.m0;
                        Intrinsics.f(it4, "it");
                        if (chargingSettingAct.i0 == null) {
                            View viewInflate = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_duration, (ViewGroup) null, false);
                            TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                            if (textView != null) {
                                TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                                if (textView2 != null) {
                                    i6 = R.id.item3;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.item3, viewInflate);
                                    if (textView3 != null) {
                                        i6 = R.id.item4;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.item4, viewInflate);
                                        if (textView4 != null) {
                                            i6 = R.id.item5;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.item5, viewInflate);
                                            if (textView5 != null) {
                                                i6 = R.id.item6;
                                                TextView textView6 = (TextView) ViewBindings.a(R.id.item6, viewInflate);
                                                if (textView6 != null) {
                                                    i6 = R.id.item7;
                                                    TextView textView7 = (TextView) ViewBindings.a(R.id.item7, viewInflate);
                                                    if (textView7 != null) {
                                                        chargingSettingAct.i0 = new LayChargingDurationBinding((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i6 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding8 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding8.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding10 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding10.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding17 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding17.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingDurationBinding layChargingDurationBinding = chargingSettingAct.i0;
                        if (layChargingDurationBinding != null) {
                            layChargingDurationBinding.f13229b.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding2 = chargingSettingAct.i0;
                        if (layChargingDurationBinding2 != null) {
                            layChargingDurationBinding2.f13230c.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding3 = chargingSettingAct.i0;
                        if (layChargingDurationBinding3 != null) {
                            layChargingDurationBinding3.d.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding4 = chargingSettingAct.i0;
                        if (layChargingDurationBinding4 != null) {
                            layChargingDurationBinding4.f13231e.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding5 = chargingSettingAct.i0;
                        if (layChargingDurationBinding5 != null) {
                            layChargingDurationBinding5.f.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding6 = chargingSettingAct.i0;
                        if (layChargingDurationBinding6 != null) {
                            layChargingDurationBinding6.g.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding7 = chargingSettingAct.i0;
                        if (layChargingDurationBinding7 != null) {
                            layChargingDurationBinding7.f13232h.setOnClickListener(onClickListener);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingDurationBinding layChargingDurationBinding8 = chargingSettingAct.i0;
                        Intrinsics.c(layChargingDurationBinding8);
                        CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                        customPopWindow.h0 = layChargingDurationBinding8.f13228a;
                        customPopWindow.g0 = -1;
                        customPopWindow.p0 = true;
                        customPopWindow.q0 = 0.7f;
                        CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                        chargingSettingAct.j0 = customPopWindowA;
                        ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct.h0;
                        if (actChargingSettingBinding8 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView8 = actChargingSettingBinding8.f13118l;
                        PopupWindow popupWindow = customPopWindowA.i0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(textView8, 0, 0);
                        }
                        return unit;
                    case 4:
                        View it5 = (View) obj;
                        int i13 = ChargingSettingAct.m0;
                        Intrinsics.f(it5, "it");
                        if (chargingSettingAct.k0 == null) {
                            View viewInflate2 = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_close_type, (ViewGroup) null, false);
                            TextView textView9 = (TextView) ViewBindings.a(R.id.item1, viewInflate2);
                            if (textView9 != null) {
                                TextView textView10 = (TextView) ViewBindings.a(R.id.item2, viewInflate2);
                                if (textView10 != null) {
                                    chargingSettingAct.k0 = new LayChargingCloseTypeBinding((LinearLayout) viewInflate2, textView9, textView10);
                                }
                            } else {
                                i6 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i6)));
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding11 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding11.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding17 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding17.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding18 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding18 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding18.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding != null) {
                            layChargingCloseTypeBinding.f13226b.setOnClickListener(onClickListener2);
                        }
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding2 = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding2 != null) {
                            layChargingCloseTypeBinding2.f13227c.setOnClickListener(onClickListener2);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder2 = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding3 = chargingSettingAct.k0;
                        Intrinsics.c(layChargingCloseTypeBinding3);
                        CustomPopWindow customPopWindow2 = popupWindowBuilder2.f13327a;
                        customPopWindow2.h0 = layChargingCloseTypeBinding3.f13225a;
                        customPopWindow2.g0 = -1;
                        customPopWindow2.p0 = true;
                        customPopWindow2.q0 = 0.7f;
                        CustomPopWindow customPopWindowA2 = popupWindowBuilder2.a();
                        chargingSettingAct.l0 = customPopWindowA2;
                        ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct.h0;
                        if (actChargingSettingBinding9 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView11 = actChargingSettingBinding9.f13118l;
                        PopupWindow popupWindow2 = customPopWindowA2.i0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(textView11, 0, 0);
                        }
                        return unit;
                    default:
                        View it6 = (View) obj;
                        int i14 = ChargingSettingAct.m0;
                        Intrinsics.f(it6, "it");
                        chargingSettingAct.onBackPressed();
                        return unit;
                }
            }
        });
        ActChargingSettingBinding actChargingSettingBinding5 = this.h0;
        if (actChargingSettingBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i6 = 4;
        ViewExt.c(actChargingSettingBinding5.f13115e, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingSettingAct f13049Y;

            {
                this.f13049Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = R.id.item2;
                AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
                final int i8 = 0;
                final int i9 = 1;
                Unit unit = Unit.f43263a;
                final ChargingSettingAct chargingSettingAct = this.f13049Y;
                switch (i6) {
                    case 0:
                        View it = (View) obj;
                        int i10 = ChargingSettingAct.m0;
                        Intrinsics.f(it, "it");
                        boolean z2 = !Z.z(appPreferencesUtil, "charging_play_sound", true);
                        appPreferencesUtil.b("charging_play_sound", z2);
                        ActChargingSettingBinding actChargingSettingBinding6 = chargingSettingAct.h0;
                        if (actChargingSettingBinding6 != null) {
                            actChargingSettingBinding6.k.setChecked(z2);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 1:
                        View it2 = (View) obj;
                        int i11 = ChargingSettingAct.m0;
                        Intrinsics.f(it2, "it");
                        boolean z3 = !Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false);
                        appPreferencesUtil.b("charging_show_on_lock_screen", z3);
                        ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct.h0;
                        if (actChargingSettingBinding7 != null) {
                            actChargingSettingBinding7.j.setChecked(z3);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 2:
                        View it3 = (View) obj;
                        int i12 = ChargingSettingAct.m0;
                        Intrinsics.f(it3, "it");
                        boolean z4 = !Z.z(appPreferencesUtil, "charging_show_battery_text", true);
                        appPreferencesUtil.b("charging_show_battery_text", z4);
                        ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct.h0;
                        if (actChargingSettingBinding8 != null) {
                            actChargingSettingBinding8.f13117i.setChecked(z4);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 3:
                        View it4 = (View) obj;
                        int i13 = ChargingSettingAct.m0;
                        Intrinsics.f(it4, "it");
                        if (chargingSettingAct.i0 == null) {
                            View viewInflate = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_duration, (ViewGroup) null, false);
                            TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                            if (textView != null) {
                                TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                                if (textView2 != null) {
                                    i7 = R.id.item3;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.item3, viewInflate);
                                    if (textView3 != null) {
                                        i7 = R.id.item4;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.item4, viewInflate);
                                        if (textView4 != null) {
                                            i7 = R.id.item5;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.item5, viewInflate);
                                            if (textView5 != null) {
                                                i7 = R.id.item6;
                                                TextView textView6 = (TextView) ViewBindings.a(R.id.item6, viewInflate);
                                                if (textView6 != null) {
                                                    i7 = R.id.item7;
                                                    TextView textView7 = (TextView) ViewBindings.a(R.id.item7, viewInflate);
                                                    if (textView7 != null) {
                                                        chargingSettingAct.i0 = new LayChargingDurationBinding((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i7 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i9) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding9 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding9.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding11 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding11.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding17 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding17.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding18 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding18 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding18.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingDurationBinding layChargingDurationBinding = chargingSettingAct.i0;
                        if (layChargingDurationBinding != null) {
                            layChargingDurationBinding.f13229b.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding2 = chargingSettingAct.i0;
                        if (layChargingDurationBinding2 != null) {
                            layChargingDurationBinding2.f13230c.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding3 = chargingSettingAct.i0;
                        if (layChargingDurationBinding3 != null) {
                            layChargingDurationBinding3.d.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding4 = chargingSettingAct.i0;
                        if (layChargingDurationBinding4 != null) {
                            layChargingDurationBinding4.f13231e.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding5 = chargingSettingAct.i0;
                        if (layChargingDurationBinding5 != null) {
                            layChargingDurationBinding5.f.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding6 = chargingSettingAct.i0;
                        if (layChargingDurationBinding6 != null) {
                            layChargingDurationBinding6.g.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding7 = chargingSettingAct.i0;
                        if (layChargingDurationBinding7 != null) {
                            layChargingDurationBinding7.f13232h.setOnClickListener(onClickListener);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingDurationBinding layChargingDurationBinding8 = chargingSettingAct.i0;
                        Intrinsics.c(layChargingDurationBinding8);
                        CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                        customPopWindow.h0 = layChargingDurationBinding8.f13228a;
                        customPopWindow.g0 = -1;
                        customPopWindow.p0 = true;
                        customPopWindow.q0 = 0.7f;
                        CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                        chargingSettingAct.j0 = customPopWindowA;
                        ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct.h0;
                        if (actChargingSettingBinding9 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView8 = actChargingSettingBinding9.f13118l;
                        PopupWindow popupWindow = customPopWindowA.i0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(textView8, 0, 0);
                        }
                        return unit;
                    case 4:
                        View it5 = (View) obj;
                        int i14 = ChargingSettingAct.m0;
                        Intrinsics.f(it5, "it");
                        if (chargingSettingAct.k0 == null) {
                            View viewInflate2 = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_close_type, (ViewGroup) null, false);
                            TextView textView9 = (TextView) ViewBindings.a(R.id.item1, viewInflate2);
                            if (textView9 != null) {
                                TextView textView10 = (TextView) ViewBindings.a(R.id.item2, viewInflate2);
                                if (textView10 != null) {
                                    chargingSettingAct.k0 = new LayChargingCloseTypeBinding((LinearLayout) viewInflate2, textView9, textView10);
                                }
                            } else {
                                i7 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i7)));
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding12 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding12.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding17 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding17.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding18 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding18 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding18.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding19 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding19 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding19.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding != null) {
                            layChargingCloseTypeBinding.f13226b.setOnClickListener(onClickListener2);
                        }
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding2 = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding2 != null) {
                            layChargingCloseTypeBinding2.f13227c.setOnClickListener(onClickListener2);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder2 = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding3 = chargingSettingAct.k0;
                        Intrinsics.c(layChargingCloseTypeBinding3);
                        CustomPopWindow customPopWindow2 = popupWindowBuilder2.f13327a;
                        customPopWindow2.h0 = layChargingCloseTypeBinding3.f13225a;
                        customPopWindow2.g0 = -1;
                        customPopWindow2.p0 = true;
                        customPopWindow2.q0 = 0.7f;
                        CustomPopWindow customPopWindowA2 = popupWindowBuilder2.a();
                        chargingSettingAct.l0 = customPopWindowA2;
                        ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct.h0;
                        if (actChargingSettingBinding10 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView11 = actChargingSettingBinding10.f13118l;
                        PopupWindow popupWindow2 = customPopWindowA2.i0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(textView11, 0, 0);
                        }
                        return unit;
                    default:
                        View it6 = (View) obj;
                        int i15 = ChargingSettingAct.m0;
                        Intrinsics.f(it6, "it");
                        chargingSettingAct.onBackPressed();
                        return unit;
                }
            }
        });
        ActChargingSettingBinding actChargingSettingBinding6 = this.h0;
        if (actChargingSettingBinding6 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i7 = 5;
        ViewExt.c(actChargingSettingBinding6.f13113b, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingSettingAct f13049Y;

            {
                this.f13049Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = R.id.item2;
                AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
                final int i9 = 0;
                final int i10 = 1;
                Unit unit = Unit.f43263a;
                final ChargingSettingAct chargingSettingAct = this.f13049Y;
                switch (i7) {
                    case 0:
                        View it = (View) obj;
                        int i11 = ChargingSettingAct.m0;
                        Intrinsics.f(it, "it");
                        boolean z2 = !Z.z(appPreferencesUtil, "charging_play_sound", true);
                        appPreferencesUtil.b("charging_play_sound", z2);
                        ActChargingSettingBinding actChargingSettingBinding7 = chargingSettingAct.h0;
                        if (actChargingSettingBinding7 != null) {
                            actChargingSettingBinding7.k.setChecked(z2);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 1:
                        View it2 = (View) obj;
                        int i12 = ChargingSettingAct.m0;
                        Intrinsics.f(it2, "it");
                        boolean z3 = !Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false);
                        appPreferencesUtil.b("charging_show_on_lock_screen", z3);
                        ActChargingSettingBinding actChargingSettingBinding8 = chargingSettingAct.h0;
                        if (actChargingSettingBinding8 != null) {
                            actChargingSettingBinding8.j.setChecked(z3);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 2:
                        View it3 = (View) obj;
                        int i13 = ChargingSettingAct.m0;
                        Intrinsics.f(it3, "it");
                        boolean z4 = !Z.z(appPreferencesUtil, "charging_show_battery_text", true);
                        appPreferencesUtil.b("charging_show_battery_text", z4);
                        ActChargingSettingBinding actChargingSettingBinding9 = chargingSettingAct.h0;
                        if (actChargingSettingBinding9 != null) {
                            actChargingSettingBinding9.f13117i.setChecked(z4);
                            return unit;
                        }
                        Intrinsics.m("binding");
                        throw null;
                    case 3:
                        View it4 = (View) obj;
                        int i14 = ChargingSettingAct.m0;
                        Intrinsics.f(it4, "it");
                        if (chargingSettingAct.i0 == null) {
                            View viewInflate = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_duration, (ViewGroup) null, false);
                            TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                            if (textView != null) {
                                TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                                if (textView2 != null) {
                                    i8 = R.id.item3;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.item3, viewInflate);
                                    if (textView3 != null) {
                                        i8 = R.id.item4;
                                        TextView textView4 = (TextView) ViewBindings.a(R.id.item4, viewInflate);
                                        if (textView4 != null) {
                                            i8 = R.id.item5;
                                            TextView textView5 = (TextView) ViewBindings.a(R.id.item5, viewInflate);
                                            if (textView5 != null) {
                                                i8 = R.id.item6;
                                                TextView textView6 = (TextView) ViewBindings.a(R.id.item6, viewInflate);
                                                if (textView6 != null) {
                                                    i8 = R.id.item7;
                                                    TextView textView7 = (TextView) ViewBindings.a(R.id.item7, viewInflate);
                                                    if (textView7 != null) {
                                                        chargingSettingAct.i0 = new LayChargingDurationBinding((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i8 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i8)));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding10 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding10.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding12 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding12.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding13 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding13.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding17 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding17.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding18 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding18 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding18.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding19 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding19 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding19.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingDurationBinding layChargingDurationBinding = chargingSettingAct.i0;
                        if (layChargingDurationBinding != null) {
                            layChargingDurationBinding.f13229b.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding2 = chargingSettingAct.i0;
                        if (layChargingDurationBinding2 != null) {
                            layChargingDurationBinding2.f13230c.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding3 = chargingSettingAct.i0;
                        if (layChargingDurationBinding3 != null) {
                            layChargingDurationBinding3.d.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding4 = chargingSettingAct.i0;
                        if (layChargingDurationBinding4 != null) {
                            layChargingDurationBinding4.f13231e.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding5 = chargingSettingAct.i0;
                        if (layChargingDurationBinding5 != null) {
                            layChargingDurationBinding5.f.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding6 = chargingSettingAct.i0;
                        if (layChargingDurationBinding6 != null) {
                            layChargingDurationBinding6.g.setOnClickListener(onClickListener);
                        }
                        LayChargingDurationBinding layChargingDurationBinding7 = chargingSettingAct.i0;
                        if (layChargingDurationBinding7 != null) {
                            layChargingDurationBinding7.f13232h.setOnClickListener(onClickListener);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingDurationBinding layChargingDurationBinding8 = chargingSettingAct.i0;
                        Intrinsics.c(layChargingDurationBinding8);
                        CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                        customPopWindow.h0 = layChargingDurationBinding8.f13228a;
                        customPopWindow.g0 = -1;
                        customPopWindow.p0 = true;
                        customPopWindow.q0 = 0.7f;
                        CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                        chargingSettingAct.j0 = customPopWindowA;
                        ActChargingSettingBinding actChargingSettingBinding10 = chargingSettingAct.h0;
                        if (actChargingSettingBinding10 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView8 = actChargingSettingBinding10.f13118l;
                        PopupWindow popupWindow = customPopWindowA.i0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(textView8, 0, 0);
                        }
                        return unit;
                    case 4:
                        View it5 = (View) obj;
                        int i15 = ChargingSettingAct.m0;
                        Intrinsics.f(it5, "it");
                        if (chargingSettingAct.k0 == null) {
                            View viewInflate2 = chargingSettingAct.getLayoutInflater().inflate(R.layout.lay_charging_close_type, (ViewGroup) null, false);
                            TextView textView9 = (TextView) ViewBindings.a(R.id.item1, viewInflate2);
                            if (textView9 != null) {
                                TextView textView10 = (TextView) ViewBindings.a(R.id.item2, viewInflate2);
                                if (textView10 != null) {
                                    chargingSettingAct.k0 = new LayChargingCloseTypeBinding((LinearLayout) viewInflate2, textView9, textView10);
                                }
                            } else {
                                i8 = R.id.item1;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i8)));
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i9) {
                                    case 0:
                                        ChargingSettingAct chargingSettingAct2 = chargingSettingAct;
                                        CustomPopWindow customPopWindow2 = chargingSettingAct2.l0;
                                        if (customPopWindow2 != null) {
                                            customPopWindow2.a();
                                        }
                                        int id = view.getId();
                                        AppPreferencesUtil appPreferencesUtil2 = AppPreferencesUtil.f13313a;
                                        if (id == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding11 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding11.f13118l.setText("One Click");
                                            appPreferencesUtil2.c("charging_close_type", 1);
                                            return;
                                        }
                                        if (id == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding12 = chargingSettingAct2.h0;
                                            if (actChargingSettingBinding12 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding12.f13118l.setText("Double Click");
                                            appPreferencesUtil2.c("charging_close_type", 2);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding13 = chargingSettingAct2.h0;
                                        if (actChargingSettingBinding13 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding13.f13118l.setText("Double Click");
                                        appPreferencesUtil2.c("charging_close_type", 2);
                                        return;
                                    default:
                                        ChargingSettingAct chargingSettingAct3 = chargingSettingAct;
                                        CustomPopWindow customPopWindow3 = chargingSettingAct3.j0;
                                        if (customPopWindow3 != null) {
                                            customPopWindow3.a();
                                        }
                                        int id2 = view.getId();
                                        if (id2 == R.id.item1) {
                                            ActChargingSettingBinding actChargingSettingBinding14 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding14 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding14.m.setText("5 secs");
                                            AppPreferences.c(5);
                                            return;
                                        }
                                        if (id2 == R.id.item2) {
                                            ActChargingSettingBinding actChargingSettingBinding15 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding15 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding15.m.setText("10 secs");
                                            AppPreferences.c(10);
                                            return;
                                        }
                                        if (id2 == R.id.item3) {
                                            ActChargingSettingBinding actChargingSettingBinding16 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding16 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding16.m.setText("15 secs");
                                            AppPreferences.c(15);
                                            return;
                                        }
                                        if (id2 == R.id.item4) {
                                            ActChargingSettingBinding actChargingSettingBinding17 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding17 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding17.m.setText("30 secs");
                                            AppPreferences.c(30);
                                            return;
                                        }
                                        if (id2 == R.id.item5) {
                                            ActChargingSettingBinding actChargingSettingBinding18 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding18 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding18.m.setText("1 min");
                                            AppPreferences.c(60);
                                            return;
                                        }
                                        if (id2 == R.id.item6) {
                                            ActChargingSettingBinding actChargingSettingBinding19 = chargingSettingAct3.h0;
                                            if (actChargingSettingBinding19 == null) {
                                                Intrinsics.m("binding");
                                                throw null;
                                            }
                                            actChargingSettingBinding19.m.setText("3 min");
                                            AppPreferences.c(180);
                                            return;
                                        }
                                        ActChargingSettingBinding actChargingSettingBinding110 = chargingSettingAct3.h0;
                                        if (actChargingSettingBinding110 == null) {
                                            Intrinsics.m("binding");
                                            throw null;
                                        }
                                        actChargingSettingBinding110.m.setText("Loop");
                                        AppPreferences.c(0);
                                        return;
                                }
                            }
                        };
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding != null) {
                            layChargingCloseTypeBinding.f13226b.setOnClickListener(onClickListener2);
                        }
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding2 = chargingSettingAct.k0;
                        if (layChargingCloseTypeBinding2 != null) {
                            layChargingCloseTypeBinding2.f13227c.setOnClickListener(onClickListener2);
                        }
                        CustomPopWindow.PopupWindowBuilder popupWindowBuilder2 = new CustomPopWindow.PopupWindowBuilder(chargingSettingAct);
                        LayChargingCloseTypeBinding layChargingCloseTypeBinding3 = chargingSettingAct.k0;
                        Intrinsics.c(layChargingCloseTypeBinding3);
                        CustomPopWindow customPopWindow2 = popupWindowBuilder2.f13327a;
                        customPopWindow2.h0 = layChargingCloseTypeBinding3.f13225a;
                        customPopWindow2.g0 = -1;
                        customPopWindow2.p0 = true;
                        customPopWindow2.q0 = 0.7f;
                        CustomPopWindow customPopWindowA2 = popupWindowBuilder2.a();
                        chargingSettingAct.l0 = customPopWindowA2;
                        ActChargingSettingBinding actChargingSettingBinding11 = chargingSettingAct.h0;
                        if (actChargingSettingBinding11 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        TextView textView11 = actChargingSettingBinding11.f13118l;
                        PopupWindow popupWindow2 = customPopWindowA2.i0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(textView11, 0, 0);
                        }
                        return unit;
                    default:
                        View it6 = (View) obj;
                        int i16 = ChargingSettingAct.m0;
                        Intrinsics.f(it6, "it");
                        chargingSettingAct.onBackPressed();
                        return unit;
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (j()) {
            q(new i(this, 0));
            return;
        }
        if (!MainAct.q0) {
            ActUtils.b(this, SplashAct.class);
        }
        finish();
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CustomPopWindow customPopWindow = this.j0;
        if (customPopWindow != null) {
            customPopWindow.a();
        }
        CustomPopWindow customPopWindow2 = this.l0;
        if (customPopWindow2 != null) {
            customPopWindow2.a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ActChargingSettingBinding actChargingSettingBinding = this.h0;
        if (actChargingSettingBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        actChargingSettingBinding.k.setChecked(Z.z(appPreferencesUtil, "charging_play_sound", true));
        ActChargingSettingBinding actChargingSettingBinding2 = this.h0;
        if (actChargingSettingBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingSettingBinding2.j.setChecked(Z.z(appPreferencesUtil, "charging_show_on_lock_screen", false));
        ActChargingSettingBinding actChargingSettingBinding3 = this.h0;
        if (actChargingSettingBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingSettingBinding3.f13117i.setChecked(Z.z(appPreferencesUtil, "charging_show_battery_text", true));
        int i2 = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getInt("charging_show_duration", 0);
        if (i2 == 5) {
            ActChargingSettingBinding actChargingSettingBinding4 = this.h0;
            if (actChargingSettingBinding4 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding4.m.setText("5 secs");
        } else if (i2 == 10) {
            ActChargingSettingBinding actChargingSettingBinding5 = this.h0;
            if (actChargingSettingBinding5 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding5.m.setText("10 secs");
        } else if (i2 == 15) {
            ActChargingSettingBinding actChargingSettingBinding6 = this.h0;
            if (actChargingSettingBinding6 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding6.m.setText("15 secs");
        } else if (i2 == 30) {
            ActChargingSettingBinding actChargingSettingBinding7 = this.h0;
            if (actChargingSettingBinding7 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding7.m.setText("30 secs");
        } else if (i2 == 60) {
            ActChargingSettingBinding actChargingSettingBinding8 = this.h0;
            if (actChargingSettingBinding8 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding8.m.setText("1 min");
        } else if (i2 != 180) {
            ActChargingSettingBinding actChargingSettingBinding9 = this.h0;
            if (actChargingSettingBinding9 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding9.m.setText("Loop");
        } else {
            ActChargingSettingBinding actChargingSettingBinding10 = this.h0;
            if (actChargingSettingBinding10 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingSettingBinding10.m.setText("3 min");
        }
        if (AppPreferences.a() == 1) {
            ActChargingSettingBinding actChargingSettingBinding11 = this.h0;
            if (actChargingSettingBinding11 != null) {
                actChargingSettingBinding11.f13118l.setText("One Click");
                return;
            } else {
                Intrinsics.m("binding");
                throw null;
            }
        }
        ActChargingSettingBinding actChargingSettingBinding12 = this.h0;
        if (actChargingSettingBinding12 != null) {
            actChargingSettingBinding12.f13118l.setText("Double Click");
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }
}
