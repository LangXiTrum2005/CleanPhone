package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;
import kotlinx.coroutines.taiyuan;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3055lh implements M0 {
    public final AdQualityResult a;

    public C3055lh(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = result;
    }

    @Override // com.inmobi.media.M0
    public final Object a() throws InterruptedException {
        boolean z;
        try {
            z = true;
            taiyuan.saneness(null, new C3030kh(this, null), 1, null);
        } catch (SQLiteException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
