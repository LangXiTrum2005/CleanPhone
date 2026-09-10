package com.charging.screenshow.battery.animations.themes.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public class CustomPopWindow implements PopupWindow.OnDismissListener {
    public Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f13326Y;
    public int Z;
    public boolean e0;
    public boolean f0;
    public int g0;
    public View h0;
    public PopupWindow i0;
    public int j0;
    public boolean k0;
    public int l0;
    public int m0;
    public boolean n0;
    public Window o0;
    public boolean p0;
    public float q0;
    public boolean r0;

    public static class PopupWindowBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomPopWindow f13327a;

        public PopupWindowBuilder(Context context) {
            CustomPopWindow customPopWindow = new CustomPopWindow();
            customPopWindow.e0 = true;
            customPopWindow.f0 = true;
            customPopWindow.g0 = -1;
            customPopWindow.j0 = -1;
            customPopWindow.k0 = true;
            customPopWindow.l0 = -1;
            customPopWindow.m0 = -1;
            customPopWindow.n0 = true;
            customPopWindow.p0 = false;
            customPopWindow.q0 = 0.0f;
            customPopWindow.r0 = true;
            customPopWindow.X = context;
            this.f13327a = customPopWindow;
        }

        public final CustomPopWindow a() {
            final CustomPopWindow customPopWindow = this.f13327a;
            if (customPopWindow.h0 == null) {
                customPopWindow.h0 = LayoutInflater.from(customPopWindow.X).inflate(customPopWindow.g0, (ViewGroup) null);
            }
            Activity activity = (Activity) customPopWindow.h0.getContext();
            if (activity != null && customPopWindow.p0) {
                float f = customPopWindow.q0;
                if (f <= 0.0f || f >= 1.0f) {
                    f = 0.7f;
                }
                Window window = activity.getWindow();
                customPopWindow.o0 = window;
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.alpha = f;
                customPopWindow.o0.addFlags(2);
                customPopWindow.o0.setAttributes(attributes);
            }
            if (customPopWindow.f13326Y == 0 || customPopWindow.Z == 0) {
                customPopWindow.i0 = new PopupWindow(customPopWindow.h0, -2, -2);
            } else {
                customPopWindow.i0 = new PopupWindow(customPopWindow.h0, customPopWindow.f13326Y, customPopWindow.Z);
            }
            int i2 = customPopWindow.j0;
            if (i2 != -1) {
                customPopWindow.i0.setAnimationStyle(i2);
            }
            PopupWindow popupWindow = customPopWindow.i0;
            popupWindow.setClippingEnabled(customPopWindow.k0);
            int i3 = customPopWindow.l0;
            if (i3 != -1) {
                popupWindow.setInputMethodMode(i3);
            }
            int i4 = customPopWindow.m0;
            if (i4 != -1) {
                popupWindow.setSoftInputMode(i4);
            }
            popupWindow.setTouchable(customPopWindow.n0);
            if (customPopWindow.f13326Y == 0 || customPopWindow.Z == 0) {
                customPopWindow.i0.getContentView().measure(0, 0);
                customPopWindow.f13326Y = customPopWindow.i0.getContentView().getMeasuredWidth();
                customPopWindow.Z = customPopWindow.i0.getContentView().getMeasuredHeight();
            }
            customPopWindow.i0.setOnDismissListener(customPopWindow);
            if (customPopWindow.r0) {
                customPopWindow.i0.setFocusable(customPopWindow.e0);
                customPopWindow.i0.setBackgroundDrawable(new ColorDrawable(0));
                customPopWindow.i0.setOutsideTouchable(customPopWindow.f0);
            } else {
                customPopWindow.i0.setFocusable(true);
                customPopWindow.i0.setOutsideTouchable(false);
                customPopWindow.i0.setBackgroundDrawable(null);
                customPopWindow.i0.getContentView().setFocusable(true);
                customPopWindow.i0.getContentView().setFocusableInTouchMode(true);
                customPopWindow.i0.getContentView().setOnKeyListener(new View.OnKeyListener() { // from class: com.charging.screenshow.battery.animations.themes.view.CustomPopWindow.1
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
                        if (i5 != 4) {
                            return false;
                        }
                        CustomPopWindow.this.i0.dismiss();
                        return true;
                    }
                });
                customPopWindow.i0.setTouchInterceptor(new View.OnTouchListener() { // from class: com.charging.screenshow.battery.animations.themes.view.CustomPopWindow.2
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int x = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        if (motionEvent.getAction() == 0) {
                            CustomPopWindow customPopWindow2 = CustomPopWindow.this;
                            if (x < 0 || x >= customPopWindow2.f13326Y || y < 0 || y >= customPopWindow2.Z) {
                                Log.e("CustomPopWindow", "out side ");
                                Log.e("CustomPopWindow", "width:" + customPopWindow2.i0.getWidth() + "height:" + customPopWindow2.i0.getHeight() + " x:" + x + " y  :" + y);
                                return true;
                            }
                        }
                        if (motionEvent.getAction() != 4) {
                            return false;
                        }
                        Log.e("CustomPopWindow", "out side ...");
                        return true;
                    }
                });
            }
            customPopWindow.i0.update();
            return customPopWindow;
        }
    }

    public final void a() {
        Window window = this.o0;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f;
            this.o0.setAttributes(attributes);
        }
        PopupWindow popupWindow = this.i0;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.i0.dismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        a();
    }
}
