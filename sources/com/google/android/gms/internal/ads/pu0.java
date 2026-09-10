package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf f18816a;

    public pu0(qf qfVar) {
        this.f18816a = qfVar;
    }

    public static final Uri b(Uri uri, String str) throws rf {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new rf("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i10 = iIndexOf + 1;
                            StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
                            sb2.append("dc_ms=");
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) string, i10, string.length());
                            return Uri.parse(sb2.toString());
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        StringBuilder sb3 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb3.append(";dc_ms=");
                        sb3.append(str);
                        sb3.append(";");
                        sb3.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return Uri.parse(sb3.toString());
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new rf("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new rf("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = iIndexOf3 + 1;
        StringBuilder sb4 = new StringBuilder(string2.substring(0, i11));
        sb4.append("ms=");
        sb4.append(str);
        sb4.append(X3.j.f27832c);
        sb4.append((CharSequence) string2, i11, string2.length());
        return Uri.parse(sb4.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws rf {
        try {
            return b(uri, this.f18816a.f19044b.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new rf("Provided Uri is not in a valid state");
        }
    }
}
