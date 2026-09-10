package com.startapp.sdk.internal;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b3 {
    public static a3 a(String str) {
        try {
            try {
                ArrayList arrayListA = jb.a(new JsonReader(new StringReader(str)));
                String str2 = (String) arrayListA.get(0);
                if (str2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String str3 = (String) arrayListA.get(1);
                if (str3 == null) {
                    throw new IllegalArgumentException(str);
                }
                List list = (List) arrayListA.get(2);
                if (list == null) {
                    throw new IllegalArgumentException(str);
                }
                int size = list.size();
                String[] strArr = new String[size];
                Class[] clsArr = new Class[size];
                Object[] objArr = new Object[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Map map = (Map) list.get(i2);
                    if (map == null) {
                        throw new IllegalArgumentException(str);
                    }
                    if (map.size() != 1) {
                        throw new IllegalArgumentException(str);
                    }
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    String str4 = (String) entry.getKey();
                    if (str4 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    try {
                        Class clsA = d3.a(str4);
                        Object objA = d3.a(clsA, entry.getValue());
                        strArr[i2] = str4;
                        clsArr[i2] = clsA;
                        objArr[i2] = objA;
                    } catch (ClassCastException e2) {
                        throw new IllegalArgumentException(str, e2);
                    } catch (ClassNotFoundException e3) {
                        throw new IllegalArgumentException(str, e3);
                    } catch (IllegalAccessException e4) {
                        throw new IllegalArgumentException(str, e4);
                    } catch (InstantiationException e5) {
                        throw new IllegalArgumentException(str, e5);
                    } catch (NoSuchMethodException e6) {
                        throw new IllegalArgumentException(str, e6);
                    } catch (InvocationTargetException e7) {
                        throw new IllegalArgumentException(str, e7);
                    }
                }
                List list2 = (List) arrayListA.get(3);
                if (list2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String[] strArr2 = new String[list2.size()];
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str5 = (String) list2.get(i3);
                    if (str5 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    strArr2[i3] = str5;
                }
                return new a3(str2, str3, strArr, clsArr, objArr, strArr2);
            } catch (IOException e8) {
                throw new IllegalArgumentException(str, e8);
            }
        } catch (ClassCastException e9) {
            throw new IllegalArgumentException(str, e9);
        }
    }
}
