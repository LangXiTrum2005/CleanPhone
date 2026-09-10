package com.smartdigimkt.c4;

import android.util.Log;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.s;
import com.thinkup.core.common.oo.o;

/* JADX INFO: loaded from: classes5.dex */
final class f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f34239F = "und";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34240a = "MetadataUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f34241b = f0.d("nam");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f34242c = f0.d("trk");
    private static final int d = f0.d("cmt");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f34243e = f0.d(o.C0684o.mn);
    private static final int f = f0.d("ART");
    private static final int g = f0.d("too");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f34244h = f0.d("alb");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f34245i = f0.d("com");
    private static final int j = f0.d("wrt");
    private static final int k = f0.d("lyr");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f34246l = f0.d(IronSourceSegment.GENDER);
    private static final int m = f0.d("covr");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f34247n = f0.d("gnre");
    private static final int o = f0.d("grp");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f34248p = f0.d("disk");
    private static final int q = f0.d("trkn");
    private static final int r = f0.d("tmpo");
    private static final int s = f0.d("cpil");
    private static final int t = f0.d("aART");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f34249u = f0.d("sonm");
    private static final int v = f0.d("soal");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f34250w = f0.d("soar");
    private static final int x = f0.d("soaa");
    private static final int y = f0.d("soco");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f34251z = f0.d("rtng");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f34236A = f0.d("pgap");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f34237B = f0.d("sosn");
    private static final int C = f0.d("tvsh");
    private static final int D = f0.d("----");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String[] f34238E = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private f() {
    }

    private static com.smartdigimkt.g4.e a(int i2, s sVar) {
        int i3 = sVar.i();
        if (sVar.i() == a.L0) {
            sVar.f(8);
            String strA = sVar.a(i3 - 16);
            return new com.smartdigimkt.g4.e("und", strA, strA);
        }
        Log.w(f34240a, "Failed to parse comment attribute: " + a.a(i2));
        return null;
    }

    public static com.smartdigimkt.e4.a.b b(s sVar) {
        int i2 = sVar.i() + sVar.c();
        int i3 = sVar.i();
        int i4 = (i3 >> 24) & 255;
        try {
            if (i4 == 169 || i4 == 65533) {
                int i5 = 16777215 & i3;
                if (i5 == d) {
                    com.smartdigimkt.g4.e eVarA = a(i3, sVar);
                    sVar.e(i2);
                    return eVarA;
                }
                if (i5 != f34241b && i5 != f34242c) {
                    if (i5 != f34245i && i5 != j) {
                        if (i5 == f34243e) {
                            com.smartdigimkt.g4.k kVarB = b(i3, "TDRC", sVar);
                            sVar.e(i2);
                            return kVarB;
                        }
                        if (i5 == f) {
                            com.smartdigimkt.g4.k kVarB2 = b(i3, "TPE1", sVar);
                            sVar.e(i2);
                            return kVarB2;
                        }
                        if (i5 == g) {
                            com.smartdigimkt.g4.k kVarB3 = b(i3, "TSSE", sVar);
                            sVar.e(i2);
                            return kVarB3;
                        }
                        if (i5 == f34244h) {
                            com.smartdigimkt.g4.k kVarB4 = b(i3, "TALB", sVar);
                            sVar.e(i2);
                            return kVarB4;
                        }
                        if (i5 == k) {
                            com.smartdigimkt.g4.k kVarB5 = b(i3, "USLT", sVar);
                            sVar.e(i2);
                            return kVarB5;
                        }
                        if (i5 == f34246l) {
                            com.smartdigimkt.g4.k kVarB6 = b(i3, "TCON", sVar);
                            sVar.e(i2);
                            return kVarB6;
                        }
                        if (i5 == o) {
                            com.smartdigimkt.g4.k kVarB7 = b(i3, "TIT1", sVar);
                            sVar.e(i2);
                            return kVarB7;
                        }
                    }
                    com.smartdigimkt.g4.k kVarB8 = b(i3, "TCOM", sVar);
                    sVar.e(i2);
                    return kVarB8;
                }
                com.smartdigimkt.g4.k kVarB9 = b(i3, "TIT2", sVar);
                sVar.e(i2);
                return kVarB9;
            }
            if (i3 == f34247n) {
                com.smartdigimkt.g4.k kVarC = c(sVar);
                sVar.e(i2);
                return kVarC;
            }
            if (i3 == f34248p) {
                com.smartdigimkt.g4.k kVarA = a(i3, "TPOS", sVar);
                sVar.e(i2);
                return kVarA;
            }
            if (i3 == q) {
                com.smartdigimkt.g4.k kVarA2 = a(i3, "TRCK", sVar);
                sVar.e(i2);
                return kVarA2;
            }
            if (i3 == r) {
                com.smartdigimkt.g4.h hVarA = a(i3, "TBPM", sVar, true, false);
                sVar.e(i2);
                return hVarA;
            }
            if (i3 == s) {
                com.smartdigimkt.g4.h hVarA2 = a(i3, "TCMP", sVar, true, true);
                sVar.e(i2);
                return hVarA2;
            }
            if (i3 == m) {
                com.smartdigimkt.g4.a aVarA = a(sVar);
                sVar.e(i2);
                return aVarA;
            }
            if (i3 == t) {
                com.smartdigimkt.g4.k kVarB10 = b(i3, "TPE2", sVar);
                sVar.e(i2);
                return kVarB10;
            }
            if (i3 == f34249u) {
                com.smartdigimkt.g4.k kVarB11 = b(i3, "TSOT", sVar);
                sVar.e(i2);
                return kVarB11;
            }
            if (i3 == v) {
                com.smartdigimkt.g4.k kVarB12 = b(i3, "TSO2", sVar);
                sVar.e(i2);
                return kVarB12;
            }
            if (i3 == f34250w) {
                com.smartdigimkt.g4.k kVarB13 = b(i3, "TSOA", sVar);
                sVar.e(i2);
                return kVarB13;
            }
            if (i3 == x) {
                com.smartdigimkt.g4.k kVarB14 = b(i3, "TSOP", sVar);
                sVar.e(i2);
                return kVarB14;
            }
            if (i3 == y) {
                com.smartdigimkt.g4.k kVarB15 = b(i3, "TSOC", sVar);
                sVar.e(i2);
                return kVarB15;
            }
            if (i3 == f34251z) {
                com.smartdigimkt.g4.h hVarA3 = a(i3, "ITUNESADVISORY", sVar, false, false);
                sVar.e(i2);
                return hVarA3;
            }
            if (i3 == f34236A) {
                com.smartdigimkt.g4.h hVarA4 = a(i3, "ITUNESGAPLESS", sVar, false, true);
                sVar.e(i2);
                return hVarA4;
            }
            if (i3 == f34237B) {
                com.smartdigimkt.g4.k kVarB16 = b(i3, "TVSHOWSORT", sVar);
                sVar.e(i2);
                return kVarB16;
            }
            if (i3 == C) {
                com.smartdigimkt.g4.k kVarB17 = b(i3, "TVSHOW", sVar);
                sVar.e(i2);
                return kVarB17;
            }
            if (i3 == D) {
                com.smartdigimkt.g4.h hVarA5 = a(sVar, i2);
                sVar.e(i2);
                return hVarA5;
            }
            Log.d(f34240a, "Skipped unknown metadata entry: " + a.a(i3));
            sVar.e(i2);
            return null;
        } catch (Throwable th) {
            sVar.e(i2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static com.smartdigimkt.g4.k c(s sVar) {
        String str;
        int iD = d(sVar);
        if (iD > 0) {
            String[] strArr = f34238E;
            if (iD <= strArr.length) {
                str = strArr[iD - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new com.smartdigimkt.g4.k("TCON", null, str);
        }
        Log.w(f34240a, "Failed to parse standard genre code");
        return null;
    }

    private static int d(s sVar) {
        sVar.f(4);
        if (sVar.i() == a.L0) {
            sVar.f(8);
            return sVar.x();
        }
        Log.w(f34240a, "Failed to parse uint8 attribute value");
        return -1;
    }

    private static com.smartdigimkt.g4.h a(int i2, String str, s sVar, boolean z2, boolean z3) {
        int iD = d(sVar);
        if (z3) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            if (z2) {
                return new com.smartdigimkt.g4.k(str, null, Integer.toString(iD));
            }
            return new com.smartdigimkt.g4.e("und", str, Integer.toString(iD));
        }
        Log.w(f34240a, "Failed to parse uint8 attribute: " + a.a(i2));
        return null;
    }

    private static com.smartdigimkt.g4.k a(int i2, String str, s sVar) {
        int i3 = sVar.i();
        if (sVar.i() == a.L0 && i3 >= 22) {
            sVar.f(10);
            int iD = sVar.D();
            if (iD > 0) {
                String strH = android.support.v4.media.a.h(iD, "");
                int iD2 = sVar.D();
                if (iD2 > 0) {
                    strH = androidx.datastore.preferences.protobuf.a.m(strH, "/", iD2);
                }
                return new com.smartdigimkt.g4.k(str, null, strH);
            }
        }
        Log.w(f34240a, "Failed to parse index/count attribute: " + a.a(i2));
        return null;
    }

    private static com.smartdigimkt.g4.a a(s sVar) {
        String str;
        int i2 = sVar.i();
        if (sVar.i() == a.L0) {
            int iB = a.b(sVar.i());
            if (iB == 13) {
                str = "image/jpeg";
            } else {
                str = iB == 14 ? "image/png" : null;
            }
            if (str == null) {
                androidx.datastore.preferences.protobuf.a.u(iB, "Unrecognized cover art flags: ", f34240a);
                return null;
            }
            sVar.f(4);
            int i3 = i2 - 16;
            byte[] bArr = new byte[i3];
            sVar.a(bArr, 0, i3);
            return new com.smartdigimkt.g4.a(str, null, 3, bArr);
        }
        Log.w(f34240a, "Failed to parse cover art attribute");
        return null;
    }

    private static com.smartdigimkt.g4.h a(s sVar, int i2) {
        String strA = null;
        String strA2 = null;
        int i3 = -1;
        int i4 = -1;
        while (sVar.c() < i2) {
            int iC = sVar.c();
            int i5 = sVar.i();
            int i6 = sVar.i();
            sVar.f(4);
            if (i6 == a.J0) {
                strA = sVar.a(i5 - 12);
            } else if (i6 == a.K0) {
                strA2 = sVar.a(i5 - 12);
            } else {
                if (i6 == a.L0) {
                    i3 = iC;
                    i4 = i5;
                }
                sVar.f(i5 - 12);
            }
        }
        if (strA == null || strA2 == null || i3 == -1) {
            return null;
        }
        sVar.e(i3);
        sVar.f(16);
        return new com.smartdigimkt.g4.i(strA, strA2, sVar.a(i4 - 16));
    }

    private static com.smartdigimkt.g4.k b(int i2, String str, s sVar) {
        int i3 = sVar.i();
        if (sVar.i() == a.L0) {
            sVar.f(8);
            return new com.smartdigimkt.g4.k(str, null, sVar.a(i3 - 16));
        }
        Log.w(f34240a, "Failed to parse text attribute: " + a.a(i2));
        return null;
    }
}
