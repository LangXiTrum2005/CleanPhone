package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.admob.AdMobAdapter;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import complexometry.competently;
import complexometry.formularize;
import complexometry.gintrap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nhl.ParentAdConfig;
import nhl.ParentCommonConfig;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc2 extends l1 {
    public String k;
    public final rc2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, a22 placementIdWrapper) {
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, placementIdWrapper);
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.l = new rc2();
    }

    public final competently a(Bundle googleExtrasBundle, Map adSourceExtrasBundle) {
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundle, "adSourceExtrasBundle");
        String str = this.k;
        if (str == null) {
            Intrinsics.preprohormone("innerAdUnitId");
            str = null;
        }
        return new gintrap(str, googleExtrasBundle, adSourceExtrasBundle, this.b).attabal();
    }

    @Override // saneness.idolatry
    public final boolean b() {
        JsonObject jsonObject = this.f.c;
        Intrinsics.checkNotNullParameter(FacebookMediationAdapter.PLACEMENT_PARAMETER, X3.i.W);
        String str = "";
        Intrinsics.checkNotNullParameter("", BuildConfig.FLAVOR);
        if (jsonObject != null) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                Intrinsics.checkNotNullParameter(FacebookMediationAdapter.PLACEMENT_PARAMETER, X3.i.W);
                String asString = jsonObject.get(FacebookMediationAdapter.PLACEMENT_PARAMETER).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                str = asString;
            } catch (Exception unused) {
            }
        }
        return str.length() > 0;
    }

    public final Bundle e() {
        return new AdMobAdapter().buildExtrasBundle(this.b.formularize(AdMobAdapter.class), cb1.b(this.f.c));
    }

    public final void f() {
        rc2 rc2Var = this.l;
        String str = this.k;
        if (str == null) {
            Intrinsics.preprohormone("innerAdUnitId");
            str = null;
        }
        String str2 = str;
        h1 h1Var = this.f;
        String str3 = h1Var.h;
        List list = h1Var.v;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(string);
        }
        List list2 = this.f.G;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String string2 = ((Uri) it2.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList2.add(string2);
        }
        List list3 = this.f.P;
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            String string3 = ((Uri) it3.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            arrayList3.add(string3);
        }
        List list4 = this.f.C;
        ArrayList arrayList4 = new ArrayList(dovishness.gintrap(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            String string4 = ((Uri) it4.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            arrayList4.add(string4);
        }
        List list5 = this.f.h0;
        ArrayList arrayList5 = new ArrayList(dovishness.gintrap(list5, 10));
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            String string5 = ((Uri) it5.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
            arrayList5.add(string5);
        }
        List list6 = this.f.d0;
        ArrayList arrayList6 = new ArrayList(dovishness.gintrap(list6, 10));
        Iterator it6 = list6.iterator();
        while (it6.hasNext()) {
            String string6 = ((Uri) it6.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            arrayList6.add(string6);
        }
        List list7 = this.f.g0;
        ArrayList arrayList7 = new ArrayList(dovishness.gintrap(list7, 10));
        Iterator it7 = list7.iterator();
        while (it7.hasNext()) {
            String string7 = ((Uri) it7.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
            arrayList7.add(string7);
        }
        h1 h1Var2 = this.f;
        ParentAdConfig parentAdConfig = new ParentAdConfig(str2, str3, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, h1Var2.K, h1Var2.X, h1Var2.m0, adultoid.formularize());
        scarbroite.attabal attabalVar = this.f.i0;
        if (attabalVar != null) {
            parentAdConfig.rewardsBundles = graveside.marial(claque.wireman.attabal(patroclinal.formularize.attabal("rb_amount", Integer.valueOf(attabalVar.getAmount())), patroclinal.formularize.attabal("rb_type", attabalVar.getType())));
        }
        rc2Var.a = parentAdConfig;
        rc2 rc2Var2 = this.l;
        List list8 = this.g.m;
        ArrayList arrayList8 = new ArrayList(dovishness.gintrap(list8, 10));
        Iterator it8 = list8.iterator();
        while (it8.hasNext()) {
            String string8 = ((Uri) it8.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
            arrayList8.add(string8);
        }
        long jGintrap = p002kotlin.time.saneness.gintrap(this.g.n);
        ur urVar = this.g;
        rc2Var2.b = new ParentCommonConfig(arrayList8, jGintrap, urVar.h, urVar.q);
    }
}
