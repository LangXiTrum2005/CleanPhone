package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class df extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static cm.a m1814(List<Object> list) {
        return new cm.a((List) cz.m1785(list, 0, List.class), ((Integer) cz.m1785(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1815(List<Object> list) {
        Object objM1785;
        Class<?> cls;
        hp hpVar;
        Object objM1786;
        hp hpVar2;
        Object objM1787;
        int size = list.size();
        Object objM1788 = null;
        Class<?> cls2 = null;
        if (size != 2) {
            if (size == 3) {
                if (list.get(0) instanceof Class) {
                    cls = (Class) cz.m1785(list, 0, Class.class);
                    if (list.get(1) instanceof hp) {
                        hpVar2 = (hp) cz.m1785(list, 1, hp.class);
                        objM1787 = cz.m1785(list, 2, Object.class);
                    } else {
                        objM1785 = cz.m1785(list, 1, Object.class);
                        hpVar = (hp) cz.m1785(list, 2, hp.class);
                    }
                } else {
                    objM1788 = cz.m1785(list, 0, Object.class);
                    cls = objM1788.getClass();
                    hpVar2 = (hp) cz.m1785(list, 1, hp.class);
                    objM1787 = cz.m1785(list, 2, Object.class);
                }
                Class<?> cls3 = cls;
                objM1786 = objM1787;
                hpVar = hpVar2;
                objM1785 = objM1788;
                cls2 = cls3;
            } else if (size != 4) {
                hpVar = null;
                objM1786 = null;
                objM1785 = null;
            } else {
                cls2 = (Class) cz.m1785(list, 0, Class.class);
                Object objM1789 = cz.m1785(list, 1, Object.class);
                hp hpVar3 = (hp) cz.m1785(list, 2, hp.class);
                objM1786 = cz.m1785(list, 3, Object.class);
                hpVar = hpVar3;
                objM1785 = objM1789;
            }
            hr.m2242().m2245();
            return hw.m2309(cls2, objM1785, hpVar, objM1786);
        }
        if (list.get(0) instanceof Class) {
            cls = (Class) cz.m1785(list, 0, Class.class);
            objM1785 = null;
        } else {
            Object objM17810 = cz.m1785(list, 0, Object.class);
            if (objM17810 != null) {
                objM1785 = objM17810;
                cls = objM17810.getClass();
            } else {
                objM1785 = objM17810;
                cls = null;
            }
        }
        hpVar = (hp) cz.m1785(list, 1, hp.class);
        cls2 = cls;
        objM1786 = null;
        hr.m2242().m2245();
        return hw.m2309(cls2, objM1785, hpVar, objM1786);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m1816(List<Object> list) {
        Object objM1785;
        hp hpVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object objM1786 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) cz.m1785(list, 0, Class.class);
                objM1785 = null;
            } else {
                objM1785 = cz.m1785(list, 0, Object.class);
                if (objM1785 != null) {
                    cls2 = objM1785.getClass();
                }
            }
            hpVar = (hp) cz.m1785(list, 1, hp.class);
        } else if (size != 3) {
            hpVar = null;
            objM1785 = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) cz.m1785(list, 0, Class.class);
                if (list.get(1) instanceof hp) {
                    hpVar = (hp) cz.m1785(list, 1, hp.class);
                } else {
                    objM1786 = cz.m1785(list, 1, Object.class);
                    hpVar = (hp) cz.m1785(list, 2, hp.class);
                }
            } else {
                objM1786 = cz.m1785(list, 0, Object.class);
                cls = objM1786.getClass();
                hpVar = (hp) cz.m1785(list, 1, hp.class);
            }
            Object obj = objM1786;
            cls2 = cls;
            objM1785 = obj;
        }
        hr.m2242().m2245();
        return hw.m2302(cls2, objM1785, hpVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final <T> ht<T> m1821(final dr drVar, final cp cpVar, List<Object> list) {
        Object objM1785 = cz.m1785(list, 0, Object.class);
        final cm cmVar = (cm) cz.m1785(list, 1, cm.class);
        final List<Object> listM1786 = cz.m1786(list, 2);
        if (cmVar == null) {
            return null;
        }
        return hr.m2242().m2245().m2315(objM1785, cmVar.m1531(new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.df.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.hy
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final boolean mo1822(ht htVar) {
                return cmVar.m1530().m1560(htVar, drVar, cpVar, listM1786);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Object> m1818(dr drVar, cp cpVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (ht htVar : m1819(drVar, cpVar, list)) {
            if (htVar != null) {
                arrayList.add(htVar.mo2260());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m1817(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hr.m2242().m2245().m2314((Class) cz.m1785(list, 0, Class.class), (String) cz.m1785(list, 1, String.class));
        }
        Object objM1785 = cz.m1785(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return hr.m2242().m2245().m2312(objM1785, new JSONArray((Collection) cz.m1785(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hr.m2242().m2245().m2312(objM1785, (JSONArray) cz.m1785(list, 1, JSONArray.class));
        }
        return hr.m2242().m2245().m2317(objM1785, (String) cz.m1785(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1820(dr drVar, cp cpVar, List<Object> list) {
        ht htVarM1821 = m1821(drVar, cpVar, list);
        if (htVarM1821 != null) {
            return htVarM1821.mo2260();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<ht> m1819(final dr drVar, final cp cpVar, List<Object> list) {
        Object objM1785 = cz.m1785(list, 0, Object.class);
        final cm cmVar = (cm) cz.m1785(list, 1, cm.class);
        final List<Object> listM1786 = cz.m1786(list, 2);
        if (cmVar == null) {
            return null;
        }
        return hr.m2242().m2245().m2318(objM1785, cmVar.m1531(new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.df.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.hy
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1822(ht htVar) {
                return cmVar.m1530().m1560(htVar, drVar, cpVar, listM1786);
            }
        }));
    }
}
