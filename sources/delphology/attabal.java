package delphology;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: compiled from: PriorityMapping.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static SparseArray<Priority> f25167attabal = new SparseArray<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static HashMap<Priority, Integer> f25168saneness;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f25168saneness = map;
        map.put(Priority.DEFAULT, 0);
        f25168saneness.put(Priority.VERY_LOW, 1);
        f25168saneness.put(Priority.HIGHEST, 2);
        for (Priority priority : f25168saneness.keySet()) {
            f25167attabal.append(f25168saneness.get(priority).intValue(), priority);
        }
    }

    public static int attabal(Priority priority) {
        Integer num = f25168saneness.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority saneness(int i) {
        Priority priority = f25167attabal.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
