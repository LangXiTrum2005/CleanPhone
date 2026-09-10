package j0;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f43569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43574f;

    public i(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
        uri.getClass();
        this.f43569a = uri;
        this.f43570b = i10;
        this.f43571c = i11;
        this.f43572d = z10;
        this.f43573e = str;
        this.f43574f = i12;
    }

    public i(String str, String str2) {
        this.f43569a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f43570b = 0;
        this.f43571c = 400;
        this.f43572d = false;
        this.f43573e = str2;
        this.f43574f = 0;
    }
}
