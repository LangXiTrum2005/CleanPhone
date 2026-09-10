package com.smartdigimkt.a6;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static final int m = -100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f33696n = -101;
    public static final int o = -102;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.w6.f<?> f33697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f33698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33699c;
    private View d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f33700e;
    private View f;
    private View g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f33701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f33702i;
    private View j;
    private View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.smartdigimkt.y5.a f33703l;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (d.this.f33703l != null) {
                d.this.f33703l.a(10, 14);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (d.this.f33703l != null) {
                d.this.f33703l.a(10, 14);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f33702i != null) {
                d.this.f33702i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.a6.d$d, reason: collision with other inner class name */
    public class RunnableC0437d implements Runnable {
        public RunnableC0437d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f33702i != null) {
                d.this.f33702i.setVisibility(0);
            }
        }
    }

    public d(com.smartdigimkt.w6.f<?> fVar, g gVar) {
        this.f33697a = fVar;
        this.f33698b = gVar;
    }

    private void b(Context context) {
        if (this.f == null) {
            this.f = this.d.findViewById(h.a(context, "myoffer_splash_ad_cta_layout", "id"));
        }
        if (this.g == null) {
            this.g = this.d.findViewById(h.a(context, "myoffer_shake_view", "id"));
        }
        if (BaseSdkSplashATView.isSinglePicture(this.f33697a, this.f33698b)) {
            this.f33702i.setPadding(0, a(context, 26.0f), 0, 0);
            a(context, this.f, 100.0f);
            a(context, this.g, 100.0f);
        } else if (this.f33698b.D1() == 2) {
            this.f33702i.setPadding(0, 0, 0, 0);
            View view = this.j;
            if (view != null && view.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
                layoutParams.height = a(context, 46.0f);
                this.j.setLayoutParams(layoutParams);
                this.j.setPadding(a(context, 31.0f), a(context, 13.0f), a(context, 33.0f), a(context, 13.0f));
                this.j.setBackgroundResource(h.a(context, "myoffer_invalid_button_shape_radius_24", k.d));
            }
            View view2 = this.k;
            if (view2 != null && view2.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams2 = this.k.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams3.addRule(0, h.a(context, "myoffer_fl_invalid_btn", "id"));
                    layoutParams3.rightMargin = a(context, 10.0f);
                    this.k.setLayoutParams(layoutParams3);
                }
                this.k.setPadding(0, 0, 0, 0);
            }
        } else {
            this.f33702i.setPadding(0, a(context, 26.0f), 0, 0);
            View view3 = this.f33700e;
            if (view3 != null) {
                view3.setPadding(0, a(context, 25.0f), 0, 0);
            }
        }
        this.f33702i.setVisibility(0);
        a(false);
    }

    public d a(int i2) {
        this.f33699c = i2;
        return this;
    }

    public d a(com.smartdigimkt.y5.a aVar) {
        this.f33703l = aVar;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x021c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0225  */
    /* JADX WARN: Code duplicated, block: B:80:0x0256  */
    /* JADX WARN: Code duplicated, block: B:82:0x0262  */
    public void a(Context context, View view) {
        g gVar;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        boolean z2;
        this.d = view;
        if (view == null || this.f33697a == null || (gVar = this.f33698b) == null || !gVar.c()) {
            return;
        }
        if ((TextUtils.equals(String.valueOf(this.f33698b.Z()), "4") || TextUtils.equals(String.valueOf(this.f33698b.Z()), "3") || TextUtils.equals(String.valueOf(this.f33698b.Z()), "1")) && this.f33698b.K() != 1) {
            return;
        }
        a(context);
        if (this.f33702i == null) {
            return;
        }
        if (TextUtils.equals(String.valueOf(this.f33698b.Z()), "4")) {
            b(context);
            return;
        }
        int i2 = this.f33699c;
        if (i2 != -101) {
            switch (i2) {
                case 1:
                case 5:
                    this.f33702i.setPadding(0, a(context, 26.0f), 0, 0);
                    if (!TextUtils.isEmpty(this.f33697a.w())) {
                        a(context, this.f, 84.0f);
                        a(context, this.g, 138.0f);
                    }
                    z2 = false;
                    break;
                case 2:
                case 6:
                    this.f33702i.setPadding(0, a(context, 10.0f), 0, 0);
                    if (!TextUtils.isEmpty(this.f33697a.w())) {
                        a(context, this.f33701h, 144.0f);
                        a(context, this.f, 54.0f);
                        a(context, this.g, 108.0f);
                    }
                    z2 = false;
                    break;
                case 3:
                case 4:
                case 7:
                    if (com.smartdigimkt.n8.c.I(context)) {
                        View view3 = this.j;
                        if (view3 != null && view3.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
                            layoutParams2.width = a(context, 80.0f);
                            layoutParams2.height = a(context, 48.0f);
                            this.j.setLayoutParams(layoutParams2);
                            this.j.setPadding(a(context, 34.0f), a(context, 14.0f), a(context, 34.0f), a(context, 14.0f));
                            this.j.setBackgroundResource(h.a(context, "myoffer_invalid_button_shape_radius_24", k.d));
                        }
                        z2 = true;
                    } else {
                        this.f33702i.setPadding(0, a(context, 10.0f), 0, 0);
                        z2 = false;
                    }
                    break;
                case 8:
                    if (!com.smartdigimkt.n8.c.I(context)) {
                        this.f33702i.setPadding(0, a(context, 26.0f), 0, 0);
                        a(context, this.f, 100.0f);
                        a(context, this.g, 152.0f);
                        if (this.f33699c == -101) {
                            a(context, this.f33702i, 35.0f);
                        }
                    } else {
                        this.f33702i.setPadding(0, 0, 0, 0);
                        view2 = this.j;
                        if (view2 != null) {
                            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                            layoutParams3.height = a(context, 48.0f);
                            this.j.setLayoutParams(layoutParams3);
                            this.j.setPadding(a(context, 34.0f), a(context, 14.0f), a(context, 34.0f), a(context, 14.0f));
                            this.j.setBackgroundResource(h.a(context, "myoffer_invalid_button_shape_radius_24", k.d));
                        }
                        if (this.f33699c == -101) {
                            layoutParams = this.f33702i.getLayoutParams();
                            layoutParams.width = -2;
                            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
                                layoutParams4.addRule(11);
                                layoutParams4.rightMargin = a(context, 20.0f);
                                layoutParams4.bottomMargin = a(context, 30.0f);
                            }
                            this.f33702i.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = false;
                    break;
                default:
                    if (!com.smartdigimkt.n8.c.I(context)) {
                        this.f33702i.setPadding(0, a(context, 26.0f), 0, 0);
                        View view4 = this.f33700e;
                        if (view4 != null) {
                            view4.setPadding(0, 0, 0, 0);
                        }
                        b(context, this.f33701h, 14.0f);
                        b(context, this.f, 92.0f);
                        if (this.f33699c == -100) {
                            a(context, this.f33702i, 44.0f);
                        }
                    } else {
                        this.f33702i.setPadding(0, 0, 0, 0);
                        View view5 = this.j;
                        if (view5 != null) {
                            ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                            layoutParams5.height = a(context, 48.0f);
                            this.j.setLayoutParams(layoutParams5);
                            this.j.setPadding(a(context, 34.0f), a(context, 14.0f), a(context, 34.0f), a(context, 14.0f));
                            this.j.setBackgroundResource(h.a(context, "myoffer_invalid_button_shape_radius_24", k.d));
                        }
                        View view6 = this.k;
                        if (view6 != null && view6.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams6 = this.k.getLayoutParams();
                            if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                                layoutParams7.addRule(0, h.a(context, "myoffer_fl_invalid_btn", "id"));
                                this.k.setLayoutParams(layoutParams7);
                            }
                        }
                        if (this.f33699c == -100) {
                            ViewGroup.LayoutParams layoutParams8 = this.f33702i.getLayoutParams();
                            layoutParams8.width = -2;
                            if (layoutParams8 instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                                layoutParams9.addRule(11);
                                layoutParams9.rightMargin = a(context, 20.0f);
                                layoutParams9.bottomMargin = a(context, 30.0f);
                            }
                            this.f33702i.setLayoutParams(layoutParams8);
                        }
                    }
                    z2 = false;
                    break;
            }
        } else {
            if (!com.smartdigimkt.n8.c.I(context)) {
                this.f33702i.setPadding(0, a(context, 26.0f), 0, 0);
                a(context, this.f, 100.0f);
                a(context, this.g, 152.0f);
                if (this.f33699c == -101) {
                    a(context, this.f33702i, 35.0f);
                }
            } else {
                this.f33702i.setPadding(0, 0, 0, 0);
                view2 = this.j;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams10 = view2.getLayoutParams();
                    layoutParams10.height = a(context, 48.0f);
                    this.j.setLayoutParams(layoutParams10);
                    this.j.setPadding(a(context, 34.0f), a(context, 14.0f), a(context, 34.0f), a(context, 14.0f));
                    this.j.setBackgroundResource(h.a(context, "myoffer_invalid_button_shape_radius_24", k.d));
                }
                if (this.f33699c == -101) {
                    layoutParams = this.f33702i.getLayoutParams();
                    layoutParams.width = -2;
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams11.addRule(11);
                        layoutParams11.rightMargin = a(context, 20.0f);
                        layoutParams11.bottomMargin = a(context, 30.0f);
                    }
                    this.f33702i.setLayoutParams(layoutParams);
                }
            }
            z2 = false;
        }
        this.f33702i.setVisibility(0);
        a(z2);
    }

    private void b(Context context, View view, float f) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = a(context, f);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = a(context, f);
        }
    }

    public void b() {
        com.smartdigimkt.l7.b.a().e(new RunnableC0437d());
    }

    private void a(Context context) {
        View viewFindViewById = this.d.findViewById(h.a(context, "myoffer_include_invalid_button_full_screen", "id"));
        this.f33702i = viewFindViewById;
        if (viewFindViewById == null) {
            this.f33702i = this.d.findViewById(h.a(context, "myoffer_fl_invalid_btn", "id"));
        }
        this.f33700e = this.d.findViewById(h.a(context, "myoffer_splash_ad_bottom_container", "id"));
        this.f33701h = this.d.findViewById(h.a(context, "myoffer_ll_top_content", "id"));
        this.f = this.d.findViewById(h.a(context, "myoffer_panel_cta_layout", "id"));
        this.g = this.d.findViewById(h.a(context, "myoffer_shake_hint_text", "id"));
        this.k = this.d.findViewById(h.a(context, "myoffer_ll_title_desc_container", "id"));
        View view = this.f33702i;
        if (view != null) {
            this.j = view.findViewById(h.a(context, "myoffer_invalid_btn", "id"));
        }
    }

    private void a(boolean z2) {
        View view;
        if (z2 && (view = this.j) != null) {
            view.setOnClickListener(new a());
            return;
        }
        View view2 = this.f33702i;
        if (view2 == null) {
            return;
        }
        view2.setOnClickListener(new b());
    }

    private void a(Context context, View view, float f) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = a(context, f);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = a(context, f);
        }
    }

    private int a(Context context, float f) {
        return h.a(context, f);
    }

    public void a() {
        com.smartdigimkt.l7.b.a().e(new c());
    }
}
