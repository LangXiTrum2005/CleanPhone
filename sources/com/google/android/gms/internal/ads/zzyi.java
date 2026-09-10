package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyi extends zzat {
    public final zzgtd zzc;

    public zzyi(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgtd.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgtd zzgtdVar = this.zzc;
        String message = super.getMessage();
        if (zzgtdVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgtdVar);
        return android.support.v4.media.a.s(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
