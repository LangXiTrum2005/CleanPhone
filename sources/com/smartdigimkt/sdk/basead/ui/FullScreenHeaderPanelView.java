package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class FullScreenHeaderPanelView extends RelativeLayout {
    private View e0;
    private TextView f0;
    private TextView g0;
    private ScanningAnimButton h0;
    private RoundImageView i0;
    protected f j0;
    protected com.smartdigimkt.v6.a k0;
    protected g l0;
    protected c m0;
    private final View.OnClickListener n0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar;
            g gVar = FullScreenHeaderPanelView.this.l0;
            if (gVar != null) {
                if (gVar.T() != 1) {
                    c cVar2 = FullScreenHeaderPanelView.this.m0;
                    if (cVar2 != null) {
                        cVar2.a(1, 23);
                        return;
                    }
                    return;
                }
                if (FullScreenHeaderPanelView.this.h0 == null || view != FullScreenHeaderPanelView.this.h0 || (cVar = FullScreenHeaderPanelView.this.m0) == null) {
                    return;
                }
                cVar.a(1, 23);
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38355a;

        public b(String str) {
            this.f38355a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38355a)) {
                FullScreenHeaderPanelView.this.i0.setImageBitmap(bitmap);
            }
        }
    }

    public interface c {
        void a(int i2, int i3);
    }

    public FullScreenHeaderPanelView(Context context) {
        super(context);
        this.n0 = new a();
        b();
    }

    public void initSetting(f fVar, com.smartdigimkt.v6.a aVar, c cVar) {
        this.j0 = fVar;
        this.k0 = aVar;
        this.l0 = aVar.t;
        this.m0 = cVar;
        a();
    }

    private void a() {
        String strW = this.j0.w();
        if (TextUtils.isEmpty(strW)) {
            strW = this.j0.s();
        }
        if (TextUtils.isEmpty(strW)) {
            this.i0.setVisibility(8);
        } else {
            this.i0.setVisibility(0);
            int iA = h.a(getContext(), 42.0f);
            com.smartdigimkt.d7.b.a(getContext()).a(new e(1, strW), iA, iA, new b(strW));
        }
        if (this.h0 != null) {
            if (TextUtils.isEmpty(this.j0.n())) {
                this.h0.setText(i.a(getContext(), this.j0));
            } else {
                this.h0.setText(this.j0.n());
            }
            this.h0.startAnimation(this.k0.t.L());
        }
        if (TextUtils.isEmpty(this.j0.g0())) {
            this.f0.setVisibility(8);
        } else {
            this.f0.setVisibility(0);
            this.f0.setText(this.j0.g0());
        }
        if (TextUtils.isEmpty(this.j0.r())) {
            this.g0.setVisibility(8);
        } else {
            this.g0.setVisibility(0);
            this.g0.setText(this.j0.r());
        }
    }

    private void b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_full_screen_top_panel", "layout"), (ViewGroup) this, true);
        this.e0 = viewInflate;
        this.i0 = (RoundImageView) viewInflate.findViewById(h.a(getContext(), "myoffer_full_screen_top_banner_icon", "id"));
        this.h0 = (ScanningAnimButton) this.e0.findViewById(h.a(getContext(), "myoffer_full_screen_top_banner_cta", "id"));
        this.f0 = (TextView) this.e0.findViewById(h.a(getContext(), "myoffer_full_screen_top_banner_title", "id"));
        this.g0 = (TextView) this.e0.findViewById(h.a(getContext(), "myoffer_full_screen_top_banner_desc", "id"));
        RoundImageView roundImageView = this.i0;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.i0.setRadiusInDip(12);
        }
        ScanningAnimButton scanningAnimButton = this.h0;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(this.n0);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(h.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        setOnClickListener(this.n0);
    }

    public FullScreenHeaderPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n0 = new a();
        b();
    }

    public FullScreenHeaderPanelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n0 = new a();
        b();
    }
}
