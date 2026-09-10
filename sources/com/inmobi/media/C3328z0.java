package com.inmobi.media;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3328z0 implements InterfaceC3249u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f24140a;

    public C3328z0(B0 b1) {
        this.f24140a = b1;
    }

    @Override // com.inmobi.media.InterfaceC3249u1
    public final void a(C3088k assetBatch, byte b2) {
        Intrinsics.f(assetBatch, "assetBatch");
        B0 b1 = this.f24140a;
        InterfaceC3333z5 interfaceC3333z5 = b1.f;
        if (interfaceC3333z5 != null) {
            String str = b1.d;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).b(str, "onAssetsFetchFailure of batch " + assetBatch);
        }
    }

    @Override // com.inmobi.media.InterfaceC3249u1
    public final void a(C3088k assetBatch) {
        String str;
        Intrinsics.f(assetBatch, "assetBatch");
        B0 b1 = this.f24140a;
        InterfaceC3333z5 interfaceC3333z5 = b1.f;
        if (interfaceC3333z5 != null) {
            String str2 = b1.d;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "onAssetsFetchSuccess of batch " + assetBatch);
        }
        Set set = assetBatch.f23733h;
        for (C3072j c3072j : assetBatch.g) {
            if (!c3072j.f23707i) {
                this.f24140a.getClass();
                Iterator it = set.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    C3307xb c3307xb = (C3307xb) it.next();
                    if (Intrinsics.a(c3307xb.f24104b, c3072j.f23703b)) {
                        byte b2 = c3307xb.f24103a;
                        if (b2 != 2) {
                            if (b2 != 1) {
                                if (b2 != 0) {
                                    break;
                                }
                                str = "video";
                                break;
                            }
                            str = "gif";
                            break;
                        }
                        str = com.smartdigimkt.x.d.c.k;
                        break;
                    }
                }
                Pair pair = new Pair("latency", Long.valueOf(c3072j.k));
                long length = 0;
                try {
                    String path = Uri.parse(c3072j.f23704c).getPath();
                    if (path != null) {
                        File file = new File(path);
                        if (file.exists()) {
                            length = file.length();
                        }
                    }
                } catch (Exception unused) {
                }
                LinkedHashMap linkedHashMapL = MapsKt.l(pair, new Pair("size", Float.valueOf((length * 1.0f) / 1024)), new Pair("assetType", str), new Pair("networkType", L3.q()));
                String strB = this.f24140a.f22710c.b();
                if (strB != null) {
                    linkedHashMapL.put("adType", strB);
                }
                this.f24140a.f22709b.b("AssetDownloaded", linkedHashMapL);
            }
        }
        B0 b3 = this.f24140a;
        InterfaceC3333z5 interfaceC3333z6 = b3.f;
        if (interfaceC3333z6 != null) {
            String str3 = b3.d;
            StringBuilder sbA = H6.a(str3, "access$getTAG$p(...)", "Notifying ad unit with placement ID (");
            sbA.append(this.f24140a.f22710c);
            sbA.append(')');
            ((A5) interfaceC3333z6).a(str3, sbA.toString());
        }
    }
}
