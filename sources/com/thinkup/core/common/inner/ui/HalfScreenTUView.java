package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class HalfScreenTUView extends BaseScreenTUView {
    public static final String TAG = "HalfScreenTUView";
    protected final int mm0;
    protected int mmo;
    protected final int mom;
    protected final int mon;
    protected View moo;

    public HalfScreenTUView(Context context) {
        super(context);
        this.mom = 1;
        this.mon = 2;
        this.mm0 = 3;
    }

    private boolean omm() {
        return this.omm <= this.omn;
    }

    private boolean omn() {
        return !com.thinkup.core.common.inner.o.o.o(this.m00);
    }

    private int omo() {
        int i2 = this.mmo;
        if (i2 != 1) {
            return i2 != 2 ? 4 : 3;
        }
        return 7;
    }

    private void on0() {
        int i2;
        int i3;
        int i4;
        int iO;
        int i5;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.nn.getLayoutParams();
        int i6 = layoutParams2.leftMargin;
        int i7 = layoutParams2.rightMargin;
        int i8 = layoutParams2.topMargin;
        int i9 = layoutParams2.bottomMargin;
        View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_player_view_id", "id"));
        RelativeLayout.LayoutParams layoutParams3 = viewFindViewById != null ? (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams() : null;
        int iM = o00.m(getContext());
        if (iM <= 0) {
            iM = o00.o(getContext(), 32.0f);
        }
        int i10 = this.mmo;
        if (i10 == 1) {
            if (this.m == 2) {
                i3 = (this.o0 - i8) - i9;
                i4 = (int) (i3 * 1.75f);
                iO = o00.o(getContext(), 120.0f);
                if (i8 < iM) {
                    layoutParams2.topMargin = (int) (iM * 1.1f);
                }
                layoutParams2.width = i4;
                this.nn.setLayoutParams(layoutParams2);
            } else if (omm()) {
                i4 = (this.f41837n - i6) - i7;
                i3 = (int) (i4 / 0.5714286f);
                int i11 = this.o0;
                int i12 = iM * 4;
                if (i11 - i3 < i12) {
                    i3 = i11 - i12;
                }
                iO = o00.o(getContext(), 240.0f);
            } else {
                i4 = (this.f41837n - i6) - i7;
                i3 = (int) (i4 / 1.032258f);
                iO = o00.o(getContext(), 120.0f);
            }
            this.oo = i4;
            this.om = i3;
        } else {
            if (i10 == 2) {
                if (this.m == 1) {
                    View viewFindViewById2 = this.o00.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
                    i2 = viewFindViewById2 != null ? ((RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams()).topMargin : 0;
                    i4 = (this.f41837n - i6) - i7;
                    float f = i4;
                    int i13 = (int) (f / 0.5714286f);
                    int i14 = this.o0;
                    int i15 = iM * 4;
                    if (i14 - i13 < i15) {
                        i13 = i14 - i15;
                    }
                    iO = (int) (f / 1.8181819f);
                    this.oo = i4;
                    this.om = (i13 - iO) + i2;
                    i3 = i13;
                } else {
                    if (i8 < iM) {
                        i8 = (int) (iM * 1.1f);
                        layoutParams2.topMargin = i8;
                    }
                    i3 = (this.o0 - i8) - i9;
                    i4 = (int) (i3 * 1.6f);
                    this.om = i3;
                    int i16 = (int) (i3 * 0.56f);
                    this.oo = i16;
                    i5 = i4 - i16;
                    layoutParams2.width = i4;
                    this.nn.setLayoutParams(layoutParams2);
                    iO = i3;
                }
                layoutParams2.width = i4;
                layoutParams2.height = i3;
                this.nn.setLayoutParams(layoutParams2);
                if (layoutParams3 != null && viewFindViewById != null) {
                    layoutParams3.width = this.oo;
                    layoutParams3.height = this.om;
                    viewFindViewById.setLayoutParams(layoutParams3);
                }
                layoutParams.width = i5;
                layoutParams.height = iO;
                this.o00.setLayoutParams(layoutParams);
            }
            View viewFindViewById3 = this.o00.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
            i2 = viewFindViewById3 != null ? ((RelativeLayout.LayoutParams) viewFindViewById3.getLayoutParams()).topMargin : 0;
            if (this.m == 1) {
                i4 = (this.f41837n - i6) - i7;
                i3 = (int) (i4 / 1.032258f);
                this.oo = i4;
                int i17 = (int) (i4 / 2.0f);
                this.om = i17;
                iO = (i3 - i17) + i2;
            } else {
                if (i8 < iM) {
                    i8 = (int) (iM * 1.1f);
                    layoutParams2.topMargin = i8;
                }
                i3 = (this.o0 - i8) - i9;
                i4 = (int) (i3 * 1.032258f);
                this.oo = i4;
                int i18 = (int) (i4 / 2.0f);
                this.om = i18;
                iO = (i3 - i18) + i2;
                layoutParams2.width = i4;
                this.nn.setLayoutParams(layoutParams2);
            }
        }
        i5 = i4;
        layoutParams2.width = i4;
        layoutParams2.height = i3;
        this.nn.setLayoutParams(layoutParams2);
        if (layoutParams3 != null) {
            layoutParams3.width = this.oo;
            layoutParams3.height = this.om;
            viewFindViewById.setLayoutParams(layoutParams3);
        }
        layoutParams.width = i5;
        layoutParams.height = iO;
        this.o00.setLayoutParams(layoutParams);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView, com.thinkup.core.common.inner.ui.BaseTUView
    public final void b_() {
        super.b_();
        if (!com.thinkup.core.common.inner.o.o.o(this.m00)) {
            this.mmo = 1;
        } else if (omm()) {
            this.mmo = 2;
        } else {
            this.mmo = 3;
        }
    }

    public boolean isAttachRoot() {
        return true;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void m0() {
        super.m0();
        if (this.m00.ooo() != 1 || this.m00.m0o() <= 0 || this.m00.m0m() <= 0) {
            return;
        }
        this.omm = this.m00.m0o();
        this.omn = this.m00.m0m();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void mm() {
        int i2;
        super.mm();
        int i3 = this.mmo;
        if (i3 != 1) {
            i2 = i3 != 2 ? 4 : 3;
        } else {
            i2 = 7;
        }
        this.mo = i2;
        if (oo0() != null) {
            oo0().setLayoutType(this.mo);
            if (o(this.mo)) {
                nn();
            } else {
                oo0().setVisibility(8);
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void n0() {
        no();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public void o() {
        int i2 = this.mmo;
        if (i2 == 1) {
            this.moo = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_half_screen_empty_info", "layout"), this, isAttachRoot());
        } else if (i2 != 2) {
            this.moo = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_half_screen_horizontal", "layout"), this, isAttachRoot());
        } else {
            this.moo = LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_half_screen_vertical", "layout"), this, isAttachRoot());
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void o0() {
        int i2;
        int i3;
        int i4;
        int iO;
        int i5;
        int i6;
        super.o0();
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.nn.getLayoutParams();
            int i7 = layoutParams2.leftMargin;
            int i8 = layoutParams2.rightMargin;
            int i9 = layoutParams2.topMargin;
            int i10 = layoutParams2.bottomMargin;
            View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_player_view_id", "id"));
            RelativeLayout.LayoutParams layoutParams3 = viewFindViewById != null ? (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams() : null;
            int iM = o00.m(getContext());
            if (iM <= 0) {
                iM = o00.o(getContext(), 32.0f);
            }
            int i11 = this.mmo;
            if (i11 != 1) {
                if (i11 != 2) {
                    View viewFindViewById2 = this.o00.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
                    i2 = viewFindViewById2 != null ? ((RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams()).topMargin : 0;
                    if (this.m == 1) {
                        i4 = (this.f41837n - i7) - i8;
                        i3 = (int) (i4 / 1.032258f);
                        this.oo = i4;
                        int i12 = (int) (i4 / 2.0f);
                        this.om = i12;
                        iO = (i3 - i12) + i2;
                    } else {
                        if (i9 < iM) {
                            i9 = (int) (iM * 1.1f);
                            layoutParams2.topMargin = i9;
                        }
                        i3 = (this.o0 - i9) - i10;
                        i4 = (int) (i3 * 1.032258f);
                        this.oo = i4;
                        int i13 = (int) (i4 / 2.0f);
                        this.om = i13;
                        iO = (i3 - i13) + i2;
                        layoutParams2.width = i4;
                        this.nn.setLayoutParams(layoutParams2);
                    }
                } else if (this.m == 1) {
                    View viewFindViewById3 = this.o00.findViewById(o00.o(getContext(), "myoffer_panel_view_blank", "id"));
                    i2 = viewFindViewById3 != null ? ((RelativeLayout.LayoutParams) viewFindViewById3.getLayoutParams()).topMargin : 0;
                    i4 = (this.f41837n - i7) - i8;
                    float f = i4;
                    int i14 = (int) (f / 0.5714286f);
                    int i15 = this.o0;
                    int i16 = iM * 4;
                    if (i15 - i14 < i16) {
                        i14 = i15 - i16;
                    }
                    int i17 = (int) (f / 1.8181819f);
                    this.oo = i4;
                    this.om = (i14 - i17) + i2;
                    i6 = i17;
                    i3 = i14;
                    i5 = i4;
                } else {
                    if (i9 < iM) {
                        i9 = (int) (iM * 1.1f);
                        layoutParams2.topMargin = i9;
                    }
                    i3 = (this.o0 - i9) - i10;
                    i4 = (int) (i3 * 1.6f);
                    this.om = i3;
                    int i18 = (int) (i3 * 0.56f);
                    this.oo = i18;
                    i5 = i4 - i18;
                    layoutParams2.width = i4;
                    this.nn.setLayoutParams(layoutParams2);
                    i6 = i3;
                }
                layoutParams2.width = i4;
                layoutParams2.height = i3;
                this.nn.setLayoutParams(layoutParams2);
                if (layoutParams3 != null && viewFindViewById != null) {
                    layoutParams3.width = this.oo;
                    layoutParams3.height = this.om;
                    viewFindViewById.setLayoutParams(layoutParams3);
                }
                layoutParams.width = i5;
                layoutParams.height = i6;
                this.o00.setLayoutParams(layoutParams);
            }
            if (this.m == 2) {
                i3 = (this.o0 - i9) - i10;
                i4 = (int) (i3 * 1.75f);
                iO = o00.o(getContext(), 120.0f);
                if (i9 < iM) {
                    layoutParams2.topMargin = (int) (iM * 1.1f);
                }
                layoutParams2.width = i4;
                this.nn.setLayoutParams(layoutParams2);
            } else if (omm()) {
                i4 = (this.f41837n - i7) - i8;
                i3 = (int) (i4 / 0.5714286f);
                int i19 = this.o0;
                int i20 = iM * 4;
                if (i19 - i3 < i20) {
                    i3 = i19 - i20;
                }
                iO = o00.o(getContext(), 240.0f);
            } else {
                i4 = (this.f41837n - i7) - i8;
                i3 = (int) (i4 / 1.032258f);
                iO = o00.o(getContext(), 120.0f);
            }
            this.oo = i4;
            this.om = i3;
            i6 = iO;
            i5 = i4;
            layoutParams2.width = i4;
            layoutParams2.height = i3;
            this.nn.setLayoutParams(layoutParams2);
            if (layoutParams3 != null) {
                layoutParams3.width = this.oo;
                layoutParams3.height = this.om;
                viewFindViewById.setLayoutParams(layoutParams3);
            }
            layoutParams.width = i5;
            layoutParams.height = i6;
            this.o00.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void o0o() {
        BaseEndCardView baseEndCardView;
        View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_player_view_id", "id"));
        if (this.nn == null || (baseEndCardView = this.o0o) == null || baseEndCardView.getParent() != null || viewFindViewById == null) {
            return;
        }
        this.nn.addView(this.o0o, 1, viewFindViewById.getLayoutParams());
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final int on() {
        return this.mo;
    }

    public HalfScreenTUView(Context context, oom oomVar, ooo oooVar, String str, int i2, int i3) {
        super(context, oomVar, oooVar, str, i2, i3);
        this.mom = 1;
        this.mon = 2;
        this.mm0 = 3;
        setId(o00.o(getContext(), "myoffer_half_screen_view_id", "id"));
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public boolean o(int i2) {
        if (this.m00.oo()) {
            return false;
        }
        return (i2 == 7 && this.onn.oo0.o0o() == 0) ? false : true;
    }
}
