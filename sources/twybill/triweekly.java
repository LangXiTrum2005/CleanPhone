package twybill;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly extends marial {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final Pattern f39040adultoid = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final Pattern f39041dovishness = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final Pattern f39042gintrap = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public triweekly(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static triweekly apical(String str, long j, long j2) {
        return new triweekly(str, j, j2, C.TIME_UNSET, null);
    }

    public static triweekly cutely(File file, long j, competently competentlyVar) {
        return taiyuan(file, j, C.TIME_UNSET, competentlyVar);
    }

    public static triweekly formularize(String str, long j) {
        return new triweekly(str, j, -1L, C.TIME_UNSET, null);
    }

    public static File impassible(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    public static triweekly taiyuan(File file, long j, long j2, competently competentlyVar) {
        String strTaiyuan;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = triweekly(file, competentlyVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f39042gintrap.matcher(name);
        if (!matcher.matches() || (strTaiyuan = competentlyVar.taiyuan(Integer.parseInt((String) decarock.attabal.marial(matcher.group(1))))) == null) {
            return null;
        }
        if (j == -1) {
            j = file2.length();
        }
        long j3 = j;
        if (j3 == 0) {
            return null;
        }
        return new triweekly(strTaiyuan, Long.parseLong((String) decarock.attabal.marial(matcher.group(2))), j3, j2 == C.TIME_UNSET ? Long.parseLong((String) decarock.attabal.marial(matcher.group(3))) : j2, file2);
    }

    public static File triweekly(File file, competently competentlyVar) {
        String strDemilitarize;
        String name = file.getName();
        Matcher matcher = f39041dovishness.matcher(name);
        if (matcher.matches()) {
            strDemilitarize = grimness.demilitarize((String) decarock.attabal.marial(matcher.group(1)));
        } else {
            matcher = f39040adultoid.matcher(name);
            strDemilitarize = matcher.matches() ? (String) decarock.attabal.marial(matcher.group(1)) : null;
        }
        if (strDemilitarize == null) {
            return null;
        }
        File fileImpassible = impassible((File) decarock.attabal.taiyuan(file.getParentFile()), competentlyVar.marial(strDemilitarize), Long.parseLong((String) decarock.attabal.marial(matcher.group(2))), Long.parseLong((String) decarock.attabal.marial(matcher.group(3))));
        if (file.renameTo(fileImpassible)) {
            return fileImpassible;
        }
        return null;
    }

    public triweekly marial(File file, long j) {
        decarock.attabal.competently(this.f39034polloi);
        return new triweekly(this.f39031kowloon, this.f39029arytenoidectomy, this.f39033monoploid, j, file);
    }
}
