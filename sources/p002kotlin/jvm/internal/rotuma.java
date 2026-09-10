package p002kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import tetrahedral.apical;
import tetrahedral.arytenoidectomy;
import tetrahedral.competently;
import tetrahedral.cutely;
import tetrahedral.dern;
import tetrahedral.formularize;
import tetrahedral.graveside;
import tetrahedral.impassible;
import tetrahedral.impromptu;
import tetrahedral.kowloon;
import tetrahedral.marial;
import tetrahedral.molybdenite;
import tetrahedral.monoploid;
import tetrahedral.polloi;
import tetrahedral.taiyuan;
import tetrahedral.triweekly;
import unready.attabal;
import unready.beachfront;
import unready.saneness;
import unready.wireman;

/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes5.dex */
public class rotuma {
    public static Set apical(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw polloi(e);
        }
    }

    public static boolean arytenoidectomy(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof attabal) || (obj instanceof beachfront);
        }
        return false;
    }

    public static Collection attabal(Object obj) {
        if ((obj instanceof attabal) && !(obj instanceof saneness)) {
            molybdenite(obj, "kotlin.collections.MutableCollection");
        }
        return competently(obj);
    }

    public static Object beachfront(Object obj, int i) {
        if (obj != null && !impassible(obj, i)) {
            molybdenite(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Collection competently(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw polloi(e);
        }
    }

    public static Map cutely(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw polloi(e);
        }
    }

    public static List dern(Object obj) {
        if ((obj instanceof attabal) && !(obj instanceof wireman)) {
            molybdenite(obj, "kotlin.collections.MutableList");
        }
        return taiyuan(obj);
    }

    public static int formularize(Object obj) {
        if (obj instanceof formularize) {
            return ((formularize) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof triweekly) {
            return 3;
        }
        if (obj instanceof kowloon) {
            return 4;
        }
        if (obj instanceof arytenoidectomy) {
            return 5;
        }
        if (obj instanceof monoploid) {
            return 6;
        }
        if (obj instanceof polloi) {
            return 7;
        }
        if (obj instanceof molybdenite) {
            return 8;
        }
        if (obj instanceof graveside) {
            return 9;
        }
        if (obj instanceof tetrahedral.attabal) {
            return 10;
        }
        if (obj instanceof tetrahedral.saneness) {
            return 11;
        }
        if (obj instanceof dern) {
            return 12;
        }
        if (obj instanceof tetrahedral.wireman) {
            return 13;
        }
        if (obj instanceof marial) {
            return 14;
        }
        if (obj instanceof tetrahedral.beachfront) {
            return 15;
        }
        if (obj instanceof competently) {
            return 16;
        }
        if (obj instanceof impromptu) {
            return 17;
        }
        if (obj instanceof taiyuan) {
            return 18;
        }
        if (obj instanceof cutely) {
            return 19;
        }
        if (obj instanceof apical) {
            return 20;
        }
        if (obj instanceof formularize) {
            return 21;
        }
        return obj instanceof impassible ? 22 : -1;
    }

    public static void graveside(String str) {
        throw polloi(new ClassCastException(str));
    }

    public static boolean impassible(Object obj, int i) {
        return (obj instanceof patroclinal.beachfront) && formularize(obj) == i;
    }

    public static Iterable impromptu(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw polloi(e);
        }
    }

    public static boolean kowloon(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof attabal) || (obj instanceof unready.marial);
        }
        return false;
    }

    public static Set marial(Object obj) {
        if ((obj instanceof attabal) && !(obj instanceof beachfront)) {
            molybdenite(obj, "kotlin.collections.MutableSet");
        }
        return apical(obj);
    }

    public static void molybdenite(Object obj, String str) {
        graveside((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static <T extends Throwable> T monoploid(T t) {
        return (T) Intrinsics.kowloon(t, rotuma.class.getName());
    }

    public static ClassCastException polloi(ClassCastException classCastException) {
        throw ((ClassCastException) monoploid(classCastException));
    }

    public static Iterable saneness(Object obj) {
        if ((obj instanceof attabal) && !(obj instanceof unready.dern)) {
            molybdenite(obj, "kotlin.collections.MutableIterable");
        }
        return impromptu(obj);
    }

    public static List taiyuan(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw polloi(e);
        }
    }

    public static boolean triweekly(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof attabal) || (obj instanceof wireman);
        }
        return false;
    }

    public static Map wireman(Object obj) {
        if ((obj instanceof attabal) && !(obj instanceof unready.marial)) {
            molybdenite(obj, "kotlin.collections.MutableMap");
        }
        return cutely(obj);
    }
}
