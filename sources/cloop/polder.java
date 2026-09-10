package cloop;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: LegacyFullAead.java */
/* JADX INFO: loaded from: classes3.dex */
public class polder implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final discernable.attabal f15697attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f15698saneness;

    /* JADX INFO: compiled from: LegacyFullAead.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f15699attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15699attabal = iArr;
            try {
                iArr[OutputPrefixType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15699attabal[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15699attabal[OutputPrefixType.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15699attabal[OutputPrefixType.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public polder(discernable.attabal attabalVar, byte[] bArr) {
        this.f15697attabal = attabalVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f15698saneness = bArr;
    }

    public static discernable.attabal dern(hobby.arytenoidectomy arytenoidectomyVar) throws GeneralSecurityException {
        byte[] bArrWireman;
        hobby.polder polderVarMarial = arytenoidectomyVar.marial(discernable.beachfront.attabal());
        discernable.attabal attabalVar = (discernable.attabal) hobby.formularize.wireman().attabal(polderVarMarial.beachfront(), discernable.attabal.class).wireman(polderVarMarial.competently());
        OutputPrefixType outputPrefixTypeMarial = polderVarMarial.marial();
        int i = attabal.f15699attabal[outputPrefixTypeMarial.ordinal()];
        if (i == 1) {
            bArrWireman = hobby.trm.f27847attabal.wireman();
        } else if (i == 2 || i == 3) {
            bArrWireman = hobby.trm.attabal(arytenoidectomyVar.attabal().intValue()).wireman();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + outputPrefixTypeMarial);
            }
            bArrWireman = hobby.trm.saneness(arytenoidectomyVar.attabal().intValue()).wireman();
        }
        return new polder(attabalVar, bArrWireman);
    }

    public static discernable.attabal saneness(discernable.attabal attabalVar, ebullioscopic.attabal attabalVar2) {
        return new polder(attabalVar, attabalVar2.wireman());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f15698saneness;
        if (bArr3.length == 0) {
            return this.f15697attabal.attabal(bArr, bArr2);
        }
        if (hobby.creditor.marial(bArr3, bArr)) {
            return this.f15697attabal.attabal(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
