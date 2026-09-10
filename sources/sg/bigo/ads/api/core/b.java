package sg.bigo.ads.api.core;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray<List<Integer>> f47018a;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f47018a = sparseArray;
        sparseArray.put(0, Arrays.asList(1, 2, 3));
        sparseArray.put(1, Arrays.asList(1, 2));
        sparseArray.put(2, Collections.singletonList(3));
        sparseArray.put(3, Arrays.asList(1, 2, 3));
        sparseArray.put(20, Arrays.asList(1, 2, 3));
        sparseArray.put(4, Arrays.asList(1, 2, 3));
        sparseArray.put(12, Arrays.asList(1, 2));
        sparseArray.put(15, Arrays.asList(1, 2, 5));
        sparseArray.put(16, Arrays.asList(1, 2, 5));
        sparseArray.put(17, Arrays.asList(1, 2, 5));
        sparseArray.put(18, Arrays.asList(1, 2, 5));
    }

    public static String a(int i2) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = f47018a.get(i2);
        if (list != null) {
            for (Integer num : list) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(num);
            }
        }
        return sb.toString();
    }

    public static boolean b(int i2) {
        return i2 == 3 || i2 == 4 || i2 == 20;
    }

    public static boolean c(int i2) {
        return i2 == 3 || i2 == 4 || i2 == 12 || i2 == 20;
    }

    public static boolean d(int i2) {
        return i2 == 12;
    }

    public static boolean e(int i2) {
        return i2 != 4;
    }
}
