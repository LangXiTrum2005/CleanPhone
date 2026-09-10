package ads_mobile_sdk;

import android.content.Intent;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class fo extends Lambda implements Function1 {
    public final /* synthetic */ go a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(go goVar) {
        super(1);
        this.a = goVar;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return Intent.parseUri(it, 0);
        } catch (Exception e) {
            ((d13) this.a.b).a("Invalid intent Uri for canOpenIntents gmsg", e);
            return null;
        }
    }
}
