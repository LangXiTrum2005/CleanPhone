package p;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47624a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f47625b = -1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47626c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f47627d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f47628e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47629f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f47630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f47631h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public b1(TextView textView) {
        this.f47630g = textView;
        this.f47631h = textView.getContext();
        new z0();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f47630g instanceof v);
    }
}
