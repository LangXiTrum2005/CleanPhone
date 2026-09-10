package com.charging.screenshow.battery.animations.themes.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActBatteryHealthBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import me.itangqi.waveloadingview.WaveLoadingView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/BatteryHealthAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BatteryHealthAct extends BaseAct {
    public static final /* synthetic */ int i0 = 0;
    public ActBatteryHealthBinding h0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/BatteryHealthAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_battery_health, (ViewGroup) null, false);
        int i2 = R.id.batteryCard;
        if (((MaterialCardView) ViewBindings.a(R.id.batteryCard, viewInflate)) != null) {
            i2 = R.id.heroSection;
            if (((LinearLayout) ViewBindings.a(R.id.heroSection, viewInflate)) != null) {
                i2 = R.id.immersionBarView;
                View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
                if (viewA != null) {
                    i2 = R.id.ivBack;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.a(R.id.ivBack, viewInflate);
                    if (appCompatImageView != null) {
                        i2 = R.id.layoutBatteryStatus;
                        if (((ConstraintLayout) ViewBindings.a(R.id.layoutBatteryStatus, viewInflate)) != null) {
                            i2 = R.id.layoutCapacity;
                            if (((LinearLayout) ViewBindings.a(R.id.layoutCapacity, viewInflate)) != null) {
                                i2 = R.id.layoutHealth;
                                if (((LinearLayout) ViewBindings.a(R.id.layoutHealth, viewInflate)) != null) {
                                    i2 = R.id.layoutStatusBadge;
                                    if (((LinearLayout) ViewBindings.a(R.id.layoutStatusBadge, viewInflate)) != null) {
                                        i2 = R.id.layoutTemperature;
                                        if (((LinearLayout) ViewBindings.a(R.id.layoutTemperature, viewInflate)) != null) {
                                            i2 = R.id.layoutTime;
                                            if (((LinearLayout) ViewBindings.a(R.id.layoutTime, viewInflate)) != null) {
                                                i2 = R.id.layoutType;
                                                if (((LinearLayout) ViewBindings.a(R.id.layoutType, viewInflate)) != null) {
                                                    i2 = R.id.layoutVoltage;
                                                    if (((LinearLayout) ViewBindings.a(R.id.layoutVoltage, viewInflate)) != null) {
                                                        i2 = R.id.progressBattery;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.a(R.id.progressBattery, viewInflate);
                                                        if (progressBar != null) {
                                                            i2 = R.id.top;
                                                            View viewA2 = ViewBindings.a(R.id.top, viewInflate);
                                                            if (viewA2 != null) {
                                                                i2 = R.id.tvCapacity;
                                                                TextView textView = (TextView) ViewBindings.a(R.id.tvCapacity, viewInflate);
                                                                if (textView != null) {
                                                                    i2 = R.id.tvHealth;
                                                                    TextView textView2 = (TextView) ViewBindings.a(R.id.tvHealth, viewInflate);
                                                                    if (textView2 != null) {
                                                                        i2 = R.id.tvPercent;
                                                                        TextView textView3 = (TextView) ViewBindings.a(R.id.tvPercent, viewInflate);
                                                                        if (textView3 != null) {
                                                                            i2 = R.id.tvStatusTitle;
                                                                            if (((TextView) ViewBindings.a(R.id.tvStatusTitle, viewInflate)) != null) {
                                                                                i2 = R.id.tvTemperature;
                                                                                TextView textView4 = (TextView) ViewBindings.a(R.id.tvTemperature, viewInflate);
                                                                                if (textView4 != null) {
                                                                                    i2 = R.id.tvTime;
                                                                                    TextView textView5 = (TextView) ViewBindings.a(R.id.tvTime, viewInflate);
                                                                                    if (textView5 != null) {
                                                                                        i2 = R.id.tvTitle;
                                                                                        if (((TextView) ViewBindings.a(R.id.tvTitle, viewInflate)) != null) {
                                                                                            i2 = R.id.tvType;
                                                                                            TextView textView6 = (TextView) ViewBindings.a(R.id.tvType, viewInflate);
                                                                                            if (textView6 != null) {
                                                                                                i2 = R.id.tvVoltage;
                                                                                                TextView textView7 = (TextView) ViewBindings.a(R.id.tvVoltage, viewInflate);
                                                                                                if (textView7 != null) {
                                                                                                    i2 = R.id.waveLoadingView;
                                                                                                    WaveLoadingView waveLoadingView = (WaveLoadingView) ViewBindings.a(R.id.waveLoadingView, viewInflate);
                                                                                                    if (waveLoadingView != null) {
                                                                                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                                        this.h0 = new ActBatteryHealthBinding(linearLayout, viewA, appCompatImageView, progressBar, viewA2, textView, textView2, textView3, textView4, textView5, textView6, textView7, waveLoadingView);
                                                                                                        Intrinsics.e(linearLayout, "getRoot(...)");
                                                                                                        return linearLayout;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActBatteryHealthBinding actBatteryHealthBinding = this.h0;
        if (actBatteryHealthBinding != null) {
            return actBatteryHealthBinding.f13086a;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ActBatteryHealthBinding actBatteryHealthBinding = this.h0;
        if (actBatteryHealthBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actBatteryHealthBinding.f13087b, new androidx.room.b(this, 3));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new BatteryHealthAct$initViews$2(this, null), 3);
        if (j()) {
            p(new a(this, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!j() || n().f13353e) {
            finish();
        } else {
            q(new a(this, 1));
        }
    }
}
