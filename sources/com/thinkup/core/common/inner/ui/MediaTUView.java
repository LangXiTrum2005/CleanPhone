package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.on;
import com.thinkup.core.common.res.m;
import com.thinkup.core.common.res.oo;
import com.thinkup.core.common.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MediaTUView extends BaseMediaTUView {
    public static final String TAG = "tpn_thinkup_MediaTUView";
    protected TextView mm;
    protected TextView mn;
    protected ImageView n0;
    protected RoundImageView nm;
    protected TextView nn;
    protected ImageView no;
    protected ImageView o00;
    RelativeLayout o0o;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.MediaTUView$2, reason: invalid class name */
    public class AnonymousClass2 implements m.o {
        public AnonymousClass2() {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
            Log.e(MediaTUView.TAG, "load: image load fail:".concat(String.valueOf(str2)));
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(MediaTUView.this.o.nm(), str)) {
                MediaTUView.this.no.setVisibility(0);
                MediaTUView.this.no.setImageBitmap(bitmap);
                MediaTUView.this.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.MediaTUView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int width = MediaTUView.this.getWidth();
                        int height = MediaTUView.this.getHeight();
                        if (width <= 0 || height <= 0) {
                            return;
                        }
                        int[] iArrO = moo.o(width, height, bitmap.getWidth() / bitmap.getHeight());
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) MediaTUView.this.no.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iArrO[0];
                            layoutParams.height = iArrO[1];
                            layoutParams.addRule(13);
                            MediaTUView.this.no.setLayoutParams(layoutParams);
                        }
                    }
                });
                on.o(MediaTUView.this.getContext(), bitmap, new on.o() { // from class: com.thinkup.core.common.inner.ui.MediaTUView.2.2
                    @Override // com.thinkup.core.common.ooo.on.o
                    public final void o() {
                    }

                    @Override // com.thinkup.core.common.ooo.on.o
                    public final void o(Bitmap bitmap2) {
                        MediaTUView.this.n0.setVisibility(0);
                        MediaTUView.this.n0.setScaleType(ImageView.ScaleType.FIT_XY);
                        MediaTUView.this.n0.setImageBitmap(bitmap2);
                    }
                });
            }
        }
    }

    public MediaTUView(Context context, ooo oooVar, oom oomVar, boolean z2, BaseMediaTUView.o oVar) {
        super(context, oooVar, oomVar, z2, oVar);
    }

    private String m() {
        int i2 = this.m0;
        if (i2 == 1) {
            return "myoffer_template_left_image";
        }
        if (i2 == 2) {
            return "myoffer_template_left_text";
        }
        if (i2 == 3) {
            return "myoffer_template_top_image";
        }
        if (i2 != 4) {
            return i2 != 5 ? "myoffer_media_ad_view" : "myoffer_template_text_float";
        }
        return "myoffer_template_top_text";
    }

    private void n() {
        FrameLayout frameLayout;
        TextView textView;
        if (o()) {
            int i2 = this.m0;
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                ViewGroup viewGroup = (ViewGroup) findViewById(o00.o(getContext(), "myoffer_title_desc", "id"));
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).leftMargin = getResources().getDimensionPixelSize(o00.o(getContext(), "myoffer_template_margin_white", "dimen"));
                        viewGroup.setLayoutParams(layoutParams);
                    }
                }
            } else if ((i2 == 1 || i2 == 2) && (textView = this.mm) != null) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                    this.mm.setLayoutParams(layoutParams2);
                }
            }
        }
        if (TextUtils.isEmpty(this.o.mn()) && this.m0 == 6) {
            ViewGroup.LayoutParams layoutParams3 = this.nn.getLayoutParams();
            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams3).topMargin = 0;
                this.nn.setLayoutParams(layoutParams3);
            }
        }
        if (TextUtils.isEmpty(this.o.n0())) {
            int i3 = this.m0;
            if (i3 == 2 || i3 == 1) {
                ViewGroup.LayoutParams layoutParams4 = this.mn.getLayoutParams();
                if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                    layoutParams5.addRule(13);
                    layoutParams5.removeRule(12);
                }
            }
            if (this.m0 != 5 || (frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_template_bg_desc", "id"))) == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    private static void o0() {
    }

    @Override // com.thinkup.core.common.inner.ui.BaseMediaTUView
    public List<View> getClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mn);
        if (this.m.o0o() != 1) {
            arrayList.add(this.mm);
            arrayList.add(this.no);
            arrayList.add(this.nm);
            arrayList.add(this.nn);
            oon oonVar = this.m;
            if (oonVar != null && oonVar.o0o() == 0) {
                arrayList.add(this.n0);
                arrayList.add(this.o0o);
            }
        }
        return arrayList;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseMediaTUView
    public void init(int i2, int i3, int i4) {
        String str;
        FrameLayout frameLayout;
        TextView textView;
        ooo oooVar;
        View viewFindViewById;
        super.init(i2, i3, i4);
        int i5 = this.m0;
        if (i5 == 1) {
            str = "myoffer_template_left_image";
        } else if (i5 == 2) {
            str = "myoffer_template_left_text";
        } else if (i5 == 3) {
            str = "myoffer_template_top_image";
        } else if (i5 != 4) {
            str = i5 != 5 ? "myoffer_media_ad_view" : "myoffer_template_text_float";
        } else {
            str = "myoffer_template_top_text";
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), str, "layout"), (ViewGroup) null, false);
        FrameLayout frameLayout2 = this.om;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            this.om.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        }
        this.mm = (TextView) findViewById(o00.o(getContext(), "myoffer_banner_ad_title", "id"));
        this.mn = (TextView) findViewById(o00.o(getContext(), "myoffer_media_ad_cta", "id"));
        this.n0 = (ImageView) findViewById(o00.o(getContext(), "myoffer_media_ad_bg_blur", "id"));
        this.no = (ImageView) findViewById(o00.o(getContext(), "myoffer_media_ad_main_image", "id"));
        this.o00 = (ImageView) findViewById(o00.o(getContext(), "myoffer_ad_logo", "id"));
        this.nm = (RoundImageView) findViewById(o00.o(getContext(), "myoffer_media_ad_icon", "id"));
        this.nn = (TextView) findViewById(o00.o(getContext(), "myoffer_banner_ad_desc", "id"));
        this.o0o = (RelativeLayout) findViewById(o00.o(getContext(), "myoffer_media_ad_container", "id"));
        String strMn = this.o.mn();
        if (TextUtils.isEmpty(strMn)) {
            this.mm.setVisibility(8);
        } else {
            this.mm.setText(strMn);
        }
        String strO00 = this.o.o00();
        if (TextUtils.isEmpty(strO00)) {
            this.mn.setText(o00.o(getContext(), "myoffer_cta_learn_more", k.f38992h));
        } else {
            this.mn.setText(strO00);
        }
        String strN0 = this.o.n0();
        if (TextUtils.isEmpty(strN0)) {
            this.nn.setVisibility(8);
        } else {
            this.nn.setText(strN0);
        }
        if (TextUtils.isEmpty(this.o.no())) {
            this.nm.setVisibility(8);
        } else {
            this.nm.setRadiusInDip(6);
            this.nm.setNeedRadiu(true);
            ViewGroup.LayoutParams layoutParams = this.nm.getLayoutParams();
            m.o(getContext()).o(new oo(1, this.o.no()), layoutParams.width, layoutParams.height, new m.o() { // from class: com.thinkup.core.common.inner.ui.MediaTUView.1
                @Override // com.thinkup.core.common.res.m.o
                public final void onFail(String str2, String str3) {
                }

                @Override // com.thinkup.core.common.res.m.o
                public final void onSuccess(String str2, Bitmap bitmap) {
                    if (TextUtils.equals(MediaTUView.this.o.no(), str2)) {
                        MediaTUView.this.nm.setImageBitmap(bitmap);
                    }
                }
            });
        }
        com.thinkup.core.common.inner.ui.oo.o oVar = new com.thinkup.core.common.inner.ui.oo.o(this.o, this.f41836n);
        this.mo = oVar;
        oVar.m(this);
        if (!com.thinkup.core.common.inner.o.o.o(this.o) && (viewFindViewById = findViewById(o00.o(getContext(), "myoffer_media_ad_main_image_container", "id"))) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = o00.o(getContext(), 84.0f);
                viewFindViewById.setLayoutParams(layoutParams2);
            }
        }
        o(i2, i3);
        if ((this.mn instanceof ScanningAnimButton) && (oooVar = this.o) != null && oooVar.on() != null) {
            ((ScanningAnimButton) this.mn).startAnimation(this.o.on().onm());
        }
        if (o()) {
            int i6 = this.m0;
            if (i6 == 3 || i6 == 4 || i6 == 5) {
                ViewGroup viewGroup = (ViewGroup) findViewById(o00.o(getContext(), "myoffer_title_desc", "id"));
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams3).leftMargin = getResources().getDimensionPixelSize(o00.o(getContext(), "myoffer_template_margin_white", "dimen"));
                        viewGroup.setLayoutParams(layoutParams3);
                    }
                }
            } else if ((i6 == 1 || i6 == 2) && (textView = this.mm) != null) {
                ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams4).leftMargin = 0;
                    this.mm.setLayoutParams(layoutParams4);
                }
            }
        }
        if (TextUtils.isEmpty(this.o.mn()) && this.m0 == 6) {
            ViewGroup.LayoutParams layoutParams5 = this.nn.getLayoutParams();
            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams5).topMargin = 0;
                this.nn.setLayoutParams(layoutParams5);
            }
        }
        if (TextUtils.isEmpty(this.o.n0())) {
            int i7 = this.m0;
            if (i7 == 2 || i7 == 1) {
                ViewGroup.LayoutParams layoutParams6 = this.mn.getLayoutParams();
                if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                    layoutParams7.addRule(13);
                    layoutParams7.removeRule(12);
                }
            }
            if (this.m0 != 5 || (frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_template_bg_desc", "id"))) == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    public boolean o() {
        return TextUtils.isEmpty(this.o.no());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    public void o(int i2, int i3) {
        this.no.setScaleType(ImageView.ScaleType.FIT_CENTER);
        m.o(getContext()).o(new oo(1, this.o.nm()), i2, i3, new AnonymousClass2());
    }

    private void m(int i2, int i3) {
        this.no.setScaleType(ImageView.ScaleType.FIT_CENTER);
        m.o(getContext()).o(new oo(1, this.o.nm()), i2, i3, new AnonymousClass2());
    }
}
