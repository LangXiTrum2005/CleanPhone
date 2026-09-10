package saneness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dustman {
    public static LinkedHashMap attabal(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i2);
    }

    public static List dern(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    public static boolean saneness(List list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }
}
