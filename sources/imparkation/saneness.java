package imparkation;

import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.rotuma;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.google.common.collect.ImmutableList;
import com.inmobi.media.core.config.models.AdConfig;
import decarock.cuirassed;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends nomenclative.dern {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal f28458saneness = new attabal() { // from class: imparkation.attabal
        @Override // imparkation.saneness.attabal
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return saneness.dern(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f28459attabal;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface attabal {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: imparkation.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class C0647saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28460attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f28461dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f28462saneness;

        public C0647saneness(int i, boolean z, int i2) {
            this.f28460attabal = i;
            this.f28462saneness = z;
            this.f28461dern = i2;
        }
    }

    public saneness() {
        this(null);
    }

    public static UrlLinkFrame adultoid(stratoscope stratoscopeVar, int i) {
        if (i < 1) {
            return null;
        }
        int iSupplicat = stratoscopeVar.supplicat();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        stratoscopeVar.formularize(bArr, 0, i2);
        int iPreprohormone = preprohormone(bArr, 0, iSupplicat);
        String str = new String(bArr, 0, iPreprohormone, gintrap(iSupplicat));
        int iDovishness = iPreprohormone + dovishness(iSupplicat);
        return new UrlLinkFrame("WXXX", str, arytenoidectomy(bArr, iDovishness, cord(bArr, iDovishness), com.google.common.base.dern.f21536saneness));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [decarock.stratoscope] */
    /* JADX WARN: Type inference failed for: r1v11, types: [decarock.stratoscope] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [decarock.stratoscope] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Id3Frame apical(int i, stratoscope stratoscopeVar, boolean z, int i2, attabal attabalVar) throws Throwable {
        int iSeminary;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r8;
        Throwable th;
        ?? r2;
        int i3;
        ?? r9;
        ?? r3;
        ?? r12;
        ?? r10;
        Parcelable parcelableCompetently;
        int i4 = i;
        stratoscope stratoscopeVar2 = stratoscopeVar;
        int iSupplicat = stratoscopeVar2.supplicat();
        int iSupplicat2 = stratoscopeVar2.supplicat();
        int iSupplicat3 = stratoscopeVar2.supplicat();
        boolean z6 = false;
        int iSupplicat4 = i4 >= 3 ? stratoscopeVar2.supplicat() : 0;
        if (i4 == 4) {
            iSeminary = stratoscopeVar2.seminary();
            if (!z) {
                iSeminary = (((iSeminary >> 24) & 255) << 21) | (iSeminary & 255) | (((iSeminary >> 8) & 255) << 7) | (((iSeminary >> 16) & 255) << 14);
            }
        } else {
            iSeminary = i4 == 3 ? stratoscopeVar2.seminary() : stratoscopeVar2.polder();
        }
        int iCuirassed = iSeminary;
        int iSaran = i4 >= 3 ? stratoscopeVar2.saran() : 0;
        if (iSupplicat == 0 && iSupplicat2 == 0 && iSupplicat3 == 0 && iSupplicat4 == 0 && iCuirassed == 0 && iSaran == 0) {
            stratoscopeVar2.mathsort(stratoscopeVar2.competently());
            return null;
        }
        int iBeachfront = stratoscopeVar2.beachfront() + iCuirassed;
        if (iBeachfront > stratoscopeVar2.competently()) {
            triweekly.impromptu("Id3Decoder", "Frame size exceeds remaining tag data");
            stratoscopeVar2.mathsort(stratoscopeVar2.competently());
            return null;
        }
        if (attabalVar != null) {
            boolean zEvaluate = attabalVar.evaluate(i4, iSupplicat, iSupplicat2, iSupplicat3, iSupplicat4);
            r1 = iSupplicat;
            iCuirassed = iSupplicat2;
            if (!zEvaluate) {
                i4 = i4;
                stratoscopeVar2.mathsort(iBeachfront);
                return null;
            }
        } else {
            iCuirassed = iSupplicat2;
            r1 = iSupplicat;
        }
        i4 = i4;
        if (i4 == 3) {
            z2 = (iSaran & 128) != 0;
            z4 = (iSaran & 64) != 0;
            z3 = (iSaran & 32) != 0;
            z5 = false;
            z6 = z2;
        } else if (i4 == 4) {
            boolean z7 = (iSaran & 64) != 0;
            boolean z8 = (iSaran & 8) != 0;
            boolean z9 = (iSaran & 4) != 0;
            z5 = (iSaran & 2) != 0;
            z6 = (iSaran & 1) != 0;
            z3 = z7;
            z2 = z6;
            z6 = z8;
            z4 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (z6 || z4) {
            triweekly.impromptu("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            stratoscopeVar2.mathsort(iBeachfront);
            return null;
        }
        if (z3) {
            iCuirassed--;
            stratoscopeVar2.splinterproof(1);
        }
        if (z2) {
            iCuirassed -= 4;
            stratoscopeVar2.splinterproof(4);
        }
        if (z5) {
            iCuirassed = cuirassed(stratoscopeVar2, iCuirassed);
        }
        try {
            try {
                if (r1 == 84 && iCuirassed == 88 && iSupplicat3 == 88 && (i4 == 2 || iSupplicat4 == 88)) {
                    parcelableCompetently = molybdenite(stratoscopeVar2, iCuirassed);
                } else if (r1 == 84) {
                    parcelableCompetently = monoploid(stratoscopeVar2, iCuirassed, rotuma(i4, r1, iCuirassed, iSupplicat3, iSupplicat4));
                } else if (r1 == 87 && iCuirassed == 88 && iSupplicat3 == 88 && (i4 == 2 || iSupplicat4 == 88)) {
                    parcelableCompetently = adultoid(stratoscopeVar2, iCuirassed);
                } else if (r1 == 87) {
                    parcelableCompetently = graveside(stratoscopeVar2, iCuirassed, rotuma(i4, r1, iCuirassed, iSupplicat3, iSupplicat4));
                } else {
                    if (r1 != 80 || iCuirassed != 82 || iSupplicat3 != 73 || iSupplicat4 != 86) {
                        if (r1 == 71 && iCuirassed == 69 && iSupplicat3 == 79 && (iSupplicat4 == 66 || i4 == 2)) {
                            parcelableCompetently = formularize(stratoscopeVar2, iCuirassed);
                        } else {
                            th = null;
                            try {
                                if (i4 != 2 ? r1 == 65 && iCuirassed == 80 && iSupplicat3 == 73 && iSupplicat4 == 67 : r1 == 80 && iCuirassed == 73 && iSupplicat3 == 67) {
                                    parcelableCompetently = beachfront(stratoscopeVar2, iCuirassed, i4);
                                } else {
                                    if (r1 != 67 || iCuirassed != 79 || iSupplicat3 != 77 || (iSupplicat4 != 77 && i4 != 2)) {
                                        if (r1 == 67 && iCuirassed == 72 && iSupplicat3 == 65 && iSupplicat4 == 80) {
                                            r1 = r1;
                                            iCuirassed = iCuirassed;
                                            iSupplicat4 = iSupplicat4;
                                            iCuirassed = iCuirassed;
                                            i3 = iSupplicat3;
                                            try {
                                                parcelableCompetently = impromptu(stratoscopeVar2, iCuirassed, i4, z, i2, attabalVar);
                                                i4 = i;
                                                r1 = stratoscopeVar;
                                            } catch (Exception e) {
                                                e = e;
                                                i4 = i;
                                                r3 = stratoscopeVar;
                                                r9 = r1;
                                                r3.mathsort(iBeachfront);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i4 = i;
                                                r3 = stratoscopeVar;
                                                r9 = r1;
                                                r3.mathsort(iBeachfront);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r2 = stratoscopeVar;
                                                r2.mathsort(iBeachfront);
                                                throw th;
                                            }
                                        } else {
                                            r1 = r1;
                                            iCuirassed = iCuirassed;
                                            iSupplicat4 = iSupplicat4;
                                            iCuirassed = iCuirassed;
                                            i3 = iSupplicat3;
                                            try {
                                                if (r1 == 67 && iCuirassed == 84 && i3 == 79 && iSupplicat4 == 67) {
                                                    i4 = i;
                                                    stratoscope stratoscopeVar3 = stratoscopeVar;
                                                    parcelableCompetently = taiyuan(stratoscopeVar3, iCuirassed, i4, z, i2, attabalVar);
                                                    r1 = stratoscopeVar3;
                                                } else {
                                                    i4 = i;
                                                    stratoscope stratoscopeVar4 = stratoscopeVar;
                                                    if (r1 == 77 && iCuirassed == 76 && i3 == 76 && iSupplicat4 == 84) {
                                                        parcelableCompetently = triweekly(stratoscopeVar4, iCuirassed);
                                                        r1 = stratoscopeVar4;
                                                    } else {
                                                        parcelableCompetently = competently(stratoscopeVar4, iCuirassed, rotuma(i4, r1, iCuirassed, i3, iSupplicat4));
                                                        r1 = stratoscopeVar4;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r3 = r1;
                                                r9 = r1;
                                                r3.mathsort(iBeachfront);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r3 = r1;
                                                r9 = r1;
                                                r3.mathsort(iBeachfront);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r2 = r1;
                                                r2.mathsort(iBeachfront);
                                                throw th;
                                            }
                                        }
                                        if (r12 == 0) {
                                            triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
                                        }
                                        return r12;
                                    }
                                    parcelableCompetently = cutely(stratoscopeVar2, iCuirassed);
                                }
                                r1 = stratoscopeVar2;
                                iCuirassed = iCuirassed;
                                r1 = r1;
                                i3 = iSupplicat3;
                            } catch (Exception e5) {
                                e = e5;
                                r8 = r1;
                                iCuirassed = iCuirassed;
                                i3 = iSupplicat3;
                                r3 = stratoscopeVar2;
                                r9 = r8;
                                r3.mathsort(iBeachfront);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                r8 = r1;
                                iCuirassed = iCuirassed;
                                i3 = iSupplicat3;
                                r3 = stratoscopeVar2;
                                r9 = r8;
                                r3.mathsort(iBeachfront);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
                                }
                                return r12;
                            }
                        }
                        r1.mathsort(iBeachfront);
                        r12 = parcelableCompetently;
                        e = th;
                        r10 = r1;
                        if (r12 == 0) {
                            triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
                        }
                        return r12;
                    }
                    parcelableCompetently = kowloon(stratoscopeVar2, iCuirassed);
                }
                r1 = stratoscopeVar2;
                iCuirassed = iCuirassed;
                th = null;
                r1 = r1;
                i3 = iSupplicat3;
                r1.mathsort(iBeachfront);
                r12 = parcelableCompetently;
                e = th;
                r10 = r1;
            } catch (Exception e7) {
                e = e7;
                r8 = r1;
                iCuirassed = iCuirassed;
                th = null;
                i3 = iSupplicat3;
                r3 = stratoscopeVar2;
                r9 = r8;
                r3.mathsort(iBeachfront);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
                }
                return r12;
            } catch (OutOfMemoryError e8) {
                e = e8;
                r8 = r1;
                iCuirassed = iCuirassed;
                th = null;
                i3 = iSupplicat3;
                r3 = stratoscopeVar2;
                r9 = r8;
                r3.mathsort(iBeachfront);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
                }
                return r12;
            }
            if (r12 == 0) {
                triweekly.taiyuan("Id3Decoder", "Failed to decode frame: id=" + rotuma(i4, r10, iCuirassed, i3, iSupplicat4) + ", frameSize=" + iCuirassed, e);
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            r2 = stratoscopeVar2;
        }
    }

    public static String arytenoidectomy(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static ApicFrame beachfront(stratoscope stratoscopeVar, int i, int i2) {
        int iCord;
        String str;
        int iSupplicat = stratoscopeVar.supplicat();
        Charset charsetGintrap = gintrap(iSupplicat);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        stratoscopeVar.formularize(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + com.google.common.base.attabal.beachfront(new String(bArr, 0, 3, com.google.common.base.dern.f21536saneness));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iCord = 2;
        } else {
            iCord = cord(bArr, 0);
            String strBeachfront = com.google.common.base.attabal.beachfront(new String(bArr, 0, iCord, com.google.common.base.dern.f21536saneness));
            if (strBeachfront.indexOf(47) == -1) {
                str = "image/" + strBeachfront;
            } else {
                str = strBeachfront;
            }
        }
        int i4 = bArr[iCord + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = iCord + 2;
        int iPreprohormone = preprohormone(bArr, i5, iSupplicat);
        return new ApicFrame(str, new String(bArr, i5, iPreprohormone - i5, charsetGintrap), i4, wireman(bArr, iPreprohormone + dovishness(iSupplicat), i3));
    }

    public static BinaryFrame competently(stratoscope stratoscopeVar, int i, String str) {
        byte[] bArr = new byte[i];
        stratoscopeVar.formularize(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static int cord(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int cuirassed(stratoscope stratoscopeVar, int i) {
        byte[] bArrMarial = stratoscopeVar.marial();
        int iBeachfront = stratoscopeVar.beachfront();
        int i2 = iBeachfront;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iBeachfront + i) {
                return i;
            }
            if ((bArrMarial[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArrMarial[i3] == 0) {
                System.arraycopy(bArrMarial, i2 + 2, bArrMarial, i3, (i - (i2 - iBeachfront)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    public static CommentFrame cutely(stratoscope stratoscopeVar, int i) {
        if (i < 4) {
            return null;
        }
        int iSupplicat = stratoscopeVar.supplicat();
        Charset charsetGintrap = gintrap(iSupplicat);
        byte[] bArr = new byte[3];
        stratoscopeVar.formularize(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        stratoscopeVar.formularize(bArr2, 0, i2);
        int iPreprohormone = preprohormone(bArr2, 0, iSupplicat);
        String str2 = new String(bArr2, 0, iPreprohormone, charsetGintrap);
        int iDovishness = iPreprohormone + dovishness(iSupplicat);
        return new CommentFrame(str, str2, arytenoidectomy(bArr2, iDovishness, preprohormone(bArr2, iDovishness, iSupplicat), charsetGintrap));
    }

    public static /* synthetic */ boolean dern(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public static int dovishness(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static GeobFrame formularize(stratoscope stratoscopeVar, int i) {
        int iSupplicat = stratoscopeVar.supplicat();
        Charset charsetGintrap = gintrap(iSupplicat);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        stratoscopeVar.formularize(bArr, 0, i2);
        int iCord = cord(bArr, 0);
        String strFormularize = rotuma.formularize(new String(bArr, 0, iCord, com.google.common.base.dern.f21536saneness));
        int i3 = iCord + 1;
        int iPreprohormone = preprohormone(bArr, i3, iSupplicat);
        String strArytenoidectomy = arytenoidectomy(bArr, i3, iPreprohormone, charsetGintrap);
        int iDovishness = iPreprohormone + dovishness(iSupplicat);
        int iPreprohormone2 = preprohormone(bArr, iDovishness, iSupplicat);
        return new GeobFrame(strFormularize, strArytenoidectomy, arytenoidectomy(bArr, iDovishness, iPreprohormone2, charsetGintrap), wireman(bArr, iPreprohormone2 + dovishness(iSupplicat), i2));
    }

    public static Charset gintrap(int i) {
        if (i == 1) {
            return com.google.common.base.dern.f21533beachfront;
        }
        if (i != 2) {
            return i != 3 ? com.google.common.base.dern.f21536saneness : com.google.common.base.dern.f21534dern;
        }
        return com.google.common.base.dern.f21537wireman;
    }

    public static UrlLinkFrame graveside(stratoscope stratoscopeVar, int i, String str) {
        byte[] bArr = new byte[i];
        stratoscopeVar.formularize(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, cord(bArr, 0), com.google.common.base.dern.f21536saneness));
    }

    public static C0647saneness impassible(stratoscope stratoscopeVar) {
        if (stratoscopeVar.attabal() < 10) {
            triweekly.impromptu("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iPolder = stratoscopeVar.polder();
        if (iPolder != 4801587) {
            triweekly.impromptu("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iPolder)));
            return null;
        }
        int iSupplicat = stratoscopeVar.supplicat();
        stratoscopeVar.splinterproof(1);
        int iSupplicat2 = stratoscopeVar.supplicat();
        int iKattegat = stratoscopeVar.kattegat();
        if (iSupplicat == 2) {
            if ((iSupplicat2 & 64) != 0) {
                triweekly.impromptu("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iSupplicat == 3) {
            if ((iSupplicat2 & 64) != 0) {
                int iMonoploid = stratoscopeVar.monoploid();
                stratoscopeVar.splinterproof(iMonoploid);
                iKattegat -= iMonoploid + 4;
            }
        } else {
            if (iSupplicat != 4) {
                triweekly.impromptu("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iSupplicat);
                return null;
            }
            if ((iSupplicat2 & 64) != 0) {
                int iKattegat2 = stratoscopeVar.kattegat();
                stratoscopeVar.splinterproof(iKattegat2 - 4);
                iKattegat -= iKattegat2;
            }
            if ((iSupplicat2 & 16) != 0) {
                iKattegat -= 10;
            }
        }
        return new C0647saneness(iSupplicat, iSupplicat < 4 && (iSupplicat2 & 128) != 0, iKattegat);
    }

    public static ChapterFrame impromptu(stratoscope stratoscopeVar, int i, int i2, boolean z, int i3, attabal attabalVar) throws Throwable {
        int iBeachfront = stratoscopeVar.beachfront();
        int iCord = cord(stratoscopeVar.marial(), iBeachfront);
        String str = new String(stratoscopeVar.marial(), iBeachfront, iCord - iBeachfront, com.google.common.base.dern.f21536saneness);
        stratoscopeVar.mathsort(iCord + 1);
        int iMonoploid = stratoscopeVar.monoploid();
        int iMonoploid2 = stratoscopeVar.monoploid();
        long jMerc = stratoscopeVar.merc();
        if (jMerc == 4294967295L) {
            jMerc = -1;
        }
        long jMerc2 = stratoscopeVar.merc();
        long j = jMerc2 == 4294967295L ? -1L : jMerc2;
        ArrayList arrayList = new ArrayList();
        int i4 = iBeachfront + i;
        while (stratoscopeVar.beachfront() < i4) {
            Id3Frame id3FrameApical = apical(i2, stratoscopeVar, z, i3, attabalVar);
            if (id3FrameApical != null) {
                arrayList.add(id3FrameApical);
            }
        }
        return new ChapterFrame(str, iMonoploid, iMonoploid2, jMerc, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static PrivFrame kowloon(stratoscope stratoscopeVar, int i) {
        byte[] bArr = new byte[i];
        stratoscopeVar.formularize(bArr, 0, i);
        int iCord = cord(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iCord, com.google.common.base.dern.f21536saneness), wireman(bArr, iCord + 1, i));
    }

    public static TextInformationFrame molybdenite(stratoscope stratoscopeVar, int i) {
        if (i < 1) {
            return null;
        }
        int iSupplicat = stratoscopeVar.supplicat();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        stratoscopeVar.formularize(bArr, 0, i2);
        int iPreprohormone = preprohormone(bArr, 0, iSupplicat);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iPreprohormone, gintrap(iSupplicat)), polloi(bArr, iSupplicat, iPreprohormone + dovishness(iSupplicat)));
    }

    public static TextInformationFrame monoploid(stratoscope stratoscopeVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iSupplicat = stratoscopeVar.supplicat();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        stratoscopeVar.formularize(bArr, 0, i2);
        return new TextInformationFrame(str, null, polloi(bArr, iSupplicat, 0));
    }

    public static ImmutableList<String> polloi(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        int iPreprohormone = preprohormone(bArr, i2, i);
        while (i2 < iPreprohormone) {
            attabalVarBuilder.attabal(new String(bArr, i2, iPreprohormone - i2, gintrap(i)));
            i2 = dovishness(i) + iPreprohormone;
            iPreprohormone = preprohormone(bArr, i2, i);
        }
        ImmutableList<String> immutableListImpassible = attabalVarBuilder.impassible();
        return immutableListImpassible.isEmpty() ? ImmutableList.of("") : immutableListImpassible;
    }

    public static int preprohormone(byte[] bArr, int i, int i2) {
        int iCord = cord(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iCord;
        }
        while (iCord < bArr.length - 1) {
            if ((iCord - i) % 2 == 0 && bArr[iCord + 1] == 0) {
                return iCord;
            }
            iCord = cord(bArr, iCord + 1);
        }
        return bArr.length;
    }

    public static String rotuma(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
  0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean stratoscope(stratoscope stratoscopeVar, int i, int i2, boolean z) {
        int iPolder;
        long jPolder;
        int iSaran;
        int i3;
        int iBeachfront = stratoscopeVar.beachfront();
        while (true) {
            try {
                boolean z2 = true;
                if (stratoscopeVar.attabal() < i2) {
                    stratoscopeVar.mathsort(iBeachfront);
                    return true;
                }
                if (i >= 3) {
                    iPolder = stratoscopeVar.monoploid();
                    jPolder = stratoscopeVar.merc();
                    iSaran = stratoscopeVar.saran();
                } else {
                    iPolder = stratoscopeVar.polder();
                    jPolder = stratoscopeVar.polder();
                    iSaran = 0;
                }
                if (iPolder == 0 && jPolder == 0 && iSaran == 0) {
                    stratoscopeVar.mathsort(iBeachfront);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jPolder) != 0) {
                        stratoscopeVar.mathsort(iBeachfront);
                        return false;
                    }
                    jPolder = (((jPolder >> 24) & 255) << 21) | (jPolder & 255) | (((jPolder >> 8) & 255) << 7) | (((jPolder >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iSaran & 64) != 0 ? 1 : 0;
                    if ((iSaran & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iSaran & 32) != 0 ? 1 : 0;
                    if ((iSaran & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jPolder < i3) {
                    stratoscopeVar.mathsort(iBeachfront);
                    return false;
                }
                if (stratoscopeVar.attabal() < jPolder) {
                    stratoscopeVar.mathsort(iBeachfront);
                    return false;
                }
                stratoscopeVar.splinterproof((int) jPolder);
            } catch (Throwable th) {
                stratoscopeVar.mathsort(iBeachfront);
                throw th;
            }
        }
    }

    public static ChapterTocFrame taiyuan(stratoscope stratoscopeVar, int i, int i2, boolean z, int i3, attabal attabalVar) throws Throwable {
        int iBeachfront = stratoscopeVar.beachfront();
        int iCord = cord(stratoscopeVar.marial(), iBeachfront);
        String str = new String(stratoscopeVar.marial(), iBeachfront, iCord - iBeachfront, com.google.common.base.dern.f21536saneness);
        stratoscopeVar.mathsort(iCord + 1);
        int iSupplicat = stratoscopeVar.supplicat();
        boolean z2 = (iSupplicat & 2) != 0;
        boolean z3 = (iSupplicat & 1) != 0;
        int iSupplicat2 = stratoscopeVar.supplicat();
        String[] strArr = new String[iSupplicat2];
        for (int i4 = 0; i4 < iSupplicat2; i4++) {
            int iBeachfront2 = stratoscopeVar.beachfront();
            int iCord2 = cord(stratoscopeVar.marial(), iBeachfront2);
            strArr[i4] = new String(stratoscopeVar.marial(), iBeachfront2, iCord2 - iBeachfront2, com.google.common.base.dern.f21536saneness);
            stratoscopeVar.mathsort(iCord2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iBeachfront + i;
        while (stratoscopeVar.beachfront() < i5) {
            Id3Frame id3FrameApical = apical(i2, stratoscopeVar, z, i3, attabalVar);
            if (id3FrameApical != null) {
                arrayList.add(id3FrameApical);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static MlltFrame triweekly(stratoscope stratoscopeVar, int i) {
        int iSaran = stratoscopeVar.saran();
        int iPolder = stratoscopeVar.polder();
        int iPolder2 = stratoscopeVar.polder();
        int iSupplicat = stratoscopeVar.supplicat();
        int iSupplicat2 = stratoscopeVar.supplicat();
        cuirassed cuirassedVar = new cuirassed();
        cuirassedVar.impassible(stratoscopeVar);
        int i2 = ((i - 10) * 8) / (iSupplicat + iSupplicat2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iImpromptu = cuirassedVar.impromptu(iSupplicat);
            int iImpromptu2 = cuirassedVar.impromptu(iSupplicat2);
            iArr[i3] = iImpromptu;
            iArr2[i3] = iImpromptu2;
        }
        return new MlltFrame(iSaran, iPolder, iPolder2, iArr, iArr2);
    }

    public static byte[] wireman(byte[] bArr, int i, int i2) {
        return i2 <= i ? grimness.f25081beachfront : Arrays.copyOfRange(bArr, i, i2);
    }

    public Metadata marial(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        stratoscope stratoscopeVar = new stratoscope(bArr, i);
        C0647saneness c0647sanenessImpassible = impassible(stratoscopeVar);
        if (c0647sanenessImpassible == null) {
            return null;
        }
        int iBeachfront = stratoscopeVar.beachfront();
        int i2 = c0647sanenessImpassible.f28460attabal == 2 ? 6 : 10;
        int iCuirassed = c0647sanenessImpassible.f28461dern;
        if (c0647sanenessImpassible.f28462saneness) {
            iCuirassed = cuirassed(stratoscopeVar, c0647sanenessImpassible.f28461dern);
        }
        stratoscopeVar.peridotite(iBeachfront + iCuirassed);
        boolean z = false;
        if (!stratoscope(stratoscopeVar, c0647sanenessImpassible.f28460attabal, i2, false)) {
            if (c0647sanenessImpassible.f28460attabal != 4 || !stratoscope(stratoscopeVar, 4, i2, true)) {
                triweekly.impromptu("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c0647sanenessImpassible.f28460attabal);
                return null;
            }
            z = true;
        }
        while (stratoscopeVar.attabal() >= i2) {
            Id3Frame id3FrameApical = apical(c0647sanenessImpassible.f28460attabal, stratoscopeVar, z, i2, this.f28459attabal);
            if (id3FrameApical != null) {
                arrayList.add(id3FrameApical);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // nomenclative.dern
    public Metadata saneness(nomenclative.saneness sanenessVar, ByteBuffer byteBuffer) {
        return marial(byteBuffer.array(), byteBuffer.limit());
    }

    public saneness(attabal attabalVar) {
        this.f28459attabal = attabalVar;
    }
}
