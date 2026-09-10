package ads_mobile_sdk;

import android.content.Intent;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class bo extends Lambda implements Function1 {
    public final /* synthetic */ Intent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(Intent intent) {
        super(1);
        this.a = intent;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.a.setAction(it);
    }
}
