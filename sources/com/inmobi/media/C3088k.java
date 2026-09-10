package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3088k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23731c;
    public final WeakReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f23732e;
    public final String f;
    public final ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f23733h;

    public C3088k(String batchId, Set rawAssets, InterfaceC3249u1 listener, String str, int i2) {
        str = (i2 & 16) != 0 ? null : str;
        Intrinsics.f(batchId, "batchId");
        Intrinsics.f(rawAssets, "rawAssets");
        Intrinsics.f(listener, "listener");
        this.d = new WeakReference(listener);
        this.g = new ArrayList();
        this.f23732e = new HashSet();
        this.f23733h = rawAssets;
        this.f = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdAssetBatch{rawAssets=");
        sb.append(this.f23733h);
        sb.append(", batchDownloadSuccessCount=");
        sb.append(this.f23729a);
        sb.append(", batchDownloadFailureCount=");
        return android.support.v4.media.a.p(sb, this.f23730b, AbstractJsonLexerKt.END_OBJ);
    }
}
