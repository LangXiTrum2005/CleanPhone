package com.smartdigimkt.v3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f39141n = 1;
    public static final int o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f39142p = 1;
    public static final int q = 2;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f39143u = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39146c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39147e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39149i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39150l;
    public int m;

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoViewRecord{videoLength=");
        sb.append(this.f39144a);
        sb.append(", videoStartTime=");
        sb.append(this.f39145b);
        sb.append(", videoEndTime=");
        sb.append(this.f39146c);
        sb.append(", isVideoPlayInStart=");
        sb.append(this.d);
        sb.append(", isVideoPlayInEnd=");
        sb.append(this.f39147e);
        sb.append(", viodePlayScence=");
        sb.append(this.j);
        sb.append(", videoPlayType=");
        sb.append(this.k);
        sb.append(", videoPlayBehavior=");
        sb.append(this.f39150l);
        sb.append(", videoPlayStatus=");
        return android.support.v4.media.a.p(sb, this.m, AbstractJsonLexerKt.END_OBJ);
    }
}
