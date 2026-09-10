package com.google.android.exoplayer2.extractor.avi;

import com.applovin.impl.Z;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class ListChunk implements AviChunk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f17614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17615b;

    public ListChunk(int i2, ImmutableList immutableList) {
        this.f17615b = i2;
        this.f17614a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ListChunk b(int i2, ParsableByteArray parsableByteArray) {
        String str;
        AviChunk streamFormatChunk;
        String str2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i3 = parsableByteArray.f18958c;
        int i4 = -2;
        while (parsableByteArray.a() > 8) {
            int i5 = parsableByteArray.i();
            int i6 = parsableByteArray.f18957b + parsableByteArray.i();
            parsableByteArray.E(i6);
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
                                    parsableByteArray.G(6);
                                    int iS = Util.s(parsableByteArray.z());
                                    int iN3 = parsableByteArray.n();
                                    byte[] bArr = new byte[iN3];
                                    parsableByteArray.e(bArr, 0, iN3);
                                    Format.Builder builder2 = new Format.Builder();
                                    builder2.k = str;
                                    builder2.x = iN2;
                                    builder2.y = i7;
                                    if ("audio/raw".equals(str) && iS != 0) {
                                        builder2.f17092z = iS;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iN3 > 0) {
                                        builder2.m = ImmutableList.z(bArr);
                                    }
                                    streamFormatChunk = new StreamFormatChunk(new Format(builder2));
                                } else {
                                    Z.s(iN, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                Log.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Util.w(i4));
                            }
                            streamFormatChunk = aviStreamHeaderChunk;
                            break;
                        } else {
                            parsableByteArray.G(4);
                            int i8 = parsableByteArray.i();
                            int i9 = parsableByteArray.i();
                            parsableByteArray.G(4);
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
                                builder3.f17089p = i8;
                                builder3.q = i9;
                                builder3.k = str2;
                                streamFormatChunk = new StreamFormatChunk(new Format(builder3));
                            } else {
                                Z.s(i10, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                streamFormatChunk = aviStreamHeaderChunk;
                            }
                        }
                        break;
                    case 1751742049:
                        int i11 = parsableByteArray.i();
                        parsableByteArray.G(8);
                        int i12 = parsableByteArray.i();
                        int i13 = parsableByteArray.i();
                        parsableByteArray.G(4);
                        parsableByteArray.i();
                        parsableByteArray.G(12);
                        streamFormatChunk = new AviMainHeaderChunk(i11, i12, i13);
                        break;
                    case 1752331379:
                        int i14 = parsableByteArray.i();
                        parsableByteArray.G(12);
                        parsableByteArray.i();
                        int i15 = parsableByteArray.i();
                        int i16 = parsableByteArray.i();
                        parsableByteArray.G(4);
                        int i17 = parsableByteArray.i();
                        int i18 = parsableByteArray.i();
                        parsableByteArray.G(8);
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
                    int i19 = ((AviStreamHeaderChunk) streamFormatChunk).f17603a;
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
            parsableByteArray.F(i6);
            parsableByteArray.E(i3);
        }
        return new ListChunk(i2, builder.j());
    }

    public final AviChunk a(Class cls) {
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f17614a.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            AviChunk aviChunk = (AviChunk) unmodifiableListIteratorListIterator.next();
            if (aviChunk.getClass() == cls) {
                return aviChunk;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public final int getType() {
        return this.f17615b;
    }
}
