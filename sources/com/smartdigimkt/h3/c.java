package com.smartdigimkt.h3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class c extends Dialog {
    private static final String i0 = "ATFeedBackDialog";
    private com.smartdigimkt.h3.b X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private TextView f35630Y;
    private LinearLayout Z;
    private Button e0;
    private Button f0;
    private int g0;
    private int h0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.X != null) {
                c.this.X.c();
            }
            c.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.X != null) {
                c.this.X.a();
            }
            c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.h3.c$c, reason: collision with other inner class name */
    public class DialogInterfaceOnCancelListenerC0500c implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC0500c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (c.this.X != null) {
                c.this.X.a();
            }
        }
    }

    public c(Context context, com.smartdigimkt.h3.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(k.a(context, "sdm_cm_feedbackview", "layout"), (ViewGroup) null);
        a(0.5f, 0.8f);
        this.X = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f35630Y = (TextView) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_titleview", "id"));
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                this.Z = (LinearLayout) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_contentview", "id"));
                this.e0 = (Button) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_confirm_button", "id"));
                this.f0 = (Button) viewInflate.findViewById(k.a(context, "sdm_video_common_alertview_cancel_button", "id"));
            } catch (Exception e3) {
                e3.getMessage();
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        c();
    }

    private void c() {
        Button button = this.f0;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        Button button2 = this.e0;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
        setOnCancelListener(new DialogInterfaceOnCancelListenerC0500c());
    }

    public com.smartdigimkt.h3.b b() {
        return this.X;
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

    public void a(boolean z2) {
        Button button = this.f0;
        if (button != null) {
            button.setClickable(z2);
        }
    }

    public void b(String str) {
        Button button = this.e0;
        if (button != null) {
            button.setText(str);
        }
    }

    public void a() {
        if (this.X != null) {
            this.X = null;
        }
    }

    public void a(com.smartdigimkt.h3.b bVar) {
        this.X = bVar;
    }

    public void c(String str) {
        TextView textView = this.f35630Y;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void a(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.Z;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = v.a(com.smartdigimkt.m6.b.p().k(), 38.0f);
            layoutParams.rightMargin = v.a(com.smartdigimkt.m6.b.p().k(), 38.0f);
            layoutParams.topMargin = v.a(com.smartdigimkt.m6.b.p().k(), 20.0f);
            layoutParams.bottomMargin = v.a(com.smartdigimkt.m6.b.p().k(), 24.0f);
            this.Z.addView(viewGroup, layoutParams);
        }
    }

    public void a(String str) {
        Button button = this.f0;
        if (button != null) {
            button.setText(str);
        }
    }

    private void a(String str, ViewGroup viewGroup, String str2, String str3) {
        c(str);
        a(viewGroup);
        b(str2);
        a(str3);
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

    public void a(float f, float f2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (a(getContext())) {
            this.h0 = displayMetrics.widthPixels;
            this.g0 = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i2 = (int) (this.g0 * f2);
            attributes.width = -1;
            attributes.height = i2;
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.h0 = displayMetrics.heightPixels;
        this.g0 = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (this.g0 * f);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}
