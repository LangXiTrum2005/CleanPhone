package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class ToolTipPopup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f16520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16521c;
    public PopupContentView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PopupWindow f16522e;
    public Style f = Style.X;
    public long g = 6000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f16523h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.ToolTipPopup.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            WeakReference weakReference;
            boolean zB = CrashShieldHandler.b(ToolTipPopup.class);
            PopupContentView popupContentView = null;
            ToolTipPopup toolTipPopup = ToolTipPopup.this;
            if (zB) {
                weakReference = null;
            } else {
                try {
                    weakReference = toolTipPopup.f16520b;
                } catch (Throwable th) {
                    CrashShieldHandler.a(ToolTipPopup.class, th);
                    weakReference = null;
                }
            }
            if (weakReference.get() == null || ToolTipPopup.a(toolTipPopup) == null || !ToolTipPopup.a(toolTipPopup).isShowing()) {
                return;
            }
            if (ToolTipPopup.a(toolTipPopup).isAboveAnchor()) {
                if (!CrashShieldHandler.b(ToolTipPopup.class)) {
                    try {
                        popupContentView = toolTipPopup.d;
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(ToolTipPopup.class, th2);
                    }
                }
                popupContentView.e0.setVisibility(4);
                popupContentView.f0.setVisibility(0);
                return;
            }
            if (!CrashShieldHandler.b(ToolTipPopup.class)) {
                try {
                    popupContentView = toolTipPopup.d;
                } catch (Throwable th3) {
                    CrashShieldHandler.a(ToolTipPopup.class, th3);
                }
            }
            popupContentView.e0.setVisibility(0);
            popupContentView.f0.setVisibility(4);
        }
    };

    public class PopupContentView extends FrameLayout {
        public final ImageView e0;
        public final ImageView f0;
        public final View g0;
        public final ImageView h0;

        public PopupContentView(Context context) {
            super(context);
            LayoutInflater.from(getContext()).inflate(R.layout.com_facebook_tooltip_bubble, this);
            this.e0 = (ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
            this.f0 = (ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.g0 = findViewById(R.id.com_facebook_body_frame);
            this.h0 = (ImageView) findViewById(R.id.com_facebook_button_xout);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Style {
        public static final Style X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ Style[] f16524Y;

        static {
            Style style = new Style("BLUE", 0);
            X = style;
            f16524Y = new Style[]{style, new Style("BLACK", 1)};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f16524Y.clone();
        }
    }

    public ToolTipPopup(String str, LoginButton loginButton) {
        this.f16519a = str;
        this.f16520b = new WeakReference(loginButton);
        this.f16521c = loginButton.getContext();
    }

    public static /* synthetic */ PopupWindow a(ToolTipPopup toolTipPopup) {
        if (CrashShieldHandler.b(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f16522e;
        } catch (Throwable th) {
            CrashShieldHandler.a(ToolTipPopup.class, th);
            return null;
        }
    }

    public final void b() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            d();
            PopupWindow popupWindow = this.f16522e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void c() {
        Context context = this.f16521c;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        WeakReference weakReference = this.f16520b;
        try {
            if (weakReference.get() != null) {
                PopupContentView popupContentView = new PopupContentView(context);
                this.d = popupContentView;
                ((TextView) popupContentView.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body)).setText(this.f16519a);
                if (this.f == Style.X) {
                    this.d.g0.setBackgroundResource(2131231095);
                    this.d.f0.setImageResource(2131231096);
                    this.d.e0.setImageResource(2131231097);
                    this.d.h0.setImageResource(2131231098);
                } else {
                    this.d.g0.setBackgroundResource(2131231091);
                    this.d.f0.setImageResource(2131231092);
                    this.d.e0.setImageResource(2131231093);
                    this.d.h0.setImageResource(2131231094);
                }
                View decorView = ((Activity) context).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!CrashShieldHandler.b(this)) {
                    try {
                        d();
                        if (weakReference.get() != null) {
                            ((View) weakReference.get()).getViewTreeObserver().addOnScrollChangedListener(this.f16523h);
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
                this.d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupContentView popupContentView2 = this.d;
                PopupWindow popupWindow = new PopupWindow(popupContentView2, popupContentView2.getMeasuredWidth(), this.d.getMeasuredHeight());
                this.f16522e = popupWindow;
                popupWindow.showAsDropDown((View) weakReference.get());
                if (!CrashShieldHandler.b(this)) {
                    try {
                        PopupWindow popupWindow2 = this.f16522e;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            if (this.f16522e.isAboveAnchor()) {
                                PopupContentView popupContentView3 = this.d;
                                popupContentView3.e0.setVisibility(4);
                                popupContentView3.f0.setVisibility(0);
                            } else {
                                PopupContentView popupContentView4 = this.d;
                                popupContentView4.e0.setVisibility(0);
                                popupContentView4.f0.setVisibility(4);
                            }
                        }
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(this, th2);
                    }
                }
                long j = this.g;
                if (j > 0) {
                    this.d.postDelayed(new Runnable() { // from class: com.facebook.login.widget.ToolTipPopup.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (CrashShieldHandler.b(this)) {
                                return;
                            }
                            try {
                                ToolTipPopup.this.b();
                            } catch (Throwable th3) {
                                CrashShieldHandler.a(this, th3);
                            }
                        }
                    }, j);
                }
                this.f16522e.setTouchable(true);
                this.d.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.widget.ToolTipPopup.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            ToolTipPopup.this.b();
                        } catch (Throwable th3) {
                            CrashShieldHandler.a(this, th3);
                        }
                    }
                });
            }
        } catch (Throwable th3) {
            CrashShieldHandler.a(this, th3);
        }
    }

    public final void d() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        WeakReference weakReference = this.f16520b;
        try {
            if (weakReference.get() != null) {
                ((View) weakReference.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f16523h);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
