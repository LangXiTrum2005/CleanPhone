package com.smartdigimkt.v4;

/* JADX INFO: loaded from: classes6.dex */
public enum c {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39157b;

    c(String str, String str2) {
        this.f39156a = str;
        this.f39157b = str2;
    }

    public void c(String str) {
        this.f39156a = str;
    }

    public String d() {
        return this.f39156a;
    }

    public void b(String str) {
        this.f39157b = str;
    }

    public String c() {
        return this.f39157b;
    }
}
