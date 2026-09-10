package com.smartdigimkt.h3;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.x;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Dialog {
    private static final String g0 = "ATAlertDialog";
    private com.smartdigimkt.h3.b X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private TextView f35627Y;
    private TextView Z;
    private Button e0;
    private Button f0;

    /* JADX INFO: renamed from: com.smartdigimkt.h3.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0499a implements View.OnClickListener {
        final /* synthetic */ com.smartdigimkt.h3.b X;

        public ViewOnClickListenerC0499a(com.smartdigimkt.h3.b bVar) {
            this.X = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.h3.b bVar = this.X;
            if (bVar != null) {
                bVar.c();
            }
            a.this.cancel();
            a.this.a();
        }
    }

    public class b implements View.OnClickListener {
        final /* synthetic */ com.smartdigimkt.h3.b X;

        public b(com.smartdigimkt.h3.b bVar) {
            this.X = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.h3.b bVar = this.X;
            if (bVar != null) {
                bVar.a();
            }
            a.this.cancel();
            a.this.a();
        }
    }

    public a(Context context, com.smartdigimkt.h3.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(k.a(context, "sdm_cm_alertview", "layout"), (ViewGroup) null);
        this.X = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f35627Y = (TextView) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_titleview", "id"));
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                this.Z = (TextView) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_contentview", "id"));
                this.e0 = (Button) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_confirm_button", "id"));
                this.f0 = (Button) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_cancel_button", "id"));
            } catch (Exception e3) {
                e3.getMessage();
            }
        }
        Button button = this.f0;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC0499a(bVar));
        }
        Button button2 = this.e0;
        if (button2 != null) {
            button2.setOnClickListener(new b(bVar));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public void a() {
        if (this.X != null) {
            this.X = null;
        }
    }

    public void b(String str) {
        Button button = this.f0;
        if (button != null) {
            button.setText(str);
        }
    }

    public void c(String str) {
        Button button = this.e0;
        if (button != null) {
            button.setText(str);
        }
    }

    public void d(String str) {
        TextView textView = this.Z;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void e(String str) {
        TextView textView = this.f35627Y;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            a(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e2) {
            e2.getMessage();
            super.show();
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        e(str);
        d(str2);
        c(str3);
        b(str4);
    }

    private void c() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        String string = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_warn", k.f38992h));
        String string2 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_desc", k.f38992h));
        String string3 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close", k.f38992h));
        String string4 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_continue_to_play", k.f38992h));
        e(string);
        d(string2);
        c(string3);
        b(string4);
    }

    private void d() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        String string = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_warn", k.f38992h));
        String string2 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_desc", k.f38992h));
        String string3 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close", k.f38992h));
        String string4 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_cancel_close", k.f38992h));
        e(string);
        d(string2);
        c(string3);
        b(string4);
    }

    public void b() {
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        if (aVarC != null) {
            a(aVarC.D(), aVarC.B(), aVarC.C(), aVarC.z());
        } else {
            c();
        }
    }

    public void a(String str) {
        try {
            d();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void a(int i2) {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        String string = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_warn", k.f38992h));
        String string2 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_warn_tips", k.f38992h));
        String string3 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_warn_close", k.f38992h));
        String string4 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_warn_continue", k.f38992h));
        String string5 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close", k.f38992h));
        String string6 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_cancel", k.f38992h));
        String string7 = contextK.getString(k.a(getContext(), "sdm_cm_dialog_alert_confim_close_continue", k.f38992h));
        if (i2 != com.smartdigimkt.b0.a.v2) {
            string = string2;
        }
        e(string);
        if (i2 != com.smartdigimkt.b0.a.v2) {
            string3 = string4;
        }
        d(string3);
        if (i2 != com.smartdigimkt.b0.a.v2) {
            string5 = string6;
        }
        c(string5);
        b(string7);
    }

    public void a(int i2, String str) {
        try {
            String string = x.b(getContext(), "Anythink_ConfirmTitle" + str, "").toString();
            String string2 = x.b(getContext(), "Anythink_ConfirmContent" + str, "").toString();
            String string3 = x.b(getContext(), "Anythink_CancelText" + str, "").toString();
            String string4 = x.b(getContext(), "Anythink_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                a(i2);
            } else {
                a(string, string2, string3, string4);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void a(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i2 = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(4098);
            if (i2 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (i2 >= 30) {
                    attributes.layoutInDisplayCutoutMode = 3;
                } else {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }
}
