package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.text.method.LinkMovementMethod;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.simplelist.MaterialSimpleListAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes.dex */
public final class EM extends AbstractDialogC2732Ro implements View.OnClickListener, InterfaceC2550Kn {
    public final BM c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final EditText g;
    public final RecyclerView h;
    public final View i;
    public final FrameLayout j;
    public final TextView k;
    public final CheckBox l;
    public final MDButton m;
    public final MDButton n;
    public final MDButton o;
    public final int p;

    /* JADX WARN: Illegal instructions before constructor call */
    public EM(BM bm) {
        int i;
        int i2;
        View view;
        int i3;
        boolean z = bm.F == 2;
        Context context = bm.f2867a;
        boolean zD0 = AbstractC2845Vx.d0(context, R.attr.md_dark_theme, z);
        bm.F = zD0 ? 2 : 1;
        super(context, zD0 ? R.style.MD_Dark : R.style.MD_Light);
        new Handler();
        this.c = bm;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (bm.m != null) {
            i = R.layout.md_dialog_custom;
        } else {
            bm.getClass();
            i = bm.y != null ? R.layout.md_dialog_list : R.layout.md_dialog_basic;
        }
        this.f3681a = (MDRootLayout) layoutInflaterFrom.inflate(i, (ViewGroup) null);
        setCancelable(bm.s);
        setCanceledOnTouchOutside(bm.t);
        if (bm.D == 0) {
            bm.D = AbstractC2845Vx.e0(context, R.attr.md_background_color, AbstractC2845Vx.e0(getContext(), R.attr.colorBackgroundFloating, 0));
        }
        if (bm.D != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.md_bg_corner_radius));
            gradientDrawable.setColor(bm.D);
            getWindow().setBackgroundDrawable(gradientDrawable);
        }
        bm.o = AbstractC2845Vx.c0(context, R.attr.md_positive_color, bm.o);
        bm.q = AbstractC2845Vx.c0(context, R.attr.md_neutral_color, bm.q);
        bm.p = AbstractC2845Vx.c0(context, R.attr.md_negative_color, bm.p);
        bm.n = AbstractC2845Vx.e0(context, R.attr.md_widget_color, bm.n);
        bm.i = AbstractC2845Vx.e0(context, R.attr.md_title_color, AbstractC2845Vx.e0(getContext(), android.R.attr.textColorPrimary, 0));
        int iE0 = AbstractC2845Vx.e0(context, R.attr.md_content_color, AbstractC2845Vx.e0(getContext(), android.R.attr.textColorSecondary, 0));
        bm.j = iE0;
        bm.E = AbstractC2845Vx.e0(context, R.attr.md_item_color, iE0);
        this.e = (TextView) this.f3681a.findViewById(R.id.md_title);
        this.d = (ImageView) this.f3681a.findViewById(R.id.md_icon);
        this.i = this.f3681a.findViewById(R.id.md_titleFrame);
        this.f = (TextView) this.f3681a.findViewById(R.id.md_content);
        this.h = (RecyclerView) this.f3681a.findViewById(R.id.md_contentRecyclerView);
        this.l = (CheckBox) this.f3681a.findViewById(R.id.md_promptCheckbox);
        this.m = (MDButton) this.f3681a.findViewById(R.id.md_buttonDefaultPositive);
        this.n = (MDButton) this.f3681a.findViewById(R.id.md_buttonDefaultNeutral);
        this.o = (MDButton) this.f3681a.findViewById(R.id.md_buttonDefaultNegative);
        this.m.setVisibility(bm.l != null ? 0 : 8);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.m.setFocusable(true);
        this.n.setFocusable(true);
        this.o.setFocusable(true);
        Drawable drawableF0 = AbstractC2845Vx.f0(context, R.attr.md_icon);
        if (drawableF0 != null) {
            this.d.setVisibility(0);
            this.d.setImageDrawable(drawableF0);
        } else {
            this.d.setVisibility(8);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.md_icon_max_size});
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            dimensionPixelSize = AbstractC2845Vx.d0(context, R.attr.md_icon_limit_icon_to_default_size, false) ? context.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size) : dimensionPixelSize;
            if (dimensionPixelSize > -1) {
                this.d.setAdjustViewBounds(true);
                this.d.setMaxHeight(dimensionPixelSize);
                this.d.setMaxWidth(dimensionPixelSize);
                this.d.requestLayout();
            }
            this.f3681a.setDividerColor(AbstractC2845Vx.e0(context, R.attr.md_divider_color, AbstractC2845Vx.e0(getContext(), R.attr.md_divider, 0)));
            TextView textView = this.e;
            int i4 = 6;
            if (textView != null) {
                e(textView, bm.x);
                this.e.setTextColor(bm.i);
                this.e.setGravity(bm.c.a());
                TextView textView2 = this.e;
                int iOrdinal = bm.c.ordinal();
                if (iOrdinal != 1) {
                    i3 = iOrdinal != 2 ? 5 : 6;
                } else {
                    i3 = 4;
                }
                textView2.setTextAlignment(i3);
                CharSequence charSequence = bm.b;
                if (charSequence == null) {
                    this.i.setVisibility(8);
                } else {
                    this.e.setText(charSequence);
                    this.i.setVisibility(0);
                }
            }
            TextView textView3 = this.f;
            if (textView3 != null) {
                textView3.setMovementMethod(new LinkMovementMethod());
                e(this.f, bm.w);
                this.f.setLineSpacing(0.0f, 1.2f);
                ColorStateList colorStateList = bm.r;
                if (colorStateList == null) {
                    this.f.setLinkTextColor(AbstractC2845Vx.e0(getContext(), android.R.attr.textColorPrimary, 0));
                } else {
                    this.f.setLinkTextColor(colorStateList);
                }
                this.f.setTextColor(bm.j);
                this.f.setGravity(bm.d.a());
                TextView textView4 = this.f;
                int iOrdinal2 = bm.d.ordinal();
                if (iOrdinal2 == 1) {
                    i4 = 4;
                } else if (iOrdinal2 != 2) {
                    i4 = 5;
                }
                textView4.setTextAlignment(i4);
                CharSequence charSequence2 = bm.k;
                if (charSequence2 != null) {
                    this.f.setText(charSequence2);
                    this.f.setVisibility(0);
                } else {
                    this.f.setVisibility(8);
                }
            }
            CheckBox checkBox = this.l;
            if (checkBox != null) {
                checkBox.setText((CharSequence) null);
                this.l.setChecked(false);
                this.l.setOnCheckedChangeListener(null);
                e(this.l, bm.w);
                this.l.setTextColor(bm.j);
                CheckBox checkBox2 = this.l;
                int i5 = bm.n;
                int I = AbstractC2845Vx.I(0.3f, AbstractC2845Vx.X(AbstractC2845Vx.e0(checkBox2.getContext(), android.R.attr.textColorPrimary, 0)) ? ViewCompat.MEASURED_STATE_MASK : -1);
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled, -16842912}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, android.R.attr.state_checked}}, new int[]{AbstractC2845Vx.e0(checkBox2.getContext(), R.attr.colorControlNormal, 0), i5, I, I});
                if (Build.VERSION.SDK_INT >= 22) {
                    checkBox2.setButtonTintList(colorStateList2);
                } else {
                    Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(checkBox2.getContext(), R.drawable.abc_btn_check_material));
                    DrawableCompat.setTintList(drawableWrap, colorStateList2);
                    checkBox2.setButtonDrawable(drawableWrap);
                }
            }
            this.f3681a.setButtonGravity(bm.g);
            this.f3681a.setButtonStackedGravity(bm.e);
            this.f3681a.setStackingBehavior(null);
            boolean zD1 = AbstractC2845Vx.d0(context, android.R.attr.textAllCaps, true);
            zD1 = zD1 ? AbstractC2845Vx.d0(context, R.attr.textAllCaps, true) : zD1;
            MDButton mDButton = this.m;
            e(mDButton, bm.x);
            mDButton.setAllCapsCompat(zD1);
            mDButton.setText(bm.l);
            mDButton.setTextColor(bm.o);
            MDButton mDButton2 = this.m;
            EnumC2706Qo enumC2706Qo = EnumC2706Qo.f3627a;
            mDButton2.setStackedSelector(c(enumC2706Qo, true));
            this.m.setDefaultSelector(c(enumC2706Qo, false));
            this.m.setTag(enumC2706Qo);
            this.m.setOnClickListener(this);
            MDButton mDButton3 = this.o;
            e(mDButton3, bm.x);
            mDButton3.setAllCapsCompat(zD1);
            mDButton3.setText((CharSequence) null);
            mDButton3.setTextColor(bm.p);
            MDButton mDButton4 = this.o;
            EnumC2706Qo enumC2706Qo2 = EnumC2706Qo.c;
            mDButton4.setStackedSelector(c(enumC2706Qo2, true));
            this.o.setDefaultSelector(c(enumC2706Qo2, false));
            this.o.setTag(enumC2706Qo2);
            this.o.setOnClickListener(this);
            MDButton mDButton5 = this.n;
            e(mDButton5, bm.x);
            mDButton5.setAllCapsCompat(zD1);
            mDButton5.setText((CharSequence) null);
            mDButton5.setTextColor(bm.q);
            MDButton mDButton6 = this.n;
            EnumC2706Qo enumC2706Qo3 = EnumC2706Qo.b;
            mDButton6.setStackedSelector(c(enumC2706Qo3, true));
            this.n.setDefaultSelector(c(enumC2706Qo3, false));
            this.n.setTag(enumC2706Qo3);
            this.n.setOnClickListener(this);
            if (this.h != null) {
                Object obj = bm.y;
                if (obj == null) {
                    this.p = 1;
                    bm.y = new C2576Ln(this, R.layout.md_listitem);
                } else if (obj instanceof QK) {
                    ((MaterialSimpleListAdapter) ((QK) obj)).f52a = this;
                }
            }
            EditText editText = (EditText) this.f3681a.findViewById(android.R.id.input);
            this.g = editText;
            if (editText != null) {
                e(editText, bm.w);
                EditText editText2 = this.g;
                if (editText2 != null) {
                    editText2.addTextChangedListener(new AM(this));
                }
                this.g.setHint((CharSequence) null);
                this.g.setSingleLine();
                this.g.setTextColor(bm.j);
                this.g.setHintTextColor(AbstractC2845Vx.I(0.3f, bm.j));
                AbstractC2340Cl.R(this.g, bm.n);
                TextView textView5 = (TextView) this.f3681a.findViewById(R.id.md_minMax);
                this.k = textView5;
                textView5.setVisibility(8);
                this.k = null;
            }
            if (bm.m != null) {
                ((MDRootLayout) this.f3681a.findViewById(R.id.md_root)).k = true;
                FrameLayout frameLayout = (FrameLayout) this.f3681a.findViewById(R.id.md_customViewFrame);
                this.j = frameLayout;
                View view2 = bm.m;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                if (bm.C) {
                    Resources resources = getContext().getResources();
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
                    ScrollView scrollView = new ScrollView(getContext());
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.md_content_padding_top);
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.md_content_padding_bottom);
                    scrollView.setClipToPadding(false);
                    if (view2 instanceof EditText) {
                        scrollView.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize4);
                    } else {
                        scrollView.setPadding(0, dimensionPixelSize3, 0, dimensionPixelSize4);
                        view2.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    }
                    i2 = -1;
                    scrollView.addView(view2, new FrameLayout.LayoutParams(-1, -2));
                    view = scrollView;
                } else {
                    i2 = -1;
                    view = view2;
                }
                frameLayout.addView(view, new ViewGroup.LayoutParams(i2, -2));
            }
            DialogInterface.OnShowListener onShowListener = bm.B;
            if (onShowListener != null) {
                this.b = onShowListener;
            }
            DialogInterface.OnDismissListener onDismissListener = bm.A;
            if (onDismissListener != null) {
                setOnDismissListener(onDismissListener);
            }
            a();
            if (this.h != null) {
                bm.getClass();
                if (bm.y != null) {
                    if (bm.z == null) {
                        bm.z = new LinearLayoutManager(getContext());
                    }
                    if (this.h.getLayoutManager() == null) {
                        this.h.setLayoutManager(bm.z);
                    }
                    this.h.setAdapter(bm.y);
                    if (this.p != 0) {
                        bm.y.d = this;
                    }
                }
            }
            b(this.f3681a);
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC5184zM(this));
            }
            Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i6 = point.x;
            int i7 = point.y;
            int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_vertical_margin);
            int dimensionPixelSize6 = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin);
            this.f3681a.setMaxHeight(i7 - (dimensionPixelSize5 * 2));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(getWindow().getAttributes());
            layoutParams.width = Math.min(context.getResources().getDimensionPixelSize(R.dimen.md_dialog_max_width), i6 - (dimensionPixelSize6 * 2));
            getWindow().setAttributes(layoutParams);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void e(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    public final Drawable c(EnumC2706Qo enumC2706Qo, boolean z) {
        BM bm = this.c;
        if (z) {
            bm.getClass();
            Drawable drawableF0 = AbstractC2845Vx.f0(bm.f2867a, R.attr.md_btn_stacked_selector);
            return drawableF0 != null ? drawableF0 : AbstractC2845Vx.f0(getContext(), R.attr.md_btn_stacked_selector);
        }
        int iOrdinal = enumC2706Qo.ordinal();
        if (iOrdinal == 1) {
            bm.getClass();
            Drawable drawableF1 = AbstractC2845Vx.f0(bm.f2867a, R.attr.md_btn_neutral_selector);
            if (drawableF1 != null) {
                return drawableF1;
            }
            Drawable drawableF2 = AbstractC2845Vx.f0(getContext(), R.attr.md_btn_neutral_selector);
            int i = bm.h;
            if (drawableF2 instanceof RippleDrawable) {
                ((RippleDrawable) drawableF2).setColor(ColorStateList.valueOf(i));
            }
            return drawableF2;
        }
        if (iOrdinal != 2) {
            bm.getClass();
            Drawable drawableF3 = AbstractC2845Vx.f0(bm.f2867a, R.attr.md_btn_positive_selector);
            if (drawableF3 != null) {
                return drawableF3;
            }
            Drawable drawableF4 = AbstractC2845Vx.f0(getContext(), R.attr.md_btn_positive_selector);
            int i2 = bm.h;
            if (drawableF4 instanceof RippleDrawable) {
                ((RippleDrawable) drawableF4).setColor(ColorStateList.valueOf(i2));
            }
            return drawableF4;
        }
        bm.getClass();
        Drawable drawableF5 = AbstractC2845Vx.f0(bm.f2867a, R.attr.md_btn_negative_selector);
        if (drawableF5 != null) {
            return drawableF5;
        }
        Drawable drawableF6 = AbstractC2845Vx.f0(getContext(), R.attr.md_btn_negative_selector);
        int i3 = bm.h;
        if (drawableF6 instanceof RippleDrawable) {
            ((RippleDrawable) drawableF6).setColor(ColorStateList.valueOf(i3));
        }
        return drawableF6;
    }

    public final boolean d(View view, int i, boolean z) {
        if (!view.isEnabled()) {
            return false;
        }
        int i2 = this.p;
        BM bm = this.c;
        if (i2 == 0 || i2 == 1) {
            if (bm.v) {
                dismiss();
            }
        } else {
            if (i2 == 3) {
                if (((CheckBox) view.findViewById(R.id.md_control)).isEnabled()) {
                    throw null;
                }
                return false;
            }
            if (i2 == 2) {
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.md_control);
                if (!radioButton.isEnabled()) {
                    return false;
                }
                int i3 = bm.u;
                if (bm.v && bm.l == null) {
                    dismiss();
                    bm.u = i;
                    bm.getClass();
                } else {
                    bm.u = i;
                    radioButton.setChecked(true);
                    bm.y.notifyItemChanged(i3);
                    bm.y.notifyItemChanged(i);
                }
            }
        }
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        EditText editText = this.g;
        if (editText != null && editText != null && (inputMethodManager = (InputMethodManager) this.c.f2867a.getSystemService("input_method")) != null) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
            } else {
                MDRootLayout mDRootLayout = this.f3681a;
                windowToken = mDRootLayout != null ? mDRootLayout.getWindowToken() : null;
            }
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        super.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iOrdinal = ((EnumC2706Qo) view.getTag()).ordinal();
        BM bm = this.c;
        if (iOrdinal == 0) {
            bm.getClass();
            bm.getClass();
            bm.getClass();
            if (bm.v) {
                dismiss();
            }
        } else if (iOrdinal == 1) {
            bm.getClass();
            if (bm.v) {
                dismiss();
            }
        } else if (iOrdinal == 2) {
            bm.getClass();
            if (bm.v) {
                cancel();
            }
        }
        bm.getClass();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC2732Ro, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        EditText editText = this.g;
        if (editText != null) {
            editText.post(new RunnableC3252dN(this, this.c, 1));
            if (this.g.getText().length() > 0) {
                EditText editText2 = this.g;
                editText2.setSelection(editText2.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new CM("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        setTitle(this.c.f2867a.getString(i));
    }
}
