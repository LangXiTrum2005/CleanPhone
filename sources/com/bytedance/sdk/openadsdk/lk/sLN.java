package com.bytedance.sdk.openadsdk.lk;

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
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends Dialog {
    private com.bytedance.sdk.openadsdk.core.JXs.OY JXs;
    private Lxb LD;
    private com.bytedance.sdk.openadsdk.core.JXs.JXs Lxb;
    private String OY;
    private String QAg;
    private com.bytedance.sdk.openadsdk.core.JXs.OY ZU;
    private String ebl;
    private com.bytedance.sdk.openadsdk.core.JXs.ZU lc;
    private com.bytedance.sdk.openadsdk.core.JXs.LD lk;
    private final nBu nBu;

    public interface Lxb {
        void LD();

        void Lxb();

        void Lxb(int i, FilterWord filterWord, String str);

        void lk();
    }

    public sLN(@NonNull Context context, nBu nbu) {
        super(context, tD.lc(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.nBu = nbu;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        LD();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb = Lxb(kqm.Lxb());
        this.Lxb = jXsLxb;
        setContentView(jXsLxb);
        Lxb(this.Lxb);
        lk();
        Lxb();
        ZU();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Lxb lxb = this.LD;
        if (lxb != null) {
            lxb.Lxb();
        }
    }

    private void Lxb(View view) {
        Lxb((EditText) this.lk);
        nBu nbu = this.nBu;
        if (nbu != null) {
            String strEbl = nbu.ebl();
            if (!TextUtils.isEmpty(strEbl)) {
                this.lk.setText(strEbl);
                this.ZU.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strEbl.length()), "/200"));
            }
            this.JXs.setEnabled(true ^ TextUtils.isEmpty(strEbl));
        }
        this.JXs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.sLN.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = sLN.this.lk.getText().toString();
                if (sLN.this.LD != null) {
                    sLN.this.LD.Lxb(4, nBu.Lxb, string);
                }
                sLN.this.dismiss();
            }
        });
        this.lc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.sLN.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (sLN.this.LD != null) {
                    sLN.this.LD.LD();
                }
                sLN.this.dismiss();
            }
        });
        this.lk.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.lk.sLN.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                com.bytedance.sdk.openadsdk.core.JXs.OY oy;
                int iRound = Math.round(charSequence.length());
                sLN.this.ZU.setText(AbstractC3950lJ.n(iRound, "/200"));
                boolean z = true;
                if (iRound <= 0) {
                    oy = sLN.this.JXs;
                    if (sLN.this.nBu == null || TextUtils.isEmpty(sLN.this.nBu.ebl())) {
                        z = false;
                    }
                } else if (sLN.this.JXs.isEnabled()) {
                    return;
                } else {
                    oy = sLN.this.JXs;
                }
                oy.setEnabled(z);
            }
        });
    }

    private void ZU() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.lk.sLN.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (sLN.this.LD != null) {
                    sLN.this.LD.lk();
                }
            }
        });
    }

    private void lk() {
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

    public void LD() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.JXs.LD ld = this.lk;
        if (ld == null || (inputMethodManager = (InputMethodManager) ld.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.Lxb.getWindowToken(), 0);
    }

    public static void Lxb(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.lk.sLN.4
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

    public void Lxb(Lxb lxb) {
        this.LD = lxb;
    }

    public void Lxb() {
        com.bytedance.sdk.openadsdk.core.JXs.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        ld.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void Lxb(String str, String str2) {
        this.ebl = str;
        this.OY = str2;
        nBu nbu = this.nBu;
        if (nbu != null) {
            nbu.ZU(str2);
        }
    }

    public void Lxb(String str) {
        this.QAg = str;
    }

    private com.bytedance.sdk.openadsdk.core.JXs.JXs Lxb(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        jXs.setOrientation(1);
        jXs.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setLayoutParams(new LinearLayout.LayoutParams(-1, le.lk(context, 48.0f)));
        this.lc = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        int iLk = le.lk(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLk, iLk);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iLk2 = le.lk(context, 10.0f);
        layoutParams.topMargin = iLk2;
        layoutParams.rightMargin = iLk2;
        this.lc.setLayoutParams(layoutParams);
        this.lc.setClickable(true);
        this.lc.setFocusable(true);
        this.lc.setImageDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = le.lk(context, 12.0f);
        oy.setLayoutParams(layoutParams2);
        oy.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        oy.setGravity(17);
        oy.setSingleLine(true);
        oy.setText(tD.Lxb(context, "tt_other_reason"));
        oy.setTextColor(Color.parseColor("#161823"));
        oy.setTextSize(15.0f);
        oy.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, le.lk(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jXs2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.JXs.LD ld = new com.bytedance.sdk.openadsdk.core.JXs.LD(context);
        this.lk = ld;
        ld.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = le.lk(context, 16.0f);
        layoutParams3.rightMargin = le.lk(context, 16.0f);
        layoutParams3.topMargin = le.lk(context, 11.5f);
        this.lk.setLayoutParams(layoutParams3);
        this.lk.setLines(4);
        this.lk.setGravity(48);
        this.lk.setHint(tD.Lxb(context, "tt_suggestion_description"));
        this.lk.setTextSize(15.0f);
        this.lk.setTextColor(Color.rgb(22, 24, 35));
        this.lk.setHintTextColor(Color.parseColor("#57161823"));
        this.lk.setBackground(null);
        this.lk.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iLk3 = le.lk(context, 16.0f);
        int iLk4 = le.lk(context, 17.0f);
        jXs3.setPadding(iLk3, iLk4, iLk3, iLk4);
        jXs3.setLayoutParams(layoutParams4);
        jXs3.setOrientation(0);
        this.ZU = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = GravityCompat.START;
        this.ZU.setLayoutParams(layoutParams5);
        this.ZU.setText("0/200");
        this.ZU.setGravity(GravityCompat.START);
        this.ZU.setTextColor(Color.parseColor("#57161823"));
        this.ZU.setTextSize(15.0f);
        this.JXs = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = GravityCompat.END;
        this.JXs.setLayoutParams(layoutParams6);
        this.JXs.setTextSize(14.0f);
        this.JXs.setTextColor(-1);
        this.JXs.setVisibility(0);
        this.JXs.setSingleLine(true);
        int iLk5 = le.lk(context, 27.0f);
        int iLk6 = le.lk(context, 5.0f);
        this.JXs.setPadding(iLk5, iLk6, iLk5, iLk6);
        int iLk7 = le.lk(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = iLk7;
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
        this.JXs.setBackground(stateListDrawable);
        this.JXs.setText(tD.Lxb(context, "tt_done"));
        this.JXs.setEnabled(false);
        jXs.addView(eblVar);
        jXs.addView(view);
        jXs.addView(jXs2);
        eblVar.addView(this.lc);
        eblVar.addView(oy);
        jXs2.addView(this.lk);
        jXs2.addView(jXs3);
        jXs3.addView(this.ZU);
        jXs3.addView(this.JXs);
        return jXs;
    }
}
