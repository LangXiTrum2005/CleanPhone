package com.bytedance.sdk.component.ri;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    public final String di;
    public final String fi;
    public final String ik;
    public final String ka;
    public final String lr;
    public final String mj;
    public final int ri;
    public final String xha;

    public static final class ri {
        private String di;
        private String fi;
        private String ik;
        private String ka;
        private String lr;
        private String ri;
        private String xha;

        private ri() {
        }

        public ri di(String str) {
            this.di = str;
            return this;
        }

        public ri fi(String str) {
            this.fi = str;
            return this;
        }

        public ri ik(String str) {
            this.ik = str;
            return this;
        }

        public ri ka(String str) {
            this.ka = str;
            return this;
        }

        public ri lr(String str) {
            this.lr = str;
            return this;
        }

        public ri ri(String str) {
            this.ri = str;
            return this;
        }

        public ri xha(String str) {
            this.xha = str;
            return this;
        }

        public bgr ri() {
            return new bgr(this);
        }
    }

    public static ri ri() {
        return new ri();
    }

    public String toString() {
        return "methodName: " + this.ka + ", params: " + this.fi + ", callbackId: " + this.di + ", type: " + this.ik + ", version: " + this.lr + ", ";
    }

    private bgr(String str, int i) {
        this.lr = null;
        this.ik = null;
        this.ka = null;
        this.fi = null;
        this.di = str;
        this.xha = null;
        this.ri = i;
        this.mj = null;
    }

    public static bgr ri(String str, int i) {
        return new bgr(str, i);
    }

    public static boolean ri(bgr bgrVar) {
        return bgrVar == null || bgrVar.ri != 1 || TextUtils.isEmpty(bgrVar.ka) || TextUtils.isEmpty(bgrVar.fi);
    }

    private bgr(ri riVar) {
        this.lr = riVar.ri;
        this.ik = riVar.lr;
        this.ka = riVar.ik;
        this.fi = riVar.ka;
        this.di = riVar.fi;
        this.xha = riVar.di;
        this.ri = 1;
        this.mj = riVar.xha;
    }
}
