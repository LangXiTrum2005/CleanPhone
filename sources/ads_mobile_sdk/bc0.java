package ads_mobile_sdk;

import android.net.Uri;
import kotlinx.coroutines.gintrap;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gerenuk;
import saneness.hemolysin;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements rotuma, gerenuk {
    public final gq0 a;
    public final /* synthetic */ gerenuk b;

    public bc0(gq0 gmaWebView) {
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        this.a = gmaWebView;
        this.b = gmaWebView.c();
    }

    @Override // saneness.rotuma
    public final gq0 a() {
        return this.a;
    }

    @Override // saneness.gerenuk
    public final Object a(gq0 gq0Var, Uri uri, wretchedly.dern dernVar) {
        return this.b.a(gq0Var, uri, dernVar);
    }

    @Override // saneness.gerenuk
    public final Object a(gq0 gq0Var, String str, wretchedly.dern dernVar) {
        return this.b.a(gq0Var, str, dernVar);
    }

    @Override // saneness.gerenuk
    public final Object a(String str, hemolysin hemolysinVar, wretchedly.dern dernVar) {
        return this.b.a(str, hemolysinVar, dernVar);
    }

    @Override // saneness.gerenuk
    public final Object a(String str, gintrap gintrapVar, mp0 mp0Var) {
        return this.b.a(str, gintrapVar, mp0Var);
    }
}
