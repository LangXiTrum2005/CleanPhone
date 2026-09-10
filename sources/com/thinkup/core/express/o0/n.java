package com.thinkup.core.express.o0;

/* JADX INFO: loaded from: classes6.dex */
public enum n {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");

    private String mm;
    private String mn;

    n(String str, String str2) {
        this.mm = str;
        this.mn = str2;
    }

    private static /* synthetic */ n[] n() {
        return new n[]{JS, CSS, JPG, JPEG, PNG, WEBP, GIF, HTM, HTML};
    }

    public final String m() {
        return this.mn;
    }

    public final String o() {
        return this.mm;
    }

    private void m(String str) {
        this.mn = str;
    }

    private void o(String str) {
        this.mm = str;
    }
}
