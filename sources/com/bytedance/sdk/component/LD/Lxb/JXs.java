package com.bytedance.sdk.component.LD.Lxb;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class JXs extends STP {
    List<String> LD;
    List<String> Lxb;

    public JXs(List<String> list, List<String> list2) {
        this.Lxb = list;
        this.LD = list2;
    }

    public static final class Lxb {
        private final List<String> Lxb = new ArrayList();
        private final List<String> LD = new ArrayList();

        public Lxb Lxb(String str, String str2) {
            this.Lxb.add(str);
            this.LD.add(str2);
            return this;
        }

        public JXs Lxb() {
            return new JXs(this.Lxb, this.LD);
        }
    }
}
