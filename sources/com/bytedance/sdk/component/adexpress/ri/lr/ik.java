package com.bytedance.sdk.component.adexpress.ri.lr;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.ory;
import com.ironsource.A5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik {
    public void ik(List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ri(), com.bytedance.sdk.component.utils.fi.ri(it.next().ri()));
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

    public List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> lr(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar, com.bytedance.sdk.component.adexpress.ri.ik.ri riVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (riVar2 == null || riVar2.di().isEmpty()) {
            arrayList2.addAll(riVar.di());
        } else if (riVar.di().isEmpty()) {
            arrayList.addAll(riVar2.di());
        } else {
            for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : riVar.di()) {
                if (!riVar2.di().contains(c0207ri) && c0207ri != null && c0207ri.ri() != null && c0207ri.lr() != null) {
                    arrayList2.add(c0207ri);
                }
            }
            for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri2 : riVar2.di()) {
                if (!riVar.di().contains(c0207ri2)) {
                    arrayList.add(c0207ri2);
                }
            }
        }
        if (ri(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File ri();

    public boolean ri(Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.ri.ik.ri riVar = map.get(it.next());
            if (riVar != null && !ri(riVar.di())) {
                return false;
            }
        }
        return true;
    }

    public boolean ri(List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> list) {
        if (list == null || list.size() <= 0 || ri() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : list) {
            String strRi = com.bytedance.sdk.component.utils.fi.ri(c0207ri.ri());
            if (TextUtils.isEmpty(strRi)) {
                return false;
            }
            File file = new File(ri(), strRi);
            String strRi2 = com.bytedance.sdk.component.utils.fi.ri(file);
            if (!file.exists() || !file.isFile() || c0207ri.lr() == null || !c0207ri.lr().equals(strRi2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean ik(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar, com.bytedance.sdk.component.adexpress.ri.ik.ri riVar2) {
        if (riVar != null) {
            try {
                if (!TextUtils.isEmpty(riVar.ik())) {
                    if (riVar2 == null) {
                        return false;
                    }
                    String strXha = riVar.xha();
                    String strXha2 = riVar2.xha();
                    if ((!TextUtils.isEmpty(strXha2) && !strXha2.equals(strXha)) || ri(riVar.ik(), riVar2.ik())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi = riVar.ri();
                    Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi2 = riVar2.ri();
                    if (mapRi.isEmpty()) {
                        return !mapRi2.isEmpty();
                    }
                    if (mapRi2.isEmpty()) {
                        return false;
                    }
                    return ri(mapRi, mapRi2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean ri(com.bytedance.sdk.component.adexpress.ri.ik.ri.lr lrVar) {
        if (lrVar == null || ri() == null) {
            return false;
        }
        List<Pair<String, String>> listLr = lrVar.lr();
        if (listLr == null || listLr.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listLr.iterator();
        while (it.hasNext()) {
            File file = new File(ri(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void lr(List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ri(), com.bytedance.sdk.component.utils.fi.ri(it.next().ri()));
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

    public List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> ri(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar, com.bytedance.sdk.component.adexpress.ri.ik.ri riVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi = riVar.ri();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mapRi.size() == 0) {
            if (riVar2 != null && riVar2.ri().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi2 = riVar2.ri();
                Iterator<String> it = mapRi2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ri.ik.ri riVar3 = mapRi2.get(it.next());
                    if (riVar3 != null) {
                        arrayList.addAll(riVar3.di());
                    }
                }
            }
        } else if (riVar2 != null && riVar2.ri().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi3 = riVar2.ri();
            for (String str : mapRi.keySet()) {
                com.bytedance.sdk.component.adexpress.ri.ik.ri riVar4 = mapRi.get(str);
                com.bytedance.sdk.component.adexpress.ri.ik.ri riVar5 = mapRi3.get(str);
                if (riVar5 == null && riVar4 != null) {
                    arrayList2.addAll(riVar4.di());
                } else if (riVar4 == null && riVar5 != null) {
                    arrayList.addAll(riVar5.di());
                } else if (riVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : riVar4.di()) {
                        if (c0207ri != null && !riVar5.di().contains(c0207ri) && c0207ri.lr() != null && c0207ri.ri() != null) {
                            arrayList2.add(c0207ri);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri2 : riVar5.di()) {
                        if (c0207ri2 != null && !riVar4.di().contains(c0207ri2)) {
                            arrayList.add(c0207ri2);
                        }
                    }
                }
            }
        } else if (mapRi.size() != 0) {
            Iterator<String> it2 = mapRi.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.ri.ik.ri riVar6 = mapRi.get(it2.next());
                if (riVar6 != null) {
                    arrayList2.addAll(riVar6.di());
                }
            }
        }
        if (ri(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void lr(File file, com.bytedance.sdk.component.adexpress.ri.ik.ri riVar, String str) {
        if (riVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (riVar.di() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> it = riVar.di().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.fi.ri(it.next().ri())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean ri(List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> list, List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> list2) {
        for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : list) {
            String strRi = c0207ri.ri();
            String strRi2 = com.bytedance.sdk.component.utils.fi.ri(strRi);
            File file = new File(ri(), strRi2);
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
            com.bytedance.sdk.component.xha.lr.ri riVarDi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().di();
            riVarDi.ik(strRi);
            riVarDi.ri(ri().getAbsolutePath(), strRi2);
            com.bytedance.sdk.component.xha.lr lrVarRi = riVarDi.ri();
            list2.add(c0207ri);
            if (lrVarRi == null || !lrVarRi.di() || lrVarRi.fi() == null || !lrVarRi.fi().exists()) {
                ik(list2);
                return false;
            }
        }
        return true;
    }

    public boolean ri(String str) {
        String strRi = com.bytedance.sdk.component.utils.fi.ri(str);
        File file = new File(ri().getAbsoluteFile(), strRi + ".zip");
        com.bytedance.sdk.component.xha.lr.ri riVarDi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().di();
        riVarDi.ik(str);
        riVarDi.ri(file.getParent(), file.getName());
        com.bytedance.sdk.component.xha.lr lrVarRi = riVarDi.ri();
        if (lrVarRi.di() && lrVarRi.fi() != null && lrVarRi.fi().exists()) {
            File fileFi = lrVarRi.fi();
            try {
                ory.ri(fileFi.getAbsolutePath(), file.getParent());
                if (!fileFi.exists()) {
                    return true;
                }
                fileFi.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void ri(int i) {
        if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ka() != null) {
            com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ka().ri(i);
        }
    }

    public static void ri(File file, com.bytedance.sdk.component.adexpress.ri.ik.ri riVar, String str) {
        FileOutputStream fileOutputStream;
        if (riVar == null) {
            return;
        }
        String strQt = riVar.qt();
        if (TextUtils.isEmpty(strQt)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(strQt.getBytes(A5.O));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
            fileOutputStream = null;
        }
    }

    private static boolean ri(Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> map, Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.ri.ik.ri riVar = map.get(str);
            if (riVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.ri.ik.ri riVar2 = map2.get(str);
            if (riVar2 == null) {
                return false;
            }
            if (ri(riVar.ik(), riVar2.ik())) {
                return true;
            }
        }
        return false;
    }

    public static boolean ri(String str, String str2) {
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

    public static boolean ri(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar, String str) {
        if (riVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(riVar.ik())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return ri(riVar.ik(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
