package com.bytedance.sdk.component.adexpress.Lxb.LD;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.id;
import com.bytedance.sdk.component.utils.sLN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lk {
    public List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> LD(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> arrayList3 = new ArrayList<>();
        if (lxb2 == null || lxb2.lc().isEmpty()) {
            arrayList2.addAll(lxb.lc());
        } else if (lxb.lc().isEmpty()) {
            arrayList.addAll(lxb2.lc());
        } else {
            for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : lxb.lc()) {
                if (!lxb2.lc().contains(c0054Lxb) && c0054Lxb != null && c0054Lxb.Lxb() != null && c0054Lxb.LD() != null) {
                    arrayList2.add(c0054Lxb);
                }
            }
            for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb2 : lxb2.lc()) {
                if (!lxb.lc().contains(c0054Lxb2)) {
                    arrayList.add(c0054Lxb2);
                }
            }
        }
        if (Lxb(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File Lxb();

    public boolean Lxb(Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb = map.get(it.next());
            if (lxb != null && !Lxb(lxb.lc())) {
                return false;
            }
        }
        return true;
    }

    public void lk(List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(Lxb(), com.bytedance.sdk.component.utils.JXs.Lxb(it.next().Lxb()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean Lxb(List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> list) {
        if (list == null || list.size() <= 0 || Lxb() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : list) {
            String strLxb = com.bytedance.sdk.component.utils.JXs.Lxb(c0054Lxb.Lxb());
            if (TextUtils.isEmpty(strLxb)) {
                return false;
            }
            File file = new File(Lxb(), strLxb);
            String strLxb2 = com.bytedance.sdk.component.utils.JXs.Lxb(file);
            if (!file.exists() || !file.isFile() || c0054Lxb.LD() == null || !c0054Lxb.LD().equals(strLxb2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean lk(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb2) {
        if (lxb != null) {
            try {
                if (!TextUtils.isEmpty(lxb.lk())) {
                    if (lxb2 == null) {
                        return false;
                    }
                    if (Lxb(lxb.lk(), lxb2.lk())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb = lxb.Lxb();
                    Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb2 = lxb2.Lxb();
                    if (mapLxb.isEmpty()) {
                        return !mapLxb2.isEmpty();
                    }
                    if (mapLxb2.isEmpty()) {
                        return false;
                    }
                    return Lxb(mapLxb, mapLxb2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.LD ld) {
        if (ld == null || Lxb() == null) {
            return false;
        }
        List<Pair<String, String>> listLD = ld.LD();
        if (listLD == null || listLD.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listLD.iterator();
        while (it.hasNext()) {
            File file = new File(Lxb(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void LD(List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(Lxb(), com.bytedance.sdk.component.utils.JXs.Lxb(it.next().Lxb()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb2) {
        Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb = lxb.Lxb();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> arrayList3 = new ArrayList<>();
        if (mapLxb.size() == 0) {
            if (lxb2 != null && lxb2.Lxb().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb2 = lxb2.Lxb();
                Iterator<String> it = mapLxb2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb3 = mapLxb2.get(it.next());
                    if (lxb3 != null) {
                        arrayList.addAll(lxb3.lc());
                    }
                }
            }
        } else if (lxb2 != null && lxb2.Lxb().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb3 = lxb2.Lxb();
            for (String str : mapLxb.keySet()) {
                com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb4 = mapLxb.get(str);
                com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb5 = mapLxb3.get(str);
                if (lxb5 == null && lxb4 != null) {
                    arrayList2.addAll(lxb4.lc());
                } else if (lxb4 == null && lxb5 != null) {
                    arrayList.addAll(lxb5.lc());
                } else if (lxb4 != null) {
                    for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : lxb4.lc()) {
                        if (c0054Lxb != null && !lxb5.lc().contains(c0054Lxb) && c0054Lxb.LD() != null && c0054Lxb.Lxb() != null) {
                            arrayList2.add(c0054Lxb);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb2 : lxb5.lc()) {
                        if (c0054Lxb2 != null && !lxb4.lc().contains(c0054Lxb2)) {
                            arrayList.add(c0054Lxb2);
                        }
                    }
                }
            }
        } else if (mapLxb.size() != 0) {
            Iterator<String> it2 = mapLxb.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb6 = mapLxb.get(it2.next());
                if (lxb6 != null) {
                    arrayList2.addAll(lxb6.lc());
                }
            }
        }
        if (Lxb(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void LD(File file, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb, String str) {
        if (lxb == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (lxb.lc() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> it = lxb.lc().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.JXs.Lxb(it.next().Lxb())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean Lxb(List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> list, List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> list2) {
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : list) {
            String strLxb = c0054Lxb.Lxb();
            String strLxb2 = com.bytedance.sdk.component.utils.JXs.Lxb(strLxb);
            File file = new File(Lxb(), strLxb2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.ebl.LD.Lxb lxbLc = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().lc();
            lxbLc.LD(strLxb);
            lxbLc.Lxb(Lxb().getAbsolutePath(), strLxb2);
            com.bytedance.sdk.component.ebl.LD ldLxb = lxbLc.Lxb();
            list2.add(c0054Lxb);
            if (ldLxb == null || !ldLxb.lc() || ldLxb.JXs() == null || !ldLxb.JXs().exists()) {
                lk(list2);
                return false;
            }
        }
        return true;
    }

    public boolean Lxb(String str) {
        File file = new File(Lxb().getAbsoluteFile(), DM.h(com.bytedance.sdk.component.utils.JXs.Lxb(str), ".zip"));
        com.bytedance.sdk.component.ebl.LD.Lxb lxbLc = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().lc();
        lxbLc.LD(str);
        lxbLc.Lxb(file.getParent(), file.getName());
        com.bytedance.sdk.component.ebl.LD ldLxb = lxbLc.Lxb();
        if (ldLxb.lc() && ldLxb.JXs() != null && ldLxb.JXs().exists()) {
            File fileJXs = ldLxb.JXs();
            try {
                id.Lxb(fileJXs.getAbsolutePath(), file.getParent());
                if (!fileJXs.exists()) {
                    return true;
                }
                fileJXs.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void Lxb(int i) {
        if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().ZU() != null) {
            com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().ZU().Lxb(i);
        }
    }

    public static void Lxb(File file, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb, String str) {
        if (lxb == null) {
            return;
        }
        String strQAg = lxb.QAg();
        if (TextUtils.isEmpty(strQAg)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(strQAg.getBytes("utf-8"));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    sLN.Lxb("PlayComponentEngineCacheManager", "version save error3", th);
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean Lxb(Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> map, Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb = map.get(str);
            if (lxb == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb2 = map2.get(str);
            if (lxb2 == null) {
                return false;
            }
            if (Lxb(lxb.lk(), lxb2.lk())) {
                return true;
            }
        }
        return false;
    }

    private static boolean Lxb(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int length = strArrSplit[i].length() - strArrSplit2[i].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i].compareTo(strArrSplit2[i]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static boolean Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb, String str) {
        if (lxb == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(lxb.lk())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Lxb(lxb.lk(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
