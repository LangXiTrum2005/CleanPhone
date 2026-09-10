package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.nb;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.ub;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f40500a;

    public a(List3DActivity list3DActivity) {
        this.f40500a = list3DActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        ag agVar;
        String str = ((rb) this.f40500a.f40487h.get(i2)).f41436b;
        String[] strArr = ((rb) this.f40500a.f40487h.get(i2)).d;
        String str2 = ((rb) this.f40500a.f40487h.get(i2)).f;
        boolean z2 = ((rb) this.f40500a.f40487h.get(i2)).k;
        boolean z3 = ((rb) this.f40500a.f40487h.get(i2)).f41441l;
        String str3 = ((rb) this.f40500a.f40487h.get(i2)).f41442n;
        String str4 = ((rb) this.f40500a.f40487h.get(i2)).m;
        Boolean bool = ((rb) this.f40500a.f40487h.get(i2)).f41443p;
        ub ubVarA = this.f40500a.f40488i.a(this.f40500a.f);
        String[] strArr2 = ((rb) this.f40500a.f40487h.get(i2)).f41437c;
        d9 d9Var = ubVarA.f41541a;
        String strR = strArr2 != null ? android.support.v4.media.a.r(new StringBuilder(), TextUtils.join("^", strArr2), ubVarA.f41543c) : null;
        HashMap map = d9Var.f40903c;
        if (map != null && (agVar = (ag) map.get(strR)) != null) {
            agVar.a(null, null);
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            List3DActivity list3DActivity = this.f40500a;
            h0.a(str3, str4, str, list3DActivity, new TrackingParams(list3DActivity.g));
            this.f40500a.finish();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zP = MetaData.E().p();
        Context applicationContext = this.f40500a.getApplicationContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean zA = h0.a(applicationContext);
        if (z2 && !zA) {
            List3DActivity list3DActivity2 = this.f40500a;
            h0.a(list3DActivity2, str, strArr, str2, list3DActivity2.a(), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), z3, bool, false, zP ? new nb(this) : null);
            return;
        }
        List3DActivity list3DActivity3 = this.f40500a;
        h0.a(list3DActivity3, str, strArr, list3DActivity3.a(), z3 && !zA, false);
        if (zP) {
            this.f40500a.finish();
        }
    }
}
