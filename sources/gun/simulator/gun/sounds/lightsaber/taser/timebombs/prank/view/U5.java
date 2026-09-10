package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U5 extends AbstractC3375el {
    public static Map A0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C2838Vq.f3896a;
        }
        if (size == 1) {
            return AbstractC3375el.O((C4839vT) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3375el.N(arrayList.size()));
        B0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static final void B0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4839vT c4839vT = (C4839vT) it.next();
            linkedHashMap.put(c4839vT.f5132a, c4839vT.b);
        }
    }

    public static List h0(Object[] objArr) {
        AbstractC2995aW.q(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC2995aW.p(listAsList, "asList(this)");
        return listAsList;
    }

    public static boolean i0(Object[] objArr, Object obj) {
        AbstractC2995aW.q(objArr, "<this>");
        return s0(obj, objArr) >= 0;
    }

    public static void j0(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        AbstractC2995aW.q(bArr, "<this>");
        AbstractC2995aW.q(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void k0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        AbstractC2995aW.q(objArr, "<this>");
        AbstractC2995aW.q(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void l0(SE se, Object[] objArr, int i, int i2) {
        AbstractC2995aW.q(objArr, "<this>");
        Arrays.fill(objArr, i, i2, se);
    }

    public static ArrayList n0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object o0(Object[] objArr) {
        AbstractC2995aW.q(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object p0(int i, Object[] objArr) {
        AbstractC2995aW.q(objArr, "<this>");
        if (i < 0 || i > objArr.length - 1) {
            return null;
        }
        return objArr[i];
    }

    public static Object q0(Map map, Object obj) {
        AbstractC2995aW.q(map, "<this>");
        if (map instanceof InterfaceC3953lM) {
            return ((InterfaceC3953lM) map).e();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap r0(C4839vT... c4839vTArr) {
        HashMap map = new HashMap(AbstractC3375el.N(c4839vTArr.length));
        x0(map, c4839vTArr);
        return map;
    }

    public static int s0(Object obj, Object[] objArr) {
        AbstractC2995aW.q(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (AbstractC2995aW.i(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashMap t0(C4839vT... c4839vTArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3375el.N(c4839vTArr.length));
        x0(linkedHashMap, c4839vTArr);
        return linkedHashMap;
    }

    public static Map u0(C4839vT... c4839vTArr) {
        if (c4839vTArr.length <= 0) {
            return C2838Vq.f3896a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3375el.N(c4839vTArr.length));
        x0(linkedHashMap, c4839vTArr);
        return linkedHashMap;
    }

    public static LinkedHashMap v0(C4839vT... c4839vTArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3375el.N(c4839vTArr.length));
        x0(linkedHashMap, c4839vTArr);
        return linkedHashMap;
    }

    public static Map w0(Map map, C4839vT c4839vT) {
        AbstractC2995aW.q(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC3375el.O(c4839vT);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c4839vT.f5132a, c4839vT.b);
        return linkedHashMap;
    }

    public static final void x0(HashMap map, C4839vT[] c4839vTArr) {
        for (C4839vT c4839vT : c4839vTArr) {
            map.put(c4839vT.f5132a, c4839vT.b);
        }
    }

    public static char y0(char[] cArr) {
        AbstractC2995aW.q(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List z0(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new P5(objArr, false)) : AbstractC2340Cl.J(objArr[0]);
        }
        return C2812Uq.f3846a;
    }
}
