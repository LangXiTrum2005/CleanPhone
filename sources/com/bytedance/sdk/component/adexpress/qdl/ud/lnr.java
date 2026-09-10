package com.bytedance.sdk.component.adexpress.qdl.ud;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.kdv;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class lnr {
    public void lnr(List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(qdl(), com.bytedance.sdk.component.utils.mzz.qdl(it.next().qdl()));
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

    public abstract File qdl();

    public boolean qdl(Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar = map.get(it.next());
            if (qdlVar != null && !qdl(qdlVar.mo())) {
                return false;
            }
        }
        return true;
    }

    public List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> ud(com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> arrayList3 = new ArrayList<>();
        if (qdlVar2 == null || qdlVar2.mo().isEmpty()) {
            arrayList2.addAll(qdlVar.mo());
        } else if (qdlVar.mo().isEmpty()) {
            arrayList.addAll(qdlVar2.mo());
        } else {
            for (com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl c0081qdl : qdlVar.mo()) {
                if (!qdlVar2.mo().contains(c0081qdl) && c0081qdl != null && c0081qdl.qdl() != null && c0081qdl.ud() != null) {
                    arrayList2.add(c0081qdl);
                }
            }
            for (com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl c0081qdl2 : qdlVar2.mo()) {
                if (!qdlVar.mo().contains(c0081qdl2)) {
                    arrayList.add(c0081qdl2);
                }
            }
        }
        if (qdl(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public boolean qdl(List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> list) {
        if (list == null || list.size() <= 0 || qdl() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl c0081qdl : list) {
            String strQdl = com.bytedance.sdk.component.utils.mzz.qdl(c0081qdl.qdl());
            if (TextUtils.isEmpty(strQdl)) {
                return false;
            }
            File file = new File(qdl(), strQdl);
            String strQdl2 = com.bytedance.sdk.component.utils.mzz.qdl(file);
            if (!file.exists() || !file.isFile() || c0081qdl.ud() == null || !c0081qdl.ud().equals(strQdl2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean lnr(com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar2) {
        if (qdlVar != null) {
            try {
                if (!TextUtils.isEmpty(qdlVar.lnr())) {
                    if (qdlVar2 == null) {
                        return false;
                    }
                    String strWd = qdlVar.wd();
                    String strWd2 = qdlVar2.wd();
                    if ((!TextUtils.isEmpty(strWd2) && !strWd2.equals(strWd)) || qdl(qdlVar.lnr(), qdlVar2.lnr())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl = qdlVar.qdl();
                    Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl2 = qdlVar2.qdl();
                    if (mapQdl.isEmpty()) {
                        return !mapQdl2.isEmpty();
                    }
                    if (mapQdl2.isEmpty()) {
                        return false;
                    }
                    return qdl(mapQdl, mapQdl2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.ud udVar) {
        if (udVar == null || qdl() == null) {
            return false;
        }
        List<Pair<String, String>> listUd = udVar.ud();
        if (listUd == null || listUd.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listUd.iterator();
        while (it.hasNext()) {
            File file = new File(qdl(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void ud(List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(qdl(), com.bytedance.sdk.component.utils.mzz.qdl(it.next().qdl()));
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

    public List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl = qdlVar.qdl();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> arrayList3 = new ArrayList<>();
        if (mapQdl.size() == 0) {
            if (qdlVar2 != null && qdlVar2.qdl().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl2 = qdlVar2.qdl();
                Iterator<String> it = mapQdl2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar3 = mapQdl2.get(it.next());
                    if (qdlVar3 != null) {
                        arrayList.addAll(qdlVar3.mo());
                    }
                }
            }
        } else if (qdlVar2 != null && qdlVar2.qdl().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl3 = qdlVar2.qdl();
            for (String str : mapQdl.keySet()) {
                com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar4 = mapQdl.get(str);
                com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar5 = mapQdl3.get(str);
                if (qdlVar5 == null && qdlVar4 != null) {
                    arrayList2.addAll(qdlVar4.mo());
                } else if (qdlVar4 == null && qdlVar5 != null) {
                    arrayList.addAll(qdlVar5.mo());
                } else if (qdlVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl c0081qdl : qdlVar4.mo()) {
                        if (c0081qdl != null && !qdlVar5.mo().contains(c0081qdl) && c0081qdl.ud() != null && c0081qdl.qdl() != null) {
                            arrayList2.add(c0081qdl);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl c0081qdl2 : qdlVar5.mo()) {
                        if (c0081qdl2 != null && !qdlVar4.mo().contains(c0081qdl2)) {
                            arrayList.add(c0081qdl2);
                        }
                    }
                }
            }
        } else if (mapQdl.size() != 0) {
            Iterator<String> it2 = mapQdl.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar6 = mapQdl.get(it2.next());
                if (qdlVar6 != null) {
                    arrayList2.addAll(qdlVar6.mo());
                }
            }
        }
        if (qdl(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void ud(File file, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar, String str) {
        if (qdlVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (qdlVar.mo() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> it = qdlVar.mo().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.mzz.qdl(it.next().qdl())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean qdl(List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> list, List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> list2) {
        for (com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl c0081qdl : list) {
            String strQdl = c0081qdl.qdl();
            String strQdl2 = com.bytedance.sdk.component.utils.mzz.qdl(strQdl);
            File file = new File(qdl(), strQdl2);
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
            com.bytedance.sdk.component.wd.ud.qdl qdlVarMo = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().mo();
            qdlVarMo.ud(strQdl);
            qdlVarMo.qdl(qdl().getAbsolutePath(), strQdl2);
            com.bytedance.sdk.component.wd.ud udVarQdl = qdlVarMo.qdl();
            list2.add(c0081qdl);
            if (udVarQdl == null || !udVarQdl.mo() || udVarQdl.mzz() == null || !udVarQdl.mzz().exists()) {
                lnr(list2);
                return false;
            }
        }
        return true;
    }

    public boolean qdl(String str) {
        File file = new File(qdl().getAbsoluteFile(), a.m(com.bytedance.sdk.component.utils.mzz.qdl(str), ".zip"));
        com.bytedance.sdk.component.wd.ud.qdl qdlVarMo = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().mo();
        qdlVarMo.ud(str);
        qdlVarMo.qdl(file.getParent(), file.getName());
        com.bytedance.sdk.component.wd.ud udVarQdl = qdlVarMo.qdl();
        if (udVarQdl.mo() && udVarQdl.mzz() != null && udVarQdl.mzz().exists()) {
            File fileMzz = udVarQdl.mzz();
            try {
                kdv.qdl(fileMzz.getAbsolutePath(), file.getParent());
                if (!fileMzz.exists()) {
                    return true;
                }
                fileMzz.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void qdl(int i2) {
        if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mml() != null) {
            com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mml().qdl(i2);
        }
    }

    public static void qdl(File file, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar, String str) {
        FileOutputStream fileOutputStream;
        if (qdlVar == null) {
            return;
        }
        String str2 = qdlVar.to();
        if (TextUtils.isEmpty(str2)) {
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
                    fileOutputStream.write(str2.getBytes("utf-8"));
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

    private static boolean qdl(Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> map, Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar = map.get(str);
            if (qdlVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar2 = map2.get(str);
            if (qdlVar2 == null) {
                return false;
            }
            if (qdl(qdlVar.lnr(), qdlVar2.lnr())) {
                return true;
            }
        }
        return false;
    }

    private static boolean qdl(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int length = strArrSplit[i2].length() - strArrSplit2[i2].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i2].compareTo(strArrSplit2[i2]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i2 == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar, String str) {
        if (qdlVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(qdlVar.lnr())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return qdl(qdlVar.lnr(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
