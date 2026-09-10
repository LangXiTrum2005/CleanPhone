package hobby;

import com.inmobi.media.core.config.models.AdConfig;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: Ed25519.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f27790attabal = new attabal(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f27792saneness = new dern(new wireman(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final byte[] f27791dern = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ExecutionDataWriter.BLOCK_SESSIONINFO};

    /* JADX INFO: compiled from: Ed25519.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long[] f27793attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long[] f27794dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long[] f27795saneness;

        public attabal() {
            this(new long[10], new long[10], new long[10]);
        }

        public void attabal(attabal attabalVar, int i) {
            hobby.wireman.attabal(this.f27793attabal, attabalVar.f27793attabal, i);
            hobby.wireman.attabal(this.f27795saneness, attabalVar.f27795saneness, i);
            hobby.wireman.attabal(this.f27794dern, attabalVar.f27794dern, i);
        }

        public void saneness(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public attabal(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f27793attabal = jArr;
            this.f27795saneness = jArr2;
            this.f27794dern = jArr3;
        }

        public attabal(attabal attabalVar) {
            this.f27793attabal = Arrays.copyOf(attabalVar.f27793attabal, 10);
            this.f27795saneness = Arrays.copyOf(attabalVar.f27795saneness, 10);
            this.f27794dern = Arrays.copyOf(attabalVar.f27794dern, 10);
        }
    }

    /* JADX INFO: compiled from: Ed25519.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman f27796attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long[] f27797saneness;

        public dern() {
            this(new wireman(), new long[10]);
        }

        public dern(wireman wiremanVar, long[] jArr) {
            this.f27796attabal = wiremanVar;
            this.f27797saneness = jArr;
        }

        public dern(dern dernVar) {
            this.f27796attabal = new wireman(dernVar.f27796attabal);
            this.f27797saneness = Arrays.copyOf(dernVar.f27797saneness, 10);
        }
    }

    /* JADX INFO: renamed from: hobby.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ed25519.java */
    public static class C0634marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman f27798attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long[] f27799saneness;

        public C0634marial() {
            this(new wireman(), new long[10]);
        }

        public static C0634marial dern(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrDern = taiyuan.dern(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            taiyuan.apical(jArr4, jArrDern);
            taiyuan.beachfront(jArr5, jArr4, beachfront.f27739attabal);
            taiyuan.impassible(jArr4, jArr4, jArr2);
            taiyuan.kowloon(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            taiyuan.apical(jArr8, jArr5);
            taiyuan.beachfront(jArr8, jArr8, jArr5);
            taiyuan.apical(jArr, jArr8);
            taiyuan.beachfront(jArr, jArr, jArr5);
            taiyuan.beachfront(jArr, jArr, jArr4);
            marial.molybdenite(jArr, jArr);
            taiyuan.beachfront(jArr, jArr, jArr8);
            taiyuan.beachfront(jArr, jArr, jArr4);
            taiyuan.apical(jArr6, jArr);
            taiyuan.beachfront(jArr6, jArr6, jArr5);
            taiyuan.impassible(jArr7, jArr6, jArr4);
            if (marial.impassible(jArr7)) {
                taiyuan.kowloon(jArr7, jArr6, jArr4);
                if (marial.impassible(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                taiyuan.beachfront(jArr, jArr, beachfront.f27742dern);
            }
            if (!marial.impassible(jArr) && ((bArr[31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (marial.apical(jArr) == ((bArr[31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7)) {
                marial.polloi(jArr, jArr);
            }
            taiyuan.beachfront(jArr3, jArr, jArrDern);
            return new C0634marial(new wireman(jArr, jArrDern, jArr2), jArr3);
        }

        public static C0634marial wireman(C0634marial c0634marial, dern dernVar) {
            taiyuan.beachfront(c0634marial.f27798attabal.f27801attabal, dernVar.f27796attabal.f27801attabal, dernVar.f27797saneness);
            long[] jArr = c0634marial.f27798attabal.f27803saneness;
            wireman wiremanVar = dernVar.f27796attabal;
            taiyuan.beachfront(jArr, wiremanVar.f27803saneness, wiremanVar.f27802dern);
            taiyuan.beachfront(c0634marial.f27798attabal.f27802dern, dernVar.f27796attabal.f27802dern, dernVar.f27797saneness);
            long[] jArr2 = c0634marial.f27799saneness;
            wireman wiremanVar2 = dernVar.f27796attabal;
            taiyuan.beachfront(jArr2, wiremanVar2.f27801attabal, wiremanVar2.f27803saneness);
            return c0634marial;
        }

        public C0634marial(wireman wiremanVar, long[] jArr) {
            this.f27798attabal = wiremanVar;
            this.f27799saneness = jArr;
        }

        public C0634marial(dern dernVar) {
            this();
            wireman(this, dernVar);
        }
    }

    /* JADX INFO: compiled from: Ed25519.java */
    public static class saneness extends attabal {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long[] f27800wireman;

        public saneness() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // hobby.marial.attabal
        public void saneness(long[] jArr, long[] jArr2) {
            taiyuan.beachfront(jArr, jArr2, this.f27800wireman);
        }

        public saneness(C0634marial c0634marial) {
            this();
            long[] jArr = this.f27793attabal;
            wireman wiremanVar = c0634marial.f27798attabal;
            taiyuan.kowloon(jArr, wiremanVar.f27803saneness, wiremanVar.f27801attabal);
            long[] jArr2 = this.f27795saneness;
            wireman wiremanVar2 = c0634marial.f27798attabal;
            taiyuan.impassible(jArr2, wiremanVar2.f27803saneness, wiremanVar2.f27801attabal);
            System.arraycopy(c0634marial.f27798attabal.f27802dern, 0, this.f27800wireman, 0, 10);
            taiyuan.beachfront(this.f27794dern, c0634marial.f27799saneness, beachfront.f27745saneness);
        }

        public saneness(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f27800wireman = jArr3;
        }
    }

    /* JADX INFO: compiled from: Ed25519.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long[] f27801attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long[] f27802dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long[] f27803saneness;

        public wireman() {
            this(new long[10], new long[10], new long[10]);
        }

        public static wireman attabal(wireman wiremanVar, dern dernVar) {
            taiyuan.beachfront(wiremanVar.f27801attabal, dernVar.f27796attabal.f27801attabal, dernVar.f27797saneness);
            long[] jArr = wiremanVar.f27803saneness;
            wireman wiremanVar2 = dernVar.f27796attabal;
            taiyuan.beachfront(jArr, wiremanVar2.f27803saneness, wiremanVar2.f27802dern);
            taiyuan.beachfront(wiremanVar.f27802dern, dernVar.f27796attabal.f27802dern, dernVar.f27797saneness);
            return wiremanVar;
        }

        public byte[] dern() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            taiyuan.marial(jArr, this.f27802dern);
            taiyuan.beachfront(jArr2, this.f27801attabal, jArr);
            taiyuan.beachfront(jArr3, this.f27803saneness, jArr);
            byte[] bArrAttabal = taiyuan.attabal(jArr3);
            bArrAttabal[31] = (byte) ((marial.apical(jArr2) << 7) ^ bArrAttabal[31]);
            return bArrAttabal;
        }

        public boolean saneness() {
            long[] jArr = new long[10];
            taiyuan.apical(jArr, this.f27801attabal);
            long[] jArr2 = new long[10];
            taiyuan.apical(jArr2, this.f27803saneness);
            long[] jArr3 = new long[10];
            taiyuan.apical(jArr3, this.f27802dern);
            long[] jArr4 = new long[10];
            taiyuan.apical(jArr4, jArr3);
            long[] jArr5 = new long[10];
            taiyuan.impassible(jArr5, jArr2, jArr);
            taiyuan.beachfront(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            taiyuan.beachfront(jArr6, jArr, jArr2);
            taiyuan.beachfront(jArr6, jArr6, beachfront.f27739attabal);
            taiyuan.triweekly(jArr6, jArr4);
            taiyuan.impromptu(jArr6, jArr6);
            return affiche.marial.saneness(taiyuan.attabal(jArr5), taiyuan.attabal(jArr6));
        }

        public wireman(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f27801attabal = jArr;
            this.f27803saneness = jArr2;
            this.f27802dern = jArr3;
        }

        public wireman(wireman wiremanVar) {
            this.f27801attabal = Arrays.copyOf(wiremanVar.f27801attabal, 10);
            this.f27803saneness = Arrays.copyOf(wiremanVar.f27803saneness, 10);
            this.f27802dern = Arrays.copyOf(wiremanVar.f27802dern, 10);
        }

        public wireman(dern dernVar) {
            this();
            attabal(this, dernVar);
        }
    }

    public static wireman adultoid(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) (((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        dern dernVar = new dern(f27792saneness);
        C0634marial c0634marial = new C0634marial();
        for (i = 1; i < 64; i += 2) {
            attabal attabalVar = new attabal(f27790attabal);
            gintrap(attabalVar, i / 2, bArr2[i]);
            marial(dernVar, C0634marial.wireman(c0634marial, dernVar), attabalVar);
        }
        wireman wiremanVar = new wireman();
        competently(dernVar, wireman.attabal(wiremanVar, dernVar));
        competently(dernVar, wireman.attabal(wiremanVar, dernVar));
        competently(dernVar, wireman.attabal(wiremanVar, dernVar));
        competently(dernVar, wireman.attabal(wiremanVar, dernVar));
        for (int i7 = 0; i7 < 64; i7 += 2) {
            attabal attabalVar2 = new attabal(f27790attabal);
            gintrap(attabalVar2, i7 / 2, bArr2[i7]);
            marial(dernVar, C0634marial.wireman(c0634marial, dernVar), attabalVar2);
        }
        wireman wiremanVar2 = new wireman(dernVar);
        if (wiremanVar2.saneness()) {
            return wiremanVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static int apical(long[] jArr) {
        return taiyuan.attabal(jArr)[0] & 1;
    }

    public static long arytenoidectomy(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24) | kowloon(bArr, i);
    }

    public static wireman beachfront(byte[] bArr, C0634marial c0634marial, byte[] bArr2) {
        saneness[] sanenessVarArr = new saneness[8];
        sanenessVarArr[0] = new saneness(c0634marial);
        dern dernVar = new dern();
        impromptu(dernVar, c0634marial);
        C0634marial c0634marial2 = new C0634marial(dernVar);
        for (int i = 1; i < 8; i++) {
            marial(dernVar, c0634marial2, sanenessVarArr[i - 1]);
            sanenessVarArr[i] = new saneness(new C0634marial(dernVar));
        }
        byte[] bArrPreprohormone = preprohormone(bArr);
        byte[] bArrPreprohormone2 = preprohormone(bArr2);
        dern dernVar2 = new dern(f27792saneness);
        C0634marial c0634marial3 = new C0634marial();
        int i2 = 255;
        while (i2 >= 0 && bArrPreprohormone[i2] == 0 && bArrPreprohormone2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            competently(dernVar2, new wireman(dernVar2));
            byte b = bArrPreprohormone[i2];
            if (b > 0) {
                marial(dernVar2, C0634marial.wireman(c0634marial3, dernVar2), sanenessVarArr[bArrPreprohormone[i2] / 2]);
            } else if (b < 0) {
                cord(dernVar2, C0634marial.wireman(c0634marial3, dernVar2), sanenessVarArr[(-bArrPreprohormone[i2]) / 2]);
            }
            byte b2 = bArrPreprohormone2[i2];
            if (b2 > 0) {
                marial(dernVar2, C0634marial.wireman(c0634marial3, dernVar2), beachfront.f27744marial[bArrPreprohormone2[i2] / 2]);
            } else if (b2 < 0) {
                cord(dernVar2, C0634marial.wireman(c0634marial3, dernVar2), beachfront.f27744marial[(-bArrPreprohormone2[i2]) / 2]);
            }
            i2--;
        }
        return new wireman(dernVar2);
    }

    public static void competently(dern dernVar, wireman wiremanVar) {
        long[] jArr = new long[10];
        taiyuan.apical(dernVar.f27796attabal.f27801attabal, wiremanVar.f27801attabal);
        taiyuan.apical(dernVar.f27796attabal.f27802dern, wiremanVar.f27803saneness);
        taiyuan.apical(dernVar.f27797saneness, wiremanVar.f27802dern);
        long[] jArr2 = dernVar.f27797saneness;
        taiyuan.kowloon(jArr2, jArr2, jArr2);
        taiyuan.kowloon(dernVar.f27796attabal.f27803saneness, wiremanVar.f27801attabal, wiremanVar.f27803saneness);
        taiyuan.apical(jArr, dernVar.f27796attabal.f27803saneness);
        wireman wiremanVar2 = dernVar.f27796attabal;
        taiyuan.kowloon(wiremanVar2.f27803saneness, wiremanVar2.f27802dern, wiremanVar2.f27801attabal);
        wireman wiremanVar3 = dernVar.f27796attabal;
        long[] jArr3 = wiremanVar3.f27802dern;
        taiyuan.impassible(jArr3, jArr3, wiremanVar3.f27801attabal);
        wireman wiremanVar4 = dernVar.f27796attabal;
        taiyuan.impassible(wiremanVar4.f27801attabal, jArr, wiremanVar4.f27803saneness);
        long[] jArr4 = dernVar.f27797saneness;
        taiyuan.impassible(jArr4, jArr4, dernVar.f27796attabal.f27802dern);
    }

    public static void cord(dern dernVar, C0634marial c0634marial, attabal attabalVar) {
        long[] jArr = new long[10];
        long[] jArr2 = dernVar.f27796attabal.f27801attabal;
        wireman wiremanVar = c0634marial.f27798attabal;
        taiyuan.kowloon(jArr2, wiremanVar.f27803saneness, wiremanVar.f27801attabal);
        long[] jArr3 = dernVar.f27796attabal.f27803saneness;
        wireman wiremanVar2 = c0634marial.f27798attabal;
        taiyuan.impassible(jArr3, wiremanVar2.f27803saneness, wiremanVar2.f27801attabal);
        long[] jArr4 = dernVar.f27796attabal.f27803saneness;
        taiyuan.beachfront(jArr4, jArr4, attabalVar.f27793attabal);
        wireman wiremanVar3 = dernVar.f27796attabal;
        taiyuan.beachfront(wiremanVar3.f27802dern, wiremanVar3.f27801attabal, attabalVar.f27795saneness);
        taiyuan.beachfront(dernVar.f27797saneness, c0634marial.f27799saneness, attabalVar.f27794dern);
        attabalVar.saneness(dernVar.f27796attabal.f27801attabal, c0634marial.f27798attabal.f27802dern);
        long[] jArr5 = dernVar.f27796attabal.f27801attabal;
        taiyuan.kowloon(jArr, jArr5, jArr5);
        wireman wiremanVar4 = dernVar.f27796attabal;
        taiyuan.impassible(wiremanVar4.f27801attabal, wiremanVar4.f27802dern, wiremanVar4.f27803saneness);
        wireman wiremanVar5 = dernVar.f27796attabal;
        long[] jArr6 = wiremanVar5.f27803saneness;
        taiyuan.kowloon(jArr6, wiremanVar5.f27802dern, jArr6);
        taiyuan.impassible(dernVar.f27796attabal.f27802dern, jArr, dernVar.f27797saneness);
        long[] jArr7 = dernVar.f27797saneness;
        taiyuan.kowloon(jArr7, jArr, jArr7);
    }

    public static boolean cuirassed(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!triweekly(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest messageDigestAttabal = affiche.cutely.f3860marial.attabal("SHA-512");
        messageDigestAttabal.update(bArr2, 0, 32);
        messageDigestAttabal.update(bArr3);
        messageDigestAttabal.update(bArr);
        byte[] bArrDigest = messageDigestAttabal.digest();
        graveside(bArrDigest);
        byte[] bArrDern = beachfront(bArrDigest, C0634marial.dern(bArr3), bArrCopyOfRange).dern();
        for (int i = 0; i < 32; i++) {
            if (bArrDern[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] cutely(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigestAttabal = affiche.cutely.f3860marial.attabal("SHA-512");
        messageDigestAttabal.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigestAttabal.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b;
        bArrDigest[31] = (byte) (b | RemoteControlWriter.BLOCK_CMDDUMP);
        return bArrDigest;
    }

    public static byte[] dovishness(byte[] bArr) {
        return adultoid(bArr).dern();
    }

    public static void formularize() {
        if (beachfront.f27739attabal == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static void gintrap(attabal attabalVar, int i, byte b) {
        int i2 = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7;
        int i3 = b - (((-i2) & b) << 1);
        attabal[][] attabalVarArr = beachfront.f27747wireman;
        attabalVar.attabal(attabalVarArr[i][0], taiyuan(i3, 1));
        attabalVar.attabal(attabalVarArr[i][1], taiyuan(i3, 2));
        attabalVar.attabal(attabalVarArr[i][2], taiyuan(i3, 3));
        attabalVar.attabal(attabalVarArr[i][3], taiyuan(i3, 4));
        attabalVar.attabal(attabalVarArr[i][4], taiyuan(i3, 5));
        attabalVar.attabal(attabalVarArr[i][5], taiyuan(i3, 6));
        attabalVar.attabal(attabalVarArr[i][6], taiyuan(i3, 7));
        attabalVar.attabal(attabalVarArr[i][7], taiyuan(i3, 8));
        long[] jArrCopyOf = Arrays.copyOf(attabalVar.f27795saneness, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(attabalVar.f27793attabal, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(attabalVar.f27794dern, 10);
        polloi(jArrCopyOf3, jArrCopyOf3);
        attabalVar.attabal(new attabal(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }

    public static void graveside(byte[] bArr) {
        long jKowloon = kowloon(bArr, 0) & 2097151;
        long jArytenoidectomy = (arytenoidectomy(bArr, 2) >> 5) & 2097151;
        long jKowloon2 = (kowloon(bArr, 5) >> 2) & 2097151;
        long jArytenoidectomy2 = (arytenoidectomy(bArr, 7) >> 7) & 2097151;
        long jArytenoidectomy3 = (arytenoidectomy(bArr, 10) >> 4) & 2097151;
        long jKowloon3 = (kowloon(bArr, 13) >> 1) & 2097151;
        long jArytenoidectomy4 = (arytenoidectomy(bArr, 15) >> 6) & 2097151;
        long jKowloon4 = (kowloon(bArr, 18) >> 3) & 2097151;
        long jKowloon5 = kowloon(bArr, 21) & 2097151;
        long jArytenoidectomy5 = (arytenoidectomy(bArr, 23) >> 5) & 2097151;
        long jKowloon6 = (kowloon(bArr, 26) >> 2) & 2097151;
        long jArytenoidectomy6 = (arytenoidectomy(bArr, 28) >> 7) & 2097151;
        long jArytenoidectomy7 = (arytenoidectomy(bArr, 31) >> 4) & 2097151;
        long jKowloon7 = (kowloon(bArr, 34) >> 1) & 2097151;
        long jArytenoidectomy8 = (arytenoidectomy(bArr, 36) >> 6) & 2097151;
        long jKowloon8 = (kowloon(bArr, 39) >> 3) & 2097151;
        long jKowloon9 = kowloon(bArr, 42) & 2097151;
        long jArytenoidectomy9 = (arytenoidectomy(bArr, 44) >> 5) & 2097151;
        long jKowloon10 = (kowloon(bArr, 47) >> 2) & 2097151;
        long jArytenoidectomy10 = (arytenoidectomy(bArr, 49) >> 7) & 2097151;
        long jArytenoidectomy11 = (arytenoidectomy(bArr, 52) >> 4) & 2097151;
        long jKowloon11 = (kowloon(bArr, 55) >> 1) & 2097151;
        long jArytenoidectomy12 = (arytenoidectomy(bArr, 57) >> 6) & 2097151;
        long jArytenoidectomy13 = arytenoidectomy(bArr, 60) >> 3;
        long j = jKowloon9 - (jArytenoidectomy13 * 683901);
        long j2 = ((jArytenoidectomy8 - (jArytenoidectomy13 * 997805)) + (jArytenoidectomy12 * 136657)) - (jKowloon11 * 683901);
        long j3 = ((((jArytenoidectomy7 + (jArytenoidectomy13 * 470296)) + (jArytenoidectomy12 * 654183)) - (jKowloon11 * 997805)) + (jArytenoidectomy11 * 136657)) - (jArytenoidectomy10 * 683901);
        long j4 = jArytenoidectomy4 + (jKowloon10 * 666643);
        long j5 = jKowloon4 + (jArytenoidectomy10 * 666643) + (jKowloon10 * 470296);
        long j6 = jKowloon5 + (jArytenoidectomy11 * 666643) + (jArytenoidectomy10 * 470296) + (jKowloon10 * 654183);
        long j7 = (((jArytenoidectomy5 + (jKowloon11 * 666643)) + (jArytenoidectomy11 * 470296)) + (jArytenoidectomy10 * 654183)) - (jKowloon10 * 997805);
        long j8 = ((((jKowloon6 + (jArytenoidectomy12 * 666643)) + (jKowloon11 * 470296)) + (jArytenoidectomy11 * 654183)) - (jArytenoidectomy10 * 997805)) + (jKowloon10 * 136657);
        long j9 = (((((jArytenoidectomy6 + (jArytenoidectomy13 * 666643)) + (jArytenoidectomy12 * 470296)) + (jKowloon11 * 654183)) - (jArytenoidectomy11 * 997805)) + (jArytenoidectomy10 * 136657)) - (jKowloon10 * 683901);
        long j10 = (j4 + 1048576) >> 21;
        long j11 = j5 + j10;
        long j12 = j4 - (j10 << 21);
        long j13 = (j6 + 1048576) >> 21;
        long j14 = j7 + j13;
        long j15 = j6 - (j13 << 21);
        long j16 = (j8 + 1048576) >> 21;
        long j17 = j9 + j16;
        long j18 = j8 - (j16 << 21);
        long j19 = (j3 + 1048576) >> 21;
        long j20 = ((((jKowloon7 + (jArytenoidectomy13 * 654183)) - (jArytenoidectomy12 * 997805)) + (jKowloon11 * 136657)) - (jArytenoidectomy11 * 683901)) + j19;
        long j21 = j3 - (j19 << 21);
        long j22 = (j2 + 1048576) >> 21;
        long j23 = ((jKowloon8 + (jArytenoidectomy13 * 136657)) - (jArytenoidectomy12 * 683901)) + j22;
        long j24 = j2 - (j22 << 21);
        long j25 = (j + 1048576) >> 21;
        long j26 = jArytenoidectomy9 + j25;
        long j27 = j - (j25 << 21);
        long j28 = (j11 + 1048576) >> 21;
        long j29 = j15 + j28;
        long j30 = j11 - (j28 << 21);
        long j31 = (j14 + 1048576) >> 21;
        long j32 = j18 + j31;
        long j33 = j14 - (j31 << 21);
        long j34 = (j17 + 1048576) >> 21;
        long j35 = j21 + j34;
        long j36 = j17 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = j32 - (j26 * 683901);
        long j44 = ((j29 - (j26 * 997805)) + (j41 * 136657)) - (j42 * 683901);
        long j45 = ((((j12 + (j26 * 470296)) + (j41 * 654183)) - (j42 * 997805)) + (j38 * 136657)) - (j39 * 683901);
        long j46 = jKowloon + (j35 * 666643);
        long j47 = jArytenoidectomy + (j39 * 666643) + (j35 * 470296);
        long j48 = jKowloon2 + (j38 * 666643) + (j39 * 470296) + (j35 * 654183);
        long j49 = (((jArytenoidectomy2 + (j42 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j35 * 997805);
        long j50 = ((((jArytenoidectomy3 + (j41 * 666643)) + (j42 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j35 * 136657);
        long j51 = (((((jKowloon3 + (j26 * 666643)) + (j41 * 470296)) + (j42 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j35 * 683901);
        long j52 = (j46 + 1048576) >> 21;
        long j53 = j47 + j52;
        long j54 = j46 - (j52 << 21);
        long j55 = (j48 + 1048576) >> 21;
        long j56 = j49 + j55;
        long j57 = j48 - (j55 << 21);
        long j58 = (j50 + 1048576) >> 21;
        long j59 = j51 + j58;
        long j60 = j50 - (j58 << 21);
        long j61 = (j45 + 1048576) >> 21;
        long j62 = ((((j30 + (j26 * 654183)) - (j41 * 997805)) + (j42 * 136657)) - (j38 * 683901)) + j61;
        long j63 = j45 - (j61 << 21);
        long j64 = (j44 + 1048576) >> 21;
        long j65 = ((j33 + (j26 * 136657)) - (j41 * 683901)) + j64;
        long j66 = j44 - (j64 << 21);
        long j67 = (j43 + 1048576) >> 21;
        long j68 = j36 + j67;
        long j69 = j43 - (j67 << 21);
        long j70 = (j53 + 1048576) >> 21;
        long j71 = j57 + j70;
        long j72 = j53 - (j70 << 21);
        long j73 = (j56 + 1048576) >> 21;
        long j74 = j60 + j73;
        long j75 = j56 - (j73 << 21);
        long j76 = (j59 + 1048576) >> 21;
        long j77 = j63 + j76;
        long j78 = j59 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = (j68 + 1048576) >> 21;
        long j84 = j68 - (j83 << 21);
        long j85 = j54 + (j83 * 666643);
        long j86 = j72 + (j83 * 470296);
        long j87 = j71 + (j83 * 654183);
        long j88 = j75 - (j83 * 997805);
        long j89 = j74 + (j83 * 136657);
        long j90 = j78 - (j83 * 683901);
        long j91 = j85 >> 21;
        long j92 = j86 + j91;
        long j93 = j85 - (j91 << 21);
        long j94 = j92 >> 21;
        long j95 = j87 + j94;
        long j96 = j92 - (j94 << 21);
        long j97 = j95 >> 21;
        long j98 = j88 + j97;
        long j99 = j95 - (j97 << 21);
        long j100 = j98 >> 21;
        long j101 = j89 + j100;
        long j102 = j98 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = j90 + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j77 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j81 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j80 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = (j65 - (j82 << 21)) + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j69 + j82 + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = j84 + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = j122 - (j124 << 21);
        long j126 = j93 + (666643 * j124);
        long j127 = j96 + (470296 * j124);
        long j128 = j99 + (654183 * j124);
        long j129 = j102 - (997805 * j124);
        long j130 = j105 + (136657 * j124);
        long j131 = j108 - (j124 * 683901);
        long j132 = j126 >> 21;
        long j133 = j127 + j132;
        long j134 = j126 - (j132 << 21);
        long j135 = j133 >> 21;
        long j136 = j128 + j135;
        long j137 = j133 - (j135 << 21);
        long j138 = j136 >> 21;
        long j139 = j129 + j138;
        long j140 = j136 - (j138 << 21);
        long j141 = j139 >> 21;
        long j142 = j130 + j141;
        long j143 = j139 - (j141 << 21);
        long j144 = j142 >> 21;
        long j145 = j131 + j144;
        long j146 = j142 - (j144 << 21);
        long j147 = j145 >> 21;
        long j148 = j111 + j147;
        long j149 = j145 - (j147 << 21);
        long j150 = j148 >> 21;
        long j151 = j114 + j150;
        long j152 = j148 - (j150 << 21);
        long j153 = j151 >> 21;
        long j154 = j117 + j153;
        long j155 = j151 - (j153 << 21);
        long j156 = j154 >> 21;
        long j157 = j120 + j156;
        long j158 = j154 - (j156 << 21);
        long j159 = j157 >> 21;
        long j160 = j123 + j159;
        long j161 = j157 - (j159 << 21);
        long j162 = j160 >> 21;
        long j163 = j125 + j162;
        long j164 = j160 - (j162 << 21);
        bArr[0] = (byte) j134;
        bArr[1] = (byte) (j134 >> 8);
        bArr[2] = (byte) ((j134 >> 16) | (j137 << 5));
        bArr[3] = (byte) (j137 >> 3);
        bArr[4] = (byte) (j137 >> 11);
        bArr[5] = (byte) ((j137 >> 19) | (j140 << 2));
        bArr[6] = (byte) (j140 >> 6);
        bArr[7] = (byte) ((j140 >> 14) | (j143 << 7));
        bArr[8] = (byte) (j143 >> 1);
        bArr[9] = (byte) (j143 >> 9);
        bArr[10] = (byte) ((j143 >> 17) | (j146 << 4));
        bArr[11] = (byte) (j146 >> 4);
        bArr[12] = (byte) (j146 >> 12);
        bArr[13] = (byte) ((j146 >> 20) | (j149 << 1));
        bArr[14] = (byte) (j149 >> 7);
        bArr[15] = (byte) ((j149 >> 15) | (j152 << 6));
        bArr[16] = (byte) (j152 >> 2);
        bArr[17] = (byte) (j152 >> 10);
        bArr[18] = (byte) ((j152 >> 18) | (j155 << 3));
        bArr[19] = (byte) (j155 >> 5);
        bArr[20] = (byte) (j155 >> 13);
        bArr[21] = (byte) j158;
        bArr[22] = (byte) (j158 >> 8);
        bArr[23] = (byte) ((j158 >> 16) | (j161 << 5));
        bArr[24] = (byte) (j161 >> 3);
        bArr[25] = (byte) (j161 >> 11);
        bArr[26] = (byte) ((j161 >> 19) | (j164 << 2));
        bArr[27] = (byte) (j164 >> 6);
        bArr[28] = (byte) ((j164 >> 14) | (j163 << 7));
        bArr[29] = (byte) (j163 >> 1);
        bArr[30] = (byte) (j163 >> 9);
        bArr[31] = (byte) (j163 >> 17);
    }

    public static boolean impassible(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        taiyuan.taiyuan(jArr2);
        for (byte b : taiyuan.attabal(jArr2)) {
            if (b != 0) {
                return true;
            }
        }
        return false;
    }

    public static void impromptu(dern dernVar, C0634marial c0634marial) {
        competently(dernVar, c0634marial.f27798attabal);
    }

    public static long kowloon(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
    }

    public static void marial(dern dernVar, C0634marial c0634marial, attabal attabalVar) {
        long[] jArr = new long[10];
        long[] jArr2 = dernVar.f27796attabal.f27801attabal;
        wireman wiremanVar = c0634marial.f27798attabal;
        taiyuan.kowloon(jArr2, wiremanVar.f27803saneness, wiremanVar.f27801attabal);
        long[] jArr3 = dernVar.f27796attabal.f27803saneness;
        wireman wiremanVar2 = c0634marial.f27798attabal;
        taiyuan.impassible(jArr3, wiremanVar2.f27803saneness, wiremanVar2.f27801attabal);
        long[] jArr4 = dernVar.f27796attabal.f27803saneness;
        taiyuan.beachfront(jArr4, jArr4, attabalVar.f27795saneness);
        wireman wiremanVar3 = dernVar.f27796attabal;
        taiyuan.beachfront(wiremanVar3.f27802dern, wiremanVar3.f27801attabal, attabalVar.f27793attabal);
        taiyuan.beachfront(dernVar.f27797saneness, c0634marial.f27799saneness, attabalVar.f27794dern);
        attabalVar.saneness(dernVar.f27796attabal.f27801attabal, c0634marial.f27798attabal.f27802dern);
        long[] jArr5 = dernVar.f27796attabal.f27801attabal;
        taiyuan.kowloon(jArr, jArr5, jArr5);
        wireman wiremanVar4 = dernVar.f27796attabal;
        taiyuan.impassible(wiremanVar4.f27801attabal, wiremanVar4.f27802dern, wiremanVar4.f27803saneness);
        wireman wiremanVar5 = dernVar.f27796attabal;
        long[] jArr6 = wiremanVar5.f27803saneness;
        taiyuan.kowloon(jArr6, wiremanVar5.f27802dern, jArr6);
        taiyuan.kowloon(dernVar.f27796attabal.f27802dern, jArr, dernVar.f27797saneness);
        long[] jArr7 = dernVar.f27797saneness;
        taiyuan.impassible(jArr7, jArr, jArr7);
    }

    public static void molybdenite(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        taiyuan.apical(jArr3, jArr2);
        taiyuan.apical(jArr4, jArr3);
        taiyuan.apical(jArr4, jArr4);
        taiyuan.beachfront(jArr4, jArr2, jArr4);
        taiyuan.beachfront(jArr3, jArr3, jArr4);
        taiyuan.apical(jArr3, jArr3);
        taiyuan.beachfront(jArr3, jArr4, jArr3);
        taiyuan.apical(jArr4, jArr3);
        for (int i = 1; i < 5; i++) {
            taiyuan.apical(jArr4, jArr4);
        }
        taiyuan.beachfront(jArr3, jArr4, jArr3);
        taiyuan.apical(jArr4, jArr3);
        for (int i2 = 1; i2 < 10; i2++) {
            taiyuan.apical(jArr4, jArr4);
        }
        taiyuan.beachfront(jArr4, jArr4, jArr3);
        taiyuan.apical(jArr5, jArr4);
        for (int i3 = 1; i3 < 20; i3++) {
            taiyuan.apical(jArr5, jArr5);
        }
        taiyuan.beachfront(jArr4, jArr5, jArr4);
        taiyuan.apical(jArr4, jArr4);
        for (int i4 = 1; i4 < 10; i4++) {
            taiyuan.apical(jArr4, jArr4);
        }
        taiyuan.beachfront(jArr3, jArr4, jArr3);
        taiyuan.apical(jArr4, jArr3);
        for (int i5 = 1; i5 < 50; i5++) {
            taiyuan.apical(jArr4, jArr4);
        }
        taiyuan.beachfront(jArr4, jArr4, jArr3);
        taiyuan.apical(jArr5, jArr4);
        for (int i6 = 1; i6 < 100; i6++) {
            taiyuan.apical(jArr5, jArr5);
        }
        taiyuan.beachfront(jArr4, jArr5, jArr4);
        taiyuan.apical(jArr4, jArr4);
        for (int i7 = 1; i7 < 50; i7++) {
            taiyuan.apical(jArr4, jArr4);
        }
        taiyuan.beachfront(jArr3, jArr4, jArr3);
        taiyuan.apical(jArr3, jArr3);
        taiyuan.apical(jArr3, jArr3);
        taiyuan.beachfront(jArr, jArr3, jArr2);
    }

    public static void monoploid(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long jKowloon = kowloon(bArr2, 0) & 2097151;
        long jArytenoidectomy = (arytenoidectomy(bArr2, 2) >> 5) & 2097151;
        long jKowloon2 = (kowloon(bArr2, 5) >> 2) & 2097151;
        long jArytenoidectomy2 = (arytenoidectomy(bArr2, 7) >> 7) & 2097151;
        long jArytenoidectomy3 = (arytenoidectomy(bArr2, 10) >> 4) & 2097151;
        long jKowloon3 = (kowloon(bArr2, 13) >> 1) & 2097151;
        long jArytenoidectomy4 = (arytenoidectomy(bArr2, 15) >> 6) & 2097151;
        long jKowloon4 = (kowloon(bArr2, 18) >> 3) & 2097151;
        long jKowloon5 = kowloon(bArr2, 21) & 2097151;
        long jArytenoidectomy5 = (arytenoidectomy(bArr2, 23) >> 5) & 2097151;
        long jKowloon6 = (kowloon(bArr2, 26) >> 2) & 2097151;
        long jArytenoidectomy6 = arytenoidectomy(bArr2, 28) >> 7;
        long jKowloon7 = kowloon(bArr3, 0) & 2097151;
        long jArytenoidectomy7 = (arytenoidectomy(bArr3, 2) >> 5) & 2097151;
        long jKowloon8 = (kowloon(bArr3, 5) >> 2) & 2097151;
        long jArytenoidectomy8 = (arytenoidectomy(bArr3, 7) >> 7) & 2097151;
        long jArytenoidectomy9 = (arytenoidectomy(bArr3, 10) >> 4) & 2097151;
        long jKowloon9 = (kowloon(bArr3, 13) >> 1) & 2097151;
        long jArytenoidectomy10 = (arytenoidectomy(bArr3, 15) >> 6) & 2097151;
        long jKowloon10 = (kowloon(bArr3, 18) >> 3) & 2097151;
        long jKowloon11 = kowloon(bArr3, 21) & 2097151;
        long jArytenoidectomy11 = (arytenoidectomy(bArr3, 23) >> 5) & 2097151;
        long jKowloon12 = (kowloon(bArr3, 26) >> 2) & 2097151;
        long jArytenoidectomy12 = arytenoidectomy(bArr3, 28) >> 7;
        long jKowloon13 = kowloon(bArr4, 0) & 2097151;
        long jArytenoidectomy13 = (arytenoidectomy(bArr4, 2) >> 5) & 2097151;
        long jKowloon14 = (kowloon(bArr4, 5) >> 2) & 2097151;
        long jArytenoidectomy14 = (arytenoidectomy(bArr4, 7) >> 7) & 2097151;
        long jArytenoidectomy15 = (arytenoidectomy(bArr4, 10) >> 4) & 2097151;
        long jKowloon15 = (kowloon(bArr4, 13) >> 1) & 2097151;
        long jArytenoidectomy16 = (arytenoidectomy(bArr4, 15) >> 6) & 2097151;
        long jKowloon16 = (kowloon(bArr4, 18) >> 3) & 2097151;
        long jKowloon17 = kowloon(bArr4, 21) & 2097151;
        long j = jKowloon13 + (jKowloon * jKowloon7);
        long j2 = jArytenoidectomy13 + (jKowloon * jArytenoidectomy7) + (jArytenoidectomy * jKowloon7);
        long j3 = jKowloon14 + (jKowloon * jKowloon8) + (jArytenoidectomy * jArytenoidectomy7) + (jKowloon2 * jKowloon7);
        long j4 = jArytenoidectomy14 + (jKowloon * jArytenoidectomy8) + (jArytenoidectomy * jKowloon8) + (jKowloon2 * jArytenoidectomy7) + (jArytenoidectomy2 * jKowloon7);
        long j5 = jArytenoidectomy15 + (jKowloon * jArytenoidectomy9) + (jArytenoidectomy * jArytenoidectomy8) + (jKowloon2 * jKowloon8) + (jArytenoidectomy2 * jArytenoidectomy7) + (jArytenoidectomy3 * jKowloon7);
        long j6 = jKowloon15 + (jKowloon * jKowloon9) + (jArytenoidectomy * jArytenoidectomy9) + (jKowloon2 * jArytenoidectomy8) + (jArytenoidectomy2 * jKowloon8) + (jArytenoidectomy3 * jArytenoidectomy7) + (jKowloon3 * jKowloon7);
        long j7 = jArytenoidectomy16 + (jKowloon * jArytenoidectomy10) + (jArytenoidectomy * jKowloon9) + (jKowloon2 * jArytenoidectomy9) + (jArytenoidectomy2 * jArytenoidectomy8) + (jArytenoidectomy3 * jKowloon8) + (jKowloon3 * jArytenoidectomy7) + (jArytenoidectomy4 * jKowloon7);
        long j8 = jKowloon16 + (jKowloon * jKowloon10) + (jArytenoidectomy * jArytenoidectomy10) + (jKowloon2 * jKowloon9) + (jArytenoidectomy2 * jArytenoidectomy9) + (jArytenoidectomy3 * jArytenoidectomy8) + (jKowloon3 * jKowloon8) + (jArytenoidectomy4 * jArytenoidectomy7) + (jKowloon4 * jKowloon7);
        long j9 = jKowloon17 + (jKowloon * jKowloon11) + (jArytenoidectomy * jKowloon10) + (jKowloon2 * jArytenoidectomy10) + (jArytenoidectomy2 * jKowloon9) + (jArytenoidectomy3 * jArytenoidectomy9) + (jKowloon3 * jArytenoidectomy8) + (jArytenoidectomy4 * jKowloon8) + (jKowloon4 * jArytenoidectomy7) + (jKowloon5 * jKowloon7);
        long jArytenoidectomy17 = ((arytenoidectomy(bArr4, 23) >> 5) & 2097151) + (jKowloon * jArytenoidectomy11) + (jArytenoidectomy * jKowloon11) + (jKowloon2 * jKowloon10) + (jArytenoidectomy2 * jArytenoidectomy10) + (jArytenoidectomy3 * jKowloon9) + (jKowloon3 * jArytenoidectomy9) + (jArytenoidectomy4 * jArytenoidectomy8) + (jKowloon4 * jKowloon8) + (jKowloon5 * jArytenoidectomy7) + (jArytenoidectomy5 * jKowloon7);
        long jKowloon18 = ((kowloon(bArr4, 26) >> 2) & 2097151) + (jKowloon * jKowloon12) + (jArytenoidectomy * jArytenoidectomy11) + (jKowloon2 * jKowloon11) + (jArytenoidectomy2 * jKowloon10) + (jArytenoidectomy3 * jArytenoidectomy10) + (jKowloon3 * jKowloon9) + (jArytenoidectomy4 * jArytenoidectomy9) + (jKowloon4 * jArytenoidectomy8) + (jKowloon5 * jKowloon8) + (jArytenoidectomy5 * jArytenoidectomy7) + (jKowloon6 * jKowloon7);
        long jArytenoidectomy18 = (arytenoidectomy(bArr4, 28) >> 7) + (jKowloon * jArytenoidectomy12) + (jArytenoidectomy * jKowloon12) + (jKowloon2 * jArytenoidectomy11) + (jArytenoidectomy2 * jKowloon11) + (jArytenoidectomy3 * jKowloon10) + (jKowloon3 * jArytenoidectomy10) + (jArytenoidectomy4 * jKowloon9) + (jKowloon4 * jArytenoidectomy9) + (jKowloon5 * jArytenoidectomy8) + (jArytenoidectomy5 * jKowloon8) + (jKowloon6 * jArytenoidectomy7) + (jKowloon7 * jArytenoidectomy6);
        long j10 = (jArytenoidectomy * jArytenoidectomy12) + (jKowloon2 * jKowloon12) + (jArytenoidectomy2 * jArytenoidectomy11) + (jArytenoidectomy3 * jKowloon11) + (jKowloon3 * jKowloon10) + (jArytenoidectomy4 * jArytenoidectomy10) + (jKowloon4 * jKowloon9) + (jKowloon5 * jArytenoidectomy9) + (jArytenoidectomy5 * jArytenoidectomy8) + (jKowloon6 * jKowloon8) + (jArytenoidectomy7 * jArytenoidectomy6);
        long j11 = (jKowloon2 * jArytenoidectomy12) + (jArytenoidectomy2 * jKowloon12) + (jArytenoidectomy3 * jArytenoidectomy11) + (jKowloon3 * jKowloon11) + (jArytenoidectomy4 * jKowloon10) + (jKowloon4 * jArytenoidectomy10) + (jKowloon5 * jKowloon9) + (jArytenoidectomy5 * jArytenoidectomy9) + (jKowloon6 * jArytenoidectomy8) + (jKowloon8 * jArytenoidectomy6);
        long j12 = (jArytenoidectomy2 * jArytenoidectomy12) + (jArytenoidectomy3 * jKowloon12) + (jKowloon3 * jArytenoidectomy11) + (jArytenoidectomy4 * jKowloon11) + (jKowloon4 * jKowloon10) + (jKowloon5 * jArytenoidectomy10) + (jArytenoidectomy5 * jKowloon9) + (jKowloon6 * jArytenoidectomy9) + (jArytenoidectomy8 * jArytenoidectomy6);
        long j13 = (jArytenoidectomy3 * jArytenoidectomy12) + (jKowloon3 * jKowloon12) + (jArytenoidectomy4 * jArytenoidectomy11) + (jKowloon4 * jKowloon11) + (jKowloon5 * jKowloon10) + (jArytenoidectomy5 * jArytenoidectomy10) + (jKowloon6 * jKowloon9) + (jArytenoidectomy9 * jArytenoidectomy6);
        long j14 = (jKowloon3 * jArytenoidectomy12) + (jArytenoidectomy4 * jKowloon12) + (jKowloon4 * jArytenoidectomy11) + (jKowloon5 * jKowloon11) + (jArytenoidectomy5 * jKowloon10) + (jKowloon6 * jArytenoidectomy10) + (jKowloon9 * jArytenoidectomy6);
        long j15 = (jArytenoidectomy4 * jArytenoidectomy12) + (jKowloon4 * jKowloon12) + (jKowloon5 * jArytenoidectomy11) + (jArytenoidectomy5 * jKowloon11) + (jKowloon6 * jKowloon10) + (jArytenoidectomy10 * jArytenoidectomy6);
        long j16 = (jKowloon4 * jArytenoidectomy12) + (jKowloon5 * jKowloon12) + (jArytenoidectomy5 * jArytenoidectomy11) + (jKowloon6 * jKowloon11) + (jKowloon10 * jArytenoidectomy6);
        long j17 = (jKowloon5 * jArytenoidectomy12) + (jArytenoidectomy5 * jKowloon12) + (jKowloon6 * jArytenoidectomy11) + (jKowloon11 * jArytenoidectomy6);
        long j18 = (jArytenoidectomy5 * jArytenoidectomy12) + (jKowloon6 * jKowloon12) + (jArytenoidectomy11 * jArytenoidectomy6);
        long j19 = (jKowloon6 * jArytenoidectomy12) + (jKowloon12 * jArytenoidectomy6);
        long j20 = jArytenoidectomy6 * jArytenoidectomy12;
        long j21 = (j + 1048576) >> 21;
        long j22 = j2 + j21;
        long j23 = j - (j21 << 21);
        long j24 = (j3 + 1048576) >> 21;
        long j25 = j4 + j24;
        long j26 = j3 - (j24 << 21);
        long j27 = (j5 + 1048576) >> 21;
        long j28 = j6 + j27;
        long j29 = j5 - (j27 << 21);
        long j30 = (j7 + 1048576) >> 21;
        long j31 = j8 + j30;
        long j32 = j7 - (j30 << 21);
        long j33 = (j9 + 1048576) >> 21;
        long j34 = jArytenoidectomy17 + j33;
        long j35 = j9 - (j33 << 21);
        long j36 = (jKowloon18 + 1048576) >> 21;
        long j37 = jArytenoidectomy18 + j36;
        long j38 = jKowloon18 - (j36 << 21);
        long j39 = (j10 + 1048576) >> 21;
        long j40 = j11 + j39;
        long j41 = j10 - (j39 << 21);
        long j42 = (j12 + 1048576) >> 21;
        long j43 = j13 + j42;
        long j44 = j12 - (j42 << 21);
        long j45 = (j14 + 1048576) >> 21;
        long j46 = j15 + j45;
        long j47 = j14 - (j45 << 21);
        long j48 = (j16 + 1048576) >> 21;
        long j49 = j17 + j48;
        long j50 = j16 - (j48 << 21);
        long j51 = (j18 + 1048576) >> 21;
        long j52 = j19 + j51;
        long j53 = j18 - (j51 << 21);
        long j54 = (j20 + 1048576) >> 21;
        long j55 = (j22 + 1048576) >> 21;
        long j56 = j26 + j55;
        long j57 = j22 - (j55 << 21);
        long j58 = (j25 + 1048576) >> 21;
        long j59 = j29 + j58;
        long j60 = j25 - (j58 << 21);
        long j61 = (j28 + 1048576) >> 21;
        long j62 = j32 + j61;
        long j63 = j28 - (j61 << 21);
        long j64 = (j31 + 1048576) >> 21;
        long j65 = j35 + j64;
        long j66 = j31 - (j64 << 21);
        long j67 = (j34 + 1048576) >> 21;
        long j68 = j38 + j67;
        long j69 = j34 - (j67 << 21);
        long j70 = (j37 + 1048576) >> 21;
        long j71 = j41 + j70;
        long j72 = j37 - (j70 << 21);
        long j73 = (j40 + 1048576) >> 21;
        long j74 = j44 + j73;
        long j75 = j40 - (j73 << 21);
        long j76 = (j43 + 1048576) >> 21;
        long j77 = j47 + j76;
        long j78 = j43 - (j76 << 21);
        long j79 = (j46 + 1048576) >> 21;
        long j80 = j50 + j79;
        long j81 = j46 - (j79 << 21);
        long j82 = (j49 + 1048576) >> 21;
        long j83 = j53 + j82;
        long j84 = j49 - (j82 << 21);
        long j85 = (j52 + 1048576) >> 21;
        long j86 = (j20 - (j54 << 21)) + j85;
        long j87 = j52 - (j85 << 21);
        long j88 = j78 + (j54 * 136657);
        long j89 = j77 - (j54 * 683901);
        long j90 = ((j75 + (j54 * 654183)) - (j86 * 997805)) + (j87 * 136657);
        long j91 = ((j74 - (j54 * 997805)) + (j86 * 136657)) - (j87 * 683901);
        long j92 = ((((j72 + (j54 * 666643)) + (j86 * 470296)) + (j87 * 654183)) - (j83 * 997805)) + (j84 * 136657);
        long j93 = ((((j71 + (j54 * 470296)) + (j86 * 654183)) - (j87 * 997805)) + (j83 * 136657)) - (j84 * 683901);
        long j94 = j62 + (j80 * 666643);
        long j95 = j65 + (j83 * 666643) + (j84 * 470296) + (j80 * 654183);
        long j96 = ((((j68 + (j86 * 666643)) + (j87 * 470296)) + (j83 * 654183)) - (j84 * 997805)) + (j80 * 136657);
        long j97 = (j94 + 1048576) >> 21;
        long j98 = j66 + (j84 * 666643) + (j80 * 470296) + j97;
        long j99 = j94 - (j97 << 21);
        long j100 = (j95 + 1048576) >> 21;
        long j101 = ((((j69 + (j87 * 666643)) + (j83 * 470296)) + (j84 * 654183)) - (j80 * 997805)) + j100;
        long j102 = j95 - (j100 << 21);
        long j103 = (j96 + 1048576) >> 21;
        long j104 = (j92 - (j80 * 683901)) + j103;
        long j105 = j96 - (j103 << 21);
        long j106 = (j93 + 1048576) >> 21;
        long j107 = (j90 - (j83 * 683901)) + j106;
        long j108 = j93 - (j106 << 21);
        long j109 = (j91 + 1048576) >> 21;
        long j110 = (j88 - (j86 * 683901)) + j109;
        long j111 = j91 - (j109 << 21);
        long j112 = (j89 + 1048576) >> 21;
        long j113 = j81 + j112;
        long j114 = j89 - (j112 << 21);
        long j115 = (j98 + 1048576) >> 21;
        long j116 = j102 + j115;
        long j117 = j98 - (j115 << 21);
        long j118 = (j101 + 1048576) >> 21;
        long j119 = j105 + j118;
        long j120 = j101 - (j118 << 21);
        long j121 = (j104 + 1048576) >> 21;
        long j122 = j108 + j121;
        long j123 = j104 - (j121 << 21);
        long j124 = (j107 + 1048576) >> 21;
        long j125 = j111 + j124;
        long j126 = j107 - (j124 << 21);
        long j127 = (j110 + 1048576) >> 21;
        long j128 = j114 + j127;
        long j129 = j110 - (j127 << 21);
        long j130 = j119 - (j113 * 683901);
        long j131 = ((j116 - (j113 * 997805)) + (j128 * 136657)) - (j129 * 683901);
        long j132 = ((((j99 + (j113 * 470296)) + (j128 * 654183)) - (j129 * 997805)) + (j125 * 136657)) - (j126 * 683901);
        long j133 = j23 + (j122 * 666643);
        long j134 = j56 + (j125 * 666643) + (j126 * 470296) + (j122 * 654183);
        long j135 = ((((j59 + (j128 * 666643)) + (j129 * 470296)) + (j125 * 654183)) - (j126 * 997805)) + (j122 * 136657);
        long j136 = (j133 + 1048576) >> 21;
        long j137 = j57 + (j126 * 666643) + (j122 * 470296) + j136;
        long j138 = j133 - (j136 << 21);
        long j139 = (j134 + 1048576) >> 21;
        long j140 = ((((j60 + (j129 * 666643)) + (j125 * 470296)) + (j126 * 654183)) - (j122 * 997805)) + j139;
        long j141 = j134 - (j139 << 21);
        long j142 = (j135 + 1048576) >> 21;
        long j143 = ((((((j63 + (j113 * 666643)) + (j128 * 470296)) + (j129 * 654183)) - (j125 * 997805)) + (j126 * 136657)) - (j122 * 683901)) + j142;
        long j144 = j135 - (j142 << 21);
        long j145 = (j132 + 1048576) >> 21;
        long j146 = ((((j117 + (j113 * 654183)) - (j128 * 997805)) + (j129 * 136657)) - (j125 * 683901)) + j145;
        long j147 = j132 - (j145 << 21);
        long j148 = (j131 + 1048576) >> 21;
        long j149 = ((j120 + (j113 * 136657)) - (j128 * 683901)) + j148;
        long j150 = j131 - (j148 << 21);
        long j151 = (j130 + 1048576) >> 21;
        long j152 = j123 + j151;
        long j153 = j130 - (j151 << 21);
        long j154 = (j137 + 1048576) >> 21;
        long j155 = j141 + j154;
        long j156 = j137 - (j154 << 21);
        long j157 = (j140 + 1048576) >> 21;
        long j158 = j144 + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (j143 + 1048576) >> 21;
        long j161 = j147 + j160;
        long j162 = j143 - (j160 << 21);
        long j163 = (j146 + 1048576) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + 1048576) >> 21;
        long j167 = (j152 + 1048576) >> 21;
        long j168 = j152 - (j167 << 21);
        long j169 = j138 + (j167 * 666643);
        long j170 = j156 + (j167 * 470296);
        long j171 = j155 + (j167 * 654183);
        long j172 = j159 - (j167 * 997805);
        long j173 = j158 + (j167 * 136657);
        long j174 = j162 - (j167 * 683901);
        long j175 = j169 >> 21;
        long j176 = j170 + j175;
        long j177 = j169 - (j175 << 21);
        long j178 = j176 >> 21;
        long j179 = j171 + j178;
        long j180 = j176 - (j178 << 21);
        long j181 = j179 >> 21;
        long j182 = j172 + j181;
        long j183 = j179 - (j181 << 21);
        long j184 = j182 >> 21;
        long j185 = j173 + j184;
        long j186 = j182 - (j184 << 21);
        long j187 = j185 >> 21;
        long j188 = j174 + j187;
        long j189 = j185 - (j187 << 21);
        long j190 = j188 >> 21;
        long j191 = j161 + j190;
        long j192 = j188 - (j190 << 21);
        long j193 = j191 >> 21;
        long j194 = j165 + j193;
        long j195 = j191 - (j193 << 21);
        long j196 = j194 >> 21;
        long j197 = j164 + j196;
        long j198 = j194 - (j196 << 21);
        long j199 = j197 >> 21;
        long j200 = (j149 - (j166 << 21)) + j199;
        long j201 = j197 - (j199 << 21);
        long j202 = j200 >> 21;
        long j203 = j153 + j166 + j202;
        long j204 = j200 - (j202 << 21);
        long j205 = j203 >> 21;
        long j206 = j168 + j205;
        long j207 = j203 - (j205 << 21);
        long j208 = j206 >> 21;
        long j209 = j206 - (j208 << 21);
        long j210 = j177 + (666643 * j208);
        long j211 = j180 + (470296 * j208);
        long j212 = j183 + (654183 * j208);
        long j213 = j186 - (997805 * j208);
        long j214 = j189 + (136657 * j208);
        long j215 = j192 - (j208 * 683901);
        long j216 = j210 >> 21;
        long j217 = j211 + j216;
        long j218 = j210 - (j216 << 21);
        long j219 = j217 >> 21;
        long j220 = j212 + j219;
        long j221 = j217 - (j219 << 21);
        long j222 = j220 >> 21;
        long j223 = j213 + j222;
        long j224 = j220 - (j222 << 21);
        long j225 = j223 >> 21;
        long j226 = j214 + j225;
        long j227 = j223 - (j225 << 21);
        long j228 = j226 >> 21;
        long j229 = j215 + j228;
        long j230 = j226 - (j228 << 21);
        long j231 = j229 >> 21;
        long j232 = j195 + j231;
        long j233 = j229 - (j231 << 21);
        long j234 = j232 >> 21;
        long j235 = j198 + j234;
        long j236 = j232 - (j234 << 21);
        long j237 = j235 >> 21;
        long j238 = j201 + j237;
        long j239 = j235 - (j237 << 21);
        long j240 = j238 >> 21;
        long j241 = j204 + j240;
        long j242 = j238 - (j240 << 21);
        long j243 = j241 >> 21;
        long j244 = j207 + j243;
        long j245 = j241 - (j243 << 21);
        long j246 = j244 >> 21;
        long j247 = j209 + j246;
        long j248 = j244 - (j246 << 21);
        bArr[0] = (byte) j218;
        bArr[1] = (byte) (j218 >> 8);
        bArr[2] = (byte) ((j218 >> 16) | (j221 << 5));
        bArr[3] = (byte) (j221 >> 3);
        bArr[4] = (byte) (j221 >> 11);
        bArr[5] = (byte) ((j221 >> 19) | (j224 << 2));
        bArr[6] = (byte) (j224 >> 6);
        bArr[7] = (byte) ((j224 >> 14) | (j227 << 7));
        bArr[8] = (byte) (j227 >> 1);
        bArr[9] = (byte) (j227 >> 9);
        bArr[10] = (byte) ((j227 >> 17) | (j230 << 4));
        bArr[11] = (byte) (j230 >> 4);
        bArr[12] = (byte) (j230 >> 12);
        bArr[13] = (byte) ((j230 >> 20) | (j233 << 1));
        bArr[14] = (byte) (j233 >> 7);
        bArr[15] = (byte) ((j233 >> 15) | (j236 << 6));
        bArr[16] = (byte) (j236 >> 2);
        bArr[17] = (byte) (j236 >> 10);
        bArr[18] = (byte) ((j236 >> 18) | (j239 << 3));
        bArr[19] = (byte) (j239 >> 5);
        bArr[20] = (byte) (j239 >> 13);
        bArr[21] = (byte) j242;
        bArr[22] = (byte) (j242 >> 8);
        bArr[23] = (byte) ((j242 >> 16) | (j245 << 5));
        bArr[24] = (byte) (j245 >> 3);
        bArr[25] = (byte) (j245 >> 11);
        bArr[26] = (byte) ((j245 >> 19) | (j248 << 2));
        bArr[27] = (byte) (j248 >> 6);
        bArr[28] = (byte) ((j248 >> 14) | (j247 << 7));
        bArr[29] = (byte) (j247 >> 1);
        bArr[30] = (byte) (j247 >> 9);
        bArr[31] = (byte) (j247 >> 17);
    }

    public static void polloi(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static byte[] preprohormone(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        if ((b << i4) + b2 > 15) {
                            if (b2 - (b << i4) < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) (b2 - (b << i4));
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) (b2 + (b << i4));
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static byte[] rotuma(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest messageDigestAttabal = affiche.cutely.f3860marial.attabal("SHA-512");
        messageDigestAttabal.update(bArr3, 32, 32);
        messageDigestAttabal.update(bArrCopyOfRange);
        byte[] bArrDigest = messageDigestAttabal.digest();
        graveside(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(adultoid(bArrDigest).dern(), 0, 32);
        messageDigestAttabal.reset();
        messageDigestAttabal.update(bArrCopyOfRange2);
        messageDigestAttabal.update(bArr2);
        messageDigestAttabal.update(bArrCopyOfRange);
        byte[] bArrDigest2 = messageDigestAttabal.digest();
        graveside(bArrDigest2);
        byte[] bArr4 = new byte[32];
        monoploid(bArr4, bArrDigest2, bArr3, bArrDigest);
        return affiche.marial.attabal(bArrCopyOfRange2, bArr4);
    }

    public static int taiyuan(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    public static boolean triweekly(byte[] bArr) {
        for (int i = 31; i >= 0; i--) {
            int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i3 = f27791dern[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i2 != i3) {
                return i2 < i3;
            }
        }
        return false;
    }
}
