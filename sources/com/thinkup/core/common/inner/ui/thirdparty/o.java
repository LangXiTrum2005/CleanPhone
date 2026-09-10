package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.smartdigimkt.d2.a;
import com.thinkup.core.common.ooo.o.om;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC0663o f41860n;
    private Timer o;
    private View o0;
    private om.m om = new om.m(1);
    private String on;
    private TextView oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.o$o, reason: collision with other inner class name */
    public interface InterfaceC0663o {
        void o(int i2);
    }

    public o(Context context, View view, long j, InterfaceC0663o interfaceC0663o) {
        this.on = "";
        this.o0 = view;
        TextView textView = new TextView(context);
        textView.setHeight(o(context, 24.0f));
        textView.setGravity(17);
        textView.setPadding(o(context, 14.0f), 0, o(context, 11.0f), 0);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(1, 12.0f);
        int color = Color.parseColor("#99000000");
        float fO = o(context, 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(fO);
        textView.setBackground(gradientDrawable);
        this.oo = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.thirdparty.o.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o.o(o.this, 2);
            }
        });
        this.f41860n = interfaceC0663o;
        this.m = j;
        this.on = Locale.getDefault().getLanguage().equals(a.S) ? "跳过" : "Skip";
    }

    public static /* synthetic */ long m(o oVar, long j) {
        long j2 = oVar.m - j;
        oVar.m = j2;
        return j2;
    }

    private static boolean o0() {
        return Locale.getDefault().getLanguage().equals(a.S);
    }

    private void n() {
        Timer timer = this.o;
        if (timer != null) {
            timer.cancel();
            this.o = null;
        }
    }

    private static TextView o(Context context) {
        TextView textView = new TextView(context);
        textView.setHeight(o(context, 24.0f));
        textView.setGravity(17);
        textView.setPadding(o(context, 14.0f), 0, o(context, 11.0f), 0);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(1, 12.0f);
        int color = Color.parseColor("#99000000");
        float fO = o(context, 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(fO);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    public final void m() {
        if (this.o == null) {
            Timer timer = new Timer();
            this.o = timer;
            timer.schedule(new TimerTask() { // from class: com.thinkup.core.common.inner.ui.thirdparty.o.2
                final /* synthetic */ long o = 1000;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    o.this.o0.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.thirdparty.o.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (o.this.o0.getParent() != null && (o.this.o0.getParent() instanceof View) && o.this.om.o((View) o.this.o0.getParent(), o.this.o0, 80, 0)) {
                                if (o.this.m <= 0) {
                                    o.o(o.this, 3);
                                } else {
                                    o oVar = o.this;
                                    o.o(oVar, oVar.m);
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                o.m(o.this, anonymousClass2.o);
                            }
                        }
                    });
                }
            }, 1000L, 1000L);
            this.o0.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.thirdparty.o.3
                final /* synthetic */ long o = 1000;

                @Override // java.lang.Runnable
                public final void run() {
                    o oVar = o.this;
                    o.o(oVar, oVar.m);
                    o.m(o.this, this.o);
                }
            });
        }
    }

    public final TextView o() {
        return this.oo;
    }

    private void o(long j) {
        int i2 = (int) (j / 1000);
        TextView textView = this.oo;
        if (textView != null) {
            textView.setText(i2 + "s | " + this.on);
        }
    }

    private void o(int i2) {
        InterfaceC0663o interfaceC0663o = this.f41860n;
        if (interfaceC0663o != null) {
            interfaceC0663o.o(i2);
        }
        TextView textView = this.oo;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = this.o;
        if (timer != null) {
            timer.cancel();
            this.o = null;
        }
    }

    private static int o(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ void o(o oVar, int i2) {
        InterfaceC0663o interfaceC0663o = oVar.f41860n;
        if (interfaceC0663o != null) {
            interfaceC0663o.o(i2);
        }
        TextView textView = oVar.oo;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = oVar.o;
        if (timer != null) {
            timer.cancel();
            oVar.o = null;
        }
    }

    public static /* synthetic */ void o(o oVar, long j) {
        int i2 = (int) (j / 1000);
        TextView textView = oVar.oo;
        if (textView != null) {
            textView.setText(i2 + "s | " + oVar.on);
        }
    }
}
