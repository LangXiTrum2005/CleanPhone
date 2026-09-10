package com.smartdigimkt.sdk.basead.ui.component.emdcardimprove;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.ScanningAnimButton;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public class SecondEndCardView extends RelativeLayout {
    RelativeLayout e0;
    RoundImageView f0;
    ImageView g0;
    TextView h0;
    TextView i0;
    ScanningAnimButton j0;
    com.smartdigimkt.a6.b.a k0;
    ObjectAnimator l0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = SecondEndCardView.this.g0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = SecondEndCardView.this.k0;
            if (aVar != null) {
                aVar.a(15, 36);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = SecondEndCardView.this.k0;
            if (aVar != null) {
                aVar.a(15, 37);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = SecondEndCardView.this.k0;
            if (aVar != null) {
                aVar.a(15, 38);
            }
        }
    }

    public class e implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38485a;

        public e(String str) {
            this.f38485a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            RoundImageView roundImageView;
            if (!TextUtils.equals(str, this.f38485a) || (roundImageView = SecondEndCardView.this.f0) == null) {
                return;
            }
            roundImageView.setImageBitmap(bitmap);
        }
    }

    public class f implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38487a;

        public f(String str) {
            this.f38487a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView;
            if (!TextUtils.equals(str, this.f38487a) || (imageView = SecondEndCardView.this.g0) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    public SecondEndCardView(Context context) {
        this(context, null);
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(getLayoutInflateID(), this);
        this.e0 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_second_ec_container", "id"));
        this.f0 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_second_ec_ad_icon", "id"));
        this.g0 = (ImageView) findViewById(h.a(getContext(), "myoffer_second_ec_ad_poster", "id"));
        if (com.smartdigimkt.n8.c.K(getContext()) == 2) {
            this.f0.setRadiusInDip(18);
        } else {
            this.f0.setRadiusInDip(24);
        }
        this.f0.setNeedRadiu(true);
        this.h0 = (TextView) findViewById(h.a(getContext(), "myoffer_second_ec_ad_title", "id"));
        this.i0 = (TextView) findViewById(h.a(getContext(), "myoffer_second_ec_ad_desc", "id"));
        this.j0 = (ScanningAnimButton) findViewById(h.a(getContext(), "myoffer_second_ec_cta", "id"));
        b();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.2f, 1.0f);
        this.l0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        if (this.g0 != null) {
            String strC = com.smartdigimkt.j5.a.a().c("ec_sec_poster");
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new a());
        }
    }

    public void addApkComplianceElements(boolean z2) {
        RelativeLayout relativeLayout;
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -2, 12);
        if (z2 || (relativeLayout = this.e0) == null) {
            addView(viewInflate, layoutParamsF);
        } else {
            relativeLayout.addView(viewInflate, layoutParamsF);
        }
    }

    public void addCloseView(View view, ViewGroup.LayoutParams layoutParams) {
        RelativeLayout relativeLayout = this.e0;
        if (relativeLayout != null) {
            relativeLayout.addView(view, layoutParams);
        } else {
            addView(view, layoutParams);
        }
    }

    public void b() {
        ScanningAnimButton scanningAnimButton = this.j0;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(new b());
        }
        RelativeLayout relativeLayout = this.e0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new c());
        }
        setOnClickListener(new d());
    }

    public int getLayoutInflateID() {
        return h.a(getContext(), "myoffer_endcard_improve_second_endcard", "layout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.l0;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.l0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void setAdDesc(String str) {
        if (this.i0 == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.i0.setText(str);
    }

    public void setAdIcon(String str) {
        if (this.f0 == null || TextUtils.isEmpty(str)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f0.getLayoutParams();
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, str), layoutParams.width, layoutParams.height, new e(str));
    }

    public void setAdPoster(String str) {
        if (this.g0 == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, str), new f(str));
    }

    public void setAdTitle(String str) {
        if (this.h0 == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.h0.setText(str);
    }

    public void setCTAText(String str) {
        if (this.j0 == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.j0.setText(str);
    }

    public void setSecondECClickListener(com.smartdigimkt.a6.b.a aVar) {
        this.k0 = aVar;
    }

    public SecondEndCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecondEndCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
