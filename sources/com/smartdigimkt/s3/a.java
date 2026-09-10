package com.smartdigimkt.s3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CTAButtonLayout f38167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ImageView f38168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    View f38169c;
    View d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Context f38170e;
    ValueAnimator f;
    boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f38171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f38172i;
    int j;

    /* JADX INFO: renamed from: com.smartdigimkt.s3.a$a, reason: collision with other inner class name */
    public class C0580a implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38173a;

        public C0580a(Context context) {
            this.f38173a = context;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            Context context;
            View viewFindViewById;
            View view = a.this.f38169c;
            if (view == null || (context = this.f38173a) == null || (viewFindViewById = view.findViewById(h.a(context, "myoffer_letter_top", "id"))) == null) {
                return;
            }
            viewFindViewById.setBackground(new BitmapDrawable(this.f38173a.getResources(), bitmap));
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38175a;

        public b(Context context) {
            this.f38175a = context;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = a.this.f38168b;
            if (imageView == null || this.f38175a == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    public class c implements com.smartdigimkt.a6.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a6.b.a f38177a;

        public c(com.smartdigimkt.a6.b.a aVar) {
            this.f38177a = aVar;
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            com.smartdigimkt.a6.b.a aVar = this.f38177a;
            if (aVar != null) {
                aVar.a(i2, i3);
            }
        }
    }

    public class d implements View.OnClickListener {
        final /* synthetic */ com.smartdigimkt.a6.b.a X;

        public d(com.smartdigimkt.a6.b.a aVar) {
            this.X = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = this.X;
            if (aVar != null) {
                aVar.a(1, 1);
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ View X;

        /* JADX INFO: renamed from: com.smartdigimkt.s3.a$e$a, reason: collision with other inner class name */
        public class C0581a implements ValueAnimator.AnimatorUpdateListener {
            public C0581a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double dPow = Math.pow(((valueAnimator.getDuration() * 2) - valueAnimator.getCurrentPlayTime()) / (valueAnimator.getDuration() * 2.0f), 2.0d) * Math.sin(Math.toRadians(fFloatValue));
                e eVar = e.this;
                eVar.X.setTranslationY(-((float) (((double) a.this.j) * dPow)));
            }
        }

        public e(View view) {
            this.X = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f = ValueAnimator.ofFloat(0.0f, 720.0f);
            a.this.f.setDuration(2000L);
            a.this.f.addUpdateListener(new C0581a());
            if (a.this.f.isStarted()) {
                return;
            }
            a.this.f.start();
        }
    }

    public a(Context context) {
        this.f38170e = context;
        this.f38169c = LayoutInflater.from(context).inflate(h.a(context, "myoffer_letter_top_layout", "layout"), (ViewGroup) null);
        View view = new View(context);
        this.d = view;
        view.setBackgroundResource(h.a(context, "myoffer_letter_bottom", k.d));
        this.f38167a = (CTAButtonLayout) this.f38169c.findViewById(h.a(context, "myoffer_panel_cta_layout", "id"));
        this.f38168b = (ImageView) this.f38169c.findViewById(h.a(context, "myoffer_letter_icon", "id"));
        String strC = com.smartdigimkt.j5.a.a().c("letter_bg");
        String strC2 = com.smartdigimkt.j5.a.a().c("letter_icon");
        if (!TextUtils.isEmpty(strC)) {
            com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new C0580a(context));
        }
        if (TextUtils.isEmpty(strC2)) {
            return;
        }
        com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC2), new b(context));
    }

    public void a(RelativeLayout relativeLayout, int i2) {
        ViewGroup.LayoutParams layoutParamsG = Z.g(-1, -2, 8, i2);
        this.f38169c.setLayoutParams(layoutParamsG);
        relativeLayout.addView(this.f38169c, layoutParamsG);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.f38169c.getId());
        layoutParams.addRule(5, this.f38169c.getId());
        layoutParams.addRule(7, this.f38169c.getId());
        relativeLayout.addView(this.d, 0, layoutParams);
    }

    public View b() {
        return this.f38167a;
    }

    public int c() {
        return this.j;
    }

    public int d() {
        return this.f38172i;
    }

    public void a(f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.a6.b.a aVar2) {
        if (!TextUtils.isEmpty(fVar.k())) {
            this.f38167a.initSetting(fVar, aVar, false, new c(aVar2));
            this.f38167a.setOnClickListener(new d(aVar2));
            this.f38168b.setVisibility(8);
            this.f38167a.setVisibility(0);
        } else {
            this.f38167a.setVisibility(8);
            this.f38168b.setVisibility(0);
        }
        new com.smartdigimkt.a6.a(fVar, aVar).a(this.f38169c);
    }

    public void a(int i2) {
        this.f38172i = (i2 * 111) / 300;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f38169c.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = this.f38172i;
        this.f38169c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.width = i2;
        layoutParams2.height = (layoutParams.height * 200) / 111;
        this.d.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f38167a.getLayoutParams();
        layoutParams3.height = (layoutParams.height * 48) / 126;
        layoutParams3.bottomMargin = (this.f38172i / 129) * 35;
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f38168b.getLayoutParams();
        int i3 = this.f38172i;
        layoutParams4.bottomMargin = (i3 / 129) * 35;
        this.j = i3 / 3;
    }

    public void a(View view) {
        if (this.g || this.f38171h) {
            return;
        }
        this.g = true;
        view.postDelayed(new e(view), 2000L);
    }

    public void a() {
        this.f38171h = true;
        try {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f.cancel();
        } catch (Throwable unused) {
        }
    }
}
