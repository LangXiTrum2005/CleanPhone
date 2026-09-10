package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public final class MediaStoreUtil {
    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && d9.h.I0.equals(uri.getAuthority());
    }
}
