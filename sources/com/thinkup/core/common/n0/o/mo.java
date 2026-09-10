package com.thinkup.core.common.n0.o;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mo {
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f41957n;
    public String o;
    public String o0;
    public Map<String, String> oo;

    public static class o {
        private String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private byte[] f41958n;
        private String o;
        private String o0;
        private Map<String, String> oo;

        public final o m(String str) {
            this.m = str;
            return this;
        }

        public final o n(String str) {
            this.o0 = str;
            return this;
        }

        public final o o(String str) {
            this.o = str;
            return this;
        }

        public final o o(byte[] bArr) {
            this.f41958n = bArr;
            return this;
        }

        public final o o(Map<String, String> map) {
            this.oo = map;
            return this;
        }

        public final mo o() {
            return new mo(this, (byte) 0);
        }
    }

    public /* synthetic */ mo(o oVar, byte b2) {
        this(oVar);
    }

    private mo(o oVar) {
        this.o = oVar.o;
        this.m = oVar.m;
        this.f41957n = oVar.f41958n;
        this.o0 = oVar.o0;
        this.oo = oVar.oo;
    }
}
