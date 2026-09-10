package androidx.profileinstaller;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class DexProfileData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7973c;
    public long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7974e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f7975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TreeMap f7976i;

    public DexProfileData(String str, String str2, long j, int i2, int i3, int i4, int[] iArr, TreeMap treeMap) {
        this.f7971a = str;
        this.f7972b = str2;
        this.f7973c = j;
        this.f7974e = i2;
        this.f = i3;
        this.g = i4;
        this.f7975h = iArr;
        this.f7976i = treeMap;
    }
}
