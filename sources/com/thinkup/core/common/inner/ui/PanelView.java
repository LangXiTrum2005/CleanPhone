package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.thinkup.core.common.inner.ui.component.RoundFrameLayout;
import com.thinkup.core.common.inner.ui.oo.n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.res.m;
import com.thinkup.core.common.res.oo;
import com.thinkup.core.common.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PanelView extends RelativeLayout {
    public static final int TYPE_FULL_SCREEN_BANNER = 0;
    public static final int TYPE_FULL_SCREEN_EMPTY_INFO = 8;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_LANDSCAPE = 6;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_PORTRAIT = 1;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_LANDSCAPE = 2;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_PORTRAIT = 5;
    public static final int TYPE_HALF_SCREEN_EMPTY_INFO = 7;
    public static final int TYPE_HALF_SCREEN_HORIZONTAL = 4;
    public static final int TYPE_HALF_SCREEN_VERTICAL = 3;
    public static final int TYPE_LETTER = 9;
    private View m;
    private o m0;
    private oon mm;
    private oom mn;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f41847n;
    private ooo n0;
    private boolean nm;
    private boolean nn;
    private int no;
    protected boolean o;
    private ImageView o0;
    private boolean o00;
    private View o0m;
    private final View.OnClickListener o0n;
    private List<View> o0o;
    private TextView om;
    private ScanningAnimButton on;
    private TextView oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.PanelView$2, reason: invalid class name */
    public class AnonymousClass2 implements m.o {
        final /* synthetic */ String o;

        public AnonymousClass2(String str) {
            this.o = str;
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.o)) {
                PanelView.this.f41847n.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.PanelView$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PanelView.this.m0 != null) {
                o unused = PanelView.this.m0;
            }
        }
    }

    public interface o {
        boolean m();

        void o();
    }

    public PanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.no = 0;
        this.nm = false;
        this.nn = false;
        this.o00 = false;
        this.o = false;
        this.o0n = new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.PanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.mm != null) {
                    if (PanelView.this.mm.o0o() == 1) {
                        if (view != PanelView.this.on || PanelView.this.m0 == null) {
                            return;
                        }
                        o unused = PanelView.this.m0;
                        return;
                    }
                    if (PanelView.this.m0 != null) {
                        if (view == PanelView.this.on) {
                            o unused2 = PanelView.this.m0;
                        } else {
                            o unused3 = PanelView.this.m0;
                        }
                    }
                }
            }
        };
    }

    private boolean m0() {
        ooo oooVar = this.n0;
        return (oooVar == null || TextUtils.isEmpty(oooVar.no())) ? false : true;
    }

    private static boolean o(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6 || i2 == 9;
    }

    private static void o0() {
    }

    private void om() {
        if (this.f41847n != null) {
            if (!this.n0.onn()) {
                this.f41847n.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.f41847n);
        }
        if (this.oo != null) {
            if (!this.n0.onn()) {
                this.oo.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.oo);
        }
        if (this.om != null) {
            if (!this.n0.onn()) {
                this.om.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.om);
        }
        if (this.on != null) {
            if (!this.n0.onn()) {
                this.on.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.on);
        }
        if (this.o0 != null) {
            if (!this.n0.onn()) {
                this.o0.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.o0);
        }
        View viewFindViewById = this.m.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
        if (viewFindViewById != null) {
            if (!this.n0.onn()) {
                viewFindViewById.setOnClickListener(this.o0n);
            }
            this.o0o.add(viewFindViewById);
        } else {
            if (!this.n0.onn()) {
                this.m.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.m);
        }
    }

    private boolean on() {
        return m0() || this.o0m != null;
    }

    private void oo() {
        this.o0o.clear();
        this.f41847n = (ImageView) this.m.findViewById(o00.o(getContext(), "myoffer_iv_banner_icon", "id"));
        this.oo = (TextView) this.m.findViewById(o00.o(getContext(), "myoffer_tv_banner_title", "id"));
        this.om = (TextView) this.m.findViewById(o00.o(getContext(), "myoffer_tv_banner_desc", "id"));
        this.on = (ScanningAnimButton) this.m.findViewById(o00.o(getContext(), "myoffer_panel_cta_layout", "id"));
        this.o0 = (ImageView) this.m.findViewById(o00.o(getContext(), "myoffer_ad_logo", "id"));
    }

    public View getCTAButton() {
        return this.on;
    }

    public List<View> getClickViews() {
        return this.o0o;
    }

    public View getDescView() {
        return this.om;
    }

    public View getIconView() {
        ImageView imageView = this.f41847n;
        View view = this.o0m;
        return view != null ? view : imageView;
    }

    public View getTitleView() {
        return this.oo;
    }

    public void init(ooo oooVar, oom oomVar, int i2, boolean z2, o oVar) {
        this.m0 = oVar;
        this.mo = i2;
        this.n0 = oooVar;
        this.mn = oomVar;
        this.mm = oomVar.oo0;
        this.o00 = z2;
        this.nm = oooVar.onm();
        this.nn = this.mm.mm() == 1;
        this.o0o = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setBaseAdIconView(View view) {
        this.o0m = view;
    }

    public void setLayoutType(int i2) {
        ViewGroup viewGroup;
        int iIndexOfChild;
        this.no = i2;
        switch (i2) {
            case 1:
                if (!on()) {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_endcard_horizontal_portrait", "layout"), (ViewGroup) this, true);
                }
                break;
            case 2:
            case 6:
                if (!on()) {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_endcard_landscape_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_endcard_landscape", "layout"), (ViewGroup) this, true);
                }
                break;
            case 3:
                if (this.mo != 1) {
                    if (!on()) {
                        this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_vertical_without_icon", "layout"), (ViewGroup) this, true);
                    } else {
                        this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
                    }
                } else if (!on()) {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                }
                break;
            case 4:
                if (!on()) {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                }
                break;
            case 5:
                if (!on()) {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_endcard_vertical_portrait", "layout"), (ViewGroup) this, true);
                }
                break;
            case 7:
                this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 8:
                this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_full_screen_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 9:
                this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_letter", "layout"), (ViewGroup) this, true);
                break;
            default:
                if (!on()) {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_bottom_banner_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.m = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
                }
                break;
        }
        this.o = i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6 || i2 == 9;
        this.o0o.clear();
        this.f41847n = (ImageView) this.m.findViewById(o00.o(getContext(), "myoffer_iv_banner_icon", "id"));
        this.oo = (TextView) this.m.findViewById(o00.o(getContext(), "myoffer_tv_banner_title", "id"));
        this.om = (TextView) this.m.findViewById(o00.o(getContext(), "myoffer_tv_banner_desc", "id"));
        this.on = (ScanningAnimButton) this.m.findViewById(o00.o(getContext(), "myoffer_panel_cta_layout", "id"));
        this.o0 = (ImageView) this.m.findViewById(o00.o(getContext(), "myoffer_ad_logo", "id"));
        ooo oooVar = this.n0;
        ImageView imageView = this.f41847n;
        if (imageView != null) {
            View view = this.o0m;
            if (view == null) {
                String strNo = oooVar.no();
                if (!TextUtils.isEmpty(strNo)) {
                    ViewGroup.LayoutParams layoutParams = this.f41847n.getLayoutParams();
                    m.o(getContext()).o(new oo(1, strNo), layoutParams.width, layoutParams.height, new AnonymousClass2(strNo));
                }
            } else if (imageView != null && view != null) {
                imageView.setVisibility(0);
                view.setVisibility(0);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) >= 0) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    moo.o(imageView);
                    moo.o(view);
                    RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
                    int i3 = this.no;
                    if (i3 == 2 || i3 == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, iIndexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f41847n = (ImageView) view;
                    }
                }
            }
            if (!on()) {
                this.f41847n.setVisibility(8);
            }
        }
        if (this.om != null) {
            if (TextUtils.isEmpty(oooVar.n0())) {
                this.om.setVisibility(8);
            } else {
                this.om.setText(oooVar.n0());
            }
        }
        if (this.oo != null) {
            if (TextUtils.isEmpty(oooVar.mn())) {
                this.oo.setVisibility(8);
            } else {
                this.oo.setText(oooVar.mn());
            }
        }
        if (this.on != null) {
            if (TextUtils.isEmpty(oooVar.o00())) {
                this.on.setText(n.o(getContext(), oooVar));
            } else {
                this.on.setText(oooVar.o00());
            }
            this.on.setOnClickListener(new AnonymousClass3());
            this.on.startAnimation(this.mn.oo0.onm());
        }
        new com.thinkup.core.common.inner.ui.oo.o(oooVar, this.mn).m(this);
        if (this.f41847n != null) {
            if (!this.n0.onn()) {
                this.f41847n.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.f41847n);
        }
        if (this.oo != null) {
            if (!this.n0.onn()) {
                this.oo.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.oo);
        }
        if (this.om != null) {
            if (!this.n0.onn()) {
                this.om.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.om);
        }
        if (this.on != null) {
            if (!this.n0.onn()) {
                this.on.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.on);
        }
        if (this.o0 != null) {
            if (!this.n0.onn()) {
                this.o0.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.o0);
        }
        View viewFindViewById = this.m.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
        if (viewFindViewById != null) {
            if (!this.n0.onn()) {
                viewFindViewById.setOnClickListener(this.o0n);
            }
            this.o0o.add(viewFindViewById);
        } else {
            if (!this.n0.onn()) {
                this.m.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.m);
        }
        ImageView imageView2 = this.f41847n;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i4 = this.no;
            if (i4 == 2 || i4 == 6) {
                ((RoundImageView) this.f41847n).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f41847n).setRadiusInDip(12);
            }
            this.f41847n.invalidate();
        }
    }

    private void m() {
        ViewGroup viewGroup;
        int iIndexOfChild;
        this.o0o.clear();
        this.f41847n = (ImageView) this.m.findViewById(o00.o(getContext(), "myoffer_iv_banner_icon", "id"));
        this.oo = (TextView) this.m.findViewById(o00.o(getContext(), "myoffer_tv_banner_title", "id"));
        this.om = (TextView) this.m.findViewById(o00.o(getContext(), "myoffer_tv_banner_desc", "id"));
        this.on = (ScanningAnimButton) this.m.findViewById(o00.o(getContext(), "myoffer_panel_cta_layout", "id"));
        this.o0 = (ImageView) this.m.findViewById(o00.o(getContext(), "myoffer_ad_logo", "id"));
        ooo oooVar = this.n0;
        ImageView imageView = this.f41847n;
        if (imageView != null) {
            View view = this.o0m;
            if (view == null) {
                String strNo = oooVar.no();
                if (!TextUtils.isEmpty(strNo)) {
                    ViewGroup.LayoutParams layoutParams = this.f41847n.getLayoutParams();
                    m.o(getContext()).o(new oo(1, strNo), layoutParams.width, layoutParams.height, new AnonymousClass2(strNo));
                }
            } else if (imageView != null && view != null) {
                imageView.setVisibility(0);
                view.setVisibility(0);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) >= 0) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    moo.o(imageView);
                    moo.o(view);
                    RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
                    int i2 = this.no;
                    if (i2 == 2 || i2 == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, iIndexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f41847n = (ImageView) view;
                    }
                }
            }
            if (!on()) {
                this.f41847n.setVisibility(8);
            }
        }
        if (this.om != null) {
            if (TextUtils.isEmpty(oooVar.n0())) {
                this.om.setVisibility(8);
            } else {
                this.om.setText(oooVar.n0());
            }
        }
        if (this.oo != null) {
            if (TextUtils.isEmpty(oooVar.mn())) {
                this.oo.setVisibility(8);
            } else {
                this.oo.setText(oooVar.mn());
            }
        }
        if (this.on != null) {
            if (TextUtils.isEmpty(oooVar.o00())) {
                this.on.setText(n.o(getContext(), oooVar));
            } else {
                this.on.setText(oooVar.o00());
            }
            this.on.setOnClickListener(new AnonymousClass3());
            this.on.startAnimation(this.mn.oo0.onm());
        }
        new com.thinkup.core.common.inner.ui.oo.o(oooVar, this.mn).m(this);
        if (this.f41847n != null) {
            if (!this.n0.onn()) {
                this.f41847n.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.f41847n);
        }
        if (this.oo != null) {
            if (!this.n0.onn()) {
                this.oo.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.oo);
        }
        if (this.om != null) {
            if (!this.n0.onn()) {
                this.om.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.om);
        }
        if (this.on != null) {
            if (!this.n0.onn()) {
                this.on.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.on);
        }
        if (this.o0 != null) {
            if (!this.n0.onn()) {
                this.o0.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.o0);
        }
        View viewFindViewById = this.m.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
        if (viewFindViewById != null) {
            if (!this.n0.onn()) {
                viewFindViewById.setOnClickListener(this.o0n);
            }
            this.o0o.add(viewFindViewById);
        } else {
            if (!this.n0.onn()) {
                this.m.setOnClickListener(this.o0n);
            }
            this.o0o.add(this.m);
        }
        ImageView imageView2 = this.f41847n;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i3 = this.no;
            if (i3 == 2 || i3 == 6) {
                ((RoundImageView) this.f41847n).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f41847n).setRadiusInDip(12);
            }
            this.f41847n.invalidate();
        }
    }

    private void n() {
        ImageView imageView = this.f41847n;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i2 = this.no;
            if (i2 == 2 || i2 == 6) {
                ((RoundImageView) this.f41847n).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f41847n).setRadiusInDip(12);
            }
            this.f41847n.invalidate();
        }
    }

    private boolean o() {
        return this.nm && !this.nn;
    }

    private void o(ooo oooVar) {
        ViewGroup viewGroup;
        int iIndexOfChild;
        ImageView imageView = this.f41847n;
        if (imageView != null) {
            View view = this.o0m;
            if (view == null) {
                String strNo = oooVar.no();
                if (!TextUtils.isEmpty(strNo)) {
                    ViewGroup.LayoutParams layoutParams = this.f41847n.getLayoutParams();
                    m.o(getContext()).o(new oo(1, strNo), layoutParams.width, layoutParams.height, new AnonymousClass2(strNo));
                }
            } else if (imageView != null && view != null) {
                imageView.setVisibility(0);
                view.setVisibility(0);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) >= 0) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    moo.o(imageView);
                    moo.o(view);
                    RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
                    int i2 = this.no;
                    if (i2 != 2 && i2 != 6) {
                        roundFrameLayout.setRadius(12);
                    } else {
                        roundFrameLayout.setRadius(8);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, iIndexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f41847n = (ImageView) view;
                    }
                }
            }
            if (!on()) {
                this.f41847n.setVisibility(8);
            }
        }
        if (this.om != null) {
            if (!TextUtils.isEmpty(oooVar.n0())) {
                this.om.setText(oooVar.n0());
            } else {
                this.om.setVisibility(8);
            }
        }
        if (this.oo != null) {
            if (!TextUtils.isEmpty(oooVar.mn())) {
                this.oo.setText(oooVar.mn());
            } else {
                this.oo.setVisibility(8);
            }
        }
        if (this.on != null) {
            if (!TextUtils.isEmpty(oooVar.o00())) {
                this.on.setText(oooVar.o00());
            } else {
                this.on.setText(n.o(getContext(), oooVar));
            }
            this.on.setOnClickListener(new AnonymousClass3());
            this.on.startAnimation(this.mn.oo0.onm());
        }
        new com.thinkup.core.common.inner.ui.oo.o(oooVar, this.mn).m(this);
    }

    private void o(ImageView imageView, View view) {
        ViewGroup viewGroup;
        int iIndexOfChild;
        if (imageView == null || view == null) {
            return;
        }
        imageView.setVisibility(0);
        view.setVisibility(0);
        ViewParent parent = imageView.getParent();
        if (!(parent instanceof ViewGroup) || (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        moo.o(imageView);
        moo.o(view);
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
        int i2 = this.no;
        if (i2 != 2 && i2 != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
        roundFrameLayout.addView(view);
        viewGroup.addView(roundFrameLayout, iIndexOfChild, layoutParams);
        roundFrameLayout.setId(imageView.getId());
        if (view instanceof ImageView) {
            this.f41847n = (ImageView) view;
        }
    }

    private void o(RoundFrameLayout roundFrameLayout) {
        int i2 = this.no;
        if (i2 != 2 && i2 != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
    }
}
