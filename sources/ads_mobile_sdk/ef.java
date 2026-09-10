package ads_mobile_sdk;

import com.google.android.gms.appset.AppSet;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ef extends Lambda implements Function0 {
    public final /* synthetic */ hf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(hf hfVar) {
        super(0);
        this.a = hfVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return AppSet.getClient(this.a.a);
    }
}
