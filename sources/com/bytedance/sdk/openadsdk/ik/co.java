package com.bytedance.sdk.openadsdk.ik;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class co extends Dialog {
    private com.bytedance.sdk.openadsdk.core.di.ka di;
    private com.bytedance.sdk.openadsdk.core.di.mj fi;
    private com.bytedance.sdk.openadsdk.core.di.lr ik;
    private com.bytedance.sdk.openadsdk.core.di.mj ka;
    private ri lr;
    private com.bytedance.sdk.openadsdk.core.di.fi ri;
    private final qt xha;

    public interface ri {
        void ik();

        void lr();

        void ri();

        void ri(int i, FilterWord filterWord, String str);
    }

    public co(Context context, qt qtVar) {
        super(context, uq.di(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.xha = qtVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        lr();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi = ri(nr.ri());
        this.ri = fiVarRi;
        setContentView(fiVarRi);
        ri(this.ri);
        ik();
        ri();
        ka();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ri riVar = this.lr;
        if (riVar != null) {
            riVar.ri();
        }
    }

    private void ik() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    private void ka() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.ik.co.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (co.this.lr != null) {
                    co.this.lr.ik();
                }
            }
        });
    }

    private void ri(View view) {
        ri((EditText) this.ik);
        qt qtVar = this.xha;
        if (qtVar != null) {
            String strXha = qtVar.xha();
            if (!TextUtils.isEmpty(strXha)) {
                this.ik.setText(strXha);
                this.ka.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strXha.length()), "/200"));
            }
            this.fi.setEnabled(!TextUtils.isEmpty(strXha));
        }
        this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.co.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = co.this.ik.getText().toString();
                if (co.this.lr != null) {
                    co.this.lr.ri(4, qt.ri, string);
                }
                co.this.dismiss();
            }
        });
        this.di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.co.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (co.this.lr != null) {
                    co.this.lr.lr();
                }
                co.this.dismiss();
            }
        });
        this.ik.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.ik.co.3
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                com.bytedance.sdk.openadsdk.core.di.mj mjVar;
                int iRound = Math.round(charSequence.length());
                co.this.ka.setText(iRound + "/200");
                boolean z = true;
                if (iRound <= 0) {
                    mjVar = co.this.fi;
                    if (co.this.xha == null || TextUtils.isEmpty(co.this.xha.xha())) {
                        z = false;
                    }
                } else if (co.this.fi.isEnabled()) {
                    return;
                } else {
                    mjVar = co.this.fi;
                }
                mjVar.setEnabled(z);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    public void lr() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.di.lr lrVar = this.ik;
        if (lrVar == null || (inputMethodManager = (InputMethodManager) lrVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.ri.getWindowToken(), 0);
    }

    public static void ri(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.ik.co.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = Character.getType(charSequence.charAt(i));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void ri(ri riVar) {
        this.lr = riVar;
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.core.di.lr lrVar = this.ik;
        if (lrVar == null) {
            return;
        }
        lrVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void ri(wjv wjvVar) {
        qt qtVar = this.xha;
        if (qtVar != null) {
            qtVar.ri(wjvVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.di.fi ri(Context context) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        fiVar.setOrientation(1);
        fiVar.setBackground(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(context);
        xhaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, qd.lr(context, 48.0f)));
        this.di = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        int iLr = qd.lr(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLr, iLr);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iLr2 = qd.lr(context, 10.0f);
        layoutParams.topMargin = iLr2;
        layoutParams.rightMargin = iLr2;
        this.di.setLayoutParams(layoutParams);
        this.di.setClickable(true);
        this.di.setFocusable(true);
        this.di.setImageDrawable(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = qd.lr(context, 12.0f);
        mjVar.setLayoutParams(layoutParams2);
        mjVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        mjVar.setGravity(17);
        mjVar.setSingleLine(true);
        mjVar.setText(uq.ri(context, "tt_other_reason"));
        mjVar.setTextColor(Color.parseColor("#161823"));
        mjVar.setTextSize(15.0f);
        mjVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, qd.lr(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fiVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.di.lr lrVar = new com.bytedance.sdk.openadsdk.core.di.lr(context);
        this.ik = lrVar;
        lrVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = qd.lr(context, 16.0f);
        layoutParams3.rightMargin = qd.lr(context, 16.0f);
        layoutParams3.topMargin = qd.lr(context, 11.5f);
        this.ik.setLayoutParams(layoutParams3);
        this.ik.setLines(4);
        this.ik.setGravity(48);
        this.ik.setTextSize(15.0f);
        this.ik.setTextColor(Color.rgb(22, 24, 35));
        this.ik.setHintTextColor(Color.parseColor("#57161823"));
        this.ik.setBackground(null);
        this.ik.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar3 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iLr3 = qd.lr(context, 16.0f);
        int iLr4 = qd.lr(context, 17.0f);
        fiVar3.setPadding(iLr3, iLr4, iLr3, iLr4);
        fiVar3.setLayoutParams(layoutParams4);
        fiVar3.setOrientation(0);
        this.ka = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.ka.setLayoutParams(layoutParams5);
        this.ka.setText(String.format("0%s", "/200"));
        this.ka.setGravity(8388611);
        this.ka.setTextColor(Color.parseColor("#57161823"));
        this.ka.setTextSize(15.0f);
        this.fi = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.fi.setLayoutParams(layoutParams6);
        this.fi.setTextSize(14.0f);
        this.fi.setTextColor(-1);
        this.fi.setVisibility(0);
        this.fi.setSingleLine(true);
        int iLr5 = qd.lr(context, 27.0f);
        int iLr6 = qd.lr(context, 5.0f);
        this.fi.setPadding(iLr5, iLr6, iLr5, iLr6);
        int iLr7 = qd.lr(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = iLr7;
        gradientDrawable.setCornerRadius(f);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.fi.setBackground(stateListDrawable);
        this.fi.setText(uq.ri(context, "tt_done"));
        this.fi.setEnabled(false);
        fiVar.addView(xhaVar);
        fiVar.addView(view);
        fiVar.addView(fiVar2);
        xhaVar.addView(this.di);
        xhaVar.addView(mjVar);
        fiVar2.addView(this.ik);
        fiVar2.addView(fiVar3);
        fiVar3.addView(this.ka);
        fiVar3.addView(this.fi);
        return fiVar;
    }
}
