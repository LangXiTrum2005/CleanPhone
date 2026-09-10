package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b0;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.q;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f40607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdInformationView f40608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f40609c;
    public final ConsentData d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40610e;
    public final String f;
    public final AdInformationOverrides g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f40612i;

    public a(Context context, AdInformationObject$Size adInformationObject$Size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2, String str3, String str4) {
        this.f40607a = new WeakReference(context);
        this.f40609c = placement;
        this.g = adInformationOverrides;
        this.d = consentData;
        this.f40610e = str;
        this.f = str2;
        this.f40611h = str3;
        this.f40612i = str4;
        this.f40608b = new AdInformationView(context, adInformationObject$Size, placement, adInformationOverrides, this, (str3 == null && str4 == null) ? false : true);
    }

    public final void a(RelativeLayout relativeLayout) {
        Set setA;
        Context context = relativeLayout.getContext();
        AdInformationConfig adInformationConfigA = AdInformationMetaData.c().a();
        AdInformationOverrides adInformationOverrides = this.g;
        if ((adInformationOverrides == null || !adInformationOverrides.d()) ? adInformationConfigA.isEnabled(context) : this.g.c()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                adInformationConfigA.getPosition(this.f40609c).addRules(layoutParams);
            } else {
                this.g.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f40608b, layoutParams);
        }
        q qVar = (q) com.startapp.sdk.components.a.a(context).f40731P.a();
        AdDebuggerMetadata adDebuggerMetadataD = MetaData.E().d();
        if ((adDebuggerMetadataD == null || (setA = adDebuggerMetadataD.a()) == null) ? false : setA.contains(((com.startapp.sdk.common.advertisingid.b) qVar.f41380b.a()).a().f41193a)) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, (this.f40608b.c() * 2) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(Integer.MIN_VALUE);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new b0(this, qVar));
            AdInformationPositions.Position positionFlipHorizontal = this.f40608b.d().flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f40608b.e(), this.f40608b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            positionFlipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f40608b.b(), this.f40608b.a());
            positionFlipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = (Context) this.f40607a.get();
        if (context == null) {
            return;
        }
        h6 h6Var = (h6) com.startapp.sdk.components.a.a(context).j.a();
        ConsentData consentData = this.d;
        String strC = consentData != null ? consentData.c() : null;
        ConsentData consentData2 = this.d;
        String strD = consentData2 != null ? consentData2.d() : null;
        ConsentData consentData3 = this.d;
        h6Var.a(true, strC, strD, consentData3 != null ? consentData3.b() : null, this.f40611h, this.f40612i);
    }
}
