package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class da extends cw {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static cm.d m1860(List<Object> list) {
        return new cm.d((List) cw.m1805(list, 0, List.class), ((Integer) cw.m1805(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m1862(List<Object> list) {
        Object objM1805;
        hz hzVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object objM1806 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) cw.m1805(list, 0, Class.class);
                objM1805 = null;
            } else {
                objM1805 = cw.m1805(list, 0, Object.class);
                if (objM1805 != null) {
                    cls2 = objM1805.getClass();
                }
            }
            hzVar = (hz) cw.m1805(list, 1, hz.class);
        } else if (size != 3) {
            hzVar = null;
            objM1805 = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) cw.m1805(list, 0, Class.class);
                if (list.get(1) instanceof hz) {
                    hzVar = (hz) cw.m1805(list, 1, hz.class);
                } else {
                    objM1806 = cw.m1805(list, 1, Object.class);
                    hzVar = (hz) cw.m1805(list, 2, hz.class);
                }
            } else {
                objM1806 = cw.m1805(list, 0, Object.class);
                cls = objM1806.getClass();
                hzVar = (hz) cw.m1805(list, 1, hz.class);
            }
            Object obj = objM1806;
            cls2 = cls;
            objM1805 = obj;
        }
        id.m2382().m2383();
        return ih.m2483(cls2, objM1805, hzVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1863(List<Object> list) {
        Object objM1805;
        Class<?> cls;
        hz hzVar;
        Object objM1806;
        hz hzVar2;
        Object objM1807;
        int size = list.size();
        Object objM1808 = null;
        Class<?> cls2 = null;
        if (size != 2) {
            if (size == 3) {
                if (list.get(0) instanceof Class) {
                    cls = (Class) cw.m1805(list, 0, Class.class);
                    if (list.get(1) instanceof hz) {
                        hzVar2 = (hz) cw.m1805(list, 1, hz.class);
                        objM1807 = cw.m1805(list, 2, Object.class);
                    } else {
                        objM1805 = cw.m1805(list, 1, Object.class);
                        hzVar = (hz) cw.m1805(list, 2, hz.class);
                    }
                } else {
                    objM1808 = cw.m1805(list, 0, Object.class);
                    cls = objM1808.getClass();
                    hzVar2 = (hz) cw.m1805(list, 1, hz.class);
                    objM1807 = cw.m1805(list, 2, Object.class);
                }
                Class<?> cls3 = cls;
                objM1806 = objM1807;
                hzVar = hzVar2;
                objM1805 = objM1808;
                cls2 = cls3;
            } else if (size != 4) {
                hzVar = null;
                objM1806 = null;
                objM1805 = null;
            } else {
                cls2 = (Class) cw.m1805(list, 0, Class.class);
                Object objM1809 = cw.m1805(list, 1, Object.class);
                hz hzVar3 = (hz) cw.m1805(list, 2, hz.class);
                objM1806 = cw.m1805(list, 3, Object.class);
                hzVar = hzVar3;
                objM1805 = objM1809;
            }
            id.m2382().m2383();
            return ih.m2468(cls2, objM1805, hzVar, objM1806);
        }
        if (list.get(0) instanceof Class) {
            cls = (Class) cw.m1805(list, 0, Class.class);
            objM1805 = null;
        } else {
            Object objM18010 = cw.m1805(list, 0, Object.class);
            if (objM18010 != null) {
                objM1805 = objM18010;
                cls = objM18010.getClass();
            } else {
                objM1805 = objM18010;
                cls = null;
            }
        }
        hzVar = (hz) cw.m1805(list, 1, hz.class);
        cls2 = cls;
        objM1806 = null;
        id.m2382().m2383();
        return ih.m2468(cls2, objM1805, hzVar, objM1806);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Cif> m1864(final ee eeVar, final cl clVar, List<Object> list) {
        Object objM1805 = cw.m1805(list, 0, Object.class);
        final cm cmVar = (cm) cw.m1805(list, 1, cm.class);
        final List<Object> listM1803 = cw.m1803(list, 2);
        if (cmVar == null) {
            return null;
        }
        return id.m2382().m2383().m2494(objM1805, cmVar.m1702(new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.da.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo1868(Cif cif) {
                return cmVar.m1701().m1744(cif, eeVar, clVar, listM1803);
            }
        }));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> Cif<T> m1866(final ee eeVar, final cl clVar, List<Object> list) {
        Object objM1805 = cw.m1805(list, 0, Object.class);
        final cm cmVar = (cm) cw.m1805(list, 1, cm.class);
        final List<Object> listM1803 = cw.m1803(list, 2);
        if (cmVar == null) {
            return null;
        }
        return id.m2382().m2383().m2490(objM1805, cmVar.m1702(new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.da.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1868(Cif cif) {
                return cmVar.m1701().m1744(cif, eeVar, clVar, listM1803);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<Object> m1865(ee eeVar, cl clVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Cif cif : m1864(eeVar, clVar, list)) {
            if (cif != null) {
                arrayList.add(cif.mo2410());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m1859(List<Object> list) {
        Object objM1805 = cw.m1805(list, 0, Object.class);
        List list2 = (List) cw.m1805(list, 1, List.class);
        int iIntValue = ((Integer) cw.m1805(list, 2, Integer.class)).intValue();
        id.m2382().m2383();
        return ih.m2478(objM1805, (List<String>) list2, iIntValue);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m1861(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return id.m2382().m2383().m2493((Class) cw.m1805(list, 0, Class.class), (String) cw.m1805(list, 1, String.class));
        }
        Object objM1805 = cw.m1805(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return id.m2382().m2383().m2489(objM1805, new JSONArray((Collection) cw.m1805(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return id.m2382().m2383().m2489(objM1805, (JSONArray) cw.m1805(list, 1, JSONArray.class));
        }
        return id.m2382().m2383().m2491(objM1805, (String) cw.m1805(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1867(ee eeVar, cl clVar, List<Object> list) {
        Cif cifM1866 = m1866(eeVar, clVar, list);
        if (cifM1866 != null) {
            return cifM1866.mo2410();
        }
        return null;
    }
}
