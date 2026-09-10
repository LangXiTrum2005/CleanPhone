package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class il1 extends Lambda implements Function0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il1(Context context) {
        super(0);
        this.a = context;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return lampshade.attabal.attabal(this.a, "google_mobile_ads_native_ad_settings.pb");
    }
}
