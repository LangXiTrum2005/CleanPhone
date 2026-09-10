package com.thinkup.core.common.no.m.o.om;

import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.oom;
import com.thinkup.core.common.no.n.oon;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface o {
    public static final o o = new o() { // from class: com.thinkup.core.common.no.m.o.om.o.1
        @Override // com.thinkup.core.common.no.m.o.om.o
        public final oom m(File file) {
            try {
                return nm.m(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return nm.m(file);
            }
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final oom n(File file) {
            try {
                return nm.n(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return nm.n(file);
            }
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final oon o(File file) {
            return nm.o(file);
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final void o0(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final long om(File file) {
            return file.length();
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final void on(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    on(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                }
            }
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final boolean oo(File file) {
            return file.exists();
        }

        @Override // com.thinkup.core.common.no.m.o.om.o
        public final void o(File file, File file2) throws IOException {
            o0(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    };

    oom m(File file);

    oom n(File file);

    oon o(File file);

    void o(File file, File file2);

    void o0(File file);

    long om(File file);

    void on(File file);

    boolean oo(File file);
}
