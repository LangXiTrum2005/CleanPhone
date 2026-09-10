package com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.to;
import com.bytedance.sdk.component.utils.wd;
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

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private int qdl;
    private File ud;

    private qdl(int i2, File file) {
        this.qdl = i2;
        this.ud = file;
    }

    private void lnr(File file) {
        if (file == null) {
            return;
        }
        try {
            wd.ud(file);
        } catch (Throwable unused) {
        }
    }

    private static void mml(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static qdl qdl(int i2, File file) {
        try {
            qdl qdlVar = new qdl(i2, file);
            if (file != null) {
                file.mkdirs();
            }
            return qdlVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private List<File> ud(File file) {
        List<File> listQdl = qdl(file);
        if (listQdl == null || listQdl.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listQdl) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listQdl, new Comparator<File>() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl.qdl.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
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
        return listQdl;
    }

    private File lnr(String str) {
        return new File(this.ud, a.m(str, ".temp"));
    }

    public synchronized InputStream qdl(String str) {
        FileInputStream fileInputStream;
        if (this.qdl <= 0) {
            return null;
        }
        File fileUd = ud(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileUd);
                try {
                    lnr(fileUd);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    to.qdl(fileInputStream);
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    private File ud(String str) {
        return new File(this.ud, str);
    }

    public synchronized boolean qdl(String str, byte[] bArr) {
        if (this.qdl > 0 && str != null && bArr != null) {
            File fileLnr = lnr(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileLnr);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileLnr.exists()) {
                        qdl(fileLnr, ud(str), true);
                    }
                    to.qdl(fileOutputStream2);
                    List<File> listQdl = qdl(this.ud);
                    if (listQdl != null) {
                        int size = listQdl.size();
                        int i2 = this.qdl;
                        if (size > i2) {
                            qdl((int) (((double) i2) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.ud;
                        if (file != null) {
                            file.mkdirs();
                        }
                        to.qdl(fileOutputStream);
                        List<File> listQdl2 = qdl(this.ud);
                        if (listQdl2 != null) {
                            int size2 = listQdl2.size();
                            int i3 = this.qdl;
                            if (size2 > i3) {
                                qdl((int) (((double) i3) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        to.qdl(fileOutputStream);
                        List<File> listQdl3 = qdl(this.ud);
                        if (listQdl3 != null) {
                            int size3 = listQdl3.size();
                            int i4 = this.qdl;
                            if (size3 > i4) {
                                qdl((int) (((double) i4) * 0.7d));
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    to.qdl(fileOutputStream);
                    List<File> listQdl4 = qdl(this.ud);
                    if (listQdl4 != null) {
                        int size4 = listQdl4.size();
                        int i5 = this.qdl;
                        if (size4 > i5) {
                            qdl((int) (((double) i5) * 0.7d));
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

    private List<File> qdl(File file) {
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

    public synchronized void qdl(int i2) {
        try {
            if (i2 > this.qdl) {
                return;
            }
            List<File> listUd = ud(this.ud);
            if (listUd != null && listUd.size() > i2) {
                while (i2 < listUd.size()) {
                    File file = listUd.get(i2);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i2++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void qdl(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            mml(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
