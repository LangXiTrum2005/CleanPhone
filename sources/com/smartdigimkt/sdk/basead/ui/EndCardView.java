package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class EndCardView extends BaseEndCardView {
    private int j0;
    private int k0;
    private ImageView l0;
    private ImageView m0;
    private TextView n0;
    private Bitmap o0;
    private final View.OnClickListener p0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseEndCardView.a aVar;
            g gVar = EndCardView.this.h0;
            if (gVar != null) {
                if (gVar.T() == 0) {
                    int i2 = view != EndCardView.this.n0 ? 7 : 6;
                    BaseEndCardView.a aVar2 = EndCardView.this.mListener;
                    if (aVar2 != null) {
                        aVar2.a(i2);
                        return;
                    }
                    return;
                }
                if (EndCardView.this.n0 == null || view != EndCardView.this.n0 || EndCardView.this.n0.getVisibility() != 0 || (aVar = EndCardView.this.mListener) == null) {
                    return;
                }
                aVar.a(6);
            }
        }
    }

    public class c implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38347b;

        public c(String str, int i2) {
            this.f38346a = str;
            this.f38347b = i2;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38346a)) {
                float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                int i2 = this.f38347b;
                ViewGroup.LayoutParams layoutParams = EndCardView.this.m0.getLayoutParams();
                layoutParams.width = (int) (i2 * width);
                layoutParams.height = i2;
                EndCardView.this.m0.setLayoutParams(layoutParams);
                EndCardView.this.m0.setScaleType(ImageView.ScaleType.FIT_XY);
                EndCardView.this.m0.setImageBitmap(bitmap);
            }
        }
    }

    public EndCardView(Context context, f fVar, com.smartdigimkt.v6.a aVar) {
        super(context, fVar, aVar);
        this.p0 = new a();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView
    public void a() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView
    public Drawable getBgDrawable() {
        Bitmap bitmap = this.o0;
        return (bitmap == null || bitmap.isRecycled()) ? super.getBgDrawable() : new BitmapDrawable(this.o0);
    }

    public View getLearnMoreButton() {
        return this.n0;
    }

    public void init(boolean z2, boolean z3, BaseEndCardView.a aVar) {
        setId(h.a(getContext(), "myoffer_end_card_id", "id"));
        this.mListener = aVar;
        this.l0 = new RoundImageView(getContext());
        addView(this.l0, new RelativeLayout.LayoutParams(-1, -1));
        if (z2) {
            a(this.f0);
        }
        if (z3) {
            b();
        }
        if (this.f0.w0()) {
            return;
        }
        setOnClickListener(this.p0);
    }

    public void load() {
        b(this.f0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setSize(int i2, int i3) {
        this.j0 = i2;
        this.k0 = i3;
    }

    private void b(f fVar) {
        try {
            com.smartdigimkt.d7.b.a(getContext()).a(new e(1, fVar.s()), this.j0, this.k0, new b(fVar));
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f38343a;

        public b(f fVar) {
            this.f38343a = fVar;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38343a.s())) {
                EndCardView.this.l0.setImageBitmap(bitmap);
                com.smartdigimkt.o8.b.a(EndCardView.this.getContext(), bitmap, new a());
            }
        }

        public class a implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                EndCardView.this.o0 = bitmap;
                EndCardView.this.setBackgroundDrawable(new BitmapDrawable(EndCardView.this.o0));
                BaseEndCardView.a aVar = EndCardView.this.mListener;
                if (aVar != null) {
                    aVar.b();
                }
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
                BaseEndCardView.a aVar = EndCardView.this.mListener;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
            BaseEndCardView.a aVar = EndCardView.this.mListener;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    private void a(f fVar) {
        this.m0 = new RoundImageView(getContext());
        int iA = h.a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, iA);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.m0, layoutParams);
        String strC = fVar.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.m0.getLayoutParams();
        com.smartdigimkt.d7.b.a(getContext()).a(new e(1, strC), layoutParams2.width, layoutParams2.height, new c(strC, iA));
    }

    private void b() {
        ScanningAnimButton scanningAnimButton = new ScanningAnimButton(getContext());
        this.n0 = scanningAnimButton;
        scanningAnimButton.setText(h.a(getContext(), "myoffer_cta_learn_more", k.f38992h));
        this.n0.setTextColor(Color.parseColor("#ffffffff"));
        this.n0.setTextSize(14.0f);
        this.n0.setGravity(17);
        this.n0.setBackgroundResource(h.a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", k.d));
        if (!this.f0.w0()) {
            this.n0.setOnClickListener(this.p0);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, h.a(getContext(), 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = h.a(getContext(), 96.0f);
        layoutParams.leftMargin = h.a(getContext(), 24.0f);
        layoutParams.rightMargin = h.a(getContext(), 24.0f);
        addView(this.n0, layoutParams);
    }
}
