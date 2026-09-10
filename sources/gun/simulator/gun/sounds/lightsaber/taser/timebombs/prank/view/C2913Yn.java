package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2913Yn extends C4589sd0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final SparseArray J;
    public final SparseBooleanArray K;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public C2913Yn(Context context) {
        c(context);
        d(context);
        this.J = new SparseArray();
        this.K = new SparseBooleanArray();
        b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4589sd0
    public final C4589sd0 a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    public final void b() {
        this.w = true;
        this.x = false;
        this.y = true;
        this.z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = true;
    }

    public final void c(Context context) {
        CaptioningManager captioningManager;
        int i = Ug0.f3833a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.p = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.o = AC.p(i >= 21 ? locale.toLanguageTag() : locale.toString());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    public final void d(Context context) {
        Point point;
        DisplayManager displayManager;
        int i = Ug0.f3833a;
        Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && Ug0.K(context)) {
            String strE = i < 28 ? Ug0.E("sys.display-size") : Ug0.E("vendor.display-size");
            if (!TextUtils.isEmpty(strE)) {
                try {
                    String[] strArrSplit = strE.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            point = new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC4038mJ.c();
                if (!"Sony".equals(Ug0.c) && Ug0.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    point = new Point();
                    if (i >= 23) {
                        Display.Mode mode = display.getMode();
                        point.x = mode.getPhysicalWidth();
                        point.y = mode.getPhysicalHeight();
                    } else if (i >= 17) {
                        display.getRealSize(point);
                    } else {
                        display.getSize(point);
                    }
                }
            } else if (!"Sony".equals(Ug0.c)) {
                point = new Point();
                if (i >= 23) {
                    Display.Mode mode2 = display.getMode();
                    point.x = mode2.getPhysicalWidth();
                    point.y = mode2.getPhysicalHeight();
                } else if (i >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            } else {
                point = new Point();
                if (i >= 23) {
                    Display.Mode mode3 = display.getMode();
                    point.x = mode3.getPhysicalWidth();
                    point.y = mode3.getPhysicalHeight();
                } else if (i >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            }
        } else {
            point = new Point();
            if (i >= 23) {
                Display.Mode mode4 = display.getMode();
                point.x = mode4.getPhysicalWidth();
                point.y = mode4.getPhysicalHeight();
            } else if (i >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
        }
        a(point.x, point.y);
    }

    public C2913Yn() {
        this.J = new SparseArray();
        this.K = new SparseBooleanArray();
        b();
    }
}
