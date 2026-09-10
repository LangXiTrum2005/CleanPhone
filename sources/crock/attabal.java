package crock;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.cuirassed;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import java.util.ArrayList;
import java.util.List;
import org.jacoco.core.data.ExecutionDataWriter;
import org.objectweb.asm.Opcodes;
import strother.polloi;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Paint f24130attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final impromptu f24131beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Bitmap f24132competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Canvas f24133dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final C0572attabal f24134marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Paint f24135saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final saneness f24136wireman;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f24128impromptu = {0, 7, 8, 15};

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final byte[] f24129taiyuan = {0, 119, -120, -1};

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final byte[] f24127cutely = {0, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: crock.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class C0572attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24137attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int[] f24138dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f24139saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int[] f24140wireman;

        public C0572attabal(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f24137attabal = i;
            this.f24139saneness = iArr;
            this.f24138dern = iArr2;
            this.f24140wireman = iArr3;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class beachfront {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final SparseArray<competently> f24141apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24142attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f24143beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final int f24144competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final int f24145cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24146dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final int f24147impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f24148marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f24149saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final int f24150taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24151wireman;

        public beachfront(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<competently> sparseArray) {
            this.f24142attabal = i;
            this.f24149saneness = z;
            this.f24146dern = i2;
            this.f24151wireman = i3;
            this.f24148marial = i4;
            this.f24143beachfront = i5;
            this.f24144competently = i6;
            this.f24147impromptu = i7;
            this.f24150taiyuan = i8;
            this.f24145cutely = i9;
            this.f24141apical = sparseArray;
        }

        public void attabal(beachfront beachfrontVar) {
            SparseArray<competently> sparseArray = beachfrontVar.f24141apical;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f24141apical.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24152attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f24153beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24154dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f24155marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24156saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24157wireman;

        public competently(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f24152attabal = i;
            this.f24156saneness = i2;
            this.f24154dern = i3;
            this.f24157wireman = i4;
            this.f24155marial = i5;
            this.f24153beachfront = i6;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24158attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final byte[] f24159dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f24160saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final byte[] f24161wireman;

        public dern(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f24158attabal = i;
            this.f24160saneness = z;
            this.f24159dern = bArr;
            this.f24161wireman = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24162attabal;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public saneness f24166impromptu;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24168saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public wireman f24169taiyuan;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final SparseArray<beachfront> f24165dern = new SparseArray<>();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final SparseArray<C0572attabal> f24170wireman = new SparseArray<>();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final SparseArray<dern> f24167marial = new SparseArray<>();

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final SparseArray<C0572attabal> f24163beachfront = new SparseArray<>();

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final SparseArray<dern> f24164competently = new SparseArray<>();

        public impromptu(int i, int i2) {
            this.f24162attabal = i;
            this.f24168saneness = i2;
        }

        public void attabal() {
            this.f24165dern.clear();
            this.f24170wireman.clear();
            this.f24167marial.clear();
            this.f24163beachfront.clear();
            this.f24164competently.clear();
            this.f24166impromptu = null;
            this.f24169taiyuan = null;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24171attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24172saneness;

        public marial(int i, int i2) {
            this.f24171attabal = i;
            this.f24172saneness = i2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24173attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f24174beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24175dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f24176marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24177saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24178wireman;

        public saneness(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f24173attabal = i;
            this.f24177saneness = i2;
            this.f24175dern = i3;
            this.f24178wireman = i4;
            this.f24176marial = i5;
            this.f24174beachfront = i6;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24179attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24180dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24181saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final SparseArray<marial> f24182wireman;

        public wireman(int i, int i2, int i3, SparseArray<marial> sparseArray) {
            this.f24179attabal = i;
            this.f24181saneness = i2;
            this.f24180dern = i3;
            this.f24182wireman = sparseArray;
        }
    }

    public attabal(List<byte[]> list) {
        stratoscope stratoscopeVar = new stratoscope(list.get(0));
        int iSaran = stratoscopeVar.saran();
        int iSaran2 = stratoscopeVar.saran();
        Paint paint = new Paint();
        this.f24130attabal = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f24135saneness = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f24133dern = new Canvas();
        this.f24136wireman = new saneness(719, 575, 0, 719, 0, 575);
        this.f24134marial = new C0572attabal(0, marial(), beachfront(), competently());
        this.f24131beachfront = new impromptu(iSaran, iSaran2);
    }

    public static int apical(cuirassed cuirassedVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int iImpromptu;
        boolean z2 = false;
        while (true) {
            int iImpromptu2 = cuirassedVar.impromptu(8);
            if (iImpromptu2 != 0) {
                z = z2;
                iImpromptu = 1;
            } else if (cuirassedVar.competently()) {
                z = z2;
                iImpromptu = cuirassedVar.impromptu(7);
                iImpromptu2 = cuirassedVar.impromptu(8);
            } else {
                int iImpromptu3 = cuirassedVar.impromptu(7);
                if (iImpromptu3 != 0) {
                    z = z2;
                    iImpromptu = iImpromptu3;
                    iImpromptu2 = 0;
                } else {
                    z = true;
                    iImpromptu2 = 0;
                    iImpromptu = 0;
                }
            }
            if (iImpromptu != 0 && paint != null) {
                if (bArr != null) {
                    iImpromptu2 = bArr[iImpromptu2];
                }
                paint.setColor(iArr[iImpromptu2]);
                canvas.drawRect(i, i2, i + iImpromptu, 1 + i2, paint);
            }
            i += iImpromptu;
            if (z) {
                return i;
            }
            z2 = z;
        }
    }

    public static saneness arytenoidectomy(cuirassed cuirassedVar) {
        int i;
        int i2;
        int i3;
        int iImpromptu;
        cuirassedVar.polloi(4);
        boolean zCompetently = cuirassedVar.competently();
        cuirassedVar.polloi(3);
        int iImpromptu2 = cuirassedVar.impromptu(16);
        int iImpromptu3 = cuirassedVar.impromptu(16);
        if (zCompetently) {
            int iImpromptu4 = cuirassedVar.impromptu(16);
            int iImpromptu5 = cuirassedVar.impromptu(16);
            int iImpromptu6 = cuirassedVar.impromptu(16);
            iImpromptu = cuirassedVar.impromptu(16);
            i3 = iImpromptu5;
            i2 = iImpromptu6;
            i = iImpromptu4;
        } else {
            i = 0;
            i2 = 0;
            i3 = iImpromptu2;
            iImpromptu = iImpromptu3;
        }
        return new saneness(iImpromptu2, iImpromptu3, i, i3, i2, iImpromptu);
    }

    public static int[] beachfront() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = impromptu(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = impromptu(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] competently() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = impromptu(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                int i4 = Opcodes.TABLESWITCH;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = impromptu(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = impromptu(127, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = impromptu(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = impromptu(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int cutely(cuirassed cuirassedVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        int iImpromptu;
        int iImpromptu2;
        boolean z = false;
        while (true) {
            int iImpromptu3 = cuirassedVar.impromptu(4);
            if (iImpromptu3 != 0) {
                z = z;
                i3 = 1;
            } else if (cuirassedVar.competently()) {
                if (cuirassedVar.competently()) {
                    int iImpromptu4 = cuirassedVar.impromptu(2);
                    if (iImpromptu4 == 0) {
                        i3 = 1;
                        iImpromptu3 = 0;
                    } else if (iImpromptu4 == 1) {
                        iImpromptu3 = 0;
                        i3 = 2;
                        z = z;
                    } else if (iImpromptu4 == 2) {
                        iImpromptu = cuirassedVar.impromptu(4) + 9;
                        iImpromptu2 = cuirassedVar.impromptu(4);
                    } else if (iImpromptu4 != 3) {
                        z = z;
                        iImpromptu3 = 0;
                        i3 = 0;
                    } else {
                        iImpromptu = cuirassedVar.impromptu(8) + 25;
                        iImpromptu2 = cuirassedVar.impromptu(4);
                    }
                } else {
                    iImpromptu = cuirassedVar.impromptu(2) + 4;
                    iImpromptu2 = cuirassedVar.impromptu(4);
                }
                z = z;
                i3 = iImpromptu;
                iImpromptu3 = iImpromptu2;
            } else {
                int iImpromptu5 = cuirassedVar.impromptu(3);
                if (iImpromptu5 != 0) {
                    i3 = iImpromptu5 + 2;
                    iImpromptu3 = 0;
                } else {
                    z = true;
                    iImpromptu3 = 0;
                    i3 = 0;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iImpromptu3 = bArr[iImpromptu3];
                }
                paint.setColor(iArr[iImpromptu3]);
                canvas.drawRect(i, i2, i + i3, 1 + i2, paint);
            }
            i += i3;
            if (z) {
                return i;
            }
            z = z;
        }
    }

    public static void formularize(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        cuirassed cuirassedVar = new cuirassed(bArr);
        byte[] bArrWireman = null;
        byte[] bArrWireman2 = null;
        int iTaiyuan = i2;
        int i4 = i3;
        byte[] bArrWireman3 = null;
        while (cuirassedVar.saneness() != 0) {
            int iImpromptu = cuirassedVar.impromptu(8);
            if (iImpromptu != 240) {
                switch (iImpromptu) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i != 3) {
                            if (i == 2) {
                                bArr3 = bArrWireman2 == null ? f24128impromptu : bArrWireman2;
                            } else {
                                bArr2 = null;
                            }
                            iTaiyuan = taiyuan(cuirassedVar, iArr2, bArr2, iTaiyuan, i4, paint2, canvas2);
                            cuirassedVar.dern();
                        } else {
                            bArr3 = bArrWireman3 == null ? f24129taiyuan : bArrWireman3;
                        }
                        bArr2 = bArr3;
                        iTaiyuan = taiyuan(cuirassedVar, iArr2, bArr2, iTaiyuan, i4, paint2, canvas2);
                        cuirassedVar.dern();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iTaiyuan = cutely(cuirassedVar, iArr2, i == 3 ? bArrWireman == null ? f24127cutely : bArrWireman : null, iTaiyuan, i4, paint2, canvas2);
                        cuirassedVar.dern();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iTaiyuan = apical(cuirassedVar, iArr2, null, iTaiyuan, i4, paint2, canvas2);
                        break;
                    default:
                        switch (iImpromptu) {
                            case 32:
                                bArrWireman2 = wireman(4, 4, cuirassedVar);
                                break;
                            case 33:
                                bArrWireman3 = wireman(4, 8, cuirassedVar);
                                break;
                            case 34:
                                bArrWireman = wireman(16, 8, cuirassedVar);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i4 += 2;
                iTaiyuan = i2;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    public static void graveside(cuirassed cuirassedVar, impromptu impromptuVar) {
        beachfront beachfrontVar;
        int iImpromptu = cuirassedVar.impromptu(8);
        int iImpromptu2 = cuirassedVar.impromptu(16);
        int iImpromptu3 = cuirassedVar.impromptu(16);
        int iWireman = cuirassedVar.wireman() + iImpromptu3;
        if (iImpromptu3 * 8 > cuirassedVar.saneness()) {
            triweekly.impromptu("DvbParser", "Data field length exceeds limit");
            cuirassedVar.polloi(cuirassedVar.saneness());
            return;
        }
        switch (iImpromptu) {
            case 16:
                if (iImpromptu2 == impromptuVar.f24162attabal) {
                    wireman wiremanVar = impromptuVar.f24169taiyuan;
                    wireman wiremanVarPolloi = polloi(cuirassedVar, iImpromptu3);
                    if (wiremanVarPolloi.f24180dern != 0) {
                        impromptuVar.f24169taiyuan = wiremanVarPolloi;
                        impromptuVar.f24165dern.clear();
                        impromptuVar.f24170wireman.clear();
                        impromptuVar.f24167marial.clear();
                    } else if (wiremanVar != null && wiremanVar.f24181saneness != wiremanVarPolloi.f24181saneness) {
                        impromptuVar.f24169taiyuan = wiremanVarPolloi;
                    }
                }
                break;
            case 17:
                wireman wiremanVar2 = impromptuVar.f24169taiyuan;
                if (iImpromptu2 == impromptuVar.f24162attabal && wiremanVar2 != null) {
                    beachfront beachfrontVarMolybdenite = molybdenite(cuirassedVar, iImpromptu3);
                    if (wiremanVar2.f24180dern == 0 && (beachfrontVar = impromptuVar.f24165dern.get(beachfrontVarMolybdenite.f24142attabal)) != null) {
                        beachfrontVarMolybdenite.attabal(beachfrontVar);
                    }
                    impromptuVar.f24165dern.put(beachfrontVarMolybdenite.f24142attabal, beachfrontVarMolybdenite);
                }
                break;
            case 18:
                if (iImpromptu2 == impromptuVar.f24162attabal) {
                    C0572attabal c0572attabalKowloon = kowloon(cuirassedVar, iImpromptu3);
                    impromptuVar.f24170wireman.put(c0572attabalKowloon.f24137attabal, c0572attabalKowloon);
                } else if (iImpromptu2 == impromptuVar.f24168saneness) {
                    C0572attabal c0572attabalKowloon2 = kowloon(cuirassedVar, iImpromptu3);
                    impromptuVar.f24163beachfront.put(c0572attabalKowloon2.f24137attabal, c0572attabalKowloon2);
                }
                break;
            case 19:
                if (iImpromptu2 == impromptuVar.f24162attabal) {
                    dern dernVarMonoploid = monoploid(cuirassedVar);
                    impromptuVar.f24167marial.put(dernVarMonoploid.f24158attabal, dernVarMonoploid);
                } else if (iImpromptu2 == impromptuVar.f24168saneness) {
                    dern dernVarMonoploid2 = monoploid(cuirassedVar);
                    impromptuVar.f24164competently.put(dernVarMonoploid2.f24158attabal, dernVarMonoploid2);
                }
                break;
            case 20:
                if (iImpromptu2 == impromptuVar.f24162attabal) {
                    impromptuVar.f24166impromptu = arytenoidectomy(cuirassedVar);
                }
                break;
        }
        cuirassedVar.molybdenite(iWireman - cuirassedVar.wireman());
    }

    public static void impassible(dern dernVar, C0572attabal c0572attabal, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0572attabal.f24140wireman;
        } else {
            iArr = i == 2 ? c0572attabal.f24138dern : c0572attabal.f24139saneness;
        }
        int[] iArr2 = iArr;
        formularize(dernVar.f24159dern, iArr2, i, i2, i3, paint, canvas);
        formularize(dernVar.f24161wireman, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    public static int impromptu(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static C0572attabal kowloon(cuirassed cuirassedVar, int i) {
        int[] iArr;
        int iImpromptu;
        int i2;
        int iImpromptu2;
        int iImpromptu3;
        int iImpromptu4;
        int i3 = 8;
        int iImpromptu5 = cuirassedVar.impromptu(8);
        cuirassedVar.polloi(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrMarial = marial();
        int[] iArrBeachfront = beachfront();
        int[] iArrCompetently = competently();
        while (i5 > 0) {
            int iImpromptu6 = cuirassedVar.impromptu(i3);
            int iImpromptu7 = cuirassedVar.impromptu(i3);
            if ((iImpromptu7 & 128) != 0) {
                iArr = iArrMarial;
            } else {
                iArr = (iImpromptu7 & 64) != 0 ? iArrBeachfront : iArrCompetently;
            }
            if ((iImpromptu7 & 1) != 0) {
                iImpromptu3 = cuirassedVar.impromptu(i3);
                iImpromptu4 = cuirassedVar.impromptu(i3);
                iImpromptu = cuirassedVar.impromptu(i3);
                iImpromptu2 = cuirassedVar.impromptu(i3);
                i2 = i5 - 6;
            } else {
                int iImpromptu8 = cuirassedVar.impromptu(6) << i4;
                int iImpromptu9 = cuirassedVar.impromptu(4) << 4;
                iImpromptu = cuirassedVar.impromptu(4) << 4;
                i2 = i5 - 4;
                iImpromptu2 = cuirassedVar.impromptu(i4) << 6;
                iImpromptu3 = iImpromptu8;
                iImpromptu4 = iImpromptu9;
            }
            if (iImpromptu3 == 0) {
                iImpromptu2 = 255;
                iImpromptu4 = 0;
                iImpromptu = 0;
            }
            double d = iImpromptu3;
            double d2 = iImpromptu4 - 128;
            double d3 = iImpromptu - 128;
            iArr[iImpromptu6] = impromptu((byte) (255 - (iImpromptu2 & 255)), grimness.kowloon((int) (d + (1.402d * d2)), 0, 255), grimness.kowloon((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), grimness.kowloon((int) (d + (d3 * 1.772d)), 0, 255));
            i5 = i2;
            iImpromptu5 = iImpromptu5;
            i3 = 8;
            i4 = 2;
        }
        return new C0572attabal(iImpromptu5, iArrMarial, iArrBeachfront, iArrCompetently);
    }

    public static int[] marial() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static beachfront molybdenite(cuirassed cuirassedVar, int i) {
        int i2;
        int iImpromptu;
        int iImpromptu2;
        char c;
        int iImpromptu3 = cuirassedVar.impromptu(8);
        int i3 = 4;
        cuirassedVar.polloi(4);
        boolean zCompetently = cuirassedVar.competently();
        cuirassedVar.polloi(3);
        int i4 = 16;
        int iImpromptu4 = cuirassedVar.impromptu(16);
        int iImpromptu5 = cuirassedVar.impromptu(16);
        int iImpromptu6 = cuirassedVar.impromptu(3);
        int iImpromptu7 = cuirassedVar.impromptu(3);
        int i5 = 2;
        cuirassedVar.polloi(2);
        int iImpromptu8 = cuirassedVar.impromptu(8);
        int iImpromptu9 = cuirassedVar.impromptu(8);
        int iImpromptu10 = cuirassedVar.impromptu(4);
        int iImpromptu11 = cuirassedVar.impromptu(2);
        cuirassedVar.polloi(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int iImpromptu12 = cuirassedVar.impromptu(i4);
            int iImpromptu13 = cuirassedVar.impromptu(i5);
            int iImpromptu14 = cuirassedVar.impromptu(i5);
            int iImpromptu15 = cuirassedVar.impromptu(12);
            cuirassedVar.polloi(i3);
            int iImpromptu16 = cuirassedVar.impromptu(12);
            int i7 = i6 - 6;
            if (iImpromptu13 != 1) {
                i2 = 2;
                if (iImpromptu13 != 2) {
                    iImpromptu2 = 0;
                    iImpromptu = 0;
                    i6 = i7;
                    c = '\b';
                }
                sparseArray.put(iImpromptu12, new competently(iImpromptu13, iImpromptu14, iImpromptu15, iImpromptu16, iImpromptu2, iImpromptu));
                i4 = 16;
                i5 = i2;
                i3 = 4;
            } else {
                i2 = 2;
            }
            c = '\b';
            i6 -= 8;
            iImpromptu2 = cuirassedVar.impromptu(8);
            iImpromptu = cuirassedVar.impromptu(8);
            sparseArray.put(iImpromptu12, new competently(iImpromptu13, iImpromptu14, iImpromptu15, iImpromptu16, iImpromptu2, iImpromptu));
            i4 = 16;
            i5 = i2;
            i3 = 4;
        }
        return new beachfront(iImpromptu3, zCompetently, iImpromptu4, iImpromptu5, iImpromptu6, iImpromptu7, iImpromptu8, iImpromptu9, iImpromptu10, iImpromptu11, sparseArray);
    }

    public static dern monoploid(cuirassed cuirassedVar) {
        byte[] bArr;
        int iImpromptu = cuirassedVar.impromptu(16);
        cuirassedVar.polloi(4);
        int iImpromptu2 = cuirassedVar.impromptu(2);
        boolean zCompetently = cuirassedVar.competently();
        cuirassedVar.polloi(1);
        byte[] bArr2 = grimness.f25081beachfront;
        if (iImpromptu2 != 1) {
            if (iImpromptu2 == 0) {
                int iImpromptu3 = cuirassedVar.impromptu(16);
                int iImpromptu4 = cuirassedVar.impromptu(16);
                if (iImpromptu3 > 0) {
                    bArr2 = new byte[iImpromptu3];
                    cuirassedVar.apical(bArr2, 0, iImpromptu3);
                }
                if (iImpromptu4 > 0) {
                    bArr = new byte[iImpromptu4];
                    cuirassedVar.apical(bArr, 0, iImpromptu4);
                }
            }
            return new dern(iImpromptu, zCompetently, bArr2, bArr);
        }
        cuirassedVar.polloi(cuirassedVar.impromptu(8) * 16);
        bArr = bArr2;
        return new dern(iImpromptu, zCompetently, bArr2, bArr);
    }

    public static wireman polloi(cuirassed cuirassedVar, int i) {
        int iImpromptu = cuirassedVar.impromptu(8);
        int iImpromptu2 = cuirassedVar.impromptu(4);
        int iImpromptu3 = cuirassedVar.impromptu(2);
        cuirassedVar.polloi(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int iImpromptu4 = cuirassedVar.impromptu(8);
            cuirassedVar.polloi(8);
            i2 -= 6;
            sparseArray.put(iImpromptu4, new marial(cuirassedVar.impromptu(16), cuirassedVar.impromptu(16)));
        }
        return new wireman(iImpromptu, iImpromptu2, iImpromptu3, sparseArray);
    }

    public static int taiyuan(cuirassed cuirassedVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        int iImpromptu;
        int iImpromptu2;
        boolean z = false;
        while (true) {
            int iImpromptu3 = cuirassedVar.impromptu(2);
            if (iImpromptu3 != 0) {
                z = z;
                i3 = 1;
            } else {
                if (cuirassedVar.competently()) {
                    iImpromptu = cuirassedVar.impromptu(3) + 3;
                    iImpromptu2 = cuirassedVar.impromptu(2);
                } else {
                    if (cuirassedVar.competently()) {
                        i3 = 1;
                    } else {
                        int iImpromptu4 = cuirassedVar.impromptu(2);
                        if (iImpromptu4 == 0) {
                            z = true;
                        } else if (iImpromptu4 == 1) {
                            i3 = 2;
                        } else if (iImpromptu4 == 2) {
                            iImpromptu = cuirassedVar.impromptu(4) + 12;
                            iImpromptu2 = cuirassedVar.impromptu(2);
                        } else if (iImpromptu4 != 3) {
                            z = z;
                        } else {
                            iImpromptu = cuirassedVar.impromptu(8) + 29;
                            iImpromptu2 = cuirassedVar.impromptu(2);
                        }
                        iImpromptu3 = 0;
                        i3 = 0;
                    }
                    iImpromptu3 = 0;
                }
                z = z;
                i3 = iImpromptu;
                iImpromptu3 = iImpromptu2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iImpromptu3 = bArr[iImpromptu3];
                }
                paint.setColor(iArr[iImpromptu3]);
                canvas.drawRect(i, i2, i + i3, 1 + i2, paint);
            }
            i += i3;
            if (z) {
                return i;
            }
            z = z;
        }
    }

    public static byte[] wireman(int i, int i2, cuirassed cuirassedVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) cuirassedVar.impromptu(i2);
        }
        return bArr;
    }

    @Override // strother.polloi
    public int dern() {
        return 2;
    }

    @Override // strother.polloi
    public void reset() {
        this.f24131beachfront.attabal();
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, decarock.impromptu<strother.marial> impromptuVar) {
        cuirassed cuirassedVar = new cuirassed(bArr, i2 + i);
        cuirassedVar.arytenoidectomy(i);
        impromptuVar.accept(triweekly(cuirassedVar));
    }

    public final strother.marial triweekly(cuirassed cuirassedVar) {
        int i;
        while (cuirassedVar.saneness() >= 48 && cuirassedVar.impromptu(8) == 15) {
            graveside(cuirassedVar, this.f24131beachfront);
        }
        impromptu impromptuVar = this.f24131beachfront;
        wireman wiremanVar = impromptuVar.f24169taiyuan;
        if (wiremanVar == null) {
            return new strother.marial(ImmutableList.of(), C.TIME_UNSET, C.TIME_UNSET);
        }
        saneness sanenessVar = impromptuVar.f24166impromptu;
        if (sanenessVar == null) {
            sanenessVar = this.f24136wireman;
        }
        Bitmap bitmap = this.f24132competently;
        if (bitmap == null || sanenessVar.f24173attabal + 1 != bitmap.getWidth() || sanenessVar.f24177saneness + 1 != this.f24132competently.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sanenessVar.f24173attabal + 1, sanenessVar.f24177saneness + 1, Bitmap.Config.ARGB_8888);
            this.f24132competently = bitmapCreateBitmap;
            this.f24133dern.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<marial> sparseArray = wiremanVar.f24182wireman;
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            this.f24133dern.save();
            marial marialVarValueAt = sparseArray.valueAt(i2);
            beachfront beachfrontVar = this.f24131beachfront.f24165dern.get(sparseArray.keyAt(i2));
            int i3 = marialVarValueAt.f24171attabal + sanenessVar.f24175dern;
            int i4 = marialVarValueAt.f24172saneness + sanenessVar.f24176marial;
            this.f24133dern.clipRect(i3, i4, Math.min(beachfrontVar.f24146dern + i3, sanenessVar.f24178wireman), Math.min(beachfrontVar.f24151wireman + i4, sanenessVar.f24174beachfront));
            C0572attabal c0572attabal = this.f24131beachfront.f24170wireman.get(beachfrontVar.f24144competently);
            if (c0572attabal == null && (c0572attabal = this.f24131beachfront.f24163beachfront.get(beachfrontVar.f24144competently)) == null) {
                c0572attabal = this.f24134marial;
            }
            C0572attabal c0572attabal2 = c0572attabal;
            SparseArray<competently> sparseArray2 = beachfrontVar.f24141apical;
            int i5 = 0;
            while (i5 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i5);
                competently competentlyVarValueAt = sparseArray2.valueAt(i5);
                dern dernVar = this.f24131beachfront.f24167marial.get(iKeyAt);
                if (dernVar == null) {
                    dernVar = this.f24131beachfront.f24164competently.get(iKeyAt);
                }
                if (dernVar != null) {
                    impassible(dernVar, c0572attabal2, beachfrontVar.f24143beachfront, competentlyVarValueAt.f24154dern + i3, competentlyVarValueAt.f24157wireman + i4, dernVar.f24160saneness ? null : this.f24130attabal, this.f24133dern);
                }
                i5++;
                sparseArray = sparseArray;
            }
            SparseArray<marial> sparseArray3 = sparseArray;
            if (beachfrontVar.f24149saneness) {
                int i6 = beachfrontVar.f24143beachfront;
                if (i6 == 3) {
                    i = c0572attabal2.f24140wireman[beachfrontVar.f24147impromptu];
                } else {
                    i = i6 == 2 ? c0572attabal2.f24138dern[beachfrontVar.f24150taiyuan] : c0572attabal2.f24139saneness[beachfrontVar.f24145cutely];
                }
                this.f24135saneness.setColor(i);
                this.f24133dern.drawRect(i3, i4, beachfrontVar.f24146dern + i3, beachfrontVar.f24151wireman + i4, this.f24135saneness);
            }
            arrayList.add(new libya.attabal.saneness().beachfront(Bitmap.createBitmap(this.f24132competently, i3, i4, beachfrontVar.f24146dern, beachfrontVar.f24151wireman)).apical(i3 / sanenessVar.f24173attabal).formularize(0).impromptu(i4 / sanenessVar.f24177saneness, 0).taiyuan(0).triweekly(beachfrontVar.f24146dern / sanenessVar.f24173attabal).competently(beachfrontVar.f24151wireman / sanenessVar.f24177saneness).attabal());
            this.f24133dern.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f24133dern.restore();
            i2++;
            sparseArray = sparseArray3;
        }
        return new strother.marial(arrayList, C.TIME_UNSET, C.TIME_UNSET);
    }
}
