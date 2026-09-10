package com.thinkup.core.basead.o;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41803n;
    private final String o;

    /* JADX INFO: renamed from: com.thinkup.core.basead.o.o$o, reason: collision with other inner class name */
    public static class C0657o {
        private boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f41804n;
        private String o;

        public final C0657o m(String str) {
            this.f41804n = str;
            return this;
        }

        public final C0657o o(String str) {
            this.o = str;
            return this;
        }

        public final C0657o o(boolean z2) {
            this.m = z2;
            return this;
        }

        public final o o() {
            return new o(this, (byte) 0);
        }
    }

    public /* synthetic */ o(C0657o c0657o, byte b2) {
        this(c0657o);
    }

    public final boolean m() {
        return this.m;
    }

    public final String n() {
        return this.f41803n;
    }

    public final String o() {
        return this.o;
    }

    private o(C0657o c0657o) {
        this.o = c0657o.o;
        this.m = c0657o.m;
        this.f41803n = c0657o.f41804n;
    }
}
