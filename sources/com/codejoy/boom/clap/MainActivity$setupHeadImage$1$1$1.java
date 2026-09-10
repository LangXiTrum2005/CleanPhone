package com.codejoy.boom.clap;

import android.graphics.Bitmap;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.MainActivity$setupHeadImage$1$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend", v = 1)
public final class MainActivity$setupHeadImage$1$1$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Bitmap $result;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$setupHeadImage$1$1$1(Bitmap bitmap, MainActivity mainActivity, wretchedly.dern<? super MainActivity$setupHeadImage$1$1$1> dernVar) {
        super(2, dernVar);
        this.$result = bitmap;
        this.this$0 = mainActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new MainActivity$setupHeadImage$1$1$1(this.$result, this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        if (this.$result != null) {
            this.this$0.grimness().f37982beachfront.setImageBitmap(this.$result);
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((MainActivity$setupHeadImage$1$1$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
