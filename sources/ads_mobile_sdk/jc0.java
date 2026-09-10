package ads_mobile_sdk;

import android.os.Build;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 30 && this.a.c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
    }
}
