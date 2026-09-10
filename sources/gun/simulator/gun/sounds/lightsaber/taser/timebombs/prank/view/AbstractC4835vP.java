package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.ViewCompat;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4835vP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5128a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpResponseHeader.Trailer, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i, JT jt) {
        int iF = jt.f();
        if (jt.f() == 1684108385) {
            jt.F(8);
            String strP = jt.p(iF - 16);
            return new CommentFrame(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, strP, strP);
        }
        AbstractC4936wb.b(i);
        AbstractC4038mJ.f();
        return null;
    }

    public static ApicFrame b(JT jt) {
        String str;
        int iF = jt.f();
        if (jt.f() != 1684108385) {
            AbstractC4038mJ.f();
            return null;
        }
        int iF2 = jt.f() & ViewCompat.MEASURED_SIZE_MASK;
        if (iF2 == 13) {
            str = "image/jpeg";
        } else {
            str = iF2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            AbstractC4038mJ.f();
            return null;
        }
        jt.F(4);
        int i = iF - 16;
        byte[] bArr = new byte[i];
        jt.d(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(int i, JT jt, String str) {
        int iF = jt.f();
        if (jt.f() == 1684108385 && iF >= 22) {
            jt.F(10);
            int iY = jt.y();
            if (iY > 0) {
                String strP = AbstractC3950lJ.p("", iY);
                int iY2 = jt.y();
                if (iY2 > 0) {
                    strP = strP + "/" + iY2;
                }
                return new TextInformationFrame(str, (String) null, AC.p(strP));
            }
        }
        AbstractC4936wb.b(i);
        AbstractC4038mJ.f();
        return null;
    }

    public static TextInformationFrame d(int i, JT jt, String str) {
        int iF = jt.f();
        if (jt.f() == 1684108385) {
            jt.F(8);
            return new TextInformationFrame(str, (String) null, AC.p(jt.p(iF - 16)));
        }
        AbstractC4936wb.b(i);
        AbstractC4038mJ.f();
        return null;
    }

    public static Id3Frame e(int i, String str, JT jt, boolean z, boolean z2) {
        int iF = f(jt);
        if (z2) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z ? new TextInformationFrame(str, (String) null, AC.p(Integer.toString(iF))) : new CommentFrame(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, str, Integer.toString(iF));
        }
        AbstractC4936wb.b(i);
        AbstractC4038mJ.f();
        return null;
    }

    public static int f(JT jt) {
        jt.F(4);
        if (jt.f() == 1684108385) {
            jt.F(8);
            return jt.t();
        }
        AbstractC4038mJ.f();
        return -1;
    }
}
