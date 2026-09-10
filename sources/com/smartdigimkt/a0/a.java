package com.smartdigimkt.a0;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.expressad.widget.FeedbackRadioGroup;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    private static int r = -1;
    private static String s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.x.d f33578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FeedBackButton f33579c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33580e;
    private String j;
    private String k;
    private com.smartdigimkt.h3.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<f> f33585p;
    private int f = -1;
    private int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33581h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33582i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f33583l = 1.0f;
    private int m = v.a(com.smartdigimkt.m6.b.p().k(), 20.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33584n = r;
    private com.smartdigimkt.h3.b q = new C0427a();

    /* JADX INFO: renamed from: com.smartdigimkt.a0.a$a, reason: collision with other inner class name */
    public class C0427a implements com.smartdigimkt.h3.b {
        public C0427a() {
        }

        @Override // com.smartdigimkt.h3.b
        public void a() {
            a.this.o();
        }

        @Override // com.smartdigimkt.h3.b
        public void b() {
            a.this.n();
        }

        @Override // com.smartdigimkt.h3.b
        public void c() {
            a.this.m();
        }
    }

    public class b implements com.smartdigimkt.h3.b {
        public b() {
        }

        @Override // com.smartdigimkt.h3.b
        public void a() {
            a.this.o();
        }

        @Override // com.smartdigimkt.h3.b
        public void b() {
            a.this.n();
        }

        @Override // com.smartdigimkt.h3.b
        public void c() {
            a.this.m();
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (z2) {
                String unused = a.s = (String) compoundButton.getText();
            }
            if (a.this.o != null) {
                a.this.o.a(!TextUtils.isEmpty(a.s));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public a(String str) {
        this.f33585p = new ArrayList();
        this.f33577a = str;
        if (this.f33585p == null) {
            this.f33585p = new ArrayList();
        }
        d();
        e();
        c();
    }

    private void e() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextK);
                this.f33579c = feedBackButton;
                int i2 = 8;
                if (this.f33584n != 8) {
                    i2 = 0;
                }
                feedBackButton.setVisibility(i2);
                this.f33579c.setOnClickListener(new d());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<f> list = this.f33585p;
        if (list != null) {
            for (f fVar : list) {
                if (fVar != null) {
                    fVar.c();
                }
            }
        }
        s = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        List<f> list = this.f33585p;
        if (list != null) {
            for (f fVar : list) {
                if (fVar != null) {
                    fVar.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        List<f> list = this.f33585p;
        if (list != null) {
            for (f fVar : list) {
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        s = "";
    }

    public void f() {
        FeedBackButton feedBackButton = this.f33579c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f33579c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f33579c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f33579c);
            }
        }
        com.smartdigimkt.h3.c cVar = this.o;
        if (cVar != null) {
            cVar.a((com.smartdigimkt.h3.b) null);
        }
        this.o = null;
        this.f33585p = null;
        this.f33579c = null;
        this.q = null;
    }

    public void g() {
        com.smartdigimkt.h3.c cVar = this.o;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.o.cancel();
    }

    public com.smartdigimkt.x.d h() {
        return this.f33578b;
    }

    public FeedBackButton i() {
        if (this.f33579c == null) {
            e();
        }
        return this.f33579c;
    }

    public String j() {
        return this.f33577a;
    }

    public int k() {
        return this.f33580e;
    }

    public int l() {
        return this.d;
    }

    public void p() {
        Activity activityA = com.smartdigimkt.z.b.b().a(com.smartdigimkt.m6.b.p().k());
        com.smartdigimkt.h3.c cVar = this.o;
        if (cVar == null || cVar.getContext() != activityA) {
            c();
        }
        Context contextK = com.smartdigimkt.m6.b.p().k();
        FeedBackButton feedBackButton = this.f33579c;
        if (feedBackButton != null) {
            contextK = feedBackButton.getContext();
        }
        a(com.smartdigimkt.z.b.b().a(this.f33577a, contextK, this.o));
    }

    private void c() {
        try {
            if (com.smartdigimkt.z.b.b().a(com.smartdigimkt.m6.b.p().k()) != null) {
                com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
                if (aVarC == null) {
                    aVarC = com.smartdigimkt.n1.b.b().a();
                }
                com.smartdigimkt.n1.a.b bVarL = aVarC.L();
                if (bVarL == null) {
                    return;
                }
                d();
                this.o = new com.smartdigimkt.h3.c(com.smartdigimkt.z.b.b().a(com.smartdigimkt.m6.b.p().k()), this.q);
                FeedbackRadioGroup feedbackRadioGroupA = a(bVarL);
                this.o.a(bVarL.c());
                this.o.b(bVarL.a());
                this.o.c(bVarL.d());
                this.o.a(feedbackRadioGroupA);
                this.o.a(!TextUtils.isEmpty(s));
                a(feedbackRadioGroupA, bVarL);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void d() {
        if (this.q == null) {
            this.q = new b();
        }
    }

    public void b(f fVar) {
        List<f> list = this.f33585p;
        if (list != null) {
            list.remove(fVar);
        }
    }

    public static class f implements com.smartdigimkt.h3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.smartdigimkt.z.a f33589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33590b;

        public f(String str, com.smartdigimkt.z.a aVar) {
            this.f33589a = aVar;
            this.f33590b = str;
        }

        @Override // com.smartdigimkt.h3.b
        public void a() {
            com.smartdigimkt.z.b.f = false;
            com.smartdigimkt.z.a aVar = this.f33589a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.smartdigimkt.h3.b
        public void b() {
        }

        @Override // com.smartdigimkt.h3.b
        public void c() {
            com.smartdigimkt.z.b.f = false;
            com.smartdigimkt.z.a aVar = this.f33589a;
            if (aVar != null) {
                aVar.a(a.s);
            }
        }

        public void a(boolean z2) {
            com.smartdigimkt.z.b.f = true;
            com.smartdigimkt.z.a aVar = this.f33589a;
            if (aVar == null || !z2) {
                return;
            }
            aVar.a();
        }
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, com.smartdigimkt.n1.a.b bVar) {
        ColorStateList colorStateList;
        JSONArray jSONArrayB = bVar.b();
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextK == null) {
            return;
        }
        int iA = k.a(contextK, "sdm_cm_feedback_choice_btn_bg", k.d);
        Resources resourcesA = k.a(contextK);
        int iA2 = k.a(contextK, "sdm_cm_feedback_rb_text_color_color_list", "color");
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA2);
            } catch (Exception e2) {
                e2.printStackTrace();
                colorStateList = null;
            }
        } else {
            colorStateList = null;
        }
        int iA3 = v.a(contextK, 14.0f);
        int iA4 = v.a(contextK, 7.0f);
        int iA5 = v.a(contextK, 6.0f);
        for (int i2 = 0; i2 < jSONArrayB.length(); i2++) {
            String strOptString = jSONArrayB.optString(i2);
            RadioButton radioButton = new RadioButton(contextK);
            radioButton.setButtonDrawable((Drawable) null);
            radioButton.setBackgroundResource(iA);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setPadding(iA3, iA4, iA3, iA4);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
            int i3 = iA5 / 4;
            layoutParams.setMargins(iA5, i3, iA5, i3);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f33579c;
        if (feedBackButton != null) {
            int i2 = this.f;
            if (i2 > -1) {
                feedBackButton.setX(i2);
            }
            int i3 = this.g;
            if (i3 > -1) {
                this.f33579c.setY(i3);
            }
            float f2 = this.f33583l;
            if (f2 >= 0.0f) {
                this.f33579c.setAlpha(f2);
                this.f33579c.setEnabled(this.f33583l != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f33579c.getLayoutParams();
            int i4 = this.f33581h;
            if (i4 > 0) {
                this.f33579c.setWidth(i4);
                if (layoutParams != null) {
                    layoutParams.width = this.f33581h;
                }
            }
            int i5 = this.f33582i;
            if (i5 > 0) {
                this.f33579c.setHeight(i5);
                if (layoutParams != null) {
                    layoutParams.height = this.f33582i;
                }
            }
            if (layoutParams != null) {
                this.f33579c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.j)) {
                    this.f33579c.setTextColor(Color.parseColor(this.j));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i6 = this.m;
            if (i6 > 0) {
                gradientDrawable.setCornerRadius(i6);
            }
            if (!TextUtils.isEmpty(this.k)) {
                gradientDrawable.setColor(Color.parseColor(this.k));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            try {
                this.f33579c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    public void c(int i2) {
        this.f33584n = i2;
        FeedBackButton feedBackButton = this.f33579c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i2);
        }
    }

    private FeedbackRadioGroup a(com.smartdigimkt.n1.a.b bVar) {
        JSONArray jSONArrayB = bVar.b();
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextK == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextK);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void b(int i2) {
        this.d = i2;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new c());
        }
    }

    public void a(f fVar) {
        if (this.f33585p == null) {
            this.f33585p = new ArrayList();
        }
        this.f33585p.add(fVar);
    }

    private void a(boolean z2) {
        List<f> list = this.f33585p;
        if (list != null) {
            for (f fVar : list) {
                if (fVar != null) {
                    fVar.a(z2);
                }
            }
        }
    }

    public void a(int i2, int i3, int i4, int i5, int i6, float f2, String str, String str2) {
        this.f = i2;
        this.g = i3;
        this.f33581h = i4;
        this.f33582i = i5;
        this.j = str;
        this.k = str2;
        this.f33583l = f2;
        this.m = i6;
        b();
    }

    public void a(com.smartdigimkt.x.d dVar) {
        this.f33578b = dVar;
    }

    public void a(int i2) {
        this.f33580e = i2;
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f33579c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f33583l);
            feedBackButton.setEnabled(this.f33583l != 0.0f);
            feedBackButton.setVisibility(this.f33584n != 8 ? 0 : 8);
            this.f33579c = feedBackButton;
            com.smartdigimkt.x.d dVar = this.f33578b;
            if (dVar != null && !dVar.H2()) {
                b();
            }
            feedBackButton.setOnClickListener(new e());
        }
    }
}
