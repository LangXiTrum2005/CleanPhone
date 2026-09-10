package b0;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5106h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IconCompat f5108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IconCompat f5109k;
    public IconCompat l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f5103e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f5104f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5105g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5107i = true;

    public static IconCompat f(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.f4014k;
            return go.c.e((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.b((Bitmap) parcelable);
        }
        return null;
    }

    @Override // b0.g0
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            ArrayList arrayList = this.f5103e;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    e0 e0Var = (e0) arrayList.get(i10);
                    if (e0Var.f5091a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", e0Var.f5091a);
                        bundle2.putInt("id", e0Var.f5092b);
                        bundle2.putInt("colorInt", e0Var.f5093c);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_SEGMENTS, arrayList2);
            ArrayList arrayList3 = this.f5104f;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    d0 d0Var = (d0) arrayList3.get(i11);
                    if (d0Var.f5087a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt(X3.i.L, d0Var.f5087a);
                        bundle3.putInt("id", d0Var.f5088b);
                        bundle3.putInt("colorInt", d0Var.f5089c);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_POINTS, arrayList4);
            bundle.putInt(NotificationCompat.EXTRA_PROGRESS, this.f5105g);
            bundle.putBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, this.f5106h);
            bundle.putInt(NotificationCompat.EXTRA_PROGRESS_MAX, g());
            bundle.putBoolean(NotificationCompat.EXTRA_STYLED_BY_PROGRESS, this.f5107i);
            p pVar = this.f5121a;
            if ((pVar != null ? pVar.f5166a : null) == null) {
                return;
            }
            IconCompat iconCompat = this.f5108j;
            if (iconCompat != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, iconCompat.g());
            } else {
                bundle.remove(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
            }
            IconCompat iconCompat2 = this.f5109k;
            if (iconCompat2 != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_START_ICON, iconCompat2.g());
            } else {
                bundle.remove(NotificationCompat.EXTRA_PROGRESS_START_ICON);
            }
            IconCompat iconCompat3 = this.l;
            if (iconCompat3 != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_END_ICON, iconCompat3.g());
            } else {
                bundle.remove(NotificationCompat.EXTRA_PROGRESS_END_ICON);
            }
        }
    }

    @Override // b0.g0
    public final void b(h9.k kVar) {
        Notification.Builder builder = (Notification.Builder) kVar.f42287b;
        if (Build.VERSION.SDK_INT < 36) {
            int iG = g();
            builder.setProgress(iG, Math.min(this.f5105g, iG), this.f5106h);
            return;
        }
        Notification.ProgressStyle progressStyle = new Notification.ProgressStyle();
        c0.h(progressStyle, this.f5107i);
        c0.a(progressStyle, this.f5105g);
        c0.c(progressStyle, this.f5106h);
        IconCompat iconCompat = this.f5109k;
        c0.f(progressStyle, iconCompat != null ? iconCompat.g() : null);
        IconCompat iconCompat2 = this.l;
        c0.b(progressStyle, iconCompat2 != null ? iconCompat2.g() : null);
        IconCompat iconCompat3 = this.f5108j;
        c0.g(progressStyle, iconCompat3 != null ? iconCompat3.g() : null);
        c0.d(progressStyle, this.f5104f);
        c0.e(progressStyle, this.f5103e);
        builder.setStyle(progressStyle);
    }

    @Override // b0.g0
    public final String d() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // b0.g0
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayListI = Build.VERSION.SDK_INT >= 34 ? b6.d.i(bundle, NotificationCompat.EXTRA_PROGRESS_SEGMENTS) : bundle.getParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_SEGMENTS);
        ArrayList arrayList = new ArrayList();
        if (arrayListI != null && !arrayListI.isEmpty()) {
            for (int i10 = 0; i10 < arrayListI.size(); i10++) {
                Bundle bundle2 = (Bundle) arrayListI.get(i10);
                int i11 = bundle2.getInt("length");
                if (i11 > 0) {
                    int i12 = bundle2.getInt("id");
                    int i13 = bundle2.getInt("colorInt", 0);
                    e0 e0Var = new e0();
                    e0Var.f5091a = i11;
                    e0Var.f5092b = i12;
                    e0Var.f5093c = i13;
                    arrayList.add(e0Var);
                }
            }
        }
        this.f5103e = arrayList;
        this.f5105g = bundle.getInt(NotificationCompat.EXTRA_PROGRESS, 0);
        this.f5106h = bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, false);
        this.f5107i = bundle.getBoolean(NotificationCompat.EXTRA_STYLED_BY_PROGRESS, true);
        ArrayList arrayListI2 = Build.VERSION.SDK_INT >= 34 ? b6.d.i(bundle, NotificationCompat.EXTRA_PROGRESS_POINTS) : bundle.getParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_POINTS);
        ArrayList arrayList2 = new ArrayList();
        if (arrayListI2 != null && !arrayListI2.isEmpty()) {
            for (int i14 = 0; i14 < arrayListI2.size(); i14++) {
                Bundle bundle3 = (Bundle) arrayListI2.get(i14);
                int i15 = bundle3.getInt(X3.i.L);
                if (i15 >= 0) {
                    int i16 = bundle3.getInt("id");
                    int i17 = bundle3.getInt("colorInt", 0);
                    d0 d0Var = new d0();
                    d0Var.f5087a = i15;
                    d0Var.f5088b = i16;
                    d0Var.f5089c = i17;
                    arrayList2.add(d0Var);
                }
            }
        }
        this.f5104f = arrayList2;
        this.f5108j = f((Parcelable) a.a.t(bundle, NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, Icon.class));
        this.f5109k = f((Parcelable) a.a.t(bundle, NotificationCompat.EXTRA_PROGRESS_START_ICON, Icon.class));
        this.l = f((Parcelable) a.a.t(bundle, NotificationCompat.EXTRA_PROGRESS_END_ICON, Icon.class));
    }

    public final int g() {
        ArrayList arrayList = this.f5103e;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            int iAddExact = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                int i12 = ((e0) arrayList.get(i11)).f5091a;
                if (i12 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i12);
                        i10++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i10 != 0) {
                return iAddExact;
            }
        }
        return 100;
    }
}
