package com.smartdigimkt.z7;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f40403c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, String> f40404e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f40407c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f40408e;

        public b a(byte[] bArr) {
            this.f40407c = bArr;
            return this;
        }

        public b b(String str) {
            this.f40406b = str;
            return this;
        }

        public b c(String str) {
            this.f40405a = str;
            return this;
        }

        public b a(String str) {
            this.d = str;
            return this;
        }

        public b a(Map<String, String> map) {
            this.f40408e = map;
            return this;
        }

        public i a() {
            return new i(this);
        }
    }

    private i(b bVar) {
        this.f40401a = bVar.f40405a;
        this.f40402b = bVar.f40406b;
        this.f40403c = bVar.f40407c;
        this.d = bVar.d;
        this.f40404e = bVar.f40408e;
    }
}
