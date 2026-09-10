package sg.bigo.ads.core.f.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f48493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f48494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48495c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48496e;
    private final int f;
    private final int g;

    public b(int i2, int i3, int i4, int i5, String str, String str2, String str3) {
        this.f48493a = i2;
        this.f48494b = i3;
        this.g = i5;
        this.f48495c = str;
        this.f = i4;
        this.d = str2;
        this.f48496e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.d, "application/javascript");
    }
}
