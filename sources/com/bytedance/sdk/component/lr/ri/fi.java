package com.bytedance.sdk.component.lr.ri;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fi extends aw {
    List<String> lr;
    List<String> ri;

    public fi(List<String> list, List<String> list2) {
        this.ri = list;
        this.lr = list2;
    }

    public static final class ri {
        private final List<String> ri = new ArrayList();
        private final List<String> lr = new ArrayList();

        public ri ri(String str, String str2) {
            this.ri.add(str);
            this.lr.add(str2);
            return this;
        }

        public fi ri() {
            return new fi(this.ri, this.lr);
        }
    }
}
