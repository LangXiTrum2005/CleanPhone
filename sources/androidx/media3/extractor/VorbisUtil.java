package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.common.base.Charsets;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisUtil {

    public static final class CommentHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f6815a;

        public CommentHeader(String[] strArr) {
            this.f6815a = strArr;
        }
    }

    public static final class Mode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6816a;

        public Mode(boolean z2) {
            this.f6816a = z2;
        }
    }

    public static final class VorbisIdHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6819c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6820e;
        public final int f;
        public final byte[] g;

        public VorbisIdHeader(int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
            this.f6817a = i2;
            this.f6818b = i3;
            this.f6819c = i4;
            this.d = i5;
            this.f6820e = i6;
            this.f = i7;
            this.g = bArr;
        }
    }

    public static int a(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static Metadata b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = Util.f5683a;
            String[] strArrSplit = str.split(d9.i.f24747b, 2);
            if (strArrSplit.length != 2) {
                Log.g("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new ParsableByteArray(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    Log.h("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static CommentHeader c(ParsableByteArray parsableByteArray, boolean z2, boolean z3) throws ParserException {
        if (z2) {
            d(3, parsableByteArray, false);
        }
        parsableByteArray.s((int) parsableByteArray.l(), Charsets.f19705c);
        long jL = parsableByteArray.l();
        String[] strArr = new String[(int) jL];
        for (int i2 = 0; i2 < jL; i2++) {
            strArr[i2] = parsableByteArray.s((int) parsableByteArray.l(), Charsets.f19705c);
        }
        if (z3 && (parsableByteArray.u() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new CommentHeader(strArr);
    }

    public static boolean d(int i2, ParsableByteArray parsableByteArray, boolean z2) throws ParserException {
        if (parsableByteArray.a() < 7) {
            if (z2) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + parsableByteArray.a());
        }
        if (parsableByteArray.u() != i2) {
            if (z2) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i2));
        }
        if (parsableByteArray.u() == 118 && parsableByteArray.u() == 111 && parsableByteArray.u() == 114 && parsableByteArray.u() == 98 && parsableByteArray.u() == 105 && parsableByteArray.u() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
