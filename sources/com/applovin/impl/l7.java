package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f8351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f8352b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends u2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return i10 == d.SETTINGS.ordinal() ? l7.this.c() : l7.this.a();
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return i10 == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return i10 == d.SETTINGS.ordinal() ? new x4("SETTINGS") : new x4("GDPR APPLICABILITY");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f8354a;

        public b(com.applovin.impl.sdk.l lVar) {
            this.f8354a = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() == d.SETTINGS.ordinal()) {
                if (l2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f8354a.y().f() != null) {
                        n7.a(this.f8354a.y().f(), com.applovin.impl.sdk.l.p(), this.f8354a);
                        return;
                    } else {
                        q7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", l7.this);
                        return;
                    }
                }
                if (l2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f8354a.y().h() == null) {
                    return;
                }
                n7.a(this.f8354a.y().h(), com.applovin.impl.sdk.l.p(), this.f8354a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private t2 d() {
        t2.b bVarD = t2.a().d("Terms of Service URL");
        if (this.f8351a.y().h() != null) {
            bVarD.a(R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(getColor(R.color.applovin_sdk_checkmarkColor));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f8351a;
    }

    public void initialize(com.applovin.impl.sdk.l lVar) {
        this.f8351a = lVar;
        a aVar = new a(this);
        this.f8352b = aVar;
        aVar.a(new b(lVar));
        this.f8352b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f8352b);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f8352b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f8351a.w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = this.f8351a.y().d();
        boolean z10 = q7.c(this.f8351a) && consentFlowUserGeographyD != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(t2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z10));
        arrayList.add(b(consentFlowUserGeographyD, z10));
        return arrayList;
    }

    private t2 b() {
        boolean z10 = this.f8351a.y().f() != null;
        return t2.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(getColor(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).a(true).a();
    }

    private t2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        String str;
        t2.b bVarD = t2.a().d("Consent Flow Geography");
        if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown";
        }
        return bVarD.c(str).b(z10).a();
    }

    private t2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        String str;
        t2.b bVarD = t2.a().d("Debug User Geography");
        if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None";
        }
        return bVarD.c(str).b(z10).a();
    }
}
