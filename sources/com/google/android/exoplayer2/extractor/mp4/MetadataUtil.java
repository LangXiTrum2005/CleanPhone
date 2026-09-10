package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.a;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class MetadataUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17804a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i2, ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.G(8);
            String strQ = parsableByteArray.q(iG - 16);
            return new CommentFrame("und", strQ, strQ);
        }
        Log.g("MetadataUtil", "Failed to parse comment attribute: " + Atom.a(i2));
        return null;
    }

    public static ApicFrame b(ParsableByteArray parsableByteArray) {
        String str;
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() != 1684108385) {
            Log.g("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iG2 = parsableByteArray.g() & 16777215;
        if (iG2 == 13) {
            str = "image/jpeg";
        } else {
            str = iG2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            Z.s(iG2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        parsableByteArray.G(4);
        int i2 = iG - 16;
        byte[] bArr = new byte[i2];
        parsableByteArray.e(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(int i2, String str, ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385 && iG >= 22) {
            parsableByteArray.G(10);
            int iZ = parsableByteArray.z();
            if (iZ > 0) {
                String strH = a.h(iZ, "");
                int iZ2 = parsableByteArray.z();
                if (iZ2 > 0) {
                    strH = androidx.datastore.preferences.protobuf.a.m(strH, "/", iZ2);
                }
                return new TextInformationFrame(str, null, ImmutableList.z(strH));
            }
        }
        Log.g("MetadataUtil", "Failed to parse index/count attribute: " + Atom.a(i2));
        return null;
    }

    public static TextInformationFrame d(int i2, String str, ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.G(8);
            return new TextInformationFrame(str, null, ImmutableList.z(parsableByteArray.q(iG - 16)));
        }
        Log.g("MetadataUtil", "Failed to parse text attribute: " + Atom.a(i2));
        return null;
    }

    public static Id3Frame e(int i2, String str, ParsableByteArray parsableByteArray, boolean z2, boolean z3) {
        int iF = f(parsableByteArray);
        if (z3) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z2 ? new TextInformationFrame(str, null, ImmutableList.z(Integer.toString(iF))) : new CommentFrame("und", str, Integer.toString(iF));
        }
        Log.g("MetadataUtil", "Failed to parse uint8 attribute: " + Atom.a(i2));
        return null;
    }

    public static int f(ParsableByteArray parsableByteArray) {
        parsableByteArray.G(4);
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.G(8);
            return parsableByteArray.u();
        }
        Log.g("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
