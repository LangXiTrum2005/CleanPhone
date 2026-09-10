package com.thinkup.core.common.o0m;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f42147n;
    private final Context o;
    private final int o0;

    public static class o {
        private String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f42148n;
        private Context o;
        private int o0;

        public final o m(int i2) {
            this.o0 = i2;
            return this;
        }

        public final o o(Context context) {
            this.o = context;
            return this;
        }

        private void m() {
            if (TextUtils.isEmpty(this.m) || !this.m.equalsIgnoreCase("exc_log")) {
                return;
            }
            this.f42148n = 0;
        }

        public final o o(String str) {
            this.m = str;
            return this;
        }

        public final o o(int i2) {
            this.f42148n = i2;
            return this;
        }

        public final n o() {
            if (!TextUtils.isEmpty(this.m) && this.m.equalsIgnoreCase("exc_log")) {
                this.f42148n = 0;
            }
            return new n(this.o, this.m, this.f42148n, this.o0, (byte) 0);
        }
    }

    public /* synthetic */ n(Context context, String str, int i2, int i3, byte b2) {
        this(context, str, i2, i3);
    }

    public final String m() {
        return this.m;
    }

    public final int n() {
        return this.f42147n;
    }

    public final Context o() {
        return this.o;
    }

    public final int o0() {
        return this.o0;
    }

    private n(Context context, String str, int i2, int i3) {
        this.o = context;
        this.m = str;
        this.f42147n = i2;
        this.o0 = i3;
    }
}
