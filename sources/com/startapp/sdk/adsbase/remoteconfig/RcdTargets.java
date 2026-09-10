package com.startapp.sdk.adsbase.remoteconfig;

import android.support.v4.media.a;
import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.vi;
import com.thinkup.core.common.n.mo;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class RcdTargets implements Serializable {
    private static final long serialVersionUID = 6963217195144137950L;

    @TypeInfo
    private final SortedMap<String, Pair<Integer, String>> nameToScopesIds;

    @TypeInfo
    private final SortedMap<Integer, SortedMap<String, String>> scopeToNamesIds;

    public static class Parser implements TypeParser<RcdTargets> {
        private static void add(String str, String str2, int i2, SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
            if (str2.length() < 1) {
                return;
            }
            String strReplaceAll = str2.replaceAll("~", mo.ono);
            sortedMap.put(strReplaceAll, new Pair<>(Integer.valueOf(i2), str));
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = 1 << i3;
                if ((i2 & i4) == i4) {
                    SortedMap<String, String> treeMap = sortedMap2.get(Integer.valueOf(i4));
                    if (treeMap == null) {
                        treeMap = new TreeMap<>();
                        sortedMap2.put(Integer.valueOf(i4), treeMap);
                    }
                    treeMap.put(strReplaceAll, str);
                }
            }
        }

        public static void parseRec(String str, String str2, JSONObject jSONObject, SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
            if (jSONObject == null) {
                return;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("~")) {
                    add(str, str2, jSONObject.optInt(next), sortedMap, sortedMap2);
                } else if (next.endsWith("~") && (jSONObject.opt(next) instanceof JSONObject)) {
                    parseRec(str, a.m(str2, next), jSONObject.optJSONObject(next), sortedMap, sortedMap2);
                } else if (next.length() > 0) {
                    add(str, a.m(str2, next), jSONObject.optInt(next), sortedMap, sortedMap2);
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public RcdTargets parse(Class<RcdTargets> cls, Object obj) {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                parseRec(next, "", jSONObject.optJSONObject(next), treeMap, treeMap2);
            }
            return new RcdTargets(treeMap, treeMap2);
        }
    }

    public RcdTargets(TreeMap treeMap, TreeMap treeMap2) {
        this.nameToScopesIds = treeMap;
        this.scopeToNamesIds = treeMap2;
    }

    public final Collection a(int i2) {
        SortedMap<String, String> sortedMap = this.scopeToNamesIds.get(Integer.valueOf(i2));
        return sortedMap != null ? Collections.unmodifiableCollection(sortedMap.keySet()) : Collections.EMPTY_LIST;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RcdTargets rcdTargets = (RcdTargets) obj;
            if (vi.a(this.nameToScopesIds, rcdTargets.nameToScopesIds) && vi.a(this.scopeToNamesIds, rcdTargets.scopeToNamesIds)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.nameToScopesIds, this.scopeToNamesIds};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final String a(HashMap map) {
        Pair<Integer, String> pair;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            if (str != null && num != null && (pair = this.nameToScopesIds.get(str)) != null) {
                String str2 = pair.second;
                Integer num2 = (Integer) treeMap.get(str2);
                if (num2 == null) {
                    num2 = 0;
                }
                treeMap.put(str2, Integer.valueOf(num.intValue() | num2.intValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append((String) entry2.getKey());
            sb.append(AbstractJsonLexerKt.COLON);
            int iIntValue = ((Integer) entry2.getValue()).intValue();
            int i2 = 1;
            boolean z2 = (57344 & iIntValue) != 0;
            boolean z3 = (iIntValue & 7680) != 0;
            if (z2 && z3) {
                i2 = 6;
            } else if (z2) {
                i2 = 5;
            } else if (z3) {
                i2 = 4;
            } else if ((iIntValue & 256) != 0) {
                i2 = 3;
            } else if ((iIntValue & 172) != 0) {
                i2 = 2;
            } else if ((iIntValue & 83) == 0) {
                i2 = 0;
            }
            sb.append(i2);
        }
        if (sb.length() > 0) {
            sb.append(AbstractJsonLexerKt.COLON);
        }
        return sb.toString();
    }
}
