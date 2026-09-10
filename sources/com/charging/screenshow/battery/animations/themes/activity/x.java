package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.applovin.impl.Z;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.fragment.HomeFrag$initViews$1;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.RateDialog;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzd;
import es.dmoral.toasty.Toasty;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f13063Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ x(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f13063Y = obj;
        this.Z = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        Object obj2 = this.Z;
        Object obj3 = this.f13063Y;
        switch (this.X) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                boolean z2 = MainAct.q0;
                RateDialog rateDialog = (RateDialog) obj3;
                MainAct mainAct = (MainAct) obj2;
                if (fFloatValue < 4.5d) {
                    String strC = IntExt.c(R.string.thank_you_rate_us);
                    Typeface typeface = Toasty.f42874a;
                    Toasty.a(mainAct, strC, AppCompatResources.a(mainAct, 2131231226), ContextCompat.getColor(mainAct, R.color.successColor), ContextCompat.getColor(mainAct, R.color.defaultTextColor)).show();
                    rateDialog.dismiss();
                } else {
                    rateDialog.dismiss();
                    if (mainAct.m0 == null || mainAct.n0 == null || Z.z(AppPreferencesUtil.f13313a, "show_rate_complete", false)) {
                        mainAct.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + mainAct.getPackageName())));
                        ReturnAppManager.e0 = true;
                    } else {
                        zzd zzdVar = mainAct.m0;
                        Intrinsics.c(zzdVar);
                        ReviewInfo reviewInfo = mainAct.n0;
                        Intrinsics.c(reviewInfo);
                        Task taskA = zzdVar.a(mainAct, reviewInfo);
                        Intrinsics.e(taskA, "launchReviewFlow(...)");
                        Intrinsics.c(taskA.addOnCompleteListener(new androidx.media3.extractor.text.a(24)));
                    }
                }
                break;
            case 1:
                ((HandlerContext) obj3).f44773Y.removeCallbacks((HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1) obj2);
                break;
            default:
                View it = (View) obj;
                Intrinsics.f(it, "it");
                HomeFrag$initViews$1 homeFrag$initViews$1 = ((ChargingCategoryAdapter) obj3).f13071l;
                if (homeFrag$initViews$1 != null) {
                    homeFrag$initViews$1.a(((ChargingCategoryAdapter.VH) obj2).getAdapterPosition());
                }
                break;
        }
        return unit;
    }
}
