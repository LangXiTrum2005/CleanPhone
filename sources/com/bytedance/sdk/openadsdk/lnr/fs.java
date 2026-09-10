package com.bytedance.sdk.openadsdk.lnr;

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
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class fs extends Dialog {
    private com.bytedance.sdk.openadsdk.core.mo.ud lnr;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mml;
    private com.bytedance.sdk.openadsdk.core.mo.mml mo;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mzz;
    private com.bytedance.sdk.openadsdk.core.mo.mzz qdl;
    private qdl ud;
    private final to wd;

    public interface qdl {
        void lnr();

        void qdl();

        void qdl(int i2, FilterWord filterWord, String str);

        void ud();
    }

    public fs(Context context, to toVar) {
        super(context, ljh.mo(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.wd = toVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ud();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl = qdl(yt.qdl());
        this.qdl = mzzVarQdl;
        setContentView(mzzVarQdl);
        qdl(this.qdl);
        lnr();
        qdl();
        mml();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.qdl();
        }
    }

    private void lnr() {
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

    private void mml() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.lnr.fs.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (fs.this.ud != null) {
                    fs.this.ud.lnr();
                }
            }
        });
    }

    private void qdl(View view) {
        qdl((EditText) this.lnr);
        to toVar = this.wd;
        if (toVar != null) {
            String strWd = toVar.wd();
            if (!TextUtils.isEmpty(strWd)) {
                this.lnr.setText(strWd);
                this.mml.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strWd.length()), "/200"));
            }
            this.mzz.setEnabled(!TextUtils.isEmpty(strWd));
        }
        this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.fs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = fs.this.lnr.getText().toString();
                if (fs.this.ud != null) {
                    fs.this.ud.qdl(4, to.qdl, string);
                }
                fs.this.dismiss();
            }
        });
        this.mo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.fs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (fs.this.ud != null) {
                    fs.this.ud.ud();
                }
                fs.this.dismiss();
            }
        });
        this.lnr.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.lnr.fs.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar;
                int iRound = Math.round(charSequence.length());
                fs.this.mml.setText(a.f(iRound, "/200"));
                boolean z2 = true;
                if (iRound <= 0) {
                    jpcVar = fs.this.mzz;
                    if (fs.this.wd == null || TextUtils.isEmpty(fs.this.wd.wd())) {
                        z2 = false;
                    }
                } else if (fs.this.mzz.isEnabled()) {
                    return;
                } else {
                    jpcVar = fs.this.mzz;
                }
                jpcVar.setEnabled(z2);
            }
        });
    }

    public void ud() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.mo.ud udVar = this.lnr;
        if (udVar == null || (inputMethodManager = (InputMethodManager) udVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.qdl.getWindowToken(), 0);
    }

    public static void qdl(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.lnr.fs.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                while (i2 < i3) {
                    int type = Character.getType(charSequence.charAt(i2));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i2++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void qdl(qdl qdlVar) {
        this.ud = qdlVar;
    }

    public void qdl() {
        com.bytedance.sdk.openadsdk.core.mo.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void qdl(String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        to toVar = this.wd;
        if (toVar != null) {
            toVar.qdl(str, ljhVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.mo.mzz qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        mzzVar.setOrientation(1);
        mzzVar.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setLayoutParams(new LinearLayout.LayoutParams(-1, ax.ud(context, 48.0f)));
        this.mo = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        int iUd = ax.ud(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iUd, iUd);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iUd2 = ax.ud(context, 10.0f);
        layoutParams.topMargin = iUd2;
        layoutParams.rightMargin = iUd2;
        this.mo.setLayoutParams(layoutParams);
        this.mo.setClickable(true);
        this.mo.setFocusable(true);
        this.mo.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -2, 16);
        layoutParamsF.topMargin = ax.ud(context, 12.0f);
        jpcVar.setLayoutParams(layoutParamsF);
        jpcVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        jpcVar.setGravity(17);
        jpcVar.setSingleLine(true);
        jpcVar.setText(ljh.qdl(context, "tt_other_reason"));
        jpcVar.setTextColor(Color.parseColor("#161823"));
        jpcVar.setTextSize(15.0f);
        jpcVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, ax.ud(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        mzzVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.mo.ud udVar = new com.bytedance.sdk.openadsdk.core.mo.ud(context);
        this.lnr = udVar;
        udVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = ax.ud(context, 16.0f);
        layoutParams2.rightMargin = ax.ud(context, 16.0f);
        layoutParams2.topMargin = ax.ud(context, 11.5f);
        this.lnr.setLayoutParams(layoutParams2);
        this.lnr.setLines(4);
        this.lnr.setGravity(48);
        this.lnr.setTextSize(15.0f);
        this.lnr.setTextColor(Color.rgb(22, 24, 35));
        this.lnr.setHintTextColor(Color.parseColor("#57161823"));
        this.lnr.setBackground(null);
        this.lnr.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iUd3 = ax.ud(context, 16.0f);
        int iUd4 = ax.ud(context, 17.0f);
        mzzVar3.setPadding(iUd3, iUd4, iUd3, iUd4);
        mzzVar3.setLayoutParams(layoutParams3);
        mzzVar3.setOrientation(0);
        this.mml = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 8388611;
        this.mml.setLayoutParams(layoutParams4);
        this.mml.setText("0/200");
        this.mml.setGravity(8388611);
        this.mml.setTextColor(Color.parseColor("#57161823"));
        this.mml.setTextSize(15.0f);
        this.mzz = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388613;
        this.mzz.setLayoutParams(layoutParams5);
        this.mzz.setTextSize(14.0f);
        this.mzz.setTextColor(-1);
        this.mzz.setVisibility(0);
        this.mzz.setSingleLine(true);
        int iUd5 = ax.ud(context, 27.0f);
        int iUd6 = ax.ud(context, 5.0f);
        this.mzz.setPadding(iUd5, iUd6, iUd5, iUd6);
        int iUd7 = ax.ud(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = iUd7;
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
        this.mzz.setBackground(stateListDrawable);
        this.mzz.setText(ljh.qdl(context, "tt_done"));
        this.mzz.setEnabled(false);
        mzzVar.addView(wdVar);
        mzzVar.addView(view);
        mzzVar.addView(mzzVar2);
        wdVar.addView(this.mo);
        wdVar.addView(jpcVar);
        mzzVar2.addView(this.lnr);
        mzzVar2.addView(mzzVar3);
        mzzVar3.addView(this.mml);
        mzzVar3.addView(this.mzz);
        return mzzVar;
    }
}
