package com.smartdigimkt.r6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class g extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    a f38104h;

    public interface a {
        void a(PackageInfo packageInfo);
    }

    public g(Context context, String str, a aVar) {
        super(context, str, "", 0L);
        this.f38104h = aVar;
    }

    @Override // com.smartdigimkt.r6.e
    public int a() {
        return 3;
    }

    @Override // com.smartdigimkt.r6.e
    public b c() {
        PackageInfo packageInfoC = !TextUtils.isEmpty(this.f38101a) ? com.smartdigimkt.n8.c.c(this.f38102b, this.f38101a) : null;
        a aVar = this.f38104h;
        if (aVar != null) {
            aVar.a(packageInfoC);
        }
        return null;
    }

    public g(Context context, String str, String str2, long j) {
        super(context, str, str2, j);
    }
}
