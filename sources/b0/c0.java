package b0;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static void a(Notification.ProgressStyle progressStyle, int i10) {
        progressStyle.setProgress(i10);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z10) {
        progressStyle.setProgressIndeterminate(z10);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<d0> list) {
        for (d0 d0Var : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(d0Var.f5087a).setColor(d0Var.f5089c).setId(d0Var.f5088b));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<e0> list) {
        for (e0 e0Var : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(e0Var.f5091a).setColor(e0Var.f5093c).setId(e0Var.f5092b));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z10) {
        progressStyle.setStyledByProgress(z10);
    }
}
