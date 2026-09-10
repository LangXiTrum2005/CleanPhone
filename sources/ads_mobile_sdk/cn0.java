package ads_mobile_sdk;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import java.lang.ref.WeakReference;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.eia;

/* JADX INFO: loaded from: classes.dex */
public final class cn0 extends Lambda implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ eddy.attabal c;
    public final /* synthetic */ Class d = AdActivity.class;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(Context context, Context context2, eddy.attabal attabalVar) {
        super(0);
        this.a = context;
        this.b = context2;
        this.c = attabalVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        h21 h21Var = eia.f37136attabal;
        WeakReference weakReference = new WeakReference(this.a);
        Context applicationContext = this.b;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "$applicationContext");
        applicationContext.getClass();
        Context applicationContext2 = this.b;
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "$applicationContext");
        Application application = (Application) applicationContext2;
        application.getClass();
        eddy.attabal attabalVar = this.c;
        attabalVar.getClass();
        Class cls = this.d;
        cls.getClass();
        return new i60(applicationContext, application, weakReference, attabalVar, cls);
    }
}
