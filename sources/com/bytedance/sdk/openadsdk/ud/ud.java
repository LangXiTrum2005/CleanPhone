package com.bytedance.sdk.openadsdk.ud;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends qdl {
    private int lnr;
    private volatile boolean mml;
    private int ud;

    public ud(int i2, int i3) {
        this.ud = 15;
        this.lnr = 3;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.ud = i2;
        this.lnr = i3;
    }

    private void lnr(List<File> list) {
        long jUd = ud(list);
        int size = list.size();
        if (qdl(jUd, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jUd -= length;
            }
            if (qdl(file, jUd, size)) {
                return;
            }
        }
    }

    private void mml(List<File> list) {
        long jUd;
        int size;
        boolean zQdl;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zQdl = qdl((jUd = ud(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zQdl) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jUd -= length;
                            }
                            if (qdl(file2, jUd, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ud.qdl
    public boolean qdl(long j, int i2) {
        return i2 <= this.ud;
    }

    @Override // com.bytedance.sdk.openadsdk.ud.qdl
    public boolean qdl(File file, long j, int i2) {
        return i2 <= this.lnr;
    }

    @Override // com.bytedance.sdk.openadsdk.ud.qdl
    public void qdl(List<File> list) {
        if (this.mml) {
            mml(list);
            this.mml = false;
        } else {
            lnr(list);
        }
    }

    public ud(int i2, int i3, boolean z2) {
        this.ud = 15;
        this.lnr = 3;
        if (i2 > 0) {
            this.ud = i2;
            this.lnr = i3;
            this.mml = z2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
