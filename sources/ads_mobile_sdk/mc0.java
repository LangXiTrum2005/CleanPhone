package ads_mobile_sdk;

import android.content.Intent;
import android.net.Uri;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/d"));
        intent.setPackage("com.android.vending");
        return Boolean.valueOf(intent.resolveActivity(this.a.e) != null);
    }
}
