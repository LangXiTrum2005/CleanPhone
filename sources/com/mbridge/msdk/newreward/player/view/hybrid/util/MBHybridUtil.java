package com.mbridge.msdk.newreward.player.view.hybrid.util;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MBHybridUtil {
    private static final String TAG = "MBHybridUtil";

    public static String convert2Unicode(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuilder sb = new StringBuilder(1000);
        sb.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        sb.append(cCharAt);
                        break;
                    }
                    if (cArr[i2] == cCharAt) {
                        sb.append("\\" + cCharAt);
                        break;
                    }
                    i2++;
                }
            } else {
                sb.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    sb.append("0");
                }
                sb.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    sb.append("0");
                }
                sb.append(upperCase2);
            }
        }
        return new String(sb);
    }

    public static double getCurrentVolume(Context context) {
        if (context == null) {
            return -1.0d;
        }
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        return (((double) (audioManager != null ? audioManager.getStreamVolume(3) : -1)) * 100.0d) / ((double) (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public static String getImageMimeType(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String path = Uri.parse(str).getPath();
        String strSubstring = (path == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(iLastIndexOf + 1);
        strSubstring.getClass();
        switch (strSubstring) {
            case "gif":
                return "image/gif";
            case "jpg":
            case "jpeg":
                return "image/jpeg";
            case "png":
                return "image/png";
            case "webp":
                return "image/webp";
            default:
                return "";
        }
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, iIndexOf2)));
            i = iIndexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        com.mbridge.msdk.foundation.tools.o0.b(com.mbridge.msdk.newreward.player.view.hybrid.util.MBHybridUtil.TAG, r7.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getQueryParameters(android.net.Uri r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.getEncodedQuery()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r3 = 0
        L11:
            r4 = 38
            int r4 = r1.indexOf(r4, r3)
            r5 = -1
            if (r4 != r5) goto L1e
            int r4 = r1.length()
        L1e:
            r6 = 61
            int r6 = r1.indexOf(r6, r3)
            if (r6 > r4) goto L28
            if (r6 != r5) goto L29
        L28:
            r6 = r4
        L29:
            java.lang.String r3 = r1.substring(r3, r6)
            java.lang.String r3 = android.net.Uri.decode(r3)
            r2.add(r3)
            int r3 = r4 + 1
            int r4 = r1.length()
            if (r3 < r4) goto L11
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L59
        L45:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r7.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L59
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L59
            goto L45
        L59:
            r7 = move-exception
            goto L60
        L5b:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L59
            return r7
        L60:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r1 = "MBHybridUtil"
            com.mbridge.msdk.foundation.tools.o0.b(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.player.view.hybrid.util.MBHybridUtil.getQueryParameters(android.net.Uri):java.lang.String");
    }
}
