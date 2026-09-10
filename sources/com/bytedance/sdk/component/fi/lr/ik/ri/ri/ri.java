package com.bytedance.sdk.component.fi.lr.ik.ri.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qt;
import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private File lr;
    private int ri;

    private ri(int i, File file) {
        this.ri = i;
        this.lr = file;
    }

    private void ik(File file) {
        if (file == null) {
            return;
        }
        try {
            xha.lr(file);
        } catch (Throwable unused) {
        }
    }

    private static void ka(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private List<File> lr(File file) {
        List<File> listRi = ri(file);
        if (listRi == null || listRi.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listRi) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listRi, new Comparator<File>() { // from class: com.bytedance.sdk.component.fi.lr.ik.ri.ri.ri.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listRi;
    }

    public static ri ri(int i, File file) {
        try {
            ri riVar = new ri(i, file);
            if (file != null) {
                file.mkdirs();
            }
            return riVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private File ik(String str) {
        return new File(this.lr, str + ".temp");
    }

    public synchronized InputStream ri(String str) {
        FileInputStream fileInputStream;
        if (this.ri <= 0) {
            return null;
        }
        File fileLr = lr(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileLr);
                try {
                    ik(fileLr);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    qt.ri(fileInputStream);
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    private File lr(String str) {
        return new File(this.lr, str);
    }

    public synchronized boolean ri(String str, byte[] bArr) {
        if (this.ri > 0 && str != null && bArr != null) {
            File fileIk = ik(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileIk);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileIk.exists()) {
                        ri(fileIk, lr(str), true);
                    }
                    qt.ri(fileOutputStream2);
                    List<File> listRi = ri(this.lr);
                    if (listRi != null) {
                        int size = listRi.size();
                        int i = this.ri;
                        if (size > i) {
                            ri((int) (((double) i) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.lr;
                        if (file != null) {
                            file.mkdirs();
                        }
                        qt.ri(fileOutputStream);
                        List<File> listRi2 = ri(this.lr);
                        if (listRi2 != null) {
                            int size2 = listRi2.size();
                            int i2 = this.ri;
                            if (size2 > i2) {
                                ri((int) (((double) i2) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        qt.ri(fileOutputStream);
                        List<File> listRi3 = ri(this.lr);
                        if (listRi3 != null) {
                            int size3 = listRi3.size();
                            int i3 = this.ri;
                            if (size3 > i3) {
                                ri((int) (((double) i3) * 0.7d));
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    qt.ri(fileOutputStream);
                    List<File> listRi4 = ri(this.lr);
                    if (listRi4 != null) {
                        int size4 = listRi4.size();
                        int i4 = this.ri;
                        if (size4 > i4) {
                            ri((int) (((double) i4) * 0.7d));
                        }
                    }
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private List<File> ri(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void ri(int i) {
        try {
            if (i > this.ri) {
                return;
            }
            List<File> listLr = lr(this.lr);
            if (listLr != null && listLr.size() > i) {
                while (i < listLr.size()) {
                    File file = listLr.get(i);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void ri(File file, File file2, boolean z) throws IOException {
        if (z) {
            ka(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
