package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f41431a;

    static {
        String[] strArrA = a("[k1]{v1|v2}[k2]{v1|v2}");
        WeakHashMap weakHashMap = vi.f41589a;
        strArrA.getClass();
        f41431a = strArrA;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    public static HashMap a(int i2, Map map, HttpClientConfig httpClientConfig) {
        String string;
        Set setD;
        HashMap map2 = new HashMap(2);
        map2.put(ii.f41102I, String.valueOf(i2));
        if (map == null || map.isEmpty() || (setD = httpClientConfig.d()) == null || setD.isEmpty()) {
            string = null;
        } else {
            ArrayList arrayList = new ArrayList(setD.size());
            for (Map.Entry entry : map.entrySet()) {
                if (setD.contains(entry.getKey()) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    arrayList.add(entry);
                }
            }
            if (arrayList.isEmpty()) {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder();
                String[] strArrA = a(httpClientConfig.a());
                if (strArrA == null) {
                    strArrA = f41431a;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str = (String) ((Map.Entry) arrayList.get(i3)).getKey();
                    List list = (List) ((Map.Entry) arrayList.get(i3)).getValue();
                    if (i3 == 0) {
                        sb.append(strArrA[0]);
                    } else {
                        sb.append(strArrA[3]);
                    }
                    sb.append(str);
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (i3 == 0) {
                            if (i4 == 0) {
                                sb.append(strArrA[1]);
                            } else {
                                sb.append(strArrA[2]);
                            }
                        } else if (i4 == 0) {
                            sb.append(strArrA[4]);
                        } else {
                            sb.append(strArrA[5]);
                        }
                        sb.append((String) list.get(i4));
                    }
                }
                sb.append(strArrA[6]);
                string = sb.toString();
            }
        }
        if (string != null) {
            map2.put(ii.f41103J, string);
        }
        return map2;
    }

    public static String[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile("^(.*)k1(.*)v1(.*)v2(.*)k2(.*)v1(.*)v2(.*)$").matcher(str);
            if (matcher.matches()) {
                return new String[]{matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), matcher.group(6), matcher.group(7)};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
