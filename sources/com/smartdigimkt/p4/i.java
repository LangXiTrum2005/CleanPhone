package com.smartdigimkt.p4;

import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class i implements com.smartdigimkt.x3.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f37548e = "EventLogger";
    private static final int f = 3;
    private static final NumberFormat g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.m4.e f37549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.w3.e0.c f37550b = new com.smartdigimkt.w3.e0.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.w3.e0.b f37551c = new com.smartdigimkt.w3.e0.b();
    private final long d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        g = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public i(com.smartdigimkt.m4.e eVar) {
        this.f37549a = eVar;
    }

    private String i(com.smartdigimkt.x3.b.a aVar) {
        String string = "window=" + aVar.f39909c;
        if (aVar.d != null) {
            StringBuilder sbX = android.support.v4.media.a.x(string, ", period=");
            sbX.append(aVar.d.f36015a);
            string = sbX.toString();
            if (aVar.d.a()) {
                StringBuilder sbX2 = android.support.v4.media.a.x(string, ", adGroup=");
                sbX2.append(aVar.d.f36016b);
                StringBuilder sbX3 = android.support.v4.media.a.x(sbX2.toString(), ", ad=");
                sbX3.append(aVar.d.f36017c);
                string = sbX3.toString();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(aVar.f39907a - this.d));
        sb.append(", ");
        return android.support.v4.media.a.s(sb, a(aVar.f), ", ", string);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.t.b bVar, com.smartdigimkt.j4.t.c cVar) {
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar, int i2, long j, long j2) {
    }

    @Override // com.smartdigimkt.x3.b
    public void c(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.t.b bVar, com.smartdigimkt.j4.t.c cVar) {
    }

    @Override // com.smartdigimkt.x3.b
    public void d(com.smartdigimkt.x3.b.a aVar, int i2) {
        b(aVar, "audioSessionId", Integer.toString(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void e(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "mediaPeriodCreated");
    }

    @Override // com.smartdigimkt.x3.b
    public void f(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "mediaPeriodReadingStarted");
    }

    @Override // com.smartdigimkt.x3.b
    public void g(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "drmKeysLoaded");
    }

    @Override // com.smartdigimkt.x3.b
    public void h(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "mediaPeriodReleased");
    }

    private static String e(int i2) {
        if (i2 == 0) {
            return "PREPARED";
        }
        if (i2 != 1) {
            return i2 != 2 ? "?" : "DYNAMIC";
        }
        return "RESET";
    }

    private static String f(int i2) {
        if (i2 == 0) {
            return "default";
        }
        if (i2 == 1) {
            return "audio";
        }
        if (i2 == 2) {
            return "video";
        }
        if (i2 == 3) {
            return "text";
        }
        if (i2 == 4) {
            return TtmlNode.TAG_METADATA;
        }
        if (i2 != 5) {
            return i2 >= 10000 ? androidx.datastore.preferences.protobuf.a.k("custom (", i2, ")") : "?";
        }
        return "none";
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, boolean z2) {
        b(aVar, "loading", Boolean.toString(z2));
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.t.b bVar, com.smartdigimkt.j4.t.c cVar) {
    }

    @Override // com.smartdigimkt.x3.b
    public void c(com.smartdigimkt.x3.b.a aVar, int i2) {
        b(aVar, "repeatMode", c(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void d(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "drmKeysRestored");
    }

    private static String d(int i2) {
        if (i2 == 1) {
            return "IDLE";
        }
        if (i2 == 2) {
            return "BUFFERING";
        }
        if (i2 == 3) {
            return "READY";
        }
        if (i2 != 4) {
            return "?";
        }
        return "ENDED";
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, boolean z2, int i2) {
        b(aVar, "state", z2 + ", " + d(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar, boolean z2) {
        b(aVar, "shuffleModeEnabled", Boolean.toString(z2));
    }

    @Override // com.smartdigimkt.x3.b
    public void c(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "seekProcessed");
    }

    private static String c(int i2) {
        if (i2 == 0) {
            return "OFF";
        }
        if (i2 == 1) {
            return "ONE";
        }
        if (i2 != 2) {
            return "?";
        }
        return "ALL";
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2) {
        b(aVar, "positionDiscontinuity", a(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "seekStarted");
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.w3.v vVar) {
        b(aVar, "playbackParameters", f0.a("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(vVar.f39374a), Float.valueOf(vVar.f39375b), Boolean.valueOf(vVar.f39376c)));
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar, int i2) {
        int iA = aVar.f39908b.a();
        int iB = aVar.f39908b.b();
        a("timelineChanged [" + i(aVar) + ", periodCount=" + iA + ", windowCount=" + iB + ", reason=" + e(i2));
        for (int i3 = 0; i3 < Math.min(iA, 3); i3++) {
            aVar.f39908b.a(i3, this.f37551c);
            a("  period [" + a(this.f37551c.c()) + d9.i.f24752e);
        }
        if (iA > 3) {
            a("  ...");
        }
        for (int i4 = 0; i4 < Math.min(iB, 3); i4++) {
            aVar.f39908b.a(i4, this.f37550b);
            a("  window [" + a(this.f37550b.c()) + ", " + this.f37550b.d + ", " + this.f37550b.f39270e + d9.i.f24752e);
        }
        if (iB > 3) {
            a("  ...");
        }
        a(d9.i.f24752e);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.w3.g gVar) {
        a(aVar, "playerFailed", (Throwable) gVar);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.f0 f0Var, com.smartdigimkt.m4.g gVar) {
        com.smartdigimkt.m4.e.a aVar2;
        com.smartdigimkt.m4.e eVar = this.f37549a;
        com.smartdigimkt.m4.e.a aVarB = eVar != null ? eVar.b() : null;
        if (aVarB == null) {
            b(aVar, "tracksChanged", "[]");
            return;
        }
        a("tracksChanged [" + i(aVar) + ", ");
        int iA = aVarB.a();
        int i2 = 0;
        while (true) {
            String str = "  ]";
            if (i2 >= iA) {
                break;
            }
            com.smartdigimkt.j4.f0 f0VarC = aVarB.c(i2);
            com.smartdigimkt.m4.f fVarA = gVar.a(i2);
            if (f0VarC.f35974a > 0) {
                a("  Renderer:" + i2 + " [");
                int i3 = 0;
                while (i3 < f0VarC.f35974a) {
                    com.smartdigimkt.j4.e0 e0VarA = f0VarC.a(i3);
                    com.smartdigimkt.j4.f0 f0Var2 = f0VarC;
                    String str2 = str;
                    a("    Group:" + i3 + ", adaptive_supported=" + a(e0VarA.f35964a, aVarB.a(i2, i3, false)) + " [");
                    int i4 = 0;
                    while (i4 < e0VarA.f35964a) {
                        String strA = a(fVarA, e0VarA, i4);
                        String strB = b(aVarB.b(i2, i3, i4));
                        StringBuilder sbZ = android.support.v4.media.a.z("      ", strA, " Track:", i4, ", ");
                        sbZ.append(com.smartdigimkt.w3.m.c(e0VarA.a(i4)));
                        sbZ.append(", supported=");
                        sbZ.append(strB);
                        a(sbZ.toString());
                        i4++;
                        aVarB = aVarB;
                    }
                    a("    ]");
                    i3++;
                    f0VarC = f0Var2;
                    str = str2;
                }
                aVar2 = aVarB;
                String str3 = str;
                if (fVarA != null) {
                    for (int i5 = 0; i5 < fVarA.j(); i5++) {
                        com.smartdigimkt.e4.a aVar3 = fVarA.a(i5).d;
                        if (aVar3 != null) {
                            a("    Metadata [");
                            a(aVar3, "      ");
                            a("    ]");
                            break;
                        }
                    }
                }
                a(str3);
            } else {
                aVar2 = aVarB;
            }
            i2++;
            iA = iA;
            aVarB = aVar2;
        }
        com.smartdigimkt.j4.f0 f0VarC2 = aVarB.c();
        if (f0VarC2.f35974a > 0) {
            a("  Renderer:None [");
            for (int i6 = 0; i6 < f0VarC2.f35974a; i6++) {
                a("    Group:" + i6 + " [");
                com.smartdigimkt.j4.e0 e0VarA2 = f0VarC2.a(i6);
                for (int i7 = 0; i7 < e0VarA2.f35964a; i7++) {
                    String strA2 = a(false);
                    String strB2 = b(0);
                    StringBuilder sbZ2 = android.support.v4.media.a.z("      ", strA2, " Track:", i7, ", ");
                    sbZ2.append(com.smartdigimkt.w3.m.c(e0VarA2.a(i7)));
                    sbZ2.append(", supported=");
                    sbZ2.append(strB2);
                    a(sbZ2.toString());
                }
                a("    ]");
            }
            a("  ]");
        }
        a(d9.i.f24752e);
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar, int i2, com.smartdigimkt.z3.d dVar) {
        b(aVar, "decoderEnabled", f(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void b(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.t.c cVar) {
        b(aVar, "downstreamFormatChanged", com.smartdigimkt.w3.m.c(cVar.f36037c));
    }

    private void b(com.smartdigimkt.x3.b.a aVar, String str) {
        a(a(aVar, str));
    }

    private void b(com.smartdigimkt.x3.b.a aVar, String str, String str2) {
        a(a(aVar, str, str2));
    }

    private static String b(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 != 4) {
            return "?";
        }
        return "YES";
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.e4.a aVar2) {
        a("metadata [" + i(aVar) + ", ");
        a(aVar2, "  ");
        a(d9.i.f24752e);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, String str, long j) {
        b(aVar, "decoderInitialized", android.support.v4.media.a.s(new StringBuilder(), f(i2), ", ", str));
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, com.smartdigimkt.w3.m mVar) {
        b(aVar, "decoderInputFormatChanged", f(i2) + ", " + com.smartdigimkt.w3.m.c(mVar));
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, com.smartdigimkt.z3.d dVar) {
        b(aVar, "decoderDisabled", f(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        a(aVar, "audioTrackUnderrun", android.support.v4.media.a.j(j2, d9.i.f24752e, sb), (Throwable) null);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, long j) {
        b(aVar, "droppedFrames", Integer.toString(i2));
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, int i3, int i4, float f2) {
        b(aVar, "videoSizeChanged", i2 + ", " + i3);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, Surface surface) {
        b(aVar, "renderedFirstFrame", surface.toString());
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.t.b bVar, com.smartdigimkt.j4.t.c cVar, IOException iOException, boolean z2) {
        a(aVar, "loadError", (Exception) iOException);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, int i2, int i3) {
        b(aVar, "viewportSizeChanged", i2 + ", " + i3);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, NetworkInfo networkInfo) {
        b(aVar, "networkTypeChanged", networkInfo == null ? "none" : networkInfo.toString());
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, com.smartdigimkt.j4.t.c cVar) {
        b(aVar, "upstreamDiscarded", com.smartdigimkt.w3.m.c(cVar.f36037c));
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar, Exception exc) {
        a(aVar, "drmSessionManagerError", exc);
    }

    @Override // com.smartdigimkt.x3.b
    public void a(com.smartdigimkt.x3.b.a aVar) {
        b(aVar, "drmKeysRemoved");
    }

    public void a(String str) {
        Log.d(f37548e, str);
    }

    public void a(String str, Throwable th) {
        Log.e(f37548e, str, th);
    }

    private void a(com.smartdigimkt.x3.b.a aVar, String str, Throwable th) {
        a(a(aVar, str), th);
    }

    private void a(com.smartdigimkt.x3.b.a aVar, String str, String str2, Throwable th) {
        a(a(aVar, str, str2), th);
    }

    private void a(com.smartdigimkt.x3.b.a aVar, String str, Exception exc) {
        a(aVar, "internalError", str, exc);
    }

    private void a(com.smartdigimkt.e4.a aVar, String str) {
        for (int i2 = 0; i2 < aVar.a(); i2++) {
            StringBuilder sbW = android.support.v4.media.a.w(str);
            sbW.append(aVar.a(i2));
            a(sbW.toString());
        }
    }

    private String a(com.smartdigimkt.x3.b.a aVar, String str) {
        return android.support.v4.media.a.r(android.support.v4.media.a.x(str, " ["), i(aVar), d9.i.f24752e);
    }

    private String a(com.smartdigimkt.x3.b.a aVar, String str, String str2) {
        return androidx.media3.extractor.text.ttml.a.q(android.support.v4.media.a.x(str, " ["), i(aVar), ", ", str2, d9.i.f24752e);
    }

    private static String a(long j) {
        return j == -9223372036854775807L ? "?" : g.format(j / 1000.0f);
    }

    private static String a(int i2, int i3) {
        if (i2 < 2) {
            return "N/A";
        }
        if (i3 == 0) {
            return "NO";
        }
        if (i3 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i3 != 16) {
            return "?";
        }
        return "YES";
    }

    private static String a(com.smartdigimkt.m4.f fVar, com.smartdigimkt.j4.e0 e0Var, int i2) {
        return a((fVar == null || fVar.f() != e0Var || fVar.c(i2) == -1) ? false : true);
    }

    private static String a(boolean z2) {
        return z2 ? "[X]" : "[ ]";
    }

    private static String a(int i2) {
        if (i2 == 0) {
            return "PERIOD_TRANSITION";
        }
        if (i2 == 1) {
            return "SEEK";
        }
        if (i2 == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (i2 == 3) {
            return "AD_INSERTION";
        }
        if (i2 != 4) {
            return "?";
        }
        return "INTERNAL";
    }
}
