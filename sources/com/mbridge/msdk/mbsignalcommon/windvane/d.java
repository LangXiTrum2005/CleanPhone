package com.mbridge.msdk.mbsignalcommon.windvane;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum d {
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
    private String f34927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34928b;

    d(String str, String str2) {
        this.f34927a = str;
        this.f34928b = str2;
    }

    public String g() {
        return this.f34928b;
    }

    public String h() {
        return this.f34927a;
    }
}
