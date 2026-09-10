package com.thinkup.core.basead.o;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private final String m;
    private final int o;

    public static class o {
        private String m;
        private int o;

        public final o o(int i2) {
            this.o = i2;
            return this;
        }

        public final o o(String str) {
            this.m = str;
            return this;
        }

        public final m o() {
            return new m(this, (byte) 0);
        }
    }

    public /* synthetic */ m(o oVar, byte b2) {
        this(oVar);
    }

    private String m() {
        return this.m;
    }

    public final int o() {
        return this.o;
    }

    private m(o oVar) {
        this.o = oVar.o;
        this.m = oVar.m;
    }
}
