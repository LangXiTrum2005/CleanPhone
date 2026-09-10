package com.bytedance.sdk.component.ud.qdl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mzz extends exu {
    List<String> qdl;
    List<String> ud;

    public mzz(List<String> list, List<String> list2) {
        this.qdl = list;
        this.ud = list2;
    }

    public static final class qdl {
        private final List<String> qdl = new ArrayList();
        private final List<String> ud = new ArrayList();

        public qdl qdl(String str, String str2) {
            this.qdl.add(str);
            this.ud.add(str2);
            return this;
        }

        public mzz qdl() {
            return new mzz(this.qdl, this.ud);
        }
    }
}
