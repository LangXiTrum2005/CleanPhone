package androidx.media3.extractor.avi;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;

/* JADX INFO: loaded from: classes.dex */
final class ListChunk implements AviChunk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f6858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6859b;

    public ListChunk(int i2, ImmutableList immutableList) {
        this.f6859b = i2;
        this.f6858a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ListChunk b(int i2, ParsableByteArray parsableByteArray) {
        String str;
        AviChunk streamFormatChunk;
        String str2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i3 = parsableByteArray.f5669c;
        int i4 = -2;
        while (parsableByteArray.a() > 8) {
            int i5 = parsableByteArray.i();
            int i6 = parsableByteArray.f5668b + parsableByteArray.i();
            parsableByteArray.F(i6);
            if (i5 != 1414744396) {
                AviStreamHeaderChunk aviStreamHeaderChunk = null;
                switch (i5) {
                    case 1718776947:
                        if (i4 != 2) {
                            if (i4 == 1) {
                                int iN = parsableByteArray.n();
                                if (iN == 1) {
                                    str = "audio/raw";
                                } else if (iN == 85) {
                                    str = "audio/mpeg";
                                } else if (iN == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iN != 8192) {
                                    str = iN != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iN2 = parsableByteArray.n();
                                    int i7 = parsableByteArray.i();
                                    parsableByteArray.H(6);
                                    int iW = Util.w(parsableByteArray.n());
                                    int iN3 = parsableByteArray.a() > 0 ? parsableByteArray.n() : 0;
                                    byte[] bArr = new byte[iN3];
                                    parsableByteArray.e(bArr, 0, iN3);
                                    Format.Builder builder2 = new Format.Builder();
                                    builder2.f5429l = MimeTypes.l(str);
                                    builder2.f5434z = iN2;
                                    builder2.f5418A = i7;
                                    if ("audio/raw".equals(str) && iW != 0) {
                                        builder2.f5419B = iW;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iN3 > 0) {
                                        builder2.o = ImmutableList.z(bArr);
                                    }
                                    streamFormatChunk = new StreamFormatChunk(new Format(builder2));
                                } else {
                                    a.C(iN, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                Log.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Util.A(i4));
                            }
                            streamFormatChunk = aviStreamHeaderChunk;
                            break;
                        } else {
                            parsableByteArray.H(4);
                            int i8 = parsableByteArray.i();
                            int i9 = parsableByteArray.i();
                            parsableByteArray.H(4);
                            int i10 = parsableByteArray.i();
                            switch (i10) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                Format.Builder builder3 = new Format.Builder();
                                builder3.r = i8;
                                builder3.s = i9;
                                builder3.f5429l = MimeTypes.l(str2);
                                streamFormatChunk = new StreamFormatChunk(new Format(builder3));
                            } else {
                                a.C(i10, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                streamFormatChunk = aviStreamHeaderChunk;
                            }
                        }
                        break;
                    case 1751742049:
                        int i11 = parsableByteArray.i();
                        parsableByteArray.H(8);
                        int i12 = parsableByteArray.i();
                        int i13 = parsableByteArray.i();
                        parsableByteArray.H(4);
                        parsableByteArray.i();
                        parsableByteArray.H(12);
                        streamFormatChunk = new AviMainHeaderChunk(i11, i12, i13);
                        break;
                    case 1752331379:
                        int i14 = parsableByteArray.i();
                        parsableByteArray.H(12);
                        parsableByteArray.i();
                        int i15 = parsableByteArray.i();
                        int i16 = parsableByteArray.i();
                        parsableByteArray.H(4);
                        int i17 = parsableByteArray.i();
                        int i18 = parsableByteArray.i();
                        parsableByteArray.H(8);
                        aviStreamHeaderChunk = new AviStreamHeaderChunk(i14, i15, i16, i17, i18);
                        streamFormatChunk = aviStreamHeaderChunk;
                        break;
                    case 1852994675:
                        streamFormatChunk = new StreamNameChunk(parsableByteArray.s(parsableByteArray.a(), Charsets.f19705c));
                        break;
                    default:
                        streamFormatChunk = aviStreamHeaderChunk;
                        break;
                }
            } else {
                streamFormatChunk = b(parsableByteArray.i(), parsableByteArray);
            }
            if (streamFormatChunk != null) {
                if (streamFormatChunk.getType() == 1752331379) {
                    int i19 = ((AviStreamHeaderChunk) streamFormatChunk).f6847a;
                    if (i19 == 1935960438) {
                        i4 = 2;
                    } else if (i19 == 1935963489) {
                        i4 = 1;
                    } else if (i19 != 1937012852) {
                        Log.g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i19));
                        i4 = -1;
                    } else {
                        i4 = 3;
                    }
                }
                builder.h(streamFormatChunk);
            }
            parsableByteArray.G(i6);
            parsableByteArray.F(i3);
        }
        return new ListChunk(i2, builder.j());
    }

    public final AviChunk a(Class cls) {
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f6858a.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            AviChunk aviChunk = (AviChunk) unmodifiableListIteratorListIterator.next();
            if (aviChunk.getClass() == cls) {
                return aviChunk;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return this.f6859b;
    }
}
