package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class nr {
    private static volatile nr fi;
    private final Map<String, List<com.bytedance.sdk.openadsdk.component.fi.lr>> ri = new ConcurrentHashMap();
    private final Map<String, List<String>> lr = new ConcurrentHashMap();
    private final Map<String, AdSlot> ik = new ConcurrentHashMap();
    private final Object ka = new Object();
    private final Runnable di = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.nr.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.component.xha.ri.ri(2);
            com.bytedance.sdk.component.di.ri.xha.ri.ri().postDelayed(nr.this.di, com.bytedance.sdk.openadsdk.component.xha.ri.qt());
        }
    };

    private nr() {
    }

    private com.bytedance.sdk.openadsdk.component.fi.lr lr(wjv wjvVar, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (wjvVar == null || wjvVar.eb() == null || riVar == null) {
            return null;
        }
        String codeId = wjvVar.eb().getCodeId();
        String strJf = wjvVar.jf();
        return new com.bytedance.sdk.openadsdk.component.fi.lr(codeId, riVar.sf(), wjvVar.cem(), System.currentTimeMillis(), wjvVar.nm(), strJf);
    }

    public Map<String, AdSlot> ik() {
        return this.ik;
    }

    public void ka() {
        com.bytedance.sdk.component.di.ri.xha.ri.ri().postDelayed(this.di, com.bytedance.sdk.openadsdk.component.xha.ri.qt());
    }

    public static nr ri() {
        if (fi == null) {
            synchronized (nr.class) {
                try {
                    if (fi == null) {
                        fi = new nr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fi;
    }

    private List<com.bytedance.sdk.openadsdk.component.fi.lr> ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), (String) null);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strLr)) {
            try {
                JSONArray jSONArray = new JSONArray(strLr);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.component.fi.lr.ri(jSONArray.getJSONObject(i)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public void lr() {
        try {
            synchronized (this.ka) {
                this.ri.clear();
                this.lr.clear();
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_material_cache_origin");
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    private void lr(String str) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    private void lr(AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        if (this.ik.size() < com.bytedance.sdk.openadsdk.component.xha.ri.co() && !this.ik.containsKey(codeId)) {
            this.ik.put(codeId, adSlot);
            Objects.toString(this.ik.keySet());
        }
    }

    private void ri(String str, List<com.bytedance.sdk.openadsdk.component.fi.lr> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.component.fi.lr lrVar : list) {
            if (lrVar != null) {
                try {
                    jSONArray.put(lrVar.ri());
                } catch (Exception unused) {
                }
            }
        }
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
    }

    public void ri(wjv wjvVar, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        AdSlot adSlotEb;
        if (wjvVar == null || riVar == null || (adSlotEb = wjvVar.eb()) == null || wjvVar.bl() || !TextUtils.isEmpty(adSlotEb.getBidAdm()) || wjvVar.zm() == 2) {
            return;
        }
        String codeId = adSlotEb.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.ka) {
            try {
                int iCo = com.bytedance.sdk.openadsdk.component.xha.ri.co();
                if (!this.ri.containsKey(codeId) && this.ri.size() >= iCo) {
                    this.ri.size();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.fi.lr lrVarLr = lr(wjvVar, riVar);
                List<com.bytedance.sdk.openadsdk.component.fi.lr> arrayList = this.ri.get(codeId);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ri(arrayList);
                int iMj = com.bytedance.sdk.openadsdk.component.xha.ri.mj();
                if (arrayList.size() < iMj) {
                    arrayList.size();
                    com.bytedance.sdk.openadsdk.component.ka.ri.ri(wjvVar, arrayList.size(), adSlotEb.getCacheScene(), false);
                    arrayList.add(lrVarLr);
                    this.ri.put(codeId, arrayList);
                    ri(adSlotEb, wjvVar.jf());
                    ri(codeId, arrayList);
                    return;
                }
                if (ri(arrayList, adSlotEb) && arrayList.size() < iMj) {
                    arrayList.add(lrVarLr);
                    ri(codeId, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ri(String str, int i, int i2) {
        boolean z = true;
        if (!com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
            return i2 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iMj = com.bytedance.sdk.openadsdk.component.xha.ri.mj();
        synchronized (this.ka) {
            try {
                List<com.bytedance.sdk.openadsdk.component.fi.lr> list = this.ri.get(str);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jJbs = com.bytedance.sdk.openadsdk.component.xha.ri.jbs();
                    for (com.bytedance.sdk.openadsdk.component.fi.lr lrVar : list) {
                        if (lrVar != null && (jCurrentTimeMillis / 1000 > lrVar.ik() || jCurrentTimeMillis - lrVar.ka() > jJbs)) {
                            size--;
                        }
                    }
                    if (i + size >= iMj) {
                        z = false;
                    }
                    list.size();
                    return z;
                }
                if (i >= iMj) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.component.fi.lr ri(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.ka) {
            try {
                ri(codeId, adSlot);
                List<com.bytedance.sdk.openadsdk.component.fi.lr> list = this.ri.get(codeId);
                List<String> list2 = this.lr.get(codeId);
                if (list != null && !list.isEmpty()) {
                    boolean zRi = ri(list);
                    if (list.isEmpty()) {
                        list.size();
                        ri(codeId, (String) null);
                        return null;
                    }
                    if (zRi) {
                        ri(codeId, list);
                    }
                    List<com.bytedance.sdk.openadsdk.component.fi.lr> listRi = ri(list, adSlot, list2);
                    if (listRi != null && !listRi.isEmpty()) {
                        Collections.sort(listRi, com.bytedance.sdk.openadsdk.component.fi.lr.ri);
                        com.bytedance.sdk.openadsdk.component.fi.lr lrVar = listRi.get(0);
                        if (com.bytedance.sdk.openadsdk.component.xha.ri.ri(adSlot) && list2 != null) {
                            if (list2.size() >= list.size()) {
                                return null;
                            }
                            list2.add(lrVar.di());
                        }
                        return lrVar;
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ri(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z || !com.bytedance.sdk.openadsdk.component.xha.ri.ri(adSlot)) {
            return;
        }
        List<String> arrayList = this.lr.get(codeId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.lr.put(codeId, arrayList);
    }

    private void ri(String str, AdSlot adSlot) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iCo = com.bytedance.sdk.openadsdk.component.xha.ri.co();
        if (!this.ri.containsKey(str) && this.ri.size() >= iCo) {
            this.ri.size();
            return;
        }
        List<com.bytedance.sdk.openadsdk.component.fi.lr> list = this.ri.get(str);
        if (list == null || list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.component.fi.lr> listRi = ri(str);
            if (listRi == null) {
                listRi = new ArrayList<>();
            }
            this.ri.put(str, listRi);
        }
        if (!this.lr.containsKey(str)) {
            this.lr.put(str, new ArrayList());
        }
        lr(adSlot);
    }

    private boolean ri(List<com.bytedance.sdk.openadsdk.component.fi.lr> list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<com.bytedance.sdk.openadsdk.component.fi.lr> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.fi.lr next = it.next();
                if (next != null && jCurrentTimeMillis > next.ik()) {
                    com.bytedance.sdk.openadsdk.component.di.ri(com.bytedance.sdk.openadsdk.core.nr.ri()).ri(next.lr());
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean ri(List<com.bytedance.sdk.openadsdk.component.fi.lr> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long jJbs = com.bytedance.sdk.openadsdk.component.xha.ri.jbs();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<com.bytedance.sdk.openadsdk.component.fi.lr> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.fi.lr next = it.next();
                if (next != null && jCurrentTimeMillis - next.ka() > jJbs) {
                    it.remove();
                    com.bytedance.sdk.openadsdk.component.ka.ri.ri(next.lr(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    private List<com.bytedance.sdk.openadsdk.component.fi.lr> ri(List<com.bytedance.sdk.openadsdk.component.fi.lr> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.component.fi.lr lrVar : list) {
            if (lrVar != null) {
                if (com.bytedance.sdk.openadsdk.component.xha.ri.ri(adSlot) && list2.contains(lrVar.di())) {
                    adSlot.getCodeId();
                    lrVar.di();
                } else {
                    arrayList.add(lrVar);
                }
            }
        }
        return arrayList;
    }

    public void ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.ka) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.ri.remove(str);
                    lr(str);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.component.fi.lr> list = this.ri.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator<com.bytedance.sdk.openadsdk.component.fi.lr> it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.openadsdk.component.fi.lr next = it.next();
                        if (next != null && str2.equals(next.di())) {
                            list.size();
                            it.remove();
                        }
                    }
                    if (list.isEmpty()) {
                        list.size();
                        this.ri.remove(str);
                        lr(str);
                    } else if (list.size() < com.bytedance.sdk.openadsdk.component.xha.ri.mj()) {
                        list.size();
                        ri(str, list);
                    }
                    List<String> list2 = this.lr.get(str);
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(str2)) {
                            this.lr.remove(str);
                        } else {
                            list2.remove(str2);
                            if (list2.isEmpty()) {
                                this.lr.remove(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
