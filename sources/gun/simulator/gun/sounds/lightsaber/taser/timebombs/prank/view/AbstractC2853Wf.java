package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2853Wf extends AbstractC2801Uf {
    public static C2827Vf c0(Iterable iterable) {
        AbstractC2995aW.q(iterable, "<this>");
        return new C2827Vf(iterable, 0);
    }

    public static boolean d0(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC2995aW.q(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    AbstractC2340Cl.S();
                    throw null;
                }
                if (AbstractC2995aW.i(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            return false;
        }
        iIndexOf = ((List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static ArrayList e0(ArrayList arrayList) {
        AbstractC2995aW.q(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static Object f0(Iterable iterable) {
        if (iterable instanceof List) {
            return g0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object g0(List list) {
        AbstractC2995aW.q(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object h0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object i0(List list) {
        AbstractC2995aW.q(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void j0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(iterable, "<this>");
        AbstractC2995aW.q(charSequence, "separator");
        AbstractC2995aW.q(charSequence2, "prefix");
        AbstractC2995aW.q(charSequence3, "postfix");
        AbstractC2995aW.q(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC3375el.f(sb, obj, interfaceC2766Sw);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String l0(Iterable iterable, String str, String str2, String str3, InterfaceC2766Sw interfaceC2766Sw, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC2766Sw = null;
        }
        AbstractC2995aW.q(iterable, "<this>");
        AbstractC2995aW.q(str4, "prefix");
        AbstractC2995aW.q(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        j0(iterable, sb, str, str4, str5, -1, "...", interfaceC2766Sw);
        String string = sb.toString();
        AbstractC2995aW.p(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static Object m0(List list) {
        AbstractC2995aW.q(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2340Cl.y(list));
    }

    public static Object n0(ArrayList arrayList) {
        AbstractC2995aW.q(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            return null;
        }
        return DM.e(arrayList, 1);
    }

    public static Comparable o0(Collection collection) {
        AbstractC2995aW.q(collection, "<this>");
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList p0(Iterable iterable, Collection collection) {
        AbstractC2995aW.q(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC2801Uf.a0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList q0(Object obj, Collection collection) {
        AbstractC2995aW.q(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List r0(Iterable iterable, Comparator comparator) {
        ArrayList arrayListV0;
        boolean z = iterable instanceof Collection;
        if (!z) {
            if (z) {
                arrayListV0 = v0((Collection) iterable);
            } else {
                ArrayList arrayList = new ArrayList();
                t0(iterable, arrayList);
                arrayListV0 = arrayList;
            }
            AbstractC2775Tf.Z(arrayListV0, comparator);
            return arrayListV0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return u0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC2995aW.q(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return U5.h0(array);
    }

    public static List s0(int i, Iterable iterable) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Requested element count ", i, " is less than zero.").toString());
        }
        C2812Uq c2812Uq = C2812Uq.f3846a;
        if (i == 0) {
            return c2812Uq;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return u0(iterable);
            }
            if (i == 1) {
                return AbstractC2340Cl.J(f0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : AbstractC2340Cl.J(arrayList.get(0));
        }
        return c2812Uq;
    }

    public static final void t0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC2995aW.q(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List u0(Iterable iterable) {
        ArrayList arrayListV0;
        AbstractC2995aW.q(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C2812Uq c2812Uq = C2812Uq.f3846a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c2812Uq;
            }
            if (size != 1) {
                return v0(collection);
            }
            return AbstractC2340Cl.J(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z) {
            arrayListV0 = v0((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            t0(iterable, arrayList);
            arrayListV0 = arrayList;
        }
        int size2 = arrayListV0.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayListV0 : AbstractC2340Cl.J(arrayListV0.get(0));
        }
        return c2812Uq;
    }

    public static ArrayList v0(Collection collection) {
        AbstractC2995aW.q(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set w0(Iterable iterable) {
        AbstractC2995aW.q(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set x0(Iterable iterable) {
        AbstractC2995aW.q(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C2942Zq c2942Zq = C2942Zq.f4095a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            t0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return c2942Zq;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            AbstractC2995aW.p(setSingleton, "singleton(element)");
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c2942Zq;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC3375el.N(collection.size()));
            t0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        AbstractC2995aW.p(setSingleton2, "singleton(element)");
        return setSingleton2;
    }
}
