package com.thinkup.core.common.inner.ui.oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.basead.m.o0;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.om0;
import com.thinkup.core.common.res.oo;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    ImageView m;
    TextView m0;
    private final ooo<?> mm;
    private final oom mn;
    ImageView mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    TextView f41857n;
    private oon n0;
    private View nm;
    private FrameLayout no;
    View o;
    TextView o0;
    TextView om;
    TextView on;
    TextView oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.oo.o$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.oo.o$8, reason: invalid class name */
    public class AnonymousClass8 implements com.thinkup.core.common.res.m.o {
        public AnonymousClass8() {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, o.this.mm.nn())) {
                o.this.m.setScaleType(ImageView.ScaleType.FIT_XY);
                o.this.m.setImageBitmap(bitmap);
                o.this.m.setVisibility(0);
                o.this.m.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.oo.o.8.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (o.this.mn != null && o.this.mm.onn() && o.this.mn.mm == 28) {
                            o.this.m.setBackgroundColor(Color.parseColor("#66999999"));
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.oo.o$9, reason: invalid class name */
    public class AnonymousClass9 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View o;

        public AnonymousClass9(View view) {
            this.o = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.o.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int height = this.o.getHeight();
            int width = this.o.getWidth();
            int iO = o00.o(this.o.getContext(), 8.0f);
            ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
            layoutParams.height = iO;
            if (width <= 0 || height <= 0) {
                layoutParams.width = iO;
            } else {
                layoutParams.width = (iO * width) / height;
            }
            this.o.setLayoutParams(layoutParams);
        }
    }

    public o(ooo<?> oooVar, oom oomVar) {
        this.mm = oooVar;
        this.mn = oomVar;
        if (oooVar != null) {
            this.n0 = oomVar.oo0;
        }
    }

    private void n(View view) {
        Context context = view.getContext();
        this.no = (FrameLayout) view.findViewById(o00.o(context, "myoffer_ad_logo_container", "id"));
        this.m = (ImageView) view.findViewById(o00.o(context, "myoffer_ad_logo", "id"));
        this.mo = (ImageView) view.findViewById(o00.o(context, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.m == null) {
            this.m = (ImageView) view.findViewById(o00.o(context, "myoffer_banner_self_ad_logo", "id"));
        }
        View view2 = this.nm;
        if (this.no != null && view2 != null && view2.getVisibility() == 0) {
            if (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.no.removeAllViews();
            this.no.addView(view2);
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass9(view2));
            return;
        }
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.m.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.m.setOnClickListener(new AnonymousClass7());
            this.m.setImageResource(o00.o(context, "myoffer_ad_logo_default", k.d));
            if (!TextUtils.isEmpty(this.mm.nn())) {
                int iO = o00.o(context, 100.0f);
                com.thinkup.core.common.res.m.o(context).o(new oo(3, this.mm.nn()), iO, iO, new AnonymousClass8());
                return;
            }
            if (this.mm.ono() == null) {
                if (this.mm.onn()) {
                    this.m.setVisibility(4);
                    return;
                }
                return;
            }
            Bitmap bitmapOno = this.mm.ono();
            float width = (bitmapOno.getWidth() * 1.0f) / bitmapOno.getHeight();
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            int i2 = layoutParams.height;
            layoutParams.width = (int) (i2 * width);
            layoutParams.height = i2;
            this.m.setLayoutParams(layoutParams);
            this.m.setScaleType(ImageView.ScaleType.FIT_XY);
            this.m.setImageBitmap(bitmapOno);
            this.m.setImageBitmap(this.mm.ono());
            this.m.setVisibility(0);
        }
    }

    private boolean o0(View view) {
        if (this.no == null || view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.no.removeAllViews();
        this.no.addView(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass9(view));
        return true;
    }

    public final void m(View view) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        this.no = (FrameLayout) view.findViewById(o00.o(context2, "myoffer_ad_logo_container", "id"));
        this.m = (ImageView) view.findViewById(o00.o(context2, "myoffer_ad_logo", "id"));
        this.mo = (ImageView) view.findViewById(o00.o(context2, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.m == null) {
            this.m = (ImageView) view.findViewById(o00.o(context2, "myoffer_banner_self_ad_logo", "id"));
        }
        View view2 = this.nm;
        if (this.no == null || view2 == null || view2.getVisibility() != 0) {
            ImageView imageView = this.m;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.m.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.m.setOnClickListener(new AnonymousClass7());
                this.m.setImageResource(o00.o(context2, "myoffer_ad_logo_default", k.d));
                if (!TextUtils.isEmpty(this.mm.nn())) {
                    int iO = o00.o(context2, 100.0f);
                    com.thinkup.core.common.res.m.o(context2).o(new oo(3, this.mm.nn()), iO, iO, new AnonymousClass8());
                } else if (this.mm.ono() != null) {
                    Bitmap bitmapOno = this.mm.ono();
                    float width = (bitmapOno.getWidth() * 1.0f) / bitmapOno.getHeight();
                    ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
                    int i2 = layoutParams.height;
                    layoutParams.width = (int) (i2 * width);
                    layoutParams.height = i2;
                    this.m.setLayoutParams(layoutParams);
                    this.m.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.m.setImageBitmap(bitmapOno);
                    this.m.setImageBitmap(this.mm.ono());
                    this.m.setVisibility(0);
                } else if (this.mm.onn()) {
                    this.m.setVisibility(4);
                }
            }
        } else {
            if (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.no.removeAllViews();
            this.no.addView(view2);
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass9(view2));
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(o00.o(context, "myoffer_four_element_container", "id"));
        this.o = viewGroup;
        if (viewGroup == null) {
            return;
        }
        this.f41857n = (TextView) viewGroup.findViewById(o00.o(context, "myoffer_publisher_name", "id"));
        this.oo = (TextView) this.o.findViewById(o00.o(context, "myoffer_privacy_agreement", "id"));
        this.om = (TextView) this.o.findViewById(o00.o(context, "myoffer_permission_manage", "id"));
        this.o0 = (TextView) this.o.findViewById(o00.o(context, "myoffer_version_name", "id"));
        this.on = (TextView) this.o.findViewById(o00.o(context, "myoffer_function_manage", "id"));
        this.m0 = (TextView) this.o.findViewById(o00.o(context, "myoffer_disclaimer", "id"));
        View viewFindViewById = view.findViewById(o00.o(context, "myoffer_four_element_container_bg", "id"));
        View viewFindViewById2 = this.o.findViewById(o00.o(context, "myoffer_center_line1", "id"));
        if (viewFindViewById2 == null) {
            viewFindViewById2 = this.o.findViewById(o00.o(context, "myoffer_banner_center_line", "id"));
        }
        View viewFindViewById3 = this.o.findViewById(o00.o(context, "myoffer_center_line2", "id"));
        if (viewFindViewById3 == null) {
            viewFindViewById3 = this.o.findViewById(o00.o(context, "myoffer_banner_center_line2", "id"));
        }
        View viewFindViewById4 = this.o.findViewById(o00.o(context, "myoffer_center_line3", "id"));
        if (this.mm.onm()) {
            this.o.setVisibility(0);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            TextView textView = this.f41857n;
            if (textView != null) {
                textView.setVisibility(0);
                this.f41857n.setText(this.mm.om0());
                this.f41857n.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.oo.o.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            TextView textView2 = this.o0;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.o0.setText(context.getResources().getString(o00.o(context, "myoffer_panel_version", k.f38992h), this.mm.omo()));
                this.o0.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.oo.o.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            if (this.oo != null) {
                if (TextUtils.isEmpty(this.mm.omm())) {
                    this.oo.setVisibility(8);
                } else {
                    this.oo.setVisibility(0);
                    this.oo.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.oo.o.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            om0.o(o0n.m().on(), o.this.mm.omm());
                        }
                    });
                }
            }
            if (this.om != null) {
                if (TextUtils.isEmpty(this.mm.omn())) {
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(8);
                    }
                    this.om.setVisibility(8);
                } else {
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(0);
                    }
                    this.om.setVisibility(0);
                    this.om.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.oo.o.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            om0.o(o0n.m().on(), o.this.mm.omn());
                        }
                    });
                }
            }
            if (this.on != null) {
                if (TextUtils.isEmpty(this.mm.m())) {
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setVisibility(8);
                    }
                    this.on.setVisibility(8);
                } else {
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setVisibility(0);
                    }
                    this.on.setVisibility(0);
                    this.on.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.oo.o.5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            om0.o(o0n.m().on(), o.this.mm.m());
                        }
                    });
                }
            }
        } else {
            if (this.o != null && !TextUtils.equals(String.valueOf(this.n0.nm()), "2")) {
                this.o.setVisibility(8);
            }
            TextView textView3 = this.o0;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f41857n;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.oo;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.om;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.on;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(8);
            }
            if (viewFindViewById != null) {
                try {
                    viewFindViewById.setBackground(null);
                } catch (Throwable unused) {
                }
            }
        }
        if (this.m0 != null) {
            View view3 = this.o;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            this.m0.setVisibility(0);
            if (viewFindViewById4 != null && this.mm.onm()) {
                viewFindViewById4.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.mn.oo0.mom())) {
                return;
            }
            this.m0.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.oo.o.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    om0.o(o0n.m().on(), o.this.mn.oo0.mom());
                }
            });
        }
    }

    public final void o(View view) {
        this.nm = view;
    }

    private void o() {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.o;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void o(BaseAd baseAd, o0 o0Var) {
        o(baseAd, o0Var, false);
    }

    public final void o(BaseAd baseAd, o0 o0Var, boolean z2) {
        oom oomVar = this.mn;
        if (oomVar == null || baseAd == null || o0Var == null || this.o == null || oomVar.mm != 34) {
            return;
        }
        String domain = baseAd.getDomain();
        String warning = baseAd.getWarning();
        String adFrom = baseAd.getAdFrom();
        if (TextUtils.isEmpty(domain) && TextUtils.isEmpty(warning) && TextUtils.isEmpty(adFrom)) {
            return;
        }
        this.o.setVisibility(0);
        if (z2 && this.o0 != null && !TextUtils.isEmpty(adFrom)) {
            o(this.o0, adFrom);
            o0Var.om(this.o0);
        }
        if (this.om != null && !TextUtils.isEmpty(domain)) {
            o(this.om, domain);
            o0Var.on(this.om);
        }
        if (this.on == null || TextUtils.isEmpty(warning)) {
            return;
        }
        o(this.on, warning);
        o0Var.m0(this.on);
    }

    private static void o(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }
}
