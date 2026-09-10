package hobby;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: Ed25519Constants.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final long[] f27739attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final BigInteger f27740beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final BigInteger f27741competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final long[] f27742dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final BigInteger f27743impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final marial.attabal[] f27744marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long[] f27745saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final BigInteger f27746taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final marial.attabal[][] f27747wireman;

    /* JADX INFO: compiled from: Ed25519Constants.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public BigInteger f27748attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public BigInteger f27749saneness;

        public saneness() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f27740beachfront = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f27741competently = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f27743impromptu = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f27746taiyuan = bigIntegerModPow;
        saneness sanenessVar = new saneness();
        sanenessVar.f27749saneness = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        sanenessVar.f27748attabal = dern(sanenessVar.f27749saneness);
        f27739attabal = taiyuan.dern(wireman(bigIntegerMod));
        f27745saneness = taiyuan.dern(wireman(bigIntegerMod2));
        f27742dern = taiyuan.dern(wireman(bigIntegerModPow));
        f27747wireman = (marial.attabal[][]) Array.newInstance((Class<?>) marial.attabal.class, 32, 8);
        saneness sanenessVarAttabal = sanenessVar;
        for (int i = 0; i < 32; i++) {
            saneness sanenessVarAttabal2 = sanenessVarAttabal;
            for (int i2 = 0; i2 < 8; i2++) {
                f27747wireman[i][i2] = saneness(sanenessVarAttabal2);
                sanenessVarAttabal2 = attabal(sanenessVarAttabal2, sanenessVarAttabal);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                sanenessVarAttabal = attabal(sanenessVarAttabal, sanenessVarAttabal);
            }
        }
        saneness sanenessVarAttabal3 = attabal(sanenessVar, sanenessVar);
        f27744marial = new marial.attabal[8];
        for (int i4 = 0; i4 < 8; i4++) {
            f27744marial[i4] = saneness(sanenessVar);
            sanenessVar = attabal(sanenessVar, sanenessVarAttabal3);
        }
    }

    public static saneness attabal(saneness sanenessVar, saneness sanenessVar2) {
        saneness sanenessVar3 = new saneness();
        BigInteger bigIntegerMultiply = f27741competently.multiply(sanenessVar.f27748attabal.multiply(sanenessVar2.f27748attabal).multiply(sanenessVar.f27749saneness).multiply(sanenessVar2.f27749saneness));
        BigInteger bigInteger = f27740beachfront;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = sanenessVar.f27748attabal.multiply(sanenessVar2.f27749saneness).add(sanenessVar2.f27748attabal.multiply(sanenessVar.f27749saneness));
        BigInteger bigInteger2 = BigInteger.ONE;
        sanenessVar3.f27748attabal = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        sanenessVar3.f27749saneness = sanenessVar.f27749saneness.multiply(sanenessVar2.f27749saneness).add(sanenessVar.f27748attabal.multiply(sanenessVar2.f27748attabal)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return sanenessVar3;
    }

    public static BigInteger dern(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f27741competently.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f27740beachfront;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f27746taiyuan).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    public static marial.attabal saneness(saneness sanenessVar) {
        BigInteger bigIntegerAdd = sanenessVar.f27749saneness.add(sanenessVar.f27748attabal);
        BigInteger bigInteger = f27740beachfront;
        return new marial.attabal(taiyuan.dern(wireman(bigIntegerAdd.mod(bigInteger))), taiyuan.dern(wireman(sanenessVar.f27749saneness.subtract(sanenessVar.f27748attabal).mod(bigInteger))), taiyuan.dern(wireman(f27743impromptu.multiply(sanenessVar.f27748attabal).multiply(sanenessVar.f27749saneness).mod(bigInteger))));
    }

    public static byte[] wireman(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
