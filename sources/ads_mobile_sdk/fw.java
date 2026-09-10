package ads_mobile_sdk;

/* JADX INFO: loaded from: classes.dex */
public enum fw {
    b("definedByJavaScript"),
    c("htmlDisplay"),
    d("nativeDisplay"),
    e("video"),
    /* JADX INFO: Fake field, exist only in values array */
    EF55("audio");

    public final String a;

    fw(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
