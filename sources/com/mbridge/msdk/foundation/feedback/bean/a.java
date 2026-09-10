package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f33682c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f33684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33685f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f33689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Dialog f33690k;
    private JSONArray l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<g> f33696r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f33699u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f33680a = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33683d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f33686g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33687h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33691m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33692n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33693o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33694p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f33697s = f2.c(20.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f33698t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f33700v = new C0123a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33701w = A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f33702x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f33703y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f33704z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0123a implements com.mbridge.msdk.widget.dialog.b {
        public C0123a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.widget.dialog.b {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f33689j != null) {
                a.this.f33689j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f33690k == null || !a.this.f33690k.isShowing()) {
                    return;
                }
                a.this.f33690k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public a(String str) {
        this.f33696r = new ArrayList();
        this.f33688i = str;
        if (this.f33696r == null) {
            this.f33696r = new ArrayList();
        }
        d();
        e();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, 1, 4, B, this.f33683d);
        List<g> list = this.f33696r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, 0, 4, B, this.f33683d);
        List<g> list = this.f33696r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, 0, 4, B, this.f33683d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        List<g> list = this.f33696r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    private void o() {
        if (TextUtils.isEmpty(this.f33698t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(i0.a(activityA, "mbridge_cm_feedback_notice_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f33690k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f33690k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f33690k.setContentView(viewInflate);
                this.f33690k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        FeedBackButton feedBackButton = this.f33684e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f33684e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f33684e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f33684e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f33689j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f33689j.setListener(null);
        }
        this.f33689j = null;
        this.f33696r = null;
        this.f33684e = null;
        this.f33700v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f33689j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f33689j.cancel();
    }

    public CampaignEx h() {
        return this.f33682c;
    }

    public FeedBackButton i() {
        if (this.f33684e == null) {
            e();
        }
        return this.f33684e;
    }

    public int j() {
        return this.f33695q;
    }

    public int k() {
        return this.f33699u;
    }

    public void p() {
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, 0, 1, B, this.f33683d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            MBFeedBackDialog mBFeedBackDialog = this.f33689j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            FeedBackButton feedBackButton = this.f33684e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, contextD, this.f33689j);
            a(zA ? 2 : 3);
            if (zA) {
                return;
            }
            a(contextD);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                com.mbridge.msdk.setting.g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = i.b().a();
                }
                com.mbridge.msdk.setting.b.C0173b c0173bB = gVarF.B();
                if (c0173bB == null) {
                    q0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f33689j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()), this.f33700v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0173bB);
                this.f33689j.setCancelText(c0173bB.d());
                this.f33689j.setConfirmText(c0173bB.a());
                this.f33689j.setPrivacyText(c0173bB.c());
                this.f33698t = c0173bB.e();
                this.f33689j.setTitle(c0173bB.f());
                this.f33689j.setContent(feedbackRadioGroupA);
                this.f33689j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0173bB);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f33700v == null) {
            this.f33700v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f33684e = feedBackButton;
                int i10 = 8;
                if (this.f33701w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f33684e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str) {
        this.f33683d = str;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f33711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33712b;

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f33711a = aVar;
            this.f33712b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f33675f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f33711a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f33675f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f33711a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f33711a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public void a(int i10) {
            if (this.f33711a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f33675f = true;
            this.f33711a.a();
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f33684e;
        if (feedBackButton != null) {
            int i10 = this.f33703y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f33704z;
            if (i11 > -1) {
                this.f33684e.setY(i11);
            }
            float f10 = this.f33680a;
            if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f33684e.setAlpha(f10);
                this.f33684e.setEnabled(this.f33680a != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            ViewGroup.LayoutParams layoutParams = this.f33684e.getLayoutParams();
            int i12 = this.f33702x;
            if (i12 > 0) {
                this.f33684e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f33702x;
                }
            }
            int i13 = this.f33687h;
            if (i13 > 0) {
                this.f33684e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f33687h;
                }
            }
            if (layoutParams != null) {
                this.f33684e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f33685f)) {
                    this.f33684e.setTextColor(Color.parseColor(this.f33685f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f33686g;
            if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f33684e.setTextSize(f11);
            }
            JSONArray jSONArray = this.l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                this.f33684e.setPadding(v0.a(contextD, (float) this.l.optDouble(0)), v0.a(contextD, (float) this.l.optDouble(1)), v0.a(contextD, (float) this.l.optDouble(2)), v0.a(contextD, (float) this.l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f33697s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f33681b)) {
                gradientDrawable.setColor(Color.parseColor(this.f33681b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f33684e.setBackground(gradientDrawable);
        }
    }

    public void a(g gVar) {
        if (this.f33696r == null) {
            this.f33696r = new ArrayList();
        }
        this.f33696r.add(gVar);
    }

    public void d(int i10) {
        this.f33701w = i10;
        FeedBackButton feedBackButton = this.f33684e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f33682c = campaignEx;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, 0, 2, B, this.f33683d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f33688i, 0, 3, B, this.f33683d);
        }
        List<g> list = this.f33696r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, v0.a(this.f33682c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, v0.a(this.f33682c));
            }
        }
    }

    private FeedbackRadioGroup a(com.mbridge.msdk.setting.b.C0173b c0173b) {
        JSONArray jSONArrayB = c0173b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void c(int i10) {
        this.f33699u = i10;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, com.mbridge.msdk.setting.b.C0173b c0173b) {
        ColorStateList colorStateList;
        JSONArray jSONArrayB = c0173b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        i0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = i0.a(contextD);
        int iA = i0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
                colorStateList = null;
            }
        } else {
            colorStateList = null;
        }
        int iA2 = v0.a(contextD, 1.0f);
        int iA3 = v0.a(contextD, 1.0f);
        int iA4 = v0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    public void b(int i10) {
        this.f33695q = i10;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f33684e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f33680a);
            feedBackButton.setEnabled(this.f33680a != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            feedBackButton.setVisibility(this.f33701w != 8 ? 0 : 8);
            this.f33684e = feedBackButton;
            CampaignEx campaignEx = this.f33682c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f33703y = i10;
        }
        if (i11 > -1) {
            this.f33704z = i11;
        }
        if (i12 > -1) {
            this.f33702x = i12;
        }
        if (i13 > -1) {
            this.f33687h = i13;
        }
        if (f11 > -1.0f) {
            this.f33686g = f11;
        }
        if (jSONArray != null) {
            this.l = jSONArray;
        }
        this.f33685f = str;
        this.f33681b = str2;
        this.f33680a = f10;
        this.f33697s = i14;
        b();
    }
}
