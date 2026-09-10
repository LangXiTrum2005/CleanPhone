package sakeen;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: EmojiExclusions.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: compiled from: EmojiExclusions.java */
    public static class attabal {
        public static Set<int[]> attabal() {
            return saneness.attabal();
        }
    }

    /* JADX INFO: compiled from: EmojiExclusions.java */
    public static class saneness {
        public static Set<int[]> attabal() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    public static Set<int[]> attabal() {
        return Build.VERSION.SDK_INT >= 34 ? attabal.attabal() : saneness.attabal();
    }
}
