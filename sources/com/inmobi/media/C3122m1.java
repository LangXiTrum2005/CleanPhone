package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3122m1 extends T1 {
    public C3122m1() {
        super("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        String asString2 = contentValues.getAsString("disk_uri");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Long asLong3 = contentValues.getAsLong("ttl");
        Long asLong4 = contentValues.getAsLong("soft_ttl");
        Intrinsics.c(asInteger);
        int iIntValue = asInteger.intValue();
        Intrinsics.c(asString);
        Intrinsics.c(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        Intrinsics.c(asLong);
        long jLongValue = asLong.longValue();
        Intrinsics.c(asLong2);
        long jLongValue2 = asLong2.longValue();
        Intrinsics.c(asLong3);
        long jLongValue3 = asLong3.longValue();
        Intrinsics.c(asLong4);
        return new C3072j(iIntValue, asString, asString2, iIntValue2, jLongValue, jLongValue2, jLongValue3, asLong4.longValue());
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        C3072j adAsset = (C3072j) obj;
        Intrinsics.f(adAsset, "adAsset");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(adAsset.f23702a));
        contentValues.put("url", adAsset.f23703b);
        contentValues.put("disk_uri", adAsset.f23704c);
        contentValues.put("pending_attempts", Integer.valueOf(adAsset.d));
        contentValues.put("ts", String.valueOf(adAsset.f23705e));
        contentValues.put("created_ts", String.valueOf(adAsset.f));
        contentValues.put("ttl", String.valueOf(adAsset.g));
        contentValues.put("soft_ttl", String.valueOf(adAsset.f23706h));
        return contentValues;
    }

    public final ArrayList a() {
        ArrayList arrayListA = T1.a(this, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList<C3072j> arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            C3072j c3072j = (C3072j) obj;
            if (c3072j != null && c3072j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3072j c3072j2 : arrayList) {
            if (c3072j2 != null) {
                arrayList2.add(c3072j2);
            }
        }
        return arrayList2;
    }

    public final ArrayList b() {
        ArrayList arrayListA = T1.a(this, null, null, null, null, "ts ASC ", null, 47);
        ArrayList<C3072j> arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            C3072j c3072j = (C3072j) obj;
            if (c3072j != null && !c3072j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3072j c3072j2 : arrayList) {
            if (c3072j2 != null) {
                arrayList2.add(c3072j2);
            }
        }
        return arrayList2;
    }

    public final C3072j a(String remoteUrl) {
        Intrinsics.f(remoteUrl, "remoteUrl");
        ArrayList arrayListA = T1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (arrayListA.isEmpty()) {
            return null;
        }
        return (C3072j) arrayListA.get(0);
    }

    public final C3072j b(String remoteUrl) {
        Intrinsics.f(remoteUrl, "remoteUrl");
        ArrayList arrayListA = T1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (arrayListA.isEmpty()) {
            return null;
        }
        return (C3072j) arrayListA.get(0);
    }

    public final void a(C3072j asset) {
        Intrinsics.f(asset, "asset");
        b(asset, "url = ?", new String[]{asset.f23703b.toString()});
    }
}
