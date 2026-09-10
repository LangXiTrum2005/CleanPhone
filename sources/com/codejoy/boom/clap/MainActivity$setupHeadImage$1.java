package com.codejoy.boom.clap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.technofreak;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.MainActivity$setupHeadImage$1", f = "MainActivity.kt", l = {Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend", v = 1)
public final class MainActivity$setupHeadImage$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    float F$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$setupHeadImage$1(MainActivity mainActivity, wretchedly.dern<? super MainActivity$setupHeadImage$1> dernVar) {
        super(2, dernVar);
        this.this$0 = mainActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new MainActivity$setupHeadImage$1(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                MainActivity mainActivity = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(mainActivity.getResources(), formularize.boom_home_head_bg);
                int i2 = mainActivity.getResources().getDisplayMetrics().widthPixels;
                float width = i2 / bitmapDecodeResource.getWidth();
                Intrinsics.beachfront(bitmapDecodeResource);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, i2, (int) (bitmapDecodeResource.getHeight() * width), false);
                technofreak technofreakVarDern = premeiotic.dern();
                MainActivity$setupHeadImage$1$1$1 mainActivity$setupHeadImage$1$1$1 = new MainActivity$setupHeadImage$1$1$1(bitmapCreateScaledBitmap, mainActivity, null);
                this.L$0 = igo.impromptu.attabal(bitmapDecodeResource);
                this.L$1 = igo.impromptu.attabal(bitmapCreateScaledBitmap);
                this.I$0 = 0;
                this.I$1 = i2;
                this.F$0 = width;
                this.label = 1;
                if (kotlinx.coroutines.impromptu.competently(technofreakVarDern, mainActivity$setupHeadImage$1$1$1, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((MainActivity$setupHeadImage$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
