package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Intent;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class eo extends Lambda implements Function1 {
    public final /* synthetic */ Intent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(Intent intent) {
        super(1);
        this.a = intent;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String[] strArr = (String[]) new Regex("/").split(it, 2).toArray(new String[0]);
        if (strArr.length == 2) {
            this.a.setComponent(new ComponentName(strArr[0], strArr[1]));
        }
        return Unit.f29295attabal;
    }
}
