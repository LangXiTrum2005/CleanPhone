package extensively;

import com.google.crypto.tink.proto.OutputPrefixType;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: LegacyFullVerify.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside implements discernable.dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final discernable.dovishness f26164attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f26165dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f26166saneness;

    /* JADX INFO: compiled from: LegacyFullVerify.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f26167attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f26167attabal = iArr;
            try {
                iArr[OutputPrefixType.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26167attabal[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26167attabal[OutputPrefixType.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26167attabal[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public graveside(discernable.dovishness dovishnessVar, byte[] bArr, byte[] bArr2) {
        this.f26164attabal = dovishnessVar;
        this.f26166saneness = bArr;
        this.f26165dern = bArr2;
    }

    public static byte[] dern(hobby.polder polderVar) {
        return polderVar.marial().equals(OutputPrefixType.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static discernable.dovishness saneness(hobby.arytenoidectomy arytenoidectomyVar) throws GeneralSecurityException {
        hobby.polder polderVarMarial = arytenoidectomyVar.marial(discernable.beachfront.attabal());
        return new graveside((discernable.dovishness) hobby.formularize.wireman().attabal(polderVarMarial.beachfront(), discernable.dovishness.class).wireman(polderVarMarial.competently()), wireman(polderVarMarial), dern(polderVarMarial));
    }

    public static byte[] wireman(hobby.polder polderVar) throws GeneralSecurityException {
        int i = attabal.f26167attabal[polderVar.marial().ordinal()];
        if (i == 1 || i == 2) {
            return hobby.trm.attabal(polderVar.dern().intValue()).wireman();
        }
        if (i == 3) {
            return hobby.trm.saneness(polderVar.dern().intValue()).wireman();
        }
        if (i == 4) {
            return hobby.trm.f27847attabal.wireman();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Override // discernable.dovishness
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f26166saneness;
        if (bArr3.length == 0 && this.f26165dern.length == 0) {
            this.f26164attabal.attabal(bArr, bArr2);
            return;
        }
        if (!creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.f26165dern;
        if (bArr4.length != 0) {
            bArr2 = affiche.marial.attabal(bArr2, bArr4);
        }
        this.f26164attabal.attabal(Arrays.copyOfRange(bArr, this.f26166saneness.length, bArr.length), bArr2);
    }
}
