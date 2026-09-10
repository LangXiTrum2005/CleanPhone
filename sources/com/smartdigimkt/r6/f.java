package com.smartdigimkt.r6;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;

/* JADX INFO: loaded from: classes6.dex */
public class f extends d {
    public f(Context context, String str, String str2, long j) {
        super(context, str, str2, j);
    }

    @Override // com.smartdigimkt.r6.e
    public int a() {
        return 1;
    }

    @Override // com.smartdigimkt.r6.e
    public b c() {
        String strA;
        boolean z2;
        if (System.currentTimeMillis() - this.d > h.e().i()) {
            strA = com.smartdigimkt.n8.c.d(this.f38102b, this.f38101a);
            p.b(this.f38102b, "sdm_sdk", "det" + this.f38103c, strA);
            p.b(this.f38102b, "sdm_sdk", "det_time_" + this.f38103c, System.currentTimeMillis());
            z2 = true;
        } else {
            strA = p.a(this.f38102b, "sdm_sdk", "det" + this.f38103c, "");
            z2 = false;
        }
        String str = strA;
        return new b(this.f38101a, this.f38103c, z2, z2 ? System.currentTimeMillis() : this.d, !TextUtils.isEmpty(str), str);
    }
}
