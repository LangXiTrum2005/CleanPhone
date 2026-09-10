package z1;

import b3.i;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d3.c;
import defpackage.e;
import i1.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54616a = new a();

    public final no.b a(p pVar) {
        String str = pVar.f42643n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new x2.b(0);
                case "application/x-icy":
                    return new a3.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new x2.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(e.n("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(p pVar) {
        String str = pVar.f42643n;
        return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
