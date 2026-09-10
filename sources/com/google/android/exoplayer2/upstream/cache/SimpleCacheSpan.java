package com.google.android.exoplayer2.upstream.cache;

import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.thinkup.core.common.n.mo;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class SimpleCacheSpan extends CacheSpan {
    public static final Pattern h0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern i0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern j0 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:28:0x0096 A[PHI: r2
  0x0096: PHI (r2v16 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x008c, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    public static SimpleCacheSpan b(File file, long j, long j2, CachedContentIndex cachedContentIndex) {
        File file2;
        long j3;
        String strGroup;
        File fileD;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = i0.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                int i2 = Util.f18979a;
                int length = strGroup.length();
                int iEnd = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (strGroup.charAt(i4) == '%') {
                        i3++;
                    }
                }
                if (i3 != 0) {
                    int i5 = length - (i3 * 2);
                    StringBuilder sb = new StringBuilder(i5);
                    Matcher matcher2 = Util.g.matcher(strGroup);
                    while (i3 > 0 && matcher2.find()) {
                        char c2 = (char) a.c(matcher2, 1, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c2);
                        iEnd = matcher2.end();
                        i3--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i5) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = h0.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileD = null;
            } else {
                File parentFile = file.getParentFile();
                Assertions.e(parentFile);
                CachedContent cachedContentD = cachedContentIndex.d(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                long j4 = Long.parseLong(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                fileD = d(parentFile, cachedContentD.f18859a, j4, Long.parseLong(strGroup3));
                if (!file.renameTo(fileD)) {
                    fileD = null;
                }
            }
            if (fileD != null) {
                file2 = fileD;
                name = fileD.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = j0.matcher(name);
        if (matcher3.matches()) {
            String strGroup4 = matcher3.group(1);
            strGroup4.getClass();
            String str = (String) cachedContentIndex.f18866b.get(Integer.parseInt(strGroup4));
            if (str != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String strGroup5 = matcher3.group(2);
                    strGroup5.getClass();
                    long j5 = Long.parseLong(strGroup5);
                    if (j2 == -9223372036854775807L) {
                        String strGroup6 = matcher3.group(3);
                        strGroup6.getClass();
                        j3 = Long.parseLong(strGroup6);
                    } else {
                        j3 = j2;
                    }
                    return new SimpleCacheSpan(str, j5, length2, j3, file2);
                }
            }
        }
        return null;
    }

    public static File d(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(mo.ono);
        sb.append(j);
        sb.append(mo.ono);
        return new File(file, android.support.v4.media.a.j(j2, ".v3.exo", sb));
    }
}
