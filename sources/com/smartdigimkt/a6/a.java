package com.smartdigimkt.a6;

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
import com.smartdigimkt.sdk.basead.ui.RoundCornerRelativeLayout;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    View f33677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.w6.f<?> f33678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.v6.a f33679c;
    private com.smartdigimkt.w6.g d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FrameLayout f33680e;
    private View f;
    ImageView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    TextView f33681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    TextView f33682i;
    TextView j;
    TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    TextView f33683l;
    TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    RoundCornerRelativeLayout f33684n;
    ImageView o;

    /* JADX INFO: renamed from: com.smartdigimkt.a6.a$a, reason: collision with other inner class name */
    public class ViewTreeObserverOnGlobalLayoutListenerC0434a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View X;

        public ViewTreeObserverOnGlobalLayoutListenerC0434a(View view) {
            this.X = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.X.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int height = this.X.getHeight();
            int width = this.X.getWidth();
            int iA = com.smartdigimkt.n8.h.a(this.X.getContext(), 8.0f);
            ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
            layoutParams.height = iA;
            if (width <= 0 || height <= 0) {
                layoutParams.width = iA;
            } else {
                layoutParams.width = (iA * width) / height;
            }
            this.X.setLayoutParams(layoutParams);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), a.this.f33678b.Z());
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), a.this.f33678b.W());
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), a.this.f33678b.u());
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), a.this.f33679c.t.M0());
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class i implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: com.smartdigimkt.a6.a$i$a, reason: collision with other inner class name */
        public class RunnableC0435a implements Runnable {
            public RunnableC0435a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f33679c != null && a.this.f33678b.w0() && a.this.f33679c.j == 28) {
                    a.this.g.setBackgroundColor(Color.parseColor("#66999999"));
                }
            }
        }

        public i() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, a.this.f33678b.c())) {
                a.this.g.setScaleType(ImageView.ScaleType.FIT_XY);
                a.this.g.setImageBitmap(bitmap);
                a.this.g.setVisibility(0);
                a.this.g.post(new RunnableC0435a());
            }
        }
    }

    public class j implements View.OnClickListener {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: com.smartdigimkt.a6.a$j$a, reason: collision with other inner class name */
        public class C0436a implements com.smartdigimkt.k3.d.a {
            public C0436a() {
            }

            @Override // com.smartdigimkt.k3.d.a
            public void a() {
            }

            @Override // com.smartdigimkt.k3.d.a
            public void b() {
            }
        }

        public j(Context context) {
            this.X = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new com.smartdigimkt.k3.d().a(this.X, a.this.f33678b, a.this.f33679c, new C0436a());
        }
    }

    public a(com.smartdigimkt.w6.f<?> fVar, com.smartdigimkt.v6.a aVar) {
        this.f33678b = fVar;
        this.f33679c = aVar;
        if (fVar != null) {
            this.d = aVar.t;
        }
    }

    private boolean c(View view) {
        if (this.f33680e == null || view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.f33680e.removeAllViews();
        this.f33680e.addView(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0434a(view));
        return true;
    }

    public void d(View view) {
        this.f = view;
    }

    private void b(View view) {
        Context context = view.getContext();
        this.f33680e = (FrameLayout) view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_ad_logo_container", "id"));
        this.g = (ImageView) view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_ad_logo", "id"));
        this.f33684n = (RoundCornerRelativeLayout) view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_banner_ad_logo_container", "id"));
        this.o = (ImageView) view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.g == null) {
            this.g = (ImageView) view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_banner_self_ad_logo", "id"));
        }
        if (c(this.f)) {
            return;
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.g.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.g.setOnClickListener(new h());
            this.g.setImageResource(com.smartdigimkt.n8.h.a(context, "myoffer_ad_logo_default", k.d));
            if (!TextUtils.isEmpty(this.f33678b.c())) {
                int iA = com.smartdigimkt.n8.h.a(context, 100.0f);
                com.smartdigimkt.d7.b.a(context).a(new com.smartdigimkt.d7.e(3, this.f33678b.c()), iA, iA, new i());
            } else if (this.f33678b.d() != null) {
                Bitmap bitmapD = this.f33678b.d();
                float width = (bitmapD.getWidth() * 1.0f) / bitmapD.getHeight();
                ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                int i2 = layoutParams.height;
                layoutParams.width = (int) (i2 * width);
                layoutParams.height = i2;
                this.g.setLayoutParams(layoutParams);
                this.g.setScaleType(ImageView.ScaleType.FIT_XY);
                this.g.setImageBitmap(bitmapD);
                this.g.setImageBitmap(this.f33678b.d());
                this.g.setVisibility(0);
            } else if (this.f33678b.w0()) {
                this.g.setVisibility(4);
            }
        }
        if (this.f33684n != null) {
            com.smartdigimkt.w6.f<?> fVar = this.f33678b;
            if (fVar == null || TextUtils.isEmpty(fVar.z()) || this.o == null) {
                this.f33684n.setRadius(0);
                return;
            }
            this.f33684n.setRadius(2);
            this.o.setVisibility(0);
            this.g.setClickable(false);
            this.f33684n.setOnClickListener(new j(context));
        }
    }

    public void a(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        b(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_four_element_container", "id"));
        this.f33677a = viewGroup;
        if (viewGroup == null) {
            return;
        }
        this.f33681h = (TextView) viewGroup.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_publisher_name", "id"));
        this.j = (TextView) this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_privacy_agreement", "id"));
        this.k = (TextView) this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_permission_manage", "id"));
        this.f33682i = (TextView) this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_version_name", "id"));
        this.f33683l = (TextView) this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_function_manage", "id"));
        this.m = (TextView) this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_disclaimer", "id"));
        View viewFindViewById = view.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_four_element_container_bg", "id"));
        View viewFindViewById2 = this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_center_line1", "id"));
        if (viewFindViewById2 == null) {
            viewFindViewById2 = this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_banner_center_line", "id"));
        }
        View viewFindViewById3 = this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_center_line2", "id"));
        if (viewFindViewById3 == null) {
            viewFindViewById3 = this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_banner_center_line2", "id"));
        }
        View viewFindViewById4 = this.f33677a.findViewById(com.smartdigimkt.n8.h.a(context, "myoffer_center_line3", "id"));
        if (this.f33678b.q0()) {
            this.f33677a.setVisibility(0);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            TextView textView = this.f33681h;
            if (textView != null) {
                textView.setVisibility(0);
                this.f33681h.setText(this.f33678b.b0());
                this.f33681h.setOnClickListener(new b());
            }
            TextView textView2 = this.f33682i;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f33682i.setText(context.getResources().getString(com.smartdigimkt.n8.h.a(context, "myoffer_panel_version", k.f38992h), this.f33678b.h()));
                this.f33682i.setOnClickListener(new c());
            }
            if (this.j != null) {
                if (TextUtils.isEmpty(this.f33678b.Z())) {
                    this.j.setVisibility(8);
                } else {
                    this.j.setVisibility(0);
                    this.j.setOnClickListener(new d());
                }
            }
            if (this.k != null) {
                if (TextUtils.isEmpty(this.f33678b.W())) {
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(8);
                    }
                    this.k.setVisibility(8);
                } else {
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(0);
                    }
                    this.k.setVisibility(0);
                    this.k.setOnClickListener(new e());
                }
            }
            if (this.f33683l != null) {
                if (TextUtils.isEmpty(this.f33678b.u())) {
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setVisibility(8);
                    }
                    this.f33683l.setVisibility(8);
                } else {
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setVisibility(0);
                    }
                    this.f33683l.setVisibility(0);
                    this.f33683l.setOnClickListener(new f());
                }
            }
        } else {
            if (this.f33677a != null && !TextUtils.equals(String.valueOf(this.d.Z()), "2")) {
                this.f33677a.setVisibility(8);
            }
            TextView textView3 = this.f33682i;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f33681h;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.j;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.k;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.f33683l;
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
        if (this.m != null) {
            View view2 = this.f33677a;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            this.m.setVisibility(0);
            if (viewFindViewById4 != null && this.f33678b.q0()) {
                viewFindViewById4.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.f33679c.t.M0())) {
                return;
            }
            this.m.setOnClickListener(new g());
        }
    }

    public void a() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.f33677a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void a(TextView textView, String str) {
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
