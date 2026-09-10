package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import j.a;
import o.b;
import o.c;
import o.l;
import o.m;
import o.o;
import o.z;
import p.k;
import p.x0;
import p.y2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends x0 implements z, View.OnClickListener, k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f3838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f3839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f3840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f3841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f3842k;
    public c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3847q;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3843m = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f43519c, 0, 0);
        this.f3845o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3847q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3846p = -1;
        setSaveEnabled(false);
    }

    @Override // p.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.k
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f3838g.getIcon() == null;
    }

    @Override // o.z
    public final void c(o oVar) {
        this.f3838g = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f46985a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f3842k == null) {
            this.f3842k = new b(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.z
    public o getItemData() {
        return this.f3838g;
    }

    public final void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f3839h);
        if (this.f3840i != null && ((this.f3838g.f47008y & 4) != 4 || (!this.f3843m && !this.f3844n))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f3839h : null);
        CharSequence charSequence = this.f3838g.f47000q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f3838g.f46989e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3838g.f47001r;
        if (TextUtils.isEmpty(charSequence2)) {
            y2.a(this, z12 ? null : this.f3838g.f46989e);
        } else {
            y2.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f3841j;
        if (lVar != null) {
            lVar.b(this.f3838g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3843m = g();
        h();
    }

    @Override // p.x0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f3846p) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f3845o;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f3840i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3840i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f3838g.hasSubMenu() && (bVar = this.f3842k) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f3844n != z10) {
            this.f3844n = z10;
            o oVar = this.f3838g;
            if (oVar != null) {
                m mVar = oVar.f46997n;
                mVar.f46969k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3840i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f3847q;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(l lVar) {
        this.f3841j = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f3846p = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(c cVar) {
        this.l = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3839h = charSequence;
        h();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
