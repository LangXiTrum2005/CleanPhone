package utwa;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final PointF f39244attabal = new PointF();

    public static void apical(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2, kinesic.apical apicalVar) {
        if (wiremanVar.dern(apicalVar.getName(), i)) {
            list.add(wiremanVar2.attabal(apicalVar.getName()).taiyuan(apicalVar));
        }
    }

    public static PointF attabal(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int beachfront(float f, float f2) {
        return competently((int) f, (int) f2);
    }

    public static int competently(int i, int i2) {
        return i - (i2 * marial(i, i2));
    }

    public static int cutely(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static int dern(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static void impromptu(euhemerize.taiyuan taiyuanVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFSaneness = taiyuanVar.saneness();
        path.moveTo(pointFSaneness.x, pointFSaneness.y);
        f39244attabal.set(pointFSaneness.x, pointFSaneness.y);
        int i = 0;
        while (i < taiyuanVar.attabal().size()) {
            lamplit.attabal attabalVar = taiyuanVar.attabal().get(i);
            PointF pointFAttabal = attabalVar.attabal();
            PointF pointFSaneness2 = attabalVar.saneness();
            PointF pointFDern = attabalVar.dern();
            PointF pointF = f39244attabal;
            if (pointFAttabal.equals(pointF) && pointFSaneness2.equals(pointFDern)) {
                path.lineTo(pointFDern.x, pointFDern.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFAttabal.x, pointFAttabal.y, pointFSaneness2.x, pointFSaneness2.y, pointFDern.x, pointFDern.y);
            }
            pointF.set(pointFDern.x, pointFDern.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (taiyuanVar.wireman()) {
            path3.close();
        }
    }

    public static int marial(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static float saneness(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float taiyuan(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static boolean wireman(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }
}
