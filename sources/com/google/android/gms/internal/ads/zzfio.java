package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfio {
    private final zzayq zza;

    public zzfio(zzayq zzayqVar) {
        this.zza = zzayqVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzayr {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzayr("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i2 = iIndexOf + 1;
                            StringBuilder sb = new StringBuilder(string.substring(0, i2));
                            sb.append("dc_ms=");
                            sb.append(str);
                            sb.append(";");
                            sb.append((CharSequence) string, i2, string.length());
                            return Uri.parse(sb.toString());
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb2.append(";dc_ms=");
                        sb2.append(str);
                        sb2.append(";");
                        sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return Uri.parse(sb2.toString());
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzayr("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzayr("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i3 = iIndexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i3));
        sb3.append("ms=");
        sb3.append(str);
        sb3.append(d9.i.f24749c);
        sb3.append((CharSequence) string2, i3, string2.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzayr {
        try {
            return zzb(uri, this.zza.zzb().zzf(context, uri.getQueryParameter(b.a3), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzayr("Provided Uri is not in a valid state");
        }
    }
}
