package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.C0474n4;
import com.ironsource.C0669y2;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.Qc;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends FrameLayout implements Qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f30403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f30404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0674y7 f30405c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
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

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
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
        this.f30405c = Kb.Y().a();
        this.f30403a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.f30403a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f30403a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f30405c.A(activity) == 1) {
                int i10 = rect.bottom - rect2.bottom;
                if (i10 > 0) {
                    return i10;
                }
                return 0;
            }
            int i11 = rect.right - rect2.right;
            if (i11 > 0) {
                return i11;
            }
            return 0;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f30403a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f30403a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f30403a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f30403a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30404b.I();
        this.f30404b.b(true, X3.i.Z);
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        return C0669y2.a().a((Activity) this.f30403a);
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30404b.E();
        this.f30404b.b(false, X3.i.Z);
        v vVar = this.f30404b;
        if (vVar != null) {
            vVar.a(v.EnumC0089v.Gone);
            this.f30404b.F();
            this.f30404b.G();
        }
        removeAllViews();
    }

    public void a(v vVar) {
        this.f30404b = vVar;
        vVar.a(this);
        this.f30404b.H();
        this.f30403a = this.f30404b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    private void a() {
        ((Activity) this.f30403a).runOnUiThread(new a());
    }

    private void a(int i10, int i11) {
        try {
            Context context = this.f30403a;
            if (context != null) {
                int iA = this.f30405c.A(context);
                if (iA == 1) {
                    setPadding(0, i10, 0, i11);
                } else if (iA == 2) {
                    setPadding(0, i10, i11, 0);
                }
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
    }
}
