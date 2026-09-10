package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3210ra {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23961e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23962a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23963b = "none";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23964c = TtmlNode.RIGHT;
    public String d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrientationProperties(allowOrientationChange=");
        sb.append(this.f23962a);
        sb.append(", forceOrientation='");
        sb.append(this.f23963b);
        sb.append("', direction='");
        sb.append(this.f23964c);
        sb.append("', creativeSuppliedProperties=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.d, ')');
    }
}
