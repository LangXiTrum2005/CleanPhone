package com.chartboost.sdk.impl;

import android.content.Context;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class tb implements kj {
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Partner f15199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub f15201c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tb(Context applicationContext, wf sharedPrefsHelper, hf resourcesLoader) {
        Intrinsics.f(applicationContext, "applicationContext");
        Intrinsics.f(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.f(resourcesLoader, "resourcesLoader");
        Partner partnerCreatePartner = Partner.createPartner("Chartboost", "9.10.2");
        Intrinsics.e(partnerCreatePartner, "createPartner(...)");
        this.f15199a = partnerCreatePartner;
        this.f15200b = true;
        this.f15201c = new ub(sharedPrefsHelper, resourcesLoader);
        Omid.activate(applicationContext);
    }

    @Override // com.chartboost.sdk.impl.kj
    public Partner a() {
        return this.f15199a;
    }

    @Override // com.chartboost.sdk.impl.kj
    public boolean b() {
        return this.f15200b;
    }

    @Override // com.chartboost.sdk.impl.kj
    public String c() {
        return this.f15201c.a();
    }

    @Override // com.chartboost.sdk.impl.kj
    public boolean isActive() {
        return b() && Omid.isActive();
    }

    @Override // com.chartboost.sdk.impl.kj
    public String a(String adResponseHtml) {
        Intrinsics.f(adResponseHtml, "adResponseHtml");
        if (b()) {
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(c(), adResponseHtml);
                Intrinsics.c(strInjectScriptContentIntoHtml);
                return strInjectScriptContentIntoHtml;
            } catch (Throwable unused) {
            }
        }
        return adResponseHtml;
    }

    public String a(String adResponseHtml, String scriptUrl) {
        Intrinsics.f(adResponseHtml, "adResponseHtml");
        Intrinsics.f(scriptUrl, "scriptUrl");
        if (b()) {
            String strN = android.support.v4.media.a.n("<script src=\"", scriptUrl, "\"></script>");
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml("cfc10ccaf0724c4cbc6122cf51421f03", adResponseHtml);
                Intrinsics.c(strInjectScriptContentIntoHtml);
                String strI = StringsKt.I(strInjectScriptContentIntoHtml, "<script type=\"text/javascript\">cfc10ccaf0724c4cbc6122cf51421f03</script>", strN);
                if (!strI.equals(strInjectScriptContentIntoHtml)) {
                    return strI;
                }
            } catch (Throwable unused) {
                za.b("failed to inject script URL into HTML.", (Throwable) null, 2, (Object) null);
            }
        }
        return adResponseHtml;
    }

    @Override // com.chartboost.sdk.impl.kj
    public String a(String adResponseHtml, Set set) {
        Intrinsics.f(adResponseHtml, "adResponseHtml");
        if (set != null && adResponseHtml.length() != 0) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String string = ((sj) it.next()).a().toString();
                Intrinsics.e(string, "toString(...)");
                adResponseHtml = a(adResponseHtml, string);
            }
        }
        return adResponseHtml;
    }
}
