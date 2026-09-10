package com.thinkup.core.common.inner.ui;

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
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.on;
import com.thinkup.core.common.res.m;
import com.thinkup.core.common.res.oo;
import com.thinkup.core.common.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public class EndCardView extends BaseEndCardView {
    private ImageView m0;
    private Bitmap mm;
    private final View.OnClickListener mn;
    private TextView mo;
    private int om;
    private ImageView on;
    private int oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.EndCardView$2, reason: invalid class name */
    public class AnonymousClass2 implements m.o {
        final /* synthetic */ ooo o;

        public AnonymousClass2(ooo oooVar) {
            this.o = oooVar;
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.o.nm())) {
                EndCardView.this.on.setImageBitmap(bitmap);
                on.o(EndCardView.this.getContext(), bitmap, new on.o() { // from class: com.thinkup.core.common.inner.ui.EndCardView.2.1
                    @Override // com.thinkup.core.common.ooo.on.o
                    public final void o() {
                    }

                    @Override // com.thinkup.core.common.ooo.on.o
                    public final void o(Bitmap bitmap2) {
                        EndCardView.this.mm = bitmap2;
                        EndCardView.this.setBackgroundDrawable(new BitmapDrawable(EndCardView.this.mm));
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.EndCardView$3, reason: invalid class name */
    public class AnonymousClass3 implements m.o {
        final /* synthetic */ int m;
        final /* synthetic */ String o;

        public AnonymousClass3(String str, int i2) {
            this.o = str;
            this.m = i2;
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.o)) {
                float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                int i2 = this.m;
                ViewGroup.LayoutParams layoutParams = EndCardView.this.m0.getLayoutParams();
                layoutParams.width = (int) (i2 * width);
                layoutParams.height = i2;
                EndCardView.this.m0.setLayoutParams(layoutParams);
                EndCardView.this.m0.setScaleType(ImageView.ScaleType.FIT_XY);
                EndCardView.this.m0.setImageBitmap(bitmap);
            }
        }
    }

    public EndCardView(Context context, ooo oooVar, oom oomVar) {
        super(context, oooVar, oomVar);
        this.mn = new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.EndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseEndCardView.o oVar;
                oon oonVar = EndCardView.this.o0;
                if (oonVar != null) {
                    if (oonVar.o0o() == 0) {
                        TextView unused = EndCardView.this.mo;
                        BaseEndCardView.o oVar2 = EndCardView.this.mListener;
                        if (oVar2 != null) {
                            oVar2.o();
                            return;
                        }
                        return;
                    }
                    if (EndCardView.this.mo == null || view != EndCardView.this.mo || EndCardView.this.mo.getVisibility() != 0 || (oVar = EndCardView.this.mListener) == null) {
                        return;
                    }
                    oVar.o();
                }
            }
        };
    }

    public View getLearnMoreButton() {
        return this.mo;
    }

    public void init(boolean z2, boolean z3, BaseEndCardView.o oVar) {
        setId(o00.o(getContext(), "myoffer_end_card_id", "id"));
        this.mListener = oVar;
        this.on = new RoundImageView(getContext());
        addView(this.on, new RelativeLayout.LayoutParams(-1, -1));
        if (z2) {
            ooo oooVar = this.m;
            this.m0 = new RoundImageView(getContext());
            int iO = o00.o(getContext(), 12.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, iO);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.m0, layoutParams);
            String strNn = oooVar.nn();
            if (!TextUtils.isEmpty(strNn)) {
                ViewGroup.LayoutParams layoutParams2 = this.m0.getLayoutParams();
                m.o(getContext()).o(new oo(1, strNn), layoutParams2.width, layoutParams2.height, new AnonymousClass3(strNn, iO));
            }
        }
        if (z3) {
            ScanningAnimButton scanningAnimButton = new ScanningAnimButton(getContext());
            this.mo = scanningAnimButton;
            scanningAnimButton.setText(o00.o(getContext(), "myoffer_cta_learn_more", k.f38992h));
            this.mo.setTextColor(Color.parseColor("#ffffffff"));
            this.mo.setTextSize(14.0f);
            this.mo.setGravity(17);
            this.mo.setBackgroundResource(o00.o(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", k.d));
            if (!this.m.onn()) {
                this.mo.setOnClickListener(this.mn);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, o00.o(getContext(), 48.0f));
            layoutParams3.addRule(12);
            layoutParams3.bottomMargin = o00.o(getContext(), 96.0f);
            layoutParams3.leftMargin = o00.o(getContext(), 24.0f);
            layoutParams3.rightMargin = o00.o(getContext(), 24.0f);
            addView(this.mo, layoutParams3);
        }
        if (this.m.onn()) {
            return;
        }
        setOnClickListener(this.mn);
    }

    public void load() {
        ooo oooVar = this.m;
        try {
            m.o(getContext()).o(new oo(1, oooVar.nm()), this.oo, this.om, new AnonymousClass2(oooVar));
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseEndCardView
    public final void o() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setSize(int i2, int i3) {
        this.oo = i2;
        this.om = i3;
    }

    private void m(ooo oooVar) {
        this.m0 = new RoundImageView(getContext());
        int iO = o00.o(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, iO);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.m0, layoutParams);
        String strNn = oooVar.nn();
        if (TextUtils.isEmpty(strNn)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.m0.getLayoutParams();
        m.o(getContext()).o(new oo(1, strNn), layoutParams2.width, layoutParams2.height, new AnonymousClass3(strNn, iO));
    }

    private void n() {
        ScanningAnimButton scanningAnimButton = new ScanningAnimButton(getContext());
        this.mo = scanningAnimButton;
        scanningAnimButton.setText(o00.o(getContext(), "myoffer_cta_learn_more", k.f38992h));
        this.mo.setTextColor(Color.parseColor("#ffffffff"));
        this.mo.setTextSize(14.0f);
        this.mo.setGravity(17);
        this.mo.setBackgroundResource(o00.o(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", k.d));
        if (!this.m.onn()) {
            this.mo.setOnClickListener(this.mn);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, o00.o(getContext(), 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = o00.o(getContext(), 96.0f);
        layoutParams.leftMargin = o00.o(getContext(), 24.0f);
        layoutParams.rightMargin = o00.o(getContext(), 24.0f);
        addView(this.mo, layoutParams);
    }

    private void o(ooo oooVar) {
        try {
            m.o(getContext()).o(new oo(1, oooVar.nm()), this.oo, this.om, new AnonymousClass2(oooVar));
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseEndCardView
    public final Drawable m() {
        Bitmap bitmap = this.mm;
        if (bitmap != null && !bitmap.isRecycled()) {
            return new BitmapDrawable(this.mm);
        }
        return super.m();
    }
}
