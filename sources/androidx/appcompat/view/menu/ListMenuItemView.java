package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.storage.androidcleaner.R;
import g9.k;
import j.a;
import o.m;
import o.o;
import o.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f3850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f3851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f3852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f3853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f3854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f3855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f3856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f3857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f3858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f3859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3860k;
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f3862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f3864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3865q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k kVarZ = k.z(getContext(), attributeSet, a.f43533r, R.attr.listMenuViewStyle);
        this.f3859j = kVarZ.s(5);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        this.f3860k = typedArray.getResourceId(1, -1);
        this.f3861m = typedArray.getBoolean(7, false);
        this.l = context;
        this.f3862n = kVarZ.s(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3863o = typedArrayObtainStyledAttributes.hasValue(0);
        kVarZ.B();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3864p == null) {
            this.f3864p = LayoutInflater.from(getContext());
        }
        return this.f3864p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f3856g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3857h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3857h.getLayoutParams();
        rect.top = this.f3857h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // o.z
    public final void c(o oVar) {
        boolean z10;
        int i10;
        String string;
        boolean z11;
        this.f3850a = oVar;
        boolean zIsVisible = oVar.isVisible();
        m mVar = oVar.f46997n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(oVar.f46989e);
        setCheckable(oVar.isCheckable());
        if (mVar.o()) {
            if ((mVar.n() ? oVar.f46994j : oVar.f46992h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        mVar.n();
        if (z10) {
            o oVar2 = this.f3850a;
            m mVar2 = oVar2.f46997n;
            if (mVar2.o()) {
                if ((mVar2.n() ? oVar2.f46994j : oVar2.f46992h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            i10 = z11 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.f3855f;
            o oVar3 = this.f3850a;
            m mVar3 = oVar3.f46997n;
            Context context = mVar3.f46959a;
            char c4 = mVar3.n() ? oVar3.f46994j : oVar3.f46992h;
            if (c4 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = mVar3.n() ? oVar3.f46995k : oVar3.f46993i;
                o.c(i11, C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                o.c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                o.c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                o.c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                o.c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                o.c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                if (c4 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c4 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c4 != ' ') {
                    sb2.append(c4);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f3855f.getVisibility() != i10) {
            this.f3855f.setVisibility(i10);
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f47000q);
    }

    @Override // o.z
    public o getItemData() {
        return this.f3850a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f3859j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3853d = textView;
        int i10 = this.f3860k;
        if (i10 != -1) {
            textView.setTextAppearance(this.l, i10);
        }
        this.f3855f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3856g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3862n);
        }
        this.f3857h = (ImageView) findViewById(R.id.group_divider);
        this.f3858i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f3851b != null && this.f3861m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3851b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f3852c == null && this.f3854e == null) {
            return;
        }
        if ((this.f3850a.f47007x & 4) != 0) {
            if (this.f3852c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3852c = radioButton;
                LinearLayout linearLayout = this.f3858i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3852c;
            view = this.f3854e;
        } else {
            if (this.f3854e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3854e = checkBox;
                LinearLayout linearLayout2 = this.f3858i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3854e;
            view = this.f3852c;
        }
        if (z10) {
            compoundButton.setChecked(this.f3850a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3854e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3852c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f3850a.f47007x & 4) != 0) {
            if (this.f3852c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3852c = radioButton;
                LinearLayout linearLayout = this.f3858i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3852c;
        } else {
            if (this.f3854e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3854e = checkBox;
                LinearLayout linearLayout2 = this.f3858i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3854e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f3865q = z10;
        this.f3861m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f3857h;
        if (imageView != null) {
            imageView.setVisibility((this.f3863o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f3850a.f46997n;
        boolean z10 = this.f3865q;
        if (z10 || this.f3861m) {
            ImageView imageView = this.f3851b;
            if (imageView == null && drawable == null && !this.f3861m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3851b = imageView2;
                LinearLayout linearLayout = this.f3858i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3861m) {
                this.f3851b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3851b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3851b.getVisibility() != 0) {
                this.f3851b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3853d.getVisibility() != 8) {
                this.f3853d.setVisibility(8);
            }
        } else {
            this.f3853d.setText(charSequence);
            if (this.f3853d.getVisibility() != 0) {
                this.f3853d.setVisibility(0);
            }
        }
    }
}
