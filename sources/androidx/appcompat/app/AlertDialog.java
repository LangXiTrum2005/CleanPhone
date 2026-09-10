package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public final AlertController g0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.AlertParams f3317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3318b;

        public Builder(Context context) {
            this(context, AlertDialog.f(context, 0));
        }

        public Builder a() {
            this.f3317a.k = false;
            return this;
        }

        public Builder b(String str) {
            this.f3317a.f = str;
            return this;
        }

        public Builder c(String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f3317a;
            alertParams.f3311i = str;
            alertParams.j = onClickListener;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        public AlertDialog create() {
            final AlertController.AlertParams alertParams = this.f3317a;
            AlertDialog alertDialog = new AlertDialog(alertParams.f3306a, this.f3318b);
            View view = alertParams.f3309e;
            final AlertController alertController = alertDialog.g0;
            if (view != null) {
                alertController.f3304w = view;
            } else {
                CharSequence charSequence = alertParams.d;
                if (charSequence != null) {
                    alertController.d = charSequence;
                    TextView textView = alertController.f3303u;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.f3308c;
                if (drawable != null) {
                    alertController.s = drawable;
                    ImageView imageView = alertController.t;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.t.setImageDrawable(drawable);
                    }
                }
            }
            String str = alertParams.f;
            if (str != null) {
                alertController.f3297e = str;
                TextView textView2 = alertController.v;
                if (textView2 != null) {
                    textView2.setText(str);
                }
            }
            CharSequence charSequence2 = alertParams.g;
            if (charSequence2 != null) {
                alertController.c(-1, charSequence2, alertParams.f3310h);
            }
            CharSequence charSequence3 = alertParams.f3311i;
            if (charSequence3 != null) {
                alertController.c(-2, charSequence3, alertParams.j);
            }
            if (alertParams.m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertParams.f3307b.inflate(alertController.f3290A, (ViewGroup) null);
                int i2 = alertParams.f3314p ? alertController.f3291B : alertController.C;
                Object obj = alertParams.m;
                ?? checkedItemAdapter = obj;
                if (obj == null) {
                    checkedItemAdapter = new AlertController.CheckedItemAdapter(alertParams.f3306a, i2, R.id.text1, null);
                }
                alertController.x = checkedItemAdapter;
                alertController.y = alertParams.q;
                if (alertParams.f3313n != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                        public final /* synthetic */ AlertController X;

                        public AnonymousClass3() {
                            alertController = alertController;
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i3, long j) {
                            AlertParams alertParams2 = AlertParams.this;
                            DialogInterface.OnClickListener onClickListener = alertParams2.f3313n;
                            AlertController alertController2 = alertController;
                            onClickListener.onClick(alertController2.f3295b, i3);
                            if (alertParams2.f3314p) {
                                return;
                            }
                            alertController2.f3295b.dismiss();
                        }
                    });
                }
                if (alertParams.f3314p) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f = recycleListView;
            }
            View view2 = alertParams.o;
            if (view2 != null) {
                alertController.g = view2;
                alertController.f3298h = false;
            }
            alertDialog.setCancelable(alertParams.k);
            if (alertParams.k) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = alertParams.f3312l;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        public Builder d(String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f3317a;
            alertParams.g = str;
            alertParams.f3310h = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f3317a.f3306a;
        }

        public Builder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f3317a;
            alertParams.f3311i = alertParams.f3306a.getText(i2);
            alertParams.j = onClickListener;
            return this;
        }

        public Builder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f3317a;
            alertParams.g = alertParams.f3306a.getText(i2);
            alertParams.f3310h = onClickListener;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.f3317a.d = charSequence;
            return this;
        }

        public Builder setView(View view) {
            this.f3317a.o = view;
            return this;
        }

        public Builder(Context context, int i2) {
            this.f3317a = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.f(context, i2)));
            this.f3318b = i2;
        }
    }

    public AlertDialog(ContextThemeWrapper contextThemeWrapper, int i2) {
        super(contextThemeWrapper, f(contextThemeWrapper, i2));
        this.g0 = new AlertController(getContext(), this, getWindow());
    }

    public static int f(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final AlertController.RecycleListView e() {
        return this.g0.f;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.g0;
        alertController.f3295b.setContentView(alertController.f3305z);
        Window window = alertController.f3296c;
        View viewFindViewById2 = window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.customPanel);
        View view = alertController.g;
        if (view == null) {
            view = null;
        }
        boolean z2 = view != null;
        if (!z2 || !AlertController.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f3298h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.charging.screenshow.battery.animations.themes.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.charging.screenshow.battery.animations.themes.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.charging.screenshow.battery.animations.themes.R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.scrollView);
        alertController.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        alertController.v = textView;
        if (textView != null) {
            String str = alertController.f3297e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                alertController.r.removeView(alertController.v);
                if (alertController.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        alertController.f3299i = button;
        View.OnClickListener onClickListener = alertController.f3293F;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.j)) {
            alertController.f3299i.setVisibility(8);
            i2 = 0;
        } else {
            alertController.f3299i.setText(alertController.j);
            alertController.f3299i.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        alertController.f3300l = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.m)) {
            alertController.f3300l.setVisibility(8);
        } else {
            alertController.f3300l.setText(alertController.m);
            alertController.f3300l.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        alertController.o = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.f3302p)) {
            alertController.o.setVisibility(8);
        } else {
            alertController.o.setText(alertController.f3302p);
            alertController.o.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        alertController.f3294a.getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = alertController.f3299i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = alertController.f3300l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = alertController.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.f3304w != null) {
            viewGroupB.addView(alertController.f3304w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.title_template).setVisibility(8);
        } else {
            alertController.t = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.d) || !alertController.D) {
                window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.title_template).setVisibility(8);
                alertController.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.alertTitle);
                alertController.f3303u = textView2;
                textView2.setText(alertController.d);
                Drawable drawable = alertController.s;
                if (drawable != null) {
                    alertController.t.setImageDrawable(drawable);
                } else {
                    alertController.f3303u.setPadding(alertController.t.getPaddingLeft(), alertController.t.getPaddingTop(), alertController.t.getPaddingRight(), alertController.t.getPaddingBottom());
                    alertController.t.setVisibility(8);
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupB3.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupB2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = alertController.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f3297e == null && alertController.f == null) ? null : viewGroupB.findViewById(com.charging.screenshow.battery.animations.themes.R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(com.charging.screenshow.battery.animations.themes.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f;
        if (recycleListView != null && (!z4 || i3 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i3 != 0 ? recycleListView.getPaddingTop() : recycleListView.e0, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f0);
        }
        if (!z3) {
            ViewGroup viewGroup3 = alertController.f;
            if (viewGroup3 == null) {
                viewGroup3 = alertController.r;
            }
            if (viewGroup3 != null) {
                int i4 = z4 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.charging.screenshow.battery.animations.themes.R.id.scrollIndicatorDown);
                ViewCompat.J(viewGroup3, i3 | i4);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f;
        if (recycleListView2 == null || (listAdapter = alertController.x) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i5 = alertController.y;
        if (i5 > -1) {
            recycleListView2.setItemChecked(i5, true);
            recycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g0.r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g0.r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.g0;
        alertController.d = charSequence;
        TextView textView = alertController.f3303u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
