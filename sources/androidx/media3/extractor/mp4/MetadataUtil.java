package androidx.media3.extractor.mp4;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
final class MetadataUtil {
    public static CommentFrame a(int i2, ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.H(8);
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
            a.C(iG2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        parsableByteArray.H(4);
        int i2 = iG - 16;
        byte[] bArr = new byte[i2];
        parsableByteArray.e(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(int i2, ParsableByteArray parsableByteArray, String str) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385 && iG >= 22) {
            parsableByteArray.H(10);
            int iA = parsableByteArray.A();
            if (iA > 0) {
                String strH = android.support.v4.media.a.h(iA, "");
                int iA2 = parsableByteArray.A();
                if (iA2 > 0) {
                    strH = a.m(strH, "/", iA2);
                }
                return new TextInformationFrame(str, null, ImmutableList.z(strH));
            }
        }
        Log.g("MetadataUtil", "Failed to parse index/count attribute: " + Atom.a(i2));
        return null;
    }

    public static int d(ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.H(8);
            int i2 = iG - 16;
            if (i2 == 1) {
                return parsableByteArray.u();
            }
            if (i2 == 2) {
                return parsableByteArray.A();
            }
            if (i2 == 3) {
                return parsableByteArray.x();
            }
            if (i2 == 4 && (parsableByteArray.f5667a[parsableByteArray.f5668b] & 128) == 0) {
                return parsableByteArray.y();
            }
        }
        Log.g("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static Id3Frame e(int i2, String str, ParsableByteArray parsableByteArray, boolean z2, boolean z3) {
        int iD = d(parsableByteArray);
        if (z3) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z2 ? new TextInformationFrame(str, null, ImmutableList.z(Integer.toString(iD))) : new CommentFrame("und", str, Integer.toString(iD));
        }
        Log.g("MetadataUtil", "Failed to parse uint8 attribute: " + Atom.a(i2));
        return null;
    }

    public static TextInformationFrame f(int i2, ParsableByteArray parsableByteArray, String str) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.H(8);
            return new TextInformationFrame(str, null, ImmutableList.z(parsableByteArray.q(iG - 16)));
        }
        Log.g("MetadataUtil", "Failed to parse text attribute: " + Atom.a(i2));
        return null;
    }
}
