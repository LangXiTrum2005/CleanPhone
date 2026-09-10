package terni;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: StandardGifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial implements attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final String f38784adultoid = "marial";

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f38785apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f38786arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int[] f38787attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public short[] f38788beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public byte[] f38789competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int[] f38790cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal.InterfaceC0809attabal f38791dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public dern f38792formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Bitmap.Config f38793graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public Bitmap f38794impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public byte[] f38795impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f38796kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public byte[] f38797marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Boolean f38798molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f38799monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f38800polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int[] f38801saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public byte[] f38802taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f38803triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ByteBuffer f38804wireman;

    public marial(attabal.InterfaceC0809attabal interfaceC0809attabal, dern dernVar, ByteBuffer byteBuffer, int i) {
        this(interfaceC0809attabal);
        monoploid(dernVar, byteBuffer, i);
    }

    public final void apical(saneness sanenessVar) {
        saneness sanenessVar2 = sanenessVar;
        int[] iArr = this.f38790cutely;
        int i = sanenessVar2.f38815wireman;
        int i2 = sanenessVar2.f38813saneness;
        int i3 = sanenessVar2.f38810dern;
        int i4 = sanenessVar2.f38806attabal;
        boolean z = this.f38785apical == 0;
        int i5 = this.f38800polloi;
        byte[] bArr = this.f38802taiyuan;
        int[] iArr2 = this.f38787attabal;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = sanenessVar2.f38810dern * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int[] iArr3 = iArr;
                int i13 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr3[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                iArr = iArr3;
            }
            i6++;
            sanenessVar2 = sanenessVar;
        }
        Boolean bool = this.f38798molybdenite;
        this.f38798molybdenite = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f38798molybdenite == null && z && b != -1));
    }

    public final int arytenoidectomy() {
        return this.f38804wireman.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // terni.attabal
    public synchronized Bitmap attabal() {
        try {
            if (this.f38792formularize.f38776dern <= 0 || this.f38785apical < 0) {
                if (Log.isLoggable(f38784adultoid, 3)) {
                    int i = this.f38792formularize.f38776dern;
                }
                this.f38796kowloon = 1;
            }
            int i2 = this.f38796kowloon;
            if (i2 != 1 && i2 != 2) {
                this.f38796kowloon = 0;
                if (this.f38797marial == null) {
                    this.f38797marial = this.f38791dern.saneness(255);
                }
                saneness sanenessVar = this.f38792formularize.f38780marial.get(this.f38785apical);
                int i3 = this.f38785apical - 1;
                saneness sanenessVar2 = i3 >= 0 ? this.f38792formularize.f38780marial.get(i3) : null;
                int[] iArr = sanenessVar.f38805apical;
                if (iArr == null) {
                    iArr = this.f38792formularize.f38772attabal;
                }
                this.f38787attabal = iArr;
                if (iArr == null) {
                    Log.isLoggable(f38784adultoid, 3);
                    this.f38796kowloon = 1;
                    return null;
                }
                if (sanenessVar.f38807beachfront) {
                    System.arraycopy(iArr, 0, this.f38801saneness, 0, iArr.length);
                    int[] iArr2 = this.f38801saneness;
                    this.f38787attabal = iArr2;
                    iArr2[sanenessVar.f38811impromptu] = 0;
                    if (sanenessVar.f38808competently == 2 && this.f38785apical == 0) {
                        this.f38798molybdenite = Boolean.TRUE;
                    }
                }
                return polloi(sanenessVar, sanenessVar2);
            }
            Log.isLoggable(f38784adultoid, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // terni.attabal
    public void beachfront() {
        this.f38785apical = -1;
    }

    @Override // terni.attabal
    public void clear() {
        this.f38792formularize = null;
        byte[] bArr = this.f38802taiyuan;
        if (bArr != null) {
            this.f38791dern.marial(bArr);
        }
        int[] iArr = this.f38790cutely;
        if (iArr != null) {
            this.f38791dern.beachfront(iArr);
        }
        Bitmap bitmap = this.f38794impassible;
        if (bitmap != null) {
            this.f38791dern.attabal(bitmap);
        }
        this.f38794impassible = null;
        this.f38804wireman = null;
        this.f38798molybdenite = null;
        byte[] bArr2 = this.f38797marial;
        if (bArr2 != null) {
            this.f38791dern.marial(bArr2);
        }
    }

    @Override // terni.attabal
    public int competently() {
        return this.f38785apical;
    }

    public final void cutely(saneness sanenessVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.f38790cutely;
        int i5 = sanenessVar.f38815wireman;
        int i6 = this.f38786arytenoidectomy;
        int i7 = i5 / i6;
        int i8 = sanenessVar.f38813saneness / i6;
        int i9 = sanenessVar.f38810dern / i6;
        int i10 = sanenessVar.f38806attabal / i6;
        boolean z = this.f38785apical == 0;
        int i11 = this.f38800polloi;
        int i12 = this.f38799monoploid;
        byte[] bArr = this.f38802taiyuan;
        int[] iArr2 = this.f38787attabal;
        Boolean bool = this.f38798molybdenite;
        int i13 = 8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i15 < i7) {
            int[] iArr3 = iArr;
            if (sanenessVar.f38812marial) {
                if (i14 >= i7) {
                    int i17 = i16 + 1;
                    i = i7;
                    if (i17 == 2) {
                        i16 = i17;
                        i14 = 4;
                    } else if (i17 == 3) {
                        i16 = i17;
                        i13 = 4;
                        i14 = 2;
                    } else if (i17 != 4) {
                        i16 = i17;
                    } else {
                        i16 = i17;
                        i14 = 1;
                        i13 = 2;
                    }
                } else {
                    i = i7;
                }
                i2 = i14 + i13;
            } else {
                i = i7;
                i2 = i14;
                i14 = i15;
            }
            int i18 = i14 + i8;
            boolean z2 = i6 == 1;
            if (i18 < i12) {
                int i19 = i18 * i11;
                int i20 = i19 + i10;
                int i21 = i20 + i9;
                int i22 = i19 + i11;
                if (i22 < i21) {
                    i21 = i22;
                }
                i3 = i2;
                int i23 = i15 * i6 * sanenessVar.f38810dern;
                if (z2) {
                    int i24 = i20;
                    while (i24 < i21) {
                        int i25 = i24;
                        int i26 = iArr2[bArr[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                        if (i26 != 0) {
                            iArr3[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i6;
                        i24 = i25 + 1;
                    }
                } else {
                    int i27 = ((i21 - i20) * i6) + i23;
                    i4 = i6;
                    int i28 = i20;
                    while (i28 < i21) {
                        int i29 = i21;
                        int iTaiyuan = taiyuan(i23, i27, sanenessVar.f38810dern);
                        if (iTaiyuan != 0) {
                            iArr3[i28] = iTaiyuan;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i4;
                        i28++;
                        i21 = i29;
                    }
                }
                i15++;
                i6 = i4;
                iArr = iArr3;
                i7 = i;
                i14 = i3;
            } else {
                i3 = i2;
            }
            i4 = i6;
            i15++;
            i6 = i4;
            iArr = iArr3;
            i7 = i;
            i14 = i3;
        }
        if (this.f38798molybdenite == null) {
            this.f38798molybdenite = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    @Override // terni.attabal
    public int dern() {
        return this.f38792formularize.f38776dern;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void formularize(saneness sanenessVar) {
        int i;
        int i2;
        short s;
        marial marialVar = this;
        if (sanenessVar != null) {
            marialVar.f38804wireman.position(sanenessVar.f38809cutely);
        }
        if (sanenessVar == null) {
            dern dernVar = marialVar.f38792formularize;
            i = dernVar.f38773beachfront;
            i2 = dernVar.f38774competently;
        } else {
            i = sanenessVar.f38810dern;
            i2 = sanenessVar.f38815wireman;
        }
        int i3 = i * i2;
        byte[] bArr = marialVar.f38802taiyuan;
        if (bArr == null || bArr.length < i3) {
            marialVar.f38802taiyuan = marialVar.f38791dern.saneness(i3);
        }
        byte[] bArr2 = marialVar.f38802taiyuan;
        if (marialVar.f38788beachfront == null) {
            marialVar.f38788beachfront = new short[4096];
        }
        short[] sArr = marialVar.f38788beachfront;
        if (marialVar.f38789competently == null) {
            marialVar.f38789competently = new byte[4096];
        }
        byte[] bArr3 = marialVar.f38789competently;
        if (marialVar.f38795impromptu == null) {
            marialVar.f38795impromptu = new byte[4097];
        }
        byte[] bArr4 = marialVar.f38795impromptu;
        int iArytenoidectomy = marialVar.arytenoidectomy();
        int i4 = 1 << iArytenoidectomy;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iArytenoidectomy + 1;
        int i8 = (1 << i7) - 1;
        byte b = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            sArr[i9] = 0;
            bArr3[i9] = (byte) i9;
        }
        byte[] bArr5 = marialVar.f38797marial;
        int i10 = i7;
        int i11 = i6;
        int i12 = i8;
        int i13 = 0;
        int iKowloon = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (i13 < i3) {
            if (iKowloon == 0) {
                iKowloon = marialVar.kowloon();
                if (iKowloon <= 0) {
                    marialVar.f38796kowloon = 3;
                    break;
                }
                i14 = b;
            }
            i16 += (bArr5[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i15;
            i14++;
            iKowloon--;
            int i21 = i15 + 8;
            i11 = i11;
            int i22 = i10;
            int i23 = i20;
            short[] sArr2 = sArr;
            int i24 = i18;
            while (true) {
                bArr3 = bArr3;
                if (i21 < i22) {
                    i18 = i24;
                    break;
                }
                int i25 = i16 & i12;
                i16 >>= i22;
                i21 -= i22;
                if (i25 == i4) {
                    i22 = i7;
                    i11 = i6;
                    i12 = i8;
                    i23 = -1;
                } else {
                    if (i25 == i5) {
                        i18 = i24;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i23 == -1) {
                        bArr2[i17] = bArr3[i25];
                        i17++;
                        i13++;
                        i23 = i25;
                        i24 = i23;
                        bArr4 = bArr6;
                    } else {
                        if (i25 >= i11) {
                            bArr6[i19] = (byte) i24;
                            i19++;
                            s = i23;
                        } else {
                            s = i25;
                        }
                        while (s >= i4) {
                            bArr6[i19] = bArr3[s];
                            i19++;
                            s = sArr2[s];
                        }
                        int i26 = bArr3[s] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        byte b2 = (byte) i26;
                        bArr2[i17] = b2;
                        while (true) {
                            i17++;
                            i13++;
                            if (i19 <= 0) {
                                break;
                            }
                            i19--;
                            bArr2[i17] = bArr6[i19];
                        }
                        if (i11 < 4096) {
                            sArr2[i11] = (short) i23;
                            bArr3[i11] = b2;
                            i11++;
                            if ((i11 & i12) == 0 && i11 < 4096) {
                                i22++;
                                i12 += i11;
                            }
                        }
                        i23 = i25;
                        bArr4 = bArr6;
                        i24 = i26;
                    }
                }
            }
            i15 = i21;
            sArr = sArr2;
            bArr3 = bArr3;
            b = 0;
            i20 = i23;
            i10 = i22;
            marialVar = this;
        }
        Arrays.fill(bArr2, i17, i3, b);
    }

    @Override // terni.attabal
    public ByteBuffer getData() {
        return this.f38804wireman;
    }

    public int impassible(int i) {
        if (i < 0) {
            return -1;
        }
        dern dernVar = this.f38792formularize;
        if (i < dernVar.f38776dern) {
            return dernVar.f38780marial.get(i).f38814taiyuan;
        }
        return -1;
    }

    @Override // terni.attabal
    public int impromptu() {
        return this.f38804wireman.limit() + this.f38802taiyuan.length + (this.f38790cutely.length * 4);
    }

    public final int kowloon() {
        int iArytenoidectomy = arytenoidectomy();
        if (iArytenoidectomy <= 0) {
            return iArytenoidectomy;
        }
        ByteBuffer byteBuffer = this.f38804wireman;
        byteBuffer.get(this.f38797marial, 0, Math.min(iArytenoidectomy, byteBuffer.remaining()));
        return iArytenoidectomy;
    }

    @Override // terni.attabal
    public int marial() {
        int i;
        if (this.f38792formularize.f38776dern <= 0 || (i = this.f38785apical) < 0) {
            return 0;
        }
        return impassible(i);
    }

    public synchronized void monoploid(dern dernVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.f38796kowloon = 0;
            this.f38792formularize = dernVar;
            this.f38785apical = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f38804wireman = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f38804wireman.order(ByteOrder.LITTLE_ENDIAN);
            this.f38803triweekly = false;
            Iterator<saneness> it = dernVar.f38780marial.iterator();
            while (it.hasNext()) {
                if (it.next().f38808competently == 3) {
                    this.f38803triweekly = true;
                    break;
                }
            }
            this.f38786arytenoidectomy = iHighestOneBit;
            int i2 = dernVar.f38773beachfront;
            this.f38800polloi = i2 / iHighestOneBit;
            int i3 = dernVar.f38774competently;
            this.f38799monoploid = i3 / iHighestOneBit;
            this.f38802taiyuan = this.f38791dern.saneness(i2 * i3);
            this.f38790cutely = this.f38791dern.wireman(this.f38800polloi * this.f38799monoploid);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Bitmap polloi(saneness sanenessVar, saneness sanenessVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f38790cutely;
        int i3 = 0;
        if (sanenessVar2 == null) {
            Bitmap bitmap2 = this.f38794impassible;
            if (bitmap2 != null) {
                this.f38791dern.attabal(bitmap2);
            }
            this.f38794impassible = null;
            Arrays.fill(iArr, 0);
        }
        if (sanenessVar2 != null && sanenessVar2.f38808competently == 3 && this.f38794impassible == null) {
            Arrays.fill(iArr, 0);
        }
        if (sanenessVar2 != null && (i2 = sanenessVar2.f38808competently) > 0) {
            if (i2 == 2) {
                if (!sanenessVar.f38807beachfront) {
                    dern dernVar = this.f38792formularize;
                    int i4 = dernVar.f38777formularize;
                    if (sanenessVar.f38805apical == null || dernVar.f38775cutely != sanenessVar.f38811impromptu) {
                        i3 = i4;
                    }
                }
                int i5 = sanenessVar2.f38815wireman;
                int i6 = this.f38786arytenoidectomy;
                int i7 = i5 / i6;
                int i8 = sanenessVar2.f38813saneness / i6;
                int i9 = sanenessVar2.f38810dern / i6;
                int i10 = sanenessVar2.f38806attabal / i6;
                int i11 = this.f38800polloi;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f38800polloi;
                }
            } else if (i2 == 3 && (bitmap = this.f38794impassible) != null) {
                int i16 = this.f38800polloi;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f38799monoploid);
            }
        }
        formularize(sanenessVar);
        if (sanenessVar.f38812marial || this.f38786arytenoidectomy != 1) {
            cutely(sanenessVar);
        } else {
            apical(sanenessVar);
        }
        if (this.f38803triweekly && ((i = sanenessVar.f38808competently) == 0 || i == 1)) {
            if (this.f38794impassible == null) {
                this.f38794impassible = triweekly();
            }
            Bitmap bitmap3 = this.f38794impassible;
            int i17 = this.f38800polloi;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f38799monoploid);
        }
        Bitmap bitmapTriweekly = triweekly();
        int i18 = this.f38800polloi;
        bitmapTriweekly.setPixels(iArr, 0, i18, 0, 0, i18, this.f38799monoploid);
        return bitmapTriweekly;
    }

    @Override // terni.attabal
    public void saneness() {
        this.f38785apical = (this.f38785apical + 1) % this.f38792formularize.f38776dern;
    }

    public final int taiyuan(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f38786arytenoidectomy + i; i9++) {
            byte[] bArr = this.f38802taiyuan;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f38787attabal[bArr[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f38786arytenoidectomy + i11; i12++) {
            byte[] bArr2 = this.f38802taiyuan;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f38787attabal[bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    public final Bitmap triweekly() {
        Boolean bool = this.f38798molybdenite;
        Bitmap bitmapDern = this.f38791dern.dern(this.f38800polloi, this.f38799monoploid, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f38793graveside);
        bitmapDern.setHasAlpha(true);
        return bitmapDern;
    }

    @Override // terni.attabal
    public void wireman(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f38793graveside = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public marial(attabal.InterfaceC0809attabal interfaceC0809attabal) {
        this.f38801saneness = new int[256];
        this.f38793graveside = Bitmap.Config.ARGB_8888;
        this.f38791dern = interfaceC0809attabal;
        this.f38792formularize = new dern();
    }
}
