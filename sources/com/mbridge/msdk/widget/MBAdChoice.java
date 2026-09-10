package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBAdChoice extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f38346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f38350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f38351h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f38347d = "";
        this.f38348e = "";
        this.f38349f = "";
        this.f38346c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f38350g = campaignEx;
        g gVarI = f2.i(i.b());
        c(campaignEx, gVarI);
        a(campaignEx, gVarI);
        b(campaignEx, gVarI);
        boolean z10 = (TextUtils.isEmpty(this.f38347d) || TextUtils.isEmpty(this.f38348e) || TextUtils.isEmpty(this.f38349f)) ? false : true;
        setImageUrl(this.f38347d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f38350g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f38348e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f38348e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f38348e = adchoice.h();
            }
            if (TextUtils.isEmpty(this.f38348e) && gVar != null) {
                this.f38348e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f38348e)) {
                this.f38348e = d.h().f33857g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f38351h == null) {
            this.f38351h = new a();
        }
        v0.a(this.f38350g, this.f38351h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f38350g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f38350g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f38351h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f38350g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f38349f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f38349f = adchoice.i();
        }
        if (!TextUtils.isEmpty(this.f38349f) || gVar == null) {
            return;
        }
        this.f38349f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38347d = "";
        this.f38348e = "";
        this.f38349f = "";
        this.f38346c = context;
        b();
    }

    private void a() {
        if (this.f38346c != null) {
            f2.g().a(this.f38347d, new b());
        }
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f38347d = "";
        this.f38348e = "";
        this.f38349f = "";
        this.f38346c = context;
        b();
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f38350g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f38347d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f38347d = adchoice.g();
        }
        if (!TextUtils.isEmpty(this.f38347d) || gVar == null) {
            return;
        }
        this.f38347d = gVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
