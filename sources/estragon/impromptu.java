package estragon;

import androidx.media3.common.ParserException;
import decarock.grimness;
import decarock.stratoscope;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Pattern f25970attabal = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean attabal(stratoscope stratoscopeVar) {
        String strMolybdenite = stratoscopeVar.molybdenite();
        return strMolybdenite != null && strMolybdenite.startsWith("WEBVTT");
    }

    public static long dern(String str) throws NumberFormatException {
        String[] strArrLicking = grimness.licking(str, "\\.");
        long j = 0;
        for (String str2 : grimness.osteal(strArrLicking[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrLicking.length == 2) {
            j2 += Long.parseLong(strArrLicking[1]);
        }
        return j2 * 1000;
    }

    public static float saneness(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void wireman(stratoscope stratoscopeVar) throws ParserException {
        int iBeachfront = stratoscopeVar.beachfront();
        if (attabal(stratoscopeVar)) {
            return;
        }
        stratoscopeVar.mathsort(iBeachfront);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + stratoscopeVar.molybdenite(), null);
    }
}
