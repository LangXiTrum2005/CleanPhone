package com.smartdigimkt.g8;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35547c;
    private final int d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f35548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35550c;
        private int d;

        public b a(Context context) {
            this.f35548a = context;
            return this;
        }

        public b b(int i2) {
            this.d = i2;
            return this;
        }

        private void b() {
            if (TextUtils.isEmpty(this.f35549b) || !this.f35549b.equalsIgnoreCase("exc_log")) {
                return;
            }
            this.f35550c = 0;
        }

        public b a(String str) {
            this.f35549b = str;
            return this;
        }

        public b a(int i2) {
            this.f35550c = i2;
            return this;
        }

        public d a() {
            b();
            return new d(this.f35548a, this.f35549b, this.f35550c, this.d);
        }
    }

    public Context a() {
        return this.f35545a;
    }

    public String b() {
        return this.f35546b;
    }

    public int c() {
        return this.f35547c;
    }

    public int d() {
        return this.d;
    }

    private d(Context context, String str, int i2, int i3) {
        this.f35545a = context;
        this.f35546b = str;
        this.f35547c = i2;
        this.d = i3;
    }
}
