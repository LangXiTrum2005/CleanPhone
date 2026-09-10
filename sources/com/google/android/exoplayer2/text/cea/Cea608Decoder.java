package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Cea608Decoder extends CeaDecoder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18479i;
    public final int j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f18481n;
    public List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18482p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f18483u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18484w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f18477z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f18473A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f18474B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, BaseATView.g.f38289J, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f18475E = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final boolean[] f18476F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ParsableByteArray g = new ParsableByteArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f18480l = new ArrayList();
    public CueBuilder m = new CueBuilder(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public static final class CueBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f18485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f18486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f18487c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18488e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18489h;

        public static class CueStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f18490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f18491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f18492c;

            public CueStyle(int i2, boolean z2, int i3) {
                this.f18490a = i2;
                this.f18491b = z2;
                this.f18492c = i3;
            }
        }

        public CueBuilder(int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            this.f18485a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f18486b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.f18487c = sb;
            this.g = i2;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.d = 15;
            this.f18488e = 0;
            this.f = 0;
            this.f18489h = i3;
        }

        public final void a(char c2) {
            StringBuilder sb = this.f18487c;
            if (sb.length() < 32) {
                sb.append(c2);
            }
        }

        public final void b() {
            StringBuilder sb = this.f18487c;
            int length = sb.length();
            if (length > 0) {
                sb.delete(length - 1, length);
                ArrayList arrayList = this.f18485a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = (CueStyle) arrayList.get(size);
                    int i2 = cueStyle.f18492c;
                    if (i2 != length) {
                        return;
                    }
                    cueStyle.f18492c = i2 - 1;
                }
            }
        }

        public final Cue c(int i2) {
            float f;
            int i3 = this.f18488e + this.f;
            int i4 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.f18486b;
                if (i5 >= arrayList.size()) {
                    break;
                }
                CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i5);
                int i6 = Util.f18979a;
                if (charSequenceSubSequence.length() > i4) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i4);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
                i5++;
            }
            SpannableString spannableStringD = d();
            int i7 = Util.f18979a;
            int length = spannableStringD.length();
            SpannableString spannableStringSubSequence = spannableStringD;
            if (length > i4) {
                spannableStringSubSequence = spannableStringD.subSequence(0, i4);
            }
            spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i4 - spannableStringBuilder.length();
            int i8 = i3 - length2;
            if (i2 == Integer.MIN_VALUE) {
                if (this.g != 2 || (Math.abs(i8) >= 3 && length2 >= 0)) {
                    i2 = (this.g != 2 || i8 <= 0) ? 0 : 2;
                } else {
                    i2 = 1;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length2;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i9 = this.d;
            if (i9 > 7) {
                i9 -= 17;
            } else if (this.g == 1) {
                i9 -= this.f18489h - 1;
            }
            Cue.Builder builder = new Cue.Builder();
            builder.f18454a = spannableStringBuilder;
            builder.f18456c = Layout.Alignment.ALIGN_NORMAL;
            builder.f18457e = i9;
            builder.f = 1;
            builder.f18458h = f;
            builder.f18459i = i2;
            return builder.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f18487c);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (true) {
                ArrayList arrayList = this.f18485a;
                if (i6 >= arrayList.size()) {
                    break;
                }
                CueStyle cueStyle = (CueStyle) arrayList.get(i6);
                boolean z3 = cueStyle.f18491b;
                int i8 = cueStyle.f18490a;
                if (i8 != 8) {
                    boolean z4 = i8 == 7;
                    if (i8 != 7) {
                        i5 = Cea608Decoder.f18473A[i8];
                    }
                    z2 = z4;
                }
                int i9 = cueStyle.f18492c;
                i6++;
                if (i9 != (i6 < arrayList.size() ? ((CueStyle) arrayList.get(i6)).f18492c : length)) {
                    if (i2 != -1 && !z3) {
                        androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i2, i9, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        androidx.datastore.preferences.protobuf.a.t(2, spannableStringBuilder, i3, i9, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        if (i4 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, i9, 33);
                        }
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i2, length, 33);
            }
            if (i3 != -1 && i3 != length) {
                androidx.datastore.preferences.protobuf.a.t(2, spannableStringBuilder, i3, length, 33);
            }
            if (i7 != length && i4 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.f18485a.isEmpty() && this.f18486b.isEmpty() && this.f18487c.length() == 0;
        }
    }

    public Cea608Decoder(String str, int i2) {
        this.f18478h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.j = 0;
            this.f18479i = 0;
        } else if (i2 == 2) {
            this.j = 1;
            this.f18479i = 0;
        } else if (i2 == 3) {
            this.j = 0;
            this.f18479i = 1;
        } else if (i2 != 4) {
            Log.g("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.f18479i = 0;
        } else {
            this.j = 1;
            this.f18479i = 1;
        }
        g(0);
        f();
        this.f18484w = true;
        this.x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final Subtitle a() {
        List list = this.f18481n;
        this.o = list;
        list.getClass();
        return new CeaSubtitle(list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final void b(SubtitleInputBuffer subtitleInputBuffer) {
        boolean z2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = subtitleInputBuffer.Z;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.g;
        parsableByteArray.D(bArrArray, iLimit);
        boolean z3 = false;
        while (true) {
            int iA = parsableByteArray.a();
            int i6 = this.f18478h;
            if (iA < i6) {
                if (z3) {
                    int i7 = this.f18482p;
                    if (i7 == 1 || i7 == 3) {
                        this.f18481n = e();
                        this.x = this.f18523e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iU = i6 == 2 ? -4 : parsableByteArray.u();
            int iU2 = parsableByteArray.u();
            int iU3 = parsableByteArray.u();
            if ((iU & 2) == 0 && (iU & 1) == this.f18479i) {
                byte b2 = (byte) (iU2 & 127);
                byte b3 = (byte) (iU3 & 127);
                if (b2 != 0 || b3 != 0) {
                    boolean z4 = this.r;
                    if ((iU & 4) == 4) {
                        boolean[] zArr = f18476F;
                        if (zArr[iU2] && zArr[iU3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.r = z2;
                    if (!z2 || (b2 & 240) != 16) {
                        this.s = false;
                        if (!z2) {
                            if (1 > b2 && b2 <= 15) {
                                this.f18484w = false;
                            } else if ((b2 & 246) == 20) {
                                if (b3 == 32 && b3 != 47) {
                                    switch (b3) {
                                        default:
                                            switch (b3) {
                                                case 42:
                                                case 43:
                                                    this.f18484w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f18484w = true;
                                            break;
                                    }
                                } else {
                                    this.f18484w = true;
                                }
                            }
                            if (this.f18484w) {
                                i2 = b2 & 224;
                                if (i2 == 0) {
                                    this.v = (b2 >> 3) & 1;
                                }
                                if (this.v != this.j) {
                                    if (i2 == 0) {
                                        i3 = b2 & 247;
                                        if (i3 == 17 || (b3 & 240) != 48) {
                                            i4 = b2 & 246;
                                            if (i4 != 18 && (b3 & 224) == 32) {
                                                this.m.b();
                                                this.m.a((char) ((b2 & 1) == 0 ? D[b3 & 31] : f18475E[b3 & 31]));
                                            } else if (i3 != 17 && (b3 & 240) == 32) {
                                                this.m.a(' ');
                                                boolean z5 = (b3 & 1) == 1;
                                                CueBuilder cueBuilder = this.m;
                                                cueBuilder.f18485a.add(new CueBuilder.CueStyle((b3 >> 1) & 7, z5, cueBuilder.f18487c.length()));
                                            } else if ((b2 & 240) != 16 && (b3 & 192) == 64) {
                                                int i8 = y[b2 & 7];
                                                if ((b3 & 32) != 0) {
                                                    i8++;
                                                }
                                                CueBuilder cueBuilder2 = this.m;
                                                if (i8 != cueBuilder2.d) {
                                                    if (this.f18482p != 1 && !cueBuilder2.e()) {
                                                        CueBuilder cueBuilder3 = new CueBuilder(this.f18482p, this.q);
                                                        this.m = cueBuilder3;
                                                        this.f18480l.add(cueBuilder3);
                                                    }
                                                    this.m.d = i8;
                                                }
                                                boolean z6 = (b3 & 16) == 16;
                                                boolean z7 = (b3 & 1) == 1;
                                                int i9 = (b3 >> 1) & 7;
                                                CueBuilder cueBuilder4 = this.m;
                                                cueBuilder4.f18485a.add(new CueBuilder.CueStyle(z6 ? 8 : i9, z7, cueBuilder4.f18487c.length()));
                                                if (z6) {
                                                    this.m.f18488e = f18477z[i9];
                                                }
                                            } else if (i3 != 23 && b3 >= 33 && b3 <= 35) {
                                                this.m.f = b3 - 32;
                                            } else if (i4 == 20 && (b3 & 240) == 32) {
                                                if (b3 == 32) {
                                                    g(2);
                                                } else if (b3 != 41) {
                                                    switch (b3) {
                                                        case 37:
                                                            g(1);
                                                            this.q = 2;
                                                            this.m.f18489h = 2;
                                                            break;
                                                        case 38:
                                                            g(1);
                                                            this.q = 3;
                                                            this.m.f18489h = 3;
                                                            break;
                                                        case 39:
                                                            g(1);
                                                            this.q = 4;
                                                            this.m.f18489h = 4;
                                                            break;
                                                        default:
                                                            i5 = this.f18482p;
                                                            if (i5 != 0) {
                                                                if (b3 != 33) {
                                                                    switch (b3) {
                                                                        case 44:
                                                                            this.f18481n = Collections.EMPTY_LIST;
                                                                            if (i5 != 1 || i5 == 3) {
                                                                                f();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i5 == 1 && !this.m.e()) {
                                                                                CueBuilder cueBuilder5 = this.m;
                                                                                arrayList = cueBuilder5.f18486b;
                                                                                arrayList.add(cueBuilder5.d());
                                                                                cueBuilder5.f18487c.setLength(0);
                                                                                cueBuilder5.f18485a.clear();
                                                                                iMin = Math.min(cueBuilder5.f18489h, cueBuilder5.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            f();
                                                                            break;
                                                                        case 47:
                                                                            this.f18481n = e();
                                                                            f();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    g(3);
                                                }
                                            }
                                        } else {
                                            this.m.a((char) C[b3 & 15]);
                                        }
                                    } else {
                                        CueBuilder cueBuilder6 = this.m;
                                        int i10 = (b2 & AbstractJsonLexerKt.TC_INVALID) - 32;
                                        iArr = f18474B;
                                        cueBuilder6.a((char) iArr[i10]);
                                        if ((b3 & 224) != 0) {
                                            this.m.a((char) iArr[(b3 & AbstractJsonLexerKt.TC_INVALID) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            f();
                            z3 = true;
                        }
                    } else if (this.s && this.t == b2 && this.f18483u == b3) {
                        this.s = false;
                    } else {
                        this.s = true;
                        this.t = b2;
                        this.f18483u = b3;
                        if (!z2) {
                            if (1 > b2) {
                                if ((b2 & 246) == 20) {
                                    if (b3 == 32) {
                                        this.f18484w = true;
                                    } else {
                                        this.f18484w = true;
                                    }
                                }
                            } else if ((b2 & 246) == 20) {
                                if (b3 == 32) {
                                    this.f18484w = true;
                                } else {
                                    this.f18484w = true;
                                }
                            }
                            if (this.f18484w) {
                                i2 = b2 & 224;
                                if (i2 == 0) {
                                    this.v = (b2 >> 3) & 1;
                                }
                                if (this.v != this.j) {
                                    if (i2 == 0) {
                                        i3 = b2 & 247;
                                        if (i3 == 17) {
                                            i4 = b2 & 246;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((b2 & 240) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (b3 == 32) {
                                                                    g(2);
                                                                } else if (b3 != 41) {
                                                                    switch (b3) {
                                                                        case 37:
                                                                            g(1);
                                                                            this.q = 2;
                                                                            this.m.f18489h = 2;
                                                                            break;
                                                                        case 38:
                                                                            g(1);
                                                                            this.q = 3;
                                                                            this.m.f18489h = 3;
                                                                            break;
                                                                        case 39:
                                                                            g(1);
                                                                            this.q = 4;
                                                                            this.m.f18489h = 4;
                                                                            break;
                                                                        default:
                                                                            i5 = this.f18482p;
                                                                            if (i5 != 0) {
                                                                                if (b3 != 33) {
                                                                                    switch (b3) {
                                                                                        case 44:
                                                                                            this.f18481n = Collections.EMPTY_LIST;
                                                                                            if (i5 != 1) {
                                                                                                f();
                                                                                            } else {
                                                                                                f();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                CueBuilder cueBuilder7 = this.m;
                                                                                                arrayList = cueBuilder7.f18486b;
                                                                                                arrayList.add(cueBuilder7.d());
                                                                                                cueBuilder7.f18487c.setLength(0);
                                                                                                cueBuilder7.f18485a.clear();
                                                                                                iMin = Math.min(cueBuilder7.f18489h, cueBuilder7.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            f();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f18481n = e();
                                                                                            f();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    g(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder8 = this.m;
                                                                                            arrayList = cueBuilder8.f18486b;
                                                                                            arrayList.add(cueBuilder8.d());
                                                                                            cueBuilder8.f18487c.setLength(0);
                                                                                            cueBuilder8.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder8.f18489h, cueBuilder8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder9 = this.m;
                                                                                            arrayList = cueBuilder9.f18486b;
                                                                                            arrayList.add(cueBuilder9.d());
                                                                                            cueBuilder9.f18487c.setLength(0);
                                                                                            cueBuilder9.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder9.f18489h, cueBuilder9.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder10 = this.m;
                                                                                        arrayList = cueBuilder10.f18486b;
                                                                                        arrayList.add(cueBuilder10.d());
                                                                                        cueBuilder10.f18487c.setLength(0);
                                                                                        cueBuilder10.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder10.f18489h, cueBuilder10.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if ((b2 & 240) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder11 = this.m;
                                                                                            arrayList = cueBuilder11.f18486b;
                                                                                            arrayList.add(cueBuilder11.d());
                                                                                            cueBuilder11.f18487c.setLength(0);
                                                                                            cueBuilder11.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder11.f18489h, cueBuilder11.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder12 = this.m;
                                                                                        arrayList = cueBuilder12.f18486b;
                                                                                        arrayList.add(cueBuilder12.d());
                                                                                        cueBuilder12.f18487c.setLength(0);
                                                                                        cueBuilder12.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder12.f18489h, cueBuilder12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder13 = this.m;
                                                                                        arrayList = cueBuilder13.f18486b;
                                                                                        arrayList.add(cueBuilder13.d());
                                                                                        cueBuilder13.f18487c.setLength(0);
                                                                                        cueBuilder13.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder13.f18489h, cueBuilder13.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder14 = this.m;
                                                                                    arrayList = cueBuilder14.f18486b;
                                                                                    arrayList.add(cueBuilder14.d());
                                                                                    cueBuilder14.f18487c.setLength(0);
                                                                                    cueBuilder14.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder14.f18489h, cueBuilder14.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if (i3 != 17) {
                                                if ((b2 & 240) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder15 = this.m;
                                                                                            arrayList = cueBuilder15.f18486b;
                                                                                            arrayList.add(cueBuilder15.d());
                                                                                            cueBuilder15.f18487c.setLength(0);
                                                                                            cueBuilder15.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder15.f18489h, cueBuilder15.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder16 = this.m;
                                                                                        arrayList = cueBuilder16.f18486b;
                                                                                        arrayList.add(cueBuilder16.d());
                                                                                        cueBuilder16.f18487c.setLength(0);
                                                                                        cueBuilder16.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder16.f18489h, cueBuilder16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder17 = this.m;
                                                                                        arrayList = cueBuilder17.f18486b;
                                                                                        arrayList.add(cueBuilder17.d());
                                                                                        cueBuilder17.f18487c.setLength(0);
                                                                                        cueBuilder17.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder17.f18489h, cueBuilder17.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder18 = this.m;
                                                                                    arrayList = cueBuilder18.f18486b;
                                                                                    arrayList.add(cueBuilder18.d());
                                                                                    cueBuilder18.f18487c.setLength(0);
                                                                                    cueBuilder18.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder18.f18489h, cueBuilder18.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if ((b2 & 240) != 16) {
                                                if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder19 = this.m;
                                                                                        arrayList = cueBuilder19.f18486b;
                                                                                        arrayList.add(cueBuilder19.d());
                                                                                        cueBuilder19.f18487c.setLength(0);
                                                                                        cueBuilder19.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder19.f18489h, cueBuilder19.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder110 = this.m;
                                                                                    arrayList = cueBuilder110.f18486b;
                                                                                    arrayList.add(cueBuilder110.d());
                                                                                    cueBuilder110.f18487c.setLength(0);
                                                                                    cueBuilder110.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder110.f18489h, cueBuilder110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if (i3 != 23) {
                                                if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder111 = this.m;
                                                                                    arrayList = cueBuilder111.f18486b;
                                                                                    arrayList.add(cueBuilder111.d());
                                                                                    cueBuilder111.f18487c.setLength(0);
                                                                                    cueBuilder111.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder111.f18489h, cueBuilder111.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if (i4 == 20) {
                                                if (b3 == 32) {
                                                    g(2);
                                                } else if (b3 != 41) {
                                                    switch (b3) {
                                                        case 37:
                                                            g(1);
                                                            this.q = 2;
                                                            this.m.f18489h = 2;
                                                            break;
                                                        case 38:
                                                            g(1);
                                                            this.q = 3;
                                                            this.m.f18489h = 3;
                                                            break;
                                                        case 39:
                                                            g(1);
                                                            this.q = 4;
                                                            this.m.f18489h = 4;
                                                            break;
                                                        default:
                                                            i5 = this.f18482p;
                                                            if (i5 != 0) {
                                                                if (b3 != 33) {
                                                                    switch (b3) {
                                                                        case 44:
                                                                            this.f18481n = Collections.EMPTY_LIST;
                                                                            if (i5 != 1) {
                                                                                f();
                                                                            } else {
                                                                                f();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i5 == 1) {
                                                                                CueBuilder cueBuilder112 = this.m;
                                                                                arrayList = cueBuilder112.f18486b;
                                                                                arrayList.add(cueBuilder112.d());
                                                                                cueBuilder112.f18487c.setLength(0);
                                                                                cueBuilder112.f18485a.clear();
                                                                                iMin = Math.min(cueBuilder112.f18489h, cueBuilder112.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            f();
                                                                            break;
                                                                        case 47:
                                                                            this.f18481n = e();
                                                                            f();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    g(3);
                                                }
                                            }
                                        } else {
                                            i4 = b2 & 246;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((b2 & 240) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (b3 == 32) {
                                                                    g(2);
                                                                } else if (b3 != 41) {
                                                                    switch (b3) {
                                                                        case 37:
                                                                            g(1);
                                                                            this.q = 2;
                                                                            this.m.f18489h = 2;
                                                                            break;
                                                                        case 38:
                                                                            g(1);
                                                                            this.q = 3;
                                                                            this.m.f18489h = 3;
                                                                            break;
                                                                        case 39:
                                                                            g(1);
                                                                            this.q = 4;
                                                                            this.m.f18489h = 4;
                                                                            break;
                                                                        default:
                                                                            i5 = this.f18482p;
                                                                            if (i5 != 0) {
                                                                                if (b3 != 33) {
                                                                                    switch (b3) {
                                                                                        case 44:
                                                                                            this.f18481n = Collections.EMPTY_LIST;
                                                                                            if (i5 != 1) {
                                                                                                f();
                                                                                            } else {
                                                                                                f();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                CueBuilder cueBuilder113 = this.m;
                                                                                                arrayList = cueBuilder113.f18486b;
                                                                                                arrayList.add(cueBuilder113.d());
                                                                                                cueBuilder113.f18487c.setLength(0);
                                                                                                cueBuilder113.f18485a.clear();
                                                                                                iMin = Math.min(cueBuilder113.f18489h, cueBuilder113.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            f();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f18481n = e();
                                                                                            f();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    g(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder114 = this.m;
                                                                                            arrayList = cueBuilder114.f18486b;
                                                                                            arrayList.add(cueBuilder114.d());
                                                                                            cueBuilder114.f18487c.setLength(0);
                                                                                            cueBuilder114.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder114.f18489h, cueBuilder114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder115 = this.m;
                                                                                            arrayList = cueBuilder115.f18486b;
                                                                                            arrayList.add(cueBuilder115.d());
                                                                                            cueBuilder115.f18487c.setLength(0);
                                                                                            cueBuilder115.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder115.f18489h, cueBuilder115.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder116 = this.m;
                                                                                        arrayList = cueBuilder116.f18486b;
                                                                                        arrayList.add(cueBuilder116.d());
                                                                                        cueBuilder116.f18487c.setLength(0);
                                                                                        cueBuilder116.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder116.f18489h, cueBuilder116.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if ((b2 & 240) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder117 = this.m;
                                                                                            arrayList = cueBuilder117.f18486b;
                                                                                            arrayList.add(cueBuilder117.d());
                                                                                            cueBuilder117.f18487c.setLength(0);
                                                                                            cueBuilder117.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder117.f18489h, cueBuilder117.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder118 = this.m;
                                                                                        arrayList = cueBuilder118.f18486b;
                                                                                        arrayList.add(cueBuilder118.d());
                                                                                        cueBuilder118.f18487c.setLength(0);
                                                                                        cueBuilder118.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder118.f18489h, cueBuilder118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder119 = this.m;
                                                                                        arrayList = cueBuilder119.f18486b;
                                                                                        arrayList.add(cueBuilder119.d());
                                                                                        cueBuilder119.f18487c.setLength(0);
                                                                                        cueBuilder119.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder119.f18489h, cueBuilder119.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder1110 = this.m;
                                                                                    arrayList = cueBuilder1110.f18486b;
                                                                                    arrayList.add(cueBuilder1110.d());
                                                                                    cueBuilder1110.f18487c.setLength(0);
                                                                                    cueBuilder1110.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder1110.f18489h, cueBuilder1110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if (i3 != 17) {
                                                if ((b2 & 240) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (b3 == 32) {
                                                                g(2);
                                                            } else if (b3 != 41) {
                                                                switch (b3) {
                                                                    case 37:
                                                                        g(1);
                                                                        this.q = 2;
                                                                        this.m.f18489h = 2;
                                                                        break;
                                                                    case 38:
                                                                        g(1);
                                                                        this.q = 3;
                                                                        this.m.f18489h = 3;
                                                                        break;
                                                                    case 39:
                                                                        g(1);
                                                                        this.q = 4;
                                                                        this.m.f18489h = 4;
                                                                        break;
                                                                    default:
                                                                        i5 = this.f18482p;
                                                                        if (i5 != 0) {
                                                                            if (b3 != 33) {
                                                                                switch (b3) {
                                                                                    case 44:
                                                                                        this.f18481n = Collections.EMPTY_LIST;
                                                                                        if (i5 != 1) {
                                                                                            f();
                                                                                        } else {
                                                                                            f();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            CueBuilder cueBuilder1111 = this.m;
                                                                                            arrayList = cueBuilder1111.f18486b;
                                                                                            arrayList.add(cueBuilder1111.d());
                                                                                            cueBuilder1111.f18487c.setLength(0);
                                                                                            cueBuilder1111.f18485a.clear();
                                                                                            iMin = Math.min(cueBuilder1111.f18489h, cueBuilder1111.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        f();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f18481n = e();
                                                                                        f();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                g(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder1112 = this.m;
                                                                                        arrayList = cueBuilder1112.f18486b;
                                                                                        arrayList.add(cueBuilder1112.d());
                                                                                        cueBuilder1112.f18487c.setLength(0);
                                                                                        cueBuilder1112.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder1112.f18489h, cueBuilder1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder1113 = this.m;
                                                                                        arrayList = cueBuilder1113.f18486b;
                                                                                        arrayList.add(cueBuilder1113.d());
                                                                                        cueBuilder1113.f18487c.setLength(0);
                                                                                        cueBuilder1113.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder1113.f18489h, cueBuilder1113.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder1114 = this.m;
                                                                                    arrayList = cueBuilder1114.f18486b;
                                                                                    arrayList.add(cueBuilder1114.d());
                                                                                    cueBuilder1114.f18487c.setLength(0);
                                                                                    cueBuilder1114.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder1114.f18489h, cueBuilder1114.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if ((b2 & 240) != 16) {
                                                if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (b3 == 32) {
                                                            g(2);
                                                        } else if (b3 != 41) {
                                                            switch (b3) {
                                                                case 37:
                                                                    g(1);
                                                                    this.q = 2;
                                                                    this.m.f18489h = 2;
                                                                    break;
                                                                case 38:
                                                                    g(1);
                                                                    this.q = 3;
                                                                    this.m.f18489h = 3;
                                                                    break;
                                                                case 39:
                                                                    g(1);
                                                                    this.q = 4;
                                                                    this.m.f18489h = 4;
                                                                    break;
                                                                default:
                                                                    i5 = this.f18482p;
                                                                    if (i5 != 0) {
                                                                        if (b3 != 33) {
                                                                            switch (b3) {
                                                                                case 44:
                                                                                    this.f18481n = Collections.EMPTY_LIST;
                                                                                    if (i5 != 1) {
                                                                                        f();
                                                                                    } else {
                                                                                        f();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        CueBuilder cueBuilder1115 = this.m;
                                                                                        arrayList = cueBuilder1115.f18486b;
                                                                                        arrayList.add(cueBuilder1115.d());
                                                                                        cueBuilder1115.f18487c.setLength(0);
                                                                                        cueBuilder1115.f18485a.clear();
                                                                                        iMin = Math.min(cueBuilder1115.f18489h, cueBuilder1115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    f();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f18481n = e();
                                                                                    f();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            g(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder1116 = this.m;
                                                                                    arrayList = cueBuilder1116.f18486b;
                                                                                    arrayList.add(cueBuilder1116.d());
                                                                                    cueBuilder1116.f18487c.setLength(0);
                                                                                    cueBuilder1116.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder1116.f18489h, cueBuilder1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if (i3 != 23) {
                                                if (i4 == 20) {
                                                    if (b3 == 32) {
                                                        g(2);
                                                    } else if (b3 != 41) {
                                                        switch (b3) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.f18489h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.f18489h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.f18489h = 4;
                                                                break;
                                                            default:
                                                                i5 = this.f18482p;
                                                                if (i5 != 0) {
                                                                    if (b3 != 33) {
                                                                        switch (b3) {
                                                                            case 44:
                                                                                this.f18481n = Collections.EMPTY_LIST;
                                                                                if (i5 != 1) {
                                                                                    f();
                                                                                } else {
                                                                                    f();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    CueBuilder cueBuilder1117 = this.m;
                                                                                    arrayList = cueBuilder1117.f18486b;
                                                                                    arrayList.add(cueBuilder1117.d());
                                                                                    cueBuilder1117.f18487c.setLength(0);
                                                                                    cueBuilder1117.f18485a.clear();
                                                                                    iMin = Math.min(cueBuilder1117.f18489h, cueBuilder1117.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                f();
                                                                                break;
                                                                            case 47:
                                                                                this.f18481n = e();
                                                                                f();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            } else if (i4 == 20) {
                                                if (b3 == 32) {
                                                    g(2);
                                                } else if (b3 != 41) {
                                                    switch (b3) {
                                                        case 37:
                                                            g(1);
                                                            this.q = 2;
                                                            this.m.f18489h = 2;
                                                            break;
                                                        case 38:
                                                            g(1);
                                                            this.q = 3;
                                                            this.m.f18489h = 3;
                                                            break;
                                                        case 39:
                                                            g(1);
                                                            this.q = 4;
                                                            this.m.f18489h = 4;
                                                            break;
                                                        default:
                                                            i5 = this.f18482p;
                                                            if (i5 != 0) {
                                                                if (b3 != 33) {
                                                                    switch (b3) {
                                                                        case 44:
                                                                            this.f18481n = Collections.EMPTY_LIST;
                                                                            if (i5 != 1) {
                                                                                f();
                                                                            } else {
                                                                                f();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i5 == 1) {
                                                                                CueBuilder cueBuilder1118 = this.m;
                                                                                arrayList = cueBuilder1118.f18486b;
                                                                                arrayList.add(cueBuilder1118.d());
                                                                                cueBuilder1118.f18487c.setLength(0);
                                                                                cueBuilder1118.f18485a.clear();
                                                                                iMin = Math.min(cueBuilder1118.f18489h, cueBuilder1118.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            f();
                                                                            break;
                                                                        case 47:
                                                                            this.f18481n = e();
                                                                            f();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    g(3);
                                                }
                                            }
                                        }
                                    } else {
                                        CueBuilder cueBuilder20 = this.m;
                                        int i11 = (b2 & AbstractJsonLexerKt.TC_INVALID) - 32;
                                        iArr = f18474B;
                                        cueBuilder20.a((char) iArr[i11]);
                                        if ((b3 & 224) != 0) {
                                            this.m.a((char) iArr[(b3 & AbstractJsonLexerKt.TC_INVALID) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            f();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    /* JADX INFO: renamed from: c */
    public final SubtitleOutputBuffer dequeueOutputBuffer() {
        SubtitleOutputBuffer subtitleOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        long j = this.k;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.x;
        if (j2 == -9223372036854775807L || this.f18523e - j2 < j || (subtitleOutputBuffer = (SubtitleOutputBuffer) this.f18521b.pollFirst()) == null) {
            return null;
        }
        this.f18481n = Collections.EMPTY_LIST;
        this.x = -9223372036854775807L;
        subtitleOutputBuffer.f(this.f18523e, a(), Long.MAX_VALUE);
        return subtitleOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final boolean d() {
        return this.f18481n != this.o;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.f18480l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueC = ((CueBuilder) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(cueC);
            if (cueC != null) {
                iMin = Math.min(iMin, cueC.j0);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Cue cueC2 = (Cue) arrayList2.get(i3);
            if (cueC2 != null) {
                if (cueC2.j0 != iMin) {
                    cueC2 = ((CueBuilder) arrayList.get(i3)).c(iMin);
                    cueC2.getClass();
                }
                arrayList3.add(cueC2);
            }
        }
        return arrayList3;
    }

    public final void f() {
        CueBuilder cueBuilder = this.m;
        cueBuilder.g = this.f18482p;
        cueBuilder.f18485a.clear();
        cueBuilder.f18486b.clear();
        cueBuilder.f18487c.setLength(0);
        cueBuilder.d = 15;
        cueBuilder.f18488e = 0;
        cueBuilder.f = 0;
        ArrayList arrayList = this.f18480l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        super.flush();
        this.f18481n = null;
        this.o = null;
        g(0);
        this.q = 4;
        this.m.f18489h = 4;
        f();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.f18483u = (byte) 0;
        this.v = 0;
        this.f18484w = true;
        this.x = -9223372036854775807L;
    }

    public final void g(int i2) {
        int i3 = this.f18482p;
        if (i3 == i2) {
            return;
        }
        this.f18482p = i2;
        if (i2 != 3) {
            f();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.f18481n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f18480l;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((CueBuilder) arrayList.get(i4)).g = i2;
            i4++;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public final void setPositionUs(long j) {
        this.f18523e = j;
    }
}
