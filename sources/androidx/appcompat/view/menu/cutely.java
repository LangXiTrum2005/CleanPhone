package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.molybdenite;

/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4899apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f4900attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public View f4901beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f4902competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public taiyuan f4903cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f4904dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f4905formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f4906impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f4907marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f4908saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public apical.attabal f4909taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f4910wireman;

    /* JADX INFO: compiled from: MenuPopupHelper.java */
    public class attabal implements PopupWindow.OnDismissListener {
        public attabal() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            cutely.this.marial();
        }
    }

    public cutely(Context context, marial marialVar, View view, boolean z, int i) {
        this(context, marialVar, view, z, i, 0);
    }

    public void apical() {
        if (!impassible()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final taiyuan attabal() {
        Display defaultDisplay = ((WindowManager) this.f4900attabal.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        taiyuan wiremanVar = Math.min(point.x, point.y) >= this.f4900attabal.getResources().getDimensionPixelSize(beachfront.wireman.abc_cascading_menus_min_smallest_width) ? new wireman(this.f4900attabal, this.f4901beachfront, this.f4910wireman, this.f4907marial, this.f4904dern) : new kowloon(this.f4900attabal, this.f4908saneness, this.f4901beachfront, this.f4910wireman, this.f4907marial, this.f4904dern);
        wiremanVar.saneness(this.f4908saneness);
        wiremanVar.apical(this.f4905formularize);
        wiremanVar.beachfront(this.f4901beachfront);
        wiremanVar.setCallback(this.f4909taiyuan);
        wiremanVar.impromptu(this.f4906impromptu);
        wiremanVar.taiyuan(this.f4902competently);
        return wiremanVar;
    }

    public void beachfront(View view) {
        this.f4901beachfront = view;
    }

    public void competently(boolean z) {
        this.f4906impromptu = z;
        taiyuan taiyuanVar = this.f4903cutely;
        if (taiyuanVar != null) {
            taiyuanVar.impromptu(z);
        }
    }

    public void cutely(apical.attabal attabalVar) {
        this.f4909taiyuan = attabalVar;
        taiyuan taiyuanVar = this.f4903cutely;
        if (taiyuanVar != null) {
            taiyuanVar.setCallback(attabalVar);
        }
    }

    public taiyuan dern() {
        if (this.f4903cutely == null) {
            this.f4903cutely = attabal();
        }
        return this.f4903cutely;
    }

    public final void formularize(int i, int i2, boolean z, boolean z2) {
        taiyuan taiyuanVarDern = dern();
        taiyuanVarDern.formularize(z2);
        if (z) {
            if ((molybdenite.saneness(this.f4902competently, this.f4901beachfront.getLayoutDirection()) & 7) == 5) {
                i -= this.f4901beachfront.getWidth();
            }
            taiyuanVarDern.cutely(i);
            taiyuanVarDern.impassible(i2);
            int i3 = (int) ((this.f4900attabal.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            taiyuanVarDern.competently(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        taiyuanVarDern.show();
    }

    public boolean impassible() {
        if (wireman()) {
            return true;
        }
        if (this.f4901beachfront == null) {
            return false;
        }
        formularize(0, 0, false, false);
        return true;
    }

    public void impromptu(int i) {
        this.f4902competently = i;
    }

    public void marial() {
        this.f4903cutely = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4899apical;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void saneness() {
        if (wireman()) {
            this.f4903cutely.dismiss();
        }
    }

    public void taiyuan(PopupWindow.OnDismissListener onDismissListener) {
        this.f4899apical = onDismissListener;
    }

    public boolean triweekly(int i, int i2) {
        if (wireman()) {
            return true;
        }
        if (this.f4901beachfront == null) {
            return false;
        }
        formularize(i, i2, true, true);
        return true;
    }

    public boolean wireman() {
        taiyuan taiyuanVar = this.f4903cutely;
        return taiyuanVar != null && taiyuanVar.attabal();
    }

    public cutely(Context context, marial marialVar, View view, boolean z, int i, int i2) {
        this.f4902competently = 8388611;
        this.f4905formularize = new attabal();
        this.f4900attabal = context;
        this.f4908saneness = marialVar;
        this.f4901beachfront = view;
        this.f4904dern = z;
        this.f4910wireman = i;
        this.f4907marial = i2;
    }
}
