package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p004ironsource.d9;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.u5;
import com.p004ironsource.up;
import com.p004ironsource.vf;

/* JADX INFO: loaded from: classes5.dex */
public class h extends FrameLayout implements up {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f26932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vf f26933c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f26933c = on.U().f();
        this.f26931a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.f26931a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f26931a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f26933c.H(activity) == 1) {
                int i2 = rect.bottom - rect2.bottom;
                if (i2 > 0) {
                    return i2;
                }
                return 0;
            }
            int i3 = rect.right - rect2.right;
            if (i3 > 0) {
                return i3;
            }
            return 0;
        } catch (Exception e2) {
            q9.d().a(e2);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f26931a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f26931a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e2) {
            q9.d().a(e2);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f26931a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f26931a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26932b.F();
        this.f26932b.a(true, d9.h.Z);
    }

    @Override // com.p004ironsource.up
    public boolean onBackButtonPressed() {
        return u5.a().a((Activity) this.f26931a);
    }

    @Override // com.p004ironsource.up
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26932b.B();
        this.f26932b.a(false, d9.h.Z);
        v vVar = this.f26932b;
        if (vVar != null) {
            vVar.a(v.u.Gone);
            this.f26932b.C();
            this.f26932b.D();
        }
        removeAllViews();
    }

    @Override // com.p004ironsource.up
    public void onOrientationChanged(String str, int i2) {
    }

    private void a() {
        ((Activity) this.f26931a).runOnUiThread(new a());
    }

    private void a(int i2, int i3) {
        try {
            Context context = this.f26931a;
            if (context != null) {
                int iH = this.f26933c.H(context);
                if (iH == 1) {
                    setPadding(0, i2, 0, i3);
                } else if (iH == 2) {
                    setPadding(0, i2, i3, 0);
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }

    public void a(v vVar) {
        this.f26932b = vVar;
        vVar.a(this);
        this.f26932b.E();
        this.f26931a = this.f26932b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }
}
