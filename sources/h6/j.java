package h6;

import a7.p;
import android.graphics.Bitmap;
import com.ironsource.X3;
import d5.u;
import ea.f2;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f42239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f42240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f42241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f42242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f42243h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f42244a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f42245b = new f2(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f42246c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f42239d = configArr;
        f42240e = configArr;
        f42241f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f42242g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f42243h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return X3.j.f27834d + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(p.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = p.d(config) * i10 * i11;
        e eVar = this.f42244a;
        g gVarH0 = (g) ((ArrayDeque) eVar.f3623a).poll();
        if (gVarH0 == null) {
            gVarH0 = eVar.H0();
        }
        i iVar = (i) gVarH0;
        iVar.f42237b = iD;
        iVar.f42238c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f42240e;
        } else {
            int i12 = h.f42235a[config.ordinal()];
            if (i12 == 1) {
                configArr = f42239d;
            } else if (i12 == 2) {
                configArr = f42241f;
            } else if (i12 != 3) {
                configArr = i12 != 4 ? new Bitmap.Config[]{config} : f42243h;
            } else {
                configArr = f42242g;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                eVar.D0(iVar);
                int iIntValue = num.intValue();
                g gVarH1 = (g) ((ArrayDeque) eVar.f3623a).poll();
                if (gVarH1 == null) {
                    gVarH1 = eVar.H0();
                }
                iVar = (i) gVarH1;
                iVar.f42237b = iIntValue;
                iVar.f42238c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f42245b.m(iVar);
        if (bitmap != null) {
            a(Integer.valueOf(iVar.f42237b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f42246c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = p.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f42244a;
        g gVarH0 = (g) ((ArrayDeque) eVar.f3623a).poll();
        if (gVarH0 == null) {
            gVarH0 = eVar.H0();
        }
        i iVar = (i) gVarH0;
        iVar.f42237b = iC;
        iVar.f42238c = config;
        this.f42245b.z(iVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(iVar.f42237b));
        navigableMapD.put(Integer.valueOf(iVar.f42237b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbI = u.i("SizeConfigStrategy{groupedMap=");
        sbI.append(this.f42245b);
        sbI.append(", sortedSizes=(");
        HashMap map = this.f42246c;
        for (Map.Entry entry : map.entrySet()) {
            sbI.append(entry.getKey());
            sbI.append('[');
            sbI.append(entry.getValue());
            sbI.append("], ");
        }
        if (!map.isEmpty()) {
            sbI.replace(sbI.length() - 2, sbI.length(), "");
        }
        sbI.append(")}");
        return sbI.toString();
    }
}
