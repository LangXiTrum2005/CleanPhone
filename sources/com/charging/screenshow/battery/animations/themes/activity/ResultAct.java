package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActResultBinding;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.CompleteView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ResultAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResultAct extends BaseAct {
    public static final /* synthetic */ int i0 = 0;
    public ActResultBinding h0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ResultAct$Companion;", "", "", "KEY_TAG", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context, int i2) {
            Intrinsics.f(context, "context");
            Intent intent = new Intent(context, (Class<?>) ResultAct.class);
            intent.putExtra("key_tag", i2);
            context.startActivity(intent);
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActResultBinding actResultBinding = this.h0;
        if (actResultBinding != null) {
            ViewExt.c(actResultBinding.d, new androidx.room.b(this, 6));
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        String strC;
        int intExtra = getIntent().getIntExtra("key_tag", 1);
        if (intExtra == 1) {
            ActResultBinding actResultBinding = this.h0;
            if (actResultBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding.f.setVisibility(0);
            ActResultBinding actResultBinding2 = this.h0;
            if (actResultBinding2 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding2.f13145c.setVisibility(8);
            strC = IntExt.c(R.string.set_image_success_home);
        } else if (intExtra == 2) {
            ActResultBinding actResultBinding3 = this.h0;
            if (actResultBinding3 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding3.f.setVisibility(0);
            ActResultBinding actResultBinding4 = this.h0;
            if (actResultBinding4 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding4.f13145c.setVisibility(8);
            strC = IntExt.c(R.string.set_image_success_lock);
        } else if (intExtra == 3) {
            ActResultBinding actResultBinding5 = this.h0;
            if (actResultBinding5 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding5.f.setVisibility(0);
            ActResultBinding actResultBinding6 = this.h0;
            if (actResultBinding6 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding6.f13145c.setVisibility(8);
            strC = IntExt.c(R.string.set_image_success_both);
        } else if (intExtra != 4) {
            ActResultBinding actResultBinding7 = this.h0;
            if (actResultBinding7 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding7.f.setVisibility(0);
            ActResultBinding actResultBinding8 = this.h0;
            if (actResultBinding8 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding8.f13145c.setVisibility(8);
            strC = IntExt.c(R.string.set_image_success_home);
        } else {
            ActResultBinding actResultBinding9 = this.h0;
            if (actResultBinding9 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding9.f.setVisibility(8);
            ActResultBinding actResultBinding10 = this.h0;
            if (actResultBinding10 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actResultBinding10.f13145c.setVisibility(0);
            strC = IntExt.c(R.string.charging_guide_desc);
        }
        ActResultBinding actResultBinding11 = this.h0;
        if (actResultBinding11 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actResultBinding11.f13146e.setText(strC);
        if (this.Z || !j()) {
            return;
        }
        p(new z(this, 0));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_result, (ViewGroup) null, false);
        int i2 = R.id.flAnimation;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.a(R.id.flAnimation, viewInflate);
        if (frameLayout != null) {
            i2 = R.id.immersionBarView;
            View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
            if (viewA != null) {
                i2 = R.id.lottie;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.a(R.id.lottie, viewInflate);
                if (lottieAnimationView != null) {
                    i2 = R.id.tvContinue;
                    TextView textView = (TextView) ViewBindings.a(R.id.tvContinue, viewInflate);
                    if (textView != null) {
                        i2 = R.id.tvText;
                        TextView textView2 = (TextView) ViewBindings.a(R.id.tvText, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.viewComplete;
                            CompleteView completeView = (CompleteView) ViewBindings.a(R.id.viewComplete, viewInflate);
                            if (completeView != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.h0 = new ActResultBinding(linearLayout, frameLayout, viewA, lottieAnimationView, textView, textView2, completeView);
                                Intrinsics.e(linearLayout, "getRoot(...)");
                                return linearLayout;
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
        ActResultBinding actResultBinding = this.h0;
        if (actResultBinding != null) {
            return actResultBinding.f13144b;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ActResultBinding actResultBinding = this.h0;
        if (actResultBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actResultBinding.f.setDuration(1600);
        ActResultBinding actResultBinding2 = this.h0;
        if (actResultBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        CompleteView.State state = CompleteView.State.Z;
        CompleteView completeView = actResultBinding2.f;
        completeView.l0 = state;
        completeView.r0.start();
        Async.b(com.smartdigimkt.o1.b.C0, new c0.a(this, 13));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }
}
