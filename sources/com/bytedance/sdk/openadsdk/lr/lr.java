package com.bytedance.sdk.openadsdk.lr;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {
    private int ik;
    private volatile boolean ka;
    private int lr;

    public lr(int i, int i2) {
        this.lr = 15;
        this.ik = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.lr = i;
        this.ik = i2;
    }

    private void ik(List<File> list) {
        long jLr = lr(list);
        int size = list.size();
        if (ri(jLr, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jLr -= length;
            }
            if (ri(file, jLr, size)) {
                return;
            }
        }
    }

    private void ka(List<File> list) {
        long jLr;
        int size;
        boolean zRi;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zRi = ri((jLr = lr(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zRi) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jLr -= length;
                            }
                            if (ri(file2, jLr, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lr.ri
    public boolean ri(long j, int i) {
        return i <= this.lr;
    }

    @Override // com.bytedance.sdk.openadsdk.lr.ri
    public boolean ri(File file, long j, int i) {
        return i <= this.ik;
    }

    @Override // com.bytedance.sdk.openadsdk.lr.ri
    public void ri(List<File> list) {
        if (this.ka) {
            ka(list);
            this.ka = false;
        } else {
            ik(list);
        }
    }

    public lr(int i, int i2, boolean z) {
        this.lr = 15;
        this.ik = 3;
        if (i > 0) {
            this.lr = i;
            this.ik = i2;
            this.ka = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
