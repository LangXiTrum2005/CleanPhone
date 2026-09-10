package ascolichen;

import com.google.crypto.tink.proto.OutputPrefixType;
import discernable.polloi;
import hobby.arytenoidectomy;
import hobby.polder;
import hobby.trm;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: LegacyFullMac.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon implements polloi {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f14462wireman = {0};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final polloi f14463attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f14464dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final OutputPrefixType f14465saneness;

    /* JADX INFO: compiled from: LegacyFullMac.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f14466attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f14466attabal = iArr;
            try {
                iArr[OutputPrefixType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14466attabal[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14466attabal[OutputPrefixType.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14466attabal[OutputPrefixType.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public kowloon(polloi polloiVar, OutputPrefixType outputPrefixType, byte[] bArr) {
        this.f14463attabal = polloiVar;
        this.f14465saneness = outputPrefixType;
        this.f14464dern = bArr;
    }

    public static polloi saneness(arytenoidectomy arytenoidectomyVar) throws GeneralSecurityException {
        byte[] bArrWireman;
        polder polderVarMarial = arytenoidectomyVar.marial(discernable.beachfront.attabal());
        polloi polloiVar = (polloi) hobby.formularize.wireman().attabal(polderVarMarial.beachfront(), polloi.class).wireman(polderVarMarial.competently());
        OutputPrefixType outputPrefixTypeMarial = polderVarMarial.marial();
        int i = attabal.f14466attabal[outputPrefixTypeMarial.ordinal()];
        if (i == 1) {
            bArrWireman = trm.f27847attabal.wireman();
        } else if (i == 2 || i == 3) {
            bArrWireman = trm.attabal(arytenoidectomyVar.attabal().intValue()).wireman();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrWireman = trm.saneness(arytenoidectomyVar.attabal().intValue()).wireman();
        }
        return new kowloon(polloiVar, outputPrefixTypeMarial, bArrWireman);
    }

    @Override // discernable.polloi
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.f14465saneness.equals(OutputPrefixType.LEGACY)) {
            bArr2 = affiche.marial.attabal(bArr2, f14462wireman);
        }
        byte[] bArr3 = new byte[0];
        if (!this.f14465saneness.equals(OutputPrefixType.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f14464dern, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f14463attabal.attabal(bArr, bArr2);
    }
}
