package homozygous;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: FocusStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: compiled from: FocusStrategy.java */
    public interface attabal<T> {
        void attabal(T t, Rect rect);
    }

    /* JADX INFO: compiled from: FocusStrategy.java */
    public static class dern<T> implements Comparator<T> {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final boolean f27918monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final attabal<T> f27919polloi;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Rect f27917kowloon = new Rect();

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Rect f27916arytenoidectomy = new Rect();

        public dern(boolean z, attabal<T> attabalVar) {
            this.f27918monoploid = z;
            this.f27919polloi = attabalVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f27917kowloon;
            Rect rect2 = this.f27916arytenoidectomy;
            this.f27919polloi.attabal(t, rect);
            this.f27919polloi.attabal(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f27918monoploid ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f27918monoploid ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f27918monoploid ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f27918monoploid ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: homozygous.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FocusStrategy.java */
    public interface InterfaceC0637saneness<T, V> {
        V attabal(T t, int i);

        int saneness(T t);
    }

    public static int apical(int i, Rect rect, Rect rect2) {
        return Math.max(0, formularize(i, rect, rect2));
    }

    public static boolean attabal(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean zSaneness = saneness(i, rect, rect2);
        if (saneness(i, rect, rect3) || !zSaneness) {
            return false;
        }
        return !cutely(i, rect, rect3) || i == 17 || i == 66 || apical(i, rect, rect2) < impassible(i, rect, rect3);
    }

    public static <T> T beachfront(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iIndexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static int competently(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static boolean cutely(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static <L, T> T dern(L l, InterfaceC0637saneness<L, T> interfaceC0637saneness, attabal<T> attabalVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iSaneness = interfaceC0637saneness.saneness(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < iSaneness; i2++) {
            T tAttabal = interfaceC0637saneness.attabal(l, i2);
            if (tAttabal != t) {
                attabalVar.attabal(tAttabal, rect3);
                if (impromptu(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = tAttabal;
                }
            }
        }
        return t2;
    }

    public static int formularize(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    public static int impassible(int i, Rect rect, Rect rect2) {
        return Math.max(1, triweekly(i, rect, rect2));
    }

    public static boolean impromptu(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!taiyuan(rect, rect2, i)) {
            return false;
        }
        if (taiyuan(rect, rect3, i) && !attabal(i, rect, rect2, rect3)) {
            return !attabal(i, rect, rect3, rect2) && competently(apical(i, rect, rect2), kowloon(i, rect, rect2)) < competently(apical(i, rect, rect3), kowloon(i, rect, rect3));
        }
        return true;
    }

    public static int kowloon(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    public static <T> T marial(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static boolean saneness(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean taiyuan(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static int triweekly(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    public static <L, T> T wireman(L l, InterfaceC0637saneness<L, T> interfaceC0637saneness, attabal<T> attabalVar, T t, int i, boolean z, boolean z2) {
        int iSaneness = interfaceC0637saneness.saneness(l);
        ArrayList arrayList = new ArrayList(iSaneness);
        for (int i2 = 0; i2 < iSaneness; i2++) {
            arrayList.add(interfaceC0637saneness.attabal(l, i2));
        }
        Collections.sort(arrayList, new dern(z, attabalVar));
        if (i == 1) {
            return (T) beachfront(t, arrayList, z2);
        }
        if (i == 2) {
            return (T) marial(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }
}
