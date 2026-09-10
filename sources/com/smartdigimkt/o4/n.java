package com.smartdigimkt.o4;

import com.smartdigimkt.p4.f0;
import com.thinkup.core.common.n.mo;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
final class n extends e {
    private static final String g = ".v3.exo";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f37456h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f37457i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private n(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    public static File a(File file, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(mo.ono);
        sb.append(j2);
        sb.append(mo.ono);
        return new File(file, android.support.v4.media.a.j(j3, g, sb));
    }

    public static n b(String str, long j2) {
        return new n(str, j2, -1L, -9223372036854775807L, null);
    }

    private static File b(File file, h hVar) {
        String strGroup;
        String name = file.getName();
        Matcher matcher = f37457i.matcher(name);
        if (matcher.matches()) {
            strGroup = f0.m(matcher.group(1));
            if (strGroup == null) {
                return null;
            }
        } else {
            matcher = f37456h.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            strGroup = matcher.group(1);
        }
        File fileA = a(file.getParentFile(), hVar.b(strGroup), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(fileA)) {
            return fileA;
        }
        return null;
    }

    public static n a(String str, long j2) {
        return new n(str, j2, -1L, -9223372036854775807L, null);
    }

    public static n a(String str, long j2, long j3) {
        return new n(str, j2, j3, -9223372036854775807L, null);
    }

    public static n a(File file, h hVar) {
        String name = file.getName();
        if (!name.endsWith(g)) {
            file = b(file, hVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = j.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file2.length();
        String strA = hVar.a(Integer.parseInt(matcher.group(1)));
        if (strA == null) {
            return null;
        }
        return new n(strA, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file2);
    }

    public n a(int i2) {
        com.smartdigimkt.p4.a.b(this.d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new n(this.f37422a, this.f37423b, this.f37424c, jCurrentTimeMillis, a(this.f37425e.getParentFile(), i2, this.f37423b, jCurrentTimeMillis));
    }
}
