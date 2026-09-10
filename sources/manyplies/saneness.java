package manyplies;

import android.text.TextUtils;
import babyless.marial;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: YoloSerializer.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f33237attabal = "YoloSerializer";

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    @Override // manyplies.attabal
    public <T> String attabal(boolean z, String str, T t) {
        String name;
        char c;
        String name2;
        if (TextUtils.isEmpty(str) || t == null) {
            return null;
        }
        String name3 = "";
        if (List.class.isAssignableFrom(t.getClass())) {
            List list = (List) t;
            if (list.isEmpty()) {
                name2 = "";
            } else {
                name3 = list.get(0).getClass().getName();
                name2 = list.getClass().getName();
            }
            c = '1';
        } else if (Map.class.isAssignableFrom(t.getClass())) {
            Map map = (Map) t;
            if (map.isEmpty()) {
                name2 = "";
            } else {
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    name3 = entry.getKey().getClass().getName();
                    name2 = entry.getValue().getClass().getName();
                } else {
                    name2 = "";
                }
            }
            c = '2';
        } else {
            if (Set.class.isAssignableFrom(t.getClass())) {
                Set set = (Set) t;
                if (set.isEmpty()) {
                    name = "";
                } else {
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        name = it2.next().getClass().getName();
                    } else {
                        name = "";
                    }
                }
                c = '3';
            } else {
                name = t.getClass().getName();
                c = '0';
            }
            name3 = name;
            name2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "0" : "1");
        sb.append("#");
        sb.append(name3);
        sb.append("#");
        sb.append(name2);
        sb.append("#");
        sb.append(c);
        sb.append('V');
        sb.append('@');
        sb.append(str);
        return sb.toString();
    }

    public final String dern(String str) {
        int iIndexOf = str.indexOf(64);
        if (iIndexOf != -1) {
            return str.substring(iIndexOf + 1);
        }
        throw new IllegalArgumentException("Text should contain delimiter");
    }

    @Override // manyplies.attabal
    public marial saneness(String str) throws ClassNotFoundException {
        Class<?> cls;
        String strSubstring;
        String[] strArrSplit = str.split("#");
        Class<?> cls2 = null;
        if (strArrSplit.length < 4) {
            return null;
        }
        char cCharAt = strArrSplit[3].charAt(0);
        String str2 = strArrSplit[1];
        if (str2 == null || str2.length() == 0) {
            cls = null;
        } else {
            try {
                cls = Class.forName(str2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                cls = null;
            }
        }
        String str3 = strArrSplit[2];
        if (str3 != null && str3.length() != 0) {
            try {
                cls2 = Class.forName(str3);
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        Class<?> cls3 = cls2;
        if (strArrSplit.length > 4) {
            try {
                strSubstring = str.substring(strArrSplit[0].length() + strArrSplit[1].length() + strArrSplit[2].length() + 3);
            } catch (Exception e3) {
                e3.printStackTrace();
                strSubstring = "";
            }
        } else {
            strSubstring = strArrSplit[3];
        }
        return new marial(strArrSplit[0], cCharAt, dern(strSubstring), cls, cls3);
    }
}
